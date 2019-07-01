package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hi")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HelloServlet() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException 
	{
		System.out.println("in init");

     }

	
	public void destroy() 
	{
		System.out.println("in destroy");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("in do-get");
        response.setContentType("text/html");
		try(PrintWriter pw =response.getWriter())
		{
			pw.write("<h4>Hello Servlet</h4>");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
