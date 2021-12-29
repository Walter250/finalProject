package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.17/tailwind.min.css\"\n");
      out.write("      integrity=\"sha512-yXagpXH0ulYCN8G/Wl7GK+XIpdnkh5fGHM5rOzG8Kb9Is5Ua8nZWRx5/RaKypcbSHc56mQe0GBG0HQIGTmd8bw==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-YWzhKL2whUzgiheMoBFwW8CKV4qpHQAEuvilg9FAn5VJUDwKZZxkJNuGM4XkWuk94WCrrwslk8yWNGmY1EduTA==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    /> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"bg-blue-500 text-white shadow dark:bg-gray-800 h-12 m-4\">\n");
      out.write("        <div class=\"flex items-center justify-between\">\n");
      out.write("          <div>\n");
      out.write("            <a\n");
      out.write("              class=\"\n");
      out.write("            ml-4\n");
      out.write("              text-xl\n");
      out.write("              text-white\n");
      out.write("              font-bold\n");
      out.write("              dark:text-white\n");
      out.write("              md:text-2xl\n");
      out.write("              hover:text-gray-700\n");
      out.write("              dark:hover:text-gray-300\n");
      out.write("            \"\n");
      out.write("              href=\"/\"\n");
      out.write("            >\n");
      out.write("            APPOINTMENT MANAGER\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"items-center md:flex\">\n");
      out.write("            <div class=\"flex flex-col md:flex-row md:mx-6\">\n");
      out.write("              <a\n");
      out.write("                class=\"\n");
      out.write("              my-1\n");
      out.write("              font-bold\n");
      out.write("              font-bold\n");
      out.write("              text-white\n");
      out.write("              md:mx-4 md:my-0\n");
      out.write("              hover:text-gray-700\n");
      out.write("            \"\n");
      out.write("                href=\"signin\"\n");
      out.write("              >\n");
      out.write("                SIGN IN\n");
      out.write("              </a>\n");
      out.write("              <a\n");
      out.write("                class=\"\n");
      out.write("              my-1\n");
      out.write("              font-bold\n");
      out.write("              text-white\n");
      out.write("              md:mx-4 md:my-0\n");
      out.write("              hover:text-gray-700\n");
      out.write("            \"\n");
      out.write("                href=\"signup\"\n");
      out.write("              >\n");
      out.write("                SIGN UP\n");
      out.write("              </a>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("<!--    body    -->\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"m-16 grid  grid-cols-2 gap-0\">\n");
      out.write("          <div class=\"ml-32\">\n");
      out.write("            <img\n");
      out.write("              class=\"object-cover\"\n");
      out.write("              src=\"./image/bgDoc.jpg\"\n");
      out.write("              alt=\"HomePhoto\"\n");
      out.write("            >\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"\">\n");
      out.write("            <div class=\"\">\n");
      out.write("              \n");
      out.write("            <div class=\"px-6\">\n");
      out.write("              <div class=\"font-bold text-xl mb-2 text-blue-400\">\n");
      out.write("                APPOINTMENT MANAGER\n");
      out.write("              </div>\n");
      out.write("              <p class=\"text-gray-700 text-base\">\n");
      out.write("                Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                Voluptatibus quia, nulla! Maiores et perferendis eaque,\n");
      out.write("                exercitationem praesentium nihil. Lorem ipsum dolor sit amet,\n");
      out.write("                consectetur adipisicing elit. Voluptatibus quia, nulla! Maiores\n");
      out.write("                et perferendis eaque, exercitationem praesentium nihil. Lorem\n");
      out.write("                ipsum dolor sit amet, consectetur adipisicing elit. Voluptatibus\n");
      out.write("                quia, nulla! Maiores et perferendis eaque, exercitationem\n");
      out.write("                praesentium nihil. Lorem ipsum dolor sit amet, consectetur\n");
      out.write("                adipisicing elit. Voluptatibus quia, nulla! Maiores et\n");
      out.write("                perferendis eaque, exercitationem praesentium nihil. Lorem ipsum\n");
      out.write("                dolor sit amet, consectetur adipisicing elit. Voluptatibus quia,\n");
      out.write("                nulla! Maiores et perferendis eaque, exercitationem praesentium\n");
      out.write("                nihil. Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                Voluptatibus quia, nulla! Maiores et perferendis eaque,\n");
      out.write("                exercitationem praesentium nihil.\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("<!-- footer       -->\n");
      out.write("        <div class=\"flex justify-center mt-8 pb-16\">\n");
      out.write("        <i class=\"far fa-copyright\">Zatec 2021</i>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
