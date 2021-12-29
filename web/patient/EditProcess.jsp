

<%@page import="dao.GeneralDao"%>
<%@page import="domain.Appointment"%>
<%@page import="java.sql.Date"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    String patient = request.getParameter("patient");
    String dateChosen = request.getParameter("date");
    String id = request.getParameter("id");
    int apptId= Integer.parseInt(id);
    Date date = Date.valueOf(dateChosen);
    Appointment appointment = new Appointment(apptId,patient,date);
    GeneralDao<Appointment> Dao = new GeneralDao<>(Appointment.class);
    Dao.update(appointment); %>
     <jsp:forward page="../patient/dashboard.html"/>
     <%
%>