<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="db.Connect"%>
<%@page import="java.util.List"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="dao.GeneralDao"%>
<%@page import="domain.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List <Appointment> list = new ArrayList<>();
    GeneralDao<Appointment> prevDao = new GeneralDao<>(Appointment.class);
    Appointment p = new Appointment();
    String appointmentId = request.getParameter("id");
    int id = Integer.parseInt(appointmentId);
    Session s = Connect.getSessionFactory().openSession();
    Transaction t = s.beginTransaction();
    Criteria cr = s.createCriteria(Appointment.class);
    cr.add(Restrictions.eq("id", id));
    List appointments = cr.list();
    t.commit();
    for(Iterator i=appointments.iterator();i.hasNext();){
       p = (Appointment) i.next();
       String patient = p.getPatient();
       Date date = p.getDate();
       
       JSONObject o = new JSONObject();
       o.put("patient",patient);
       o.put("date",date);
       list.add(p);
    }
    s.close();
//    
    Gson g = new Gson();
    String all = g.toJson(list);
    out.print(all);
    out.flush();
    
%>
