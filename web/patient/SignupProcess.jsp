<%-- 
    Document   : SignUpProcess
    Created on : Apr 19, 2021, 1:47:05 PM
    Author     : Planet Innovation
--%>

<%@page import="domain.Patient"%>
<%@page import="Patientservice.PatientAuth"%>
<%@page import="Patientservice.PatientAuthImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String names = request.getParameter("names");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
    String password = request.getParameter("password");
    String password2 = request.getParameter("password2");
    
    if(!password.equals(password2)){
//        out.print("Password Does not match");
        %>
            <jsp:forward page="../patient/SignupForm.jsp"/>
        <%
        return;
    }
    PatientAuth authenticationService = new PatientAuthImpl();
    Patient patient = new Patient(names,email, phone, password);
    
    try{
        authenticationService.signup(patient);
//        out.print("Account Created");
        %>
            <jsp:forward page="../patient/dashboard.html"/>
        <%
    }catch(Exception e){
//        out.print(e.getMessage());
          %>
            <jsp:forward page="../patient/SignupForm.jsp"/>
          <%
           return;
    }
    
%>