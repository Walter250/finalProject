

<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="db.Connect"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Patientservice.*"%>
<%@page import="domain.Patient"%>
<%@page import="dao.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    PatientAuth authenticationService = new PatientAuthImpl();
    Patient patient = new Patient();
    Session s = Connect.getSessionFactory().openSession();
    Transaction t = s.beginTransaction();
    Criteria cr = s.createCriteria(Patient.class);
    cr.add(Restrictions.eq("email", email));
    List usr = cr.list();
    t.commit();
    for(Iterator i=usr.iterator();i.hasNext();){
       patient = (Patient) i.next();
    }
    s.close();
    
    try{
       Patient loggedPatient = authenticationService.login(email, password);
       
       if(loggedPatient == null){
           %>   
             
                <jsp:forward page="../patient/LoginForm.jsp"/>
            <%
           return;
       } 
       %>
       <% 
        HttpSession sess = request.getSession();
        sess.setAttribute("email",email);
       %>
       <jsp:forward page="../patient/dashboard.html"/>
       <%
    }catch(Exception e){
        %>
           <jsp:forward page="../patient/LoginForm.jsp"/>
        <%
           return;
    }
%>