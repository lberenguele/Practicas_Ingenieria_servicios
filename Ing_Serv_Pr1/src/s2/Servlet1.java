package s2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*getServletContext().getRequestDispatcher("/Formulario.html").forward(request, response);
		
		/*response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Servlet Test</title></head>");
		out.println("<body ><center><h1> SERVLET TEST </h1>");
		String answer = request.getParameter("username");
		out.println("<h2> Username: " + answer + "</h2>");
		out.println("</center></body></html>");
		out.close();*/
		
		HttpSession sesion = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter html = response.getWriter();
		html.print("<strong>");
		Date date = (Date)sesion.getAttribute("date");
		if(date != null) {
		html.print("Último acceso de la sesión: " + date + "<br>");
		}
		else {
		html.print("Este es el primer acceso de la sesión <br>");
		}
		date = new Date();
		sesion.setAttribute("date", date);
		html.print("Fecha actual: " + date);
		html.print("</strong>");
		
		int interval = 20;
	    sesion.setMaxInactiveInterval(interval);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
