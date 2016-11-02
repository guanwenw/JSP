// Import required java libraries
// 
// compile: 
// javac -cp /usr/local/apache-tomcat-8.5.6/lib/servlet-api.jar HelloWorld.java 
// move HelloWorld.class to 
// /Library/Tomcat/webapps/ROOT/WEB-INF/classes
//
// add into web.xml
// <servlet>
//    <servlet-name>HelloWorld</servlet-name>
//       <servlet-class>HelloWorld</servlet-class>
//    </servlet>
//
//    <servlet-mapping>
//       <servlet-name>HelloWorld</servlet-name>
//    <url-pattern>/HelloWorld</url-pattern>
// </servlet-mapping>
//
// Run:
// http://localhost:8080/HelloWorld
//
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
        throws ServletException, IOException
    {
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy()
    {
        // do nothing.
    }
}
