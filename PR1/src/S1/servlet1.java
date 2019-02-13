package S1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.SQLException;

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
		getServletContext().getRequestDispatcher("/Formulario_ID.html").forward(request, response);
		
		
				
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
	

		/*//se leen los parametros
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String email = request.getParameter("email");
		
		//ser crea el objeto usuario (se supone que ya existe la clase usuario)
		Usuario usuario = new Usuario (nombre, apellidos, email,"SI");
		
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
		response.addCookie(b);*/
		
	
		
			
			// Se leen los parámetros
			//String nombre = request.getParameter("nombre");
			//String apellidos = request.getParameter("apellidos");
			//String email = request.getParameter("email");
		    //String admin = request.getParameter("admin");
		    
			// Se crea el objeto usuario
		  //  Usuario usuario = new Usuario(nombre, apellidos, email, admin);
		    
			// Se añade el usuario al objeto request como atributo
			//request.setAttribute("usuario", usuario);
			
			// Se reenvían los objetos request y response a la url especificada
			 //El JSP tendrá disponible los datos del usuario en el atributo usuario
			//String url = "/TablaUsuario.jsp“;"*/
		
		
		
		
		// html = response.getWriter();
			
		ArrayList<Usuario> user = new ArrayList<Usuario> ();
		Usuario user1 = new Usuario ("Luis","Berenguel", "luis@gmail.com", "SI", "123");
	    Usuario user2 = new Usuario ("Antonio","Pamos", "antonio@gmail.com", "NO", "1234");
	    Usuario user3 = new Usuario ("Lucas","Lopez","lucas@gmail.com", "SI", "12345");
		
		  user.add(user1);
		  user.add(user2);
		  
		  // recojo el campo del formulario de login
		  String UserForm=(String)request.getParameter("email");
		  String PassForm=(String)request.getParameter("pass");
		
		 
		  
		 int EsAdmin = 0;
		  
		 for(int i = 0; i < user.size(); i++){
			 
			 if(UserForm.equals(user.get(i).getEmail()) && PassForm.equals(user.get(i).getPass())){
				 
				 if(user.get(i).getAdmin().equals("SI")){
					 EsAdmin = 1;
					 
				 }
			 }
		 }
		 
		/* if(EsAdmin == 1){
			 request.setAttribute("Usuario", user);
			 String url = "/TablaUsuario.jsp";
			 getServletContext().getRequestDispatcher(url).forward(request, response);
			 
		 }else{
			 //html.print("No eres Administrador");
			 String url = "/servlet2";
			 getServletContext().getRequestDispatcher(url).forward(request, response);
		 }*/
		 
		 
		 
		
	 
		  
		
		
		//HttpSession session = request.getSession( );
		//Usuario usuario1 = (Usuario) session.getAttribute ("usuario");
		// Primero se comprueba si existe ya el usuario en la sesión
	//	if (admin == null){
			
	//	}
		
	//	doGet(request, response);
	}
	
	
}
