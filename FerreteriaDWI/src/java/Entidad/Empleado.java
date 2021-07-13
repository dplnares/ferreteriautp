
package Entidad;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String login;
    private String clave;   

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String login, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.clave = clave;
    }
    
    public Empleado(String nombre, String apellido,String login, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login= login;
        this.clave= clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
