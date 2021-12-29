<%@page import="dao.GeneralDao"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="db.Connect"%>
<%@page import="java.util.Iterator"%>
<%@page import="domain.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String appointmentId = request.getParameter("id");
    int id = Integer.parseInt(appointmentId);
    Appointment appointment = new Appointment();
    Session s = Connect.getSessionFactory().openSession();
    Transaction t = s.beginTransaction();
    Criteria cr = s.createCriteria(Appointment.class);
    cr.add(Restrictions.eq("id", id));
    List pers = cr.list();
    t.commit();
    for(Iterator i=pers.iterator();i.hasNext();){
       appointment = (Appointment) i.next();
    }
    s.close();
    GeneralDao<Appointment> Dao = new GeneralDao<>(Appointment.class);
    boolean b = Dao.delete(appointment); 
    if (b){
%>
     <jsp:forward page="../patient/viewAppointments.jsp"/>
     <%
        }
%>
