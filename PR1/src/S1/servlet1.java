package S1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet1() {
    	
    	
        // TODO Auto-generated constructor stub
    }
   
   
    		
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/Formulario.html").forward(request, response);
				
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("hola mundo");//
		
		/*HttpSession sesion = request.getSession(true);
		response.setContentType("text/html");
		PrintWriter html = response.getWriter();

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
		html.print("</strong>");*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*//Codigo para borrar la cookies
		Cookie[ ] cookies = request.getCookies( );
		for (Cookie cookie: cookies){
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);
		}*/
		
		
		//se leen los parametros
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String email = request.getParameter("email");
		
		//ser crea el objeto usuario (se supone que ya existe la clase usuario)
		Usuario usuario = new Usuario (nombre, apellidos, email);
		
		HttpSession session = request.getSession();
		session.setAttribute ("usuario",usuario);
		
		Cookie c = new Cookie("EmailCookie",email);
		c.setMaxAge(60*60*24*365*2);
		c.setPath("/");
		response.addCookie(c);
		
		session.setAttribute ("usuario",usuario);
		
		Cookie b = new Cookie("NombreCookie",nombre);
		b.setMaxAge(60*60*24*365);
		b.setPath("/");
		response.addCookie(b);
		
		
		/*// Comprueba si la cookie existe, si no existe no entra 
		HttpSession session1 = request.getSession( );
		Usuario usuario1 = (Usuario) session1.getAttribute ("usuario");
		String url = "";
		// Primero se comprueba si existe ya el usuario en la sesión
		if (usuario1 == null){
		//Si no existe el usuario se busca la cookie de email
		Cookie[ ] cookies = request.getCookies( );
		String cookieName ="emailCookie";
		String emailAddress = "";
		if (cookies != null){
			for (Cookie cookie: cookies){
			if (cookieName.equals(cookie.getName())) emailAddress =
			cookie.getValue();
			}
			}
			//Se comprueba si la cookie no existe:
			if (emailAddress.equals("")){
			url = "/PR1/servlet1"; //Se ofrecerá registrarse
			}
		}*/
		
		
		doGet(request, response);
	}
	
	
}
