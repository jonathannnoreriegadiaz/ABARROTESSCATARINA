/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Conexion.*;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
public class GenerarReportes extends Conexion{public GenerarReportes(){}
/// imprimir Reportes sin parámetros
public void ImprimirInformes(String ruta,String titulo){
    try{
     JasperReport Reporte=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta));   
     JasperPrint impreso=JasperFillManager.fillReport(Reporte,null,this.ConectarSQLServerJava());
     int paginas=impreso.getPages().size();
     if(paginas>0){
    JasperViewer visualizarInform=new JasperViewer(impreso,false);
  visualizarInform.setVisible(true);visualizarInform.setTitle(titulo);}}catch(Exception ex){}
}
public void ImprimirInformesConParametros(String ruta,String titulo,String datoireport,String DatoEnvio){
    try{
     Map parametro=new HashMap();parametro.put(datoireport,DatoEnvio);
     JasperReport Reporte=(JasperReport)JRLoader.loadObject(getClass().getResource(ruta));   
     JasperPrint impreso=JasperFillManager.fillReport(Reporte,parametro,this.ConectarSQLServerJava());
     int paginas=impreso.getPages().size();
     if(paginas>0){
    JasperViewer visualizarInform=new JasperViewer(impreso,false);
  visualizarInform.setVisible(true);visualizarInform.setTitle(titulo); visualizarInform.setZoomRatio((float) 0.74);}}catch(Exception ex){ex.printStackTrace();}
}
    
}
