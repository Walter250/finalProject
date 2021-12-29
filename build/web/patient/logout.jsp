
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    try{
   request.getSession().invalidate();
   response.sendRedirect(request.getContextPath()+"/index.jsp");
  }catch(Exception e)
   {
       System.out.printf(e.getMessage());
       e.printStackTrace();
   }
%>    
