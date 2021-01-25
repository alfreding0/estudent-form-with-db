package core;
/** @author alfreding0*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class ConexionExample{
    private final String bd="tubasededatos";
    private final String url="jdbc:postgresql://localhost:5432/"+bd;
    private final String user="tuusuario";
    private final String pass="tucontraseña";
    private Connection cnx=null;
      
    public ConexionExample(){
        conectar(); 
    }
    
    public void conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            cnx= DriverManager.getConnection(url, user, pass);
        }catch (ClassNotFoundException | SQLException e) { 
            JOptionPane.showMessageDialog(null, "Error en la conexion!\n" + e.getMessage());
        }
    }
    
    public void desconectar(){
        if(getConnection()!=null){
            try {
                cnx.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Connection getConnection(){
        return cnx; 
    }
    
    public void ejecutarComando(String Comando) {
        try {
            Statement Cmd = cnx.createStatement();
            Cmd.execute(Comando);
        }catch (SQLException err) {
            System.out.println("Error al intentar ejecutar comando: " + err);
        }
    }
    
    public ResultSet ejecutarConsulta(String Consulta){
        ResultSet res = null;
        try {
            Statement stmt = cnx.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            res = stmt.executeQuery(Consulta);  
        }catch (SQLException err) {
            System.out.println("Error al intentar ejecutar consulta: " + err);
        }
        return res;
    }
}
