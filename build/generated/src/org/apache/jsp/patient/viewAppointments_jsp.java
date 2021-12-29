package org.apache.jsp.patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewAppointments_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/bootstrap.min.css\">\n");
      out.write("    <link href=\"../DataTables/datatables.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>APPOINTMENTS</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table id=\"mytable\" class=\"table table-striped table-hover\" style=\"margin-top: 40px\">\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("    <div class=\"container py-5\" id=\"frm\" style=\"display: none;\">\n");
      out.write("             <div class=\"col-md-6 offset-md-3 mt-5\" >\n");
      out.write("    <div class=\"card shadow\">\n");
      out.write("      <div class=\"card-body p-4\">\n");
      out.write("        <h3 class=\"font-weight-normal text-center mb-5\">Edit</h3>\n");
      out.write("        <form action=\"../patient/EditProcess.jsp\" method=\"POST\" class=\"mb-5\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"names\" id=\"names\" placeholder=\"names\">\n");
      out.write("            </div>\n");
      out.write("     \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input class=\"form-control\" type=\"date\" name=\"date\" id=\"date\" placeholder=\"Date\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <button class=\"btn btn-info btn-block my-5\">Update</button>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <script src=\"../jquery/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../DataTables/datatables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            var personID =null;\n");
      out.write("            function displadata(){\n");
      out.write("                $('#mytable').dataTable().fnDestroy();\n");
      out.write("                $.ajax({\n");
      out.write("                    url:\"http://localhost:8080/Appointment/patient/APIList.jsp\",\n");
      out.write("                    type:'GET',\n");
      out.write("                    dataType:'JSON',\n");
      out.write("                    \n");
      out.write("                    success: function(data){\n");
      out.write("                        console.log(data);\n");
      out.write("                        $('#mytable').dataTable({\n");
      out.write("                            \"aaData\":data,\n");
      out.write("                            \"scrollx\": true,\n");
      out.write("                            \"aoColumns\":[\n");
      out.write("                                {\"sTitle\":\"names\",mData:\"names\"},\n");
      out.write("                                {\"sTitle\":\"date\",mData:\"date\"},\n");
      out.write("                               \n");
      out.write("                                {\"sTitle\":\"ReSchedule\",\n");
      out.write("                                    mData:\"id\",\n");
      out.write("                                    \"render\": function(mData,type,row,meta)\n");
      out.write("                                    {\n");
      out.write("                                        return '<button class=\"btn btn-success\" onclick=\"getDetails('+ mData +')\">Edit</button>'\n");
      out.write("                                    }\n");
      out.write("                              \n");
      out.write("                                },\n");
      out.write("                                {\"sTitle\":\"Cancel\",\n");
      out.write("                                    mData:\"id\",\n");
      out.write("                                     \"render\": function(mData,type,row,meta)\n");
      out.write("                                    {\n");
      out.write("                                        return '<button class=\"btn btn-danger\" onclick=\"getDelete('+ mData +')\">Delete</button>'\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            ]\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            displadata();\n");
      out.write("            \n");
      out.write("            function getDetails(nid){\n");
      out.write("                \n");
      out.write("                document.getElementById(\"frm\").style.display=\"block\";\n");
      out.write("                \n");
      out.write("                $.ajax({\n");
      out.write("                    \n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: \"edit.jsp\",\n");
      out.write("                    data: {\"nid\": nid},\n");
      out.write("                    \n");
      out.write("                    success: function(data){\n");
      out.write("                        var obj = JSON.parse(data);\n");
      out.write("                        personID = obj[0].nid;\n");
      out.write("                        var db = new Date(Date(obj[0].dob));\n");
      out.write("                        var day = (\"0\" + db.getDate()).slice(-2);\n");
      out.write("                        var month = (\"0\" + db.getMonth()).slice(-2);\n");
      out.write("                        var dbo = db.getFullYear()+'-'+(month)+'-'+(day);\n");
      out.write("                        $('#nid').val(obj[0].nid);\n");
      out.write("                        $('#fname').val(obj[0].fname);\n");
      out.write("                        $('#lname').val(obj[0].lname);\n");
      out.write("                        $('#dob').val(dbo);\n");
      out.write("                        $('#email').val(obj[0].email);\n");
      out.write("                        $('#phone').val(obj[0].phone);\n");
      out.write("                        $('#status').val(obj[0].status);\n");
      out.write("                        $('#children').val(obj[0].children);\n");
      out.write("                        $('#occupation').val(obj[0].occupation);\n");
      out.write("                        $('#socialClass').val(obj[0].socialClass).prop('selected', true);\n");
      out.write("                        $('#prevVillage').val(obj[0].prevVillage);\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                        }\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            function getDelete(nid){\n");
      out.write("                \n");
      out.write("                 $.ajax({\n");
      out.write("                    \n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: \"delete.jsp\",\n");
      out.write("                    data: {\"nid\": nid},\n");
      out.write("                    success: function(data){\n");
      out.write("                        displadata(); \n");
      out.write("                    }\n");
      out.write("                    });\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
