 
package Conexion;
import java.awt.event.KeyEvent;
 import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {public Conexion(){}
private SQLException vento;
private String usuario="sa";private String contraseña="123";
private String server="DESKTOP-507PQAL\\SERVIDOR3";private String BaseDatos="SistemaVentas1";
private Connection conectar=null;private String url="com.microsoft.sqlserver.jdbc.SQLServerDriver";
private String url1="jdbc:sqlserver://"+server+";databaseName="+BaseDatos+";";
public static ResultSet rs;public static Statement st;public static String consultasql;
private String msj="A ocurrido un error al conectarse con SQL Server , Porfavor"
        + "\n verfique bién su password y usuario de SQL server que tiene en si"
        + "\n usted , las credenciales resultaron incorrectas podría ser por falta "
        + "\n del Driver, si es asi porfavor proceda a agregar el driver de la coneción"
        + "\n de la base de datos de java y SQL Server"
        + "\n"
        + "\n"
        + "\n"
        + "!!Conexión Denegada para el usuario : "+usuario+" , password : "+contraseña+""
        + "\n Base de Datos : "+BaseDatos+" ¡¡"
        + "\n Aquì puede observar mas informaciòn sobre los errores posible "
        + "\nque en si pueda estar ocurriendo con la conexiòn ";
public Connection conectarse=null;
public Connection ConectarSQLServerJava(){
    try{Class.forName(url);
    conectarse=DriverManager.getConnection(url1,usuario,contraseña);
    }catch(Exception ex){ex.printStackTrace();}
    return conectarse;}
// devolver conexion
public void DevolverConexion(){
    String Mensajesql="";
    if(ConectarSQLServerJava()==null){
//   JOptionPane.showMessageDialog(null,msj,"Error en la Conexión de SQL Server",
//   JOptionPane.ERROR_MESSAGE);
    }else{  }}
/// Devolver Desconexion de la base de datos
public void Desconectarse(){
    try {conectar.close();} catch (Exception e) {}}
    
}
