<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% HttpSession sessionsa = request.getSession(true);
   sessionsa.setMaxInactiveInterval(10);
if(sessionsa.getAttribute("user") == null){
	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String email = request.getParameter("email");


	sessionsa.setAttribute("user",nombre); 
	sessionsa.setAttribute("surname",apellidos);
	sessionsa.setAttribute("mail",email);	
	
}
%>
<%= sessionsa.getAttribute("user") %>
<%= sessionsa.getAttribute("surname") %>
<%= sessionsa.getAttribute("mail") %>



</body>
</html>
