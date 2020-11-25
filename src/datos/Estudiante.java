package datos;
/** @author alfreding0*/
public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String ci;
    private String sexo;
    private String telefono;

    public Estudiante() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.ci = "";
        this.sexo = "";
        this.telefono = "";
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    public String insertar()
    {
        return "INSERT INTO estudiante (nombre, apellido, ci, sexo, telefono) VALUES ('"+nombre+"','"+apellido+"','"+ci+"','"+sexo+"','"+telefono+"');";
    }
    public String actualizar()
    {
        return "UPDATE estudiante SET nombre='"+nombre+"', apellido='"+apellido+"', ci='"+ci+"', sexo='"+sexo+"', telefono='"+telefono+"' WHERE id="+id+";";
    }        
    public String eliminar()
    {
        return "DELETE from estudiante WHERE id="+id+";";
    }        
    public String buscar()
    {
        return "SELECT * FROM estudiante;";
    }
}