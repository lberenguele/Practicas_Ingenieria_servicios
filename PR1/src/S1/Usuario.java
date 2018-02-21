package S1;

public class Usuario {
 String nombre;
 String apellidos;
 String email;
 
 public Usuario(String n, String a, String e){
	 nombre = n;
	 apellidos = a;
	 email = e;
 }
 
 public String getNombre(){
	 return nombre;
 }
 public String getApellidos(){
	 return apellidos;
 }
 public String getEmail(){
	 return email;
 }
 
 public void setNombre(String n){
	 nombre = n;
 }
 public void setApellidos(String a){
	 apellidos = a;
 }
 public void setEmail(String e){
	 email = e;
 }
}
