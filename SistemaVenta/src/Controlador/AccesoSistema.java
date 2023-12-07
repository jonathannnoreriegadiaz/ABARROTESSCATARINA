 
package Controlador;
 import Conexion.*;
import GUIS.MenuSistema;
public class AccesoSistema extends Conexion {public AccesoSistema(){}
    Controlador con=new Controlador();
public String  EntrarSistema(String sql){String msj="";
    try {
       this.rs=con.DevolverRegistro(sql);
       if(this.rs.next()){
          msj="1";
       }else{
           msj="0";
       }
    } catch (Exception e) {
    }return msj;
}   
public String CapturarUsuarioSistema(String sql,int posSelect){
    String usuarioConectado="";
    try {
        this.rs=con.DevolverRegistro(sql);while(this.rs.next()){usuarioConectado=this.rs.getString(posSelect);}
    } catch (Exception e) { }
    return usuarioConectado;
}
}
