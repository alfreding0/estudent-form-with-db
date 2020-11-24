package negocio;
/** @author Curso de Git*/
import datos.Conexion;
import datos.Estudiante;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NEstudiante {
    Estudiante est =new Estudiante();
    private final Conexion cnx;
    DefaultTableModel model;
    
    public NEstudiante() {
        cnx=new Conexion();
    }
    
    public void insertarEstudiante(String nombre, String apellido, String ci, String sexo, String telefono) {
        est.setNombre(nombre);
        est.setApellido(apellido);
        est.setCi(ci);
        est.setSexo(sexo);
        est.setTelefono(telefono);
        cnx.EjecutarComando(est.insertar());
    }
    
    public void buscarEstudiante(JTable tablaEstudiante) {
        try {
            String [] titulos = {"ID","NOMBRES","APELLIDOS","CI","SEXO","TELEFONO"};
            model = new DefaultTableModel(null, titulos);
            
            ResultSet rs=cnx.EjecutarConsulta(est.buscar());
            ResultSetMetaData datos = rs.getMetaData();
            
            int nc=datos.getColumnCount();
            
            while (rs.next()) {
                Object f []= new Object [nc];
                for(int i=0;i<nc;i++){
                    f[i]=rs.getObject(i+1);
                }
                model.addRow(f);
            }
            tablaEstudiante.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al mostrar clientes!\n"+ex.getMessage());
        }
    }
    
    public void eliminarEstudiante(String id) {
        est.setId(id);
        cnx.EjecutarComando(est.eliminar());
    }
    
    public  void actualizarEstudiante(String codigo, String nombre, String apellido, String ci, String sexo, String telefono) {
        est.setId(ci);
        est.setNombre(nombre);
        est.setApellido(apellido);
        est.setCi(ci);
        est.setSexo(sexo);
        est.setTelefono(telefono);
        cnx.EjecutarComando( est.actualizar() );
    }
}
