package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class user_005ffacility_005faccess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link type=\"text/css\" href=\"CSS/main.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <h2>Identity Based Encryption using KU-CSP</h2>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"csp_home.jsp\">CSP HOME</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"user_facility_access.jsp\">USER FACILITY</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                     <a href=\"#\">CLOUD DOWNLOADS</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"key_request.jsp\">KEY REQUEST</a>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"logout.jsp\"> LOGOUT</a>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"abs\">\n");
      out.write("            <div class=\"welcome\"><h2>MODIFY USER ACCESS</h2>\n");
      out.write("            \n");
      out.write("                <div class=\"innerdiv1\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr class=\"tbltr\">\n");
      out.write("                            <td class=\"tblrow\">\n");
      out.write("                                User Name\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"tblrow\">\n");
      out.write("                                Email\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"tblrow\">\n");
      out.write("                                Mobile\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"tblrow\">\n");
      out.write("                                Place\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"tblrow\">\n");
      out.write("                                Status\n");
      out.write("                            </td>\n");
      out.write("                         <!--   <td class=\"tblrow\">\n");
      out.write("                                Activate\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"tblrow\">\n");
      out.write("                                Deactivate\n");
      out.write("                            </td> -->\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibeorcc","root","password");
                            String query="select * from users";
                            Statement st=con.createStatement();
                            ResultSet rs=st.executeQuery(query);
                            while(rs.next())
                            {
                            out.println("<tr style='text-align:center;'><td>'"+rs.getString(1)+"'</td>"
                                    + "<td>'"+rs.getString(2)+"'</td>"
                                    + "<td>'"+rs.getString(4)+"'</td>"
                                    + "<td>'"+rs.getString(5)+"'</td>"
                                    + "<td>'"+rs.getString(6)+"'</td>"
                                   // + "<td><input style='color:green;' type='submit' value='Activate'></td>"
                                   // + "<td><input style='color:red;' type='submit' value='Deactivate'></td>"
                                    + "</tr>");
                            }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                        <form method=\"POST\" action=\"UserAccessActivateDeactivate\">\n");
      out.write("                            <h3> Enter users Email to Activate/Deactivate</h3>\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Email: </td>\n");
      out.write("                                    <td><input type=\"text\" name =\"user_email_to_Activate\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td><input type=\"submit\" value=\"Activate/Deactivate\" ></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </center>\n");
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
