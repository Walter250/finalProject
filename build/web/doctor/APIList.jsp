
<%@page import="domain.Appointment"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.List"%>
<%@page import="dao.GeneralDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    GeneralDao<Appointment> apptDao = new GeneralDao<>(Appointment.class);
    List<Appointment> apptList = apptDao.listAll();
    Gson g = new Gson();
    String all = g.toJson(apptList);
    out.print(all);
    
%>
