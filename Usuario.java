public class Usuario{
    public String nombre;
    public String apellidos;
    public String email;

    public Usuario(String n, Strin a, String e){
        this.nombre = n;
        this.apellidos = a;
        this.email = e;
    }

    public String toString(){
        return nombre + " " + apellidos + ".\nEmail: " + email;
    }
}