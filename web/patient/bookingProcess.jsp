<%-- 
    Document   : SignUpProcess
    Created on : Apr 19, 2021, 1:47:05 PM
    Author     : Planet Innovation
--%>

<%@page import="java.util.List"%>
<%@page import="org.hibernate.criterion.Projections"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="db.Connect"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.sql.Date"%>
<%@page import="java.time.LocalDate"%>
<%@page import="domain.Appointment"%>
<%@page import="dao.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String names = request.getParameter("names");
    String date = request.getParameter("dt");
    Appointment appointment = new Appointment(names,Date.valueOf(date));
    GeneralDao<Appointment> apptDao = new GeneralDao<>(Appointment.class);
    
//Validation on past dates

    LocalDate apptDate = LocalDate.parse(date);
    if(apptDate.isBefore(LocalDate.now())){
        %>
        <script>
            alert("Date chosen is in the past");
        </script>
        <jsp:forward page="../patient/booking.jsp"/>
        <%
        }

//SECOND VALIDATION ON already chosen DATES
    Session ses = Connect.getSessionFactory().openSession();
    ses.beginTransaction();
    Criteria criteria = ses.createCriteria(Appointment.class);
    criteria.setProjection(Projections.property("date"));
    List<Date> all = criteria.list();
    Boolean check= false;
    for (Date d: all){
            if(LocalDate.parse(d.toString()).isEqual(apptDate)){
             check = true;   

        }
        
    }
    if(check){
        %>
        <script>
            alert("Date already chosen");
        </script>
        <jsp:forward page="../patient/booking.jsp"/>
        <%
}
        
    try{
        apptDao.create(appointment);
        %>
            <jsp:forward page="../patient/dashboard.html"/>
        <%
    }catch(Exception e){
        out.print(e.getMessage());
          %>
          <jsp:forward page="../patient/booking.jsp"/>
          <%
           return;
    }
    
%>
