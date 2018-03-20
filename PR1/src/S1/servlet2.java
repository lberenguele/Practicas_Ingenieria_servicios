package S1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 getServletContext().getRequestDispatcher("/Formulario.html").forward(request, response);
	      
	}	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		 try{  
	    	   
	           response.setContentType("text/html");  
	           PrintWriter out = response.getWriter();  
	             
	           //String n=request.getParameter("userName");  
	          // out.print("Welcome "+n);  
	             
	           HttpSession session=request.getSession();  
	         //  session.setAttribute("uname",n);  
	     
	           out.print("<a href='/PR1/Formulario.html'>pincha para el registro</a>");  
	                     
	           out.close();  
	     
	                   }catch(Exception e){System.out.println(e);}  
	       
	      
	}
		
	
		

	

}
