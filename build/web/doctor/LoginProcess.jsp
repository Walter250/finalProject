

<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="db.Connect"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="DoctorService.*"%>
<%@page import="domain.Doctor"%>
<%@page import="dao.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    DoctorAuth authenticationService = new DoctorAuthImpl();
    Doctor doctor = new Doctor();
    Session s = Connect.getSessionFactory().openSession();
    Transaction t = s.beginTransaction();
    Criteria cr = s.createCriteria(Doctor.class);
    cr.add(Restrictions.eq("email", email));
    List usr = cr.list();
    t.commit();
    for(Iterator i=usr.iterator();i.hasNext();){
       doctor = (Doctor) i.next();
    }
    s.close();
    
    try{
       Doctor loggedDoctor = authenticationService.login(email, password);
       
       if(loggedDoctor == null){
           %>   
             
                <jsp:forward page="../doctor/LoginForm.jsp"/>
            <%
           return;
       } 
       %>
       <% 
        HttpSession sess = request.getSession();
        sess.setAttribute("email",email);
       %>
       <jsp:forward page="../doctor/dashboard.html"/>
       <%
    }catch(Exception e){
        %>
           <jsp:forward page="../doctor/LoginForm.jsp"/>
        <%
           return;
    }
%>