package s2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1_2
 */
@WebServlet("/Servlet1_2")
public class Servlet1_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/Formulario.html").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 try{  
	    	   
	           response.setContentType("text/html");  
	           PrintWriter out = response.getWriter();  
	             
	           //String n=request.getParameter("userName");  
	          // out.print("Welcome "+n);  
	             
	           HttpSession session=request.getSession();  
	         //  session.setAttribute("uname",n);  
	     
	           out.print("<a href='/Ing_Serv_Pr1/Formulario.html'>pincha para el registro</a>");  
	                     
	           out.close();  
	     
	                   }catch(Exception e){System.out.println(e);}  
	}

}
