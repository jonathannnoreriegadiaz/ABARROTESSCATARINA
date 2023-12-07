 
package Controlador;
 import Controlador.*;
public class GenerarCodigo extends Controlador{
    
    public GenerarCodigo(){}
    public static String CapturarLetrasCod(String cadena){
        String letra=""+cadena.charAt(0);
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)==' '){
                letra=letra+cadena.charAt(i+1);
            }
        }
        return letra;
    }
   public  String Codigonumero( ){
       String cod;  String num;
       num=this.DevolverDatosSql("select max(id_empleado)+1 from empleados", 1);
       if(num==null){
           num="1";
       } 
      return num;
   }
   public String GeneraCodigo(String cdn){
      String micodigo="";
      micodigo=CapturarLetrasCod(cdn)+"_"+Codigonumero();
      return micodigo;
   }
}
