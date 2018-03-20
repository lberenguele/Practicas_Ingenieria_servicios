package S1;

public class Usuario {
 String Nombre;
 String Apellidos;
 String Email;
 String Admin;
 String Pass;
 
 public Usuario(String nombre, String apellidos, String email, String admin, String pass){
	 Nombre = nombre;
	 Apellidos = apellidos;
	 Email = email;
	 Admin = admin;
	 Pass = pass;
	 
 }
 
 public String getNombre(){
	 return Nombre;
 }
 public String getApellidos(){
	 return Apellidos;
 }
 public String getEmail(){
	 return Email;
 }
 
 public String getAdmin(){
	 return Admin;
 }
 
 public String getPass(){
	 return Pass;
 }
 
 
 public void setNombre(String nombre){
	 Nombre = nombre;
 }
 public void setApellidos(String apellidos){
	 Apellidos = apellidos;
 }
 public void setEmail(String email){
	 Email = email;
 }
 public void setAdmin(String admin){
	 Admin = admin;
 }
 
 public void setPass(String pass){
	 Pass = pass;
 }
}
