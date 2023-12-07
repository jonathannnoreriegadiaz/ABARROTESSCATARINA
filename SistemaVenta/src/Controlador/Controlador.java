 
package Controlador;
 import Conexion.Conexion;
import  java.sql.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import PersonalizacionTable.Render1;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
public class Controlador extends Conexion{
    private int columnas,filas;private JButton botontable;
public Controlador(){ DevolverConexion();}
public ResultSet DevolverRegistro(String sql){
    try{this.st=this.ConectarSQLServerJava().createStatement();
    this.rs=this.st.executeQuery(sql);
    }catch(Exception ex){ex.printStackTrace();}
    return this.rs;}
///Registrar, Actualizar y eliminar Registros
public String DevolverDatosSql(String sql, int colselect){
    String Datos="";try {
        this.rs=DevolverRegistro(sql);while(this.rs.next()){Datos=this.rs.getString(colselect);}
    } catch (Exception e) { }return Datos;}
    /// Método para mostrar en Combo
public void LlenarCombo(String sql, JComboBox cbo, int posselect){
    try {this.rs=DevolverRegistro(sql);
    while(this.rs.next()){cbo.addItem(this.rs.getString(posselect));}
     } catch (Exception e) {}
}
//limpiar Registros tabla
public void LimpiarTabla(DefaultTableModel mdt){while(mdt.getRowCount()>0){mdt.removeRow(0);}}
// llenar tabla registros
public void LlenarTablaBaseDatos(String sql,int tamanio,DefaultTableModel model ){
    LimpiarTabla(model);Object DatosSQL[]=new Object[tamanio];
    
    try{
        this.rs=DevolverRegistro(sql);while(this.rs.next()){
        for(int i=0;i<tamanio;i++){DatosSQL[i]=this.rs.getString(i+1);}model.addRow(DatosSQL);
        }
    }catch(Exception ex){}
}
public void MostrarProducots(String sql,DefaultTableModel model,JTable TAB,JButton botonMODIF,JButton BOTONDELETE){
    LimpiarTabla(model);
    TAB.setDefaultRenderer(Object.class, new Render1());
    try {
     this.rs=DevolverRegistro(sql);
    while(this.rs.next()){
   Object Datos[]={this.rs.getString(1),this.rs.getString(2),this.rs.getString(3),this.rs.getString(4),
    this.rs.getString(5),this.rs.getString(6),this.rs.getString(7),this.rs.getString(8),botonMODIF,BOTONDELETE};model.addRow(Datos); }
    } catch (Exception e) {}}
public void InsertarIcono(JButton botonJtable,String ruta){
 botonJtable.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));} 
public JButton BotonTableDinamico(JTable tabla,MouseEvent evt){
   columnas=tabla.getColumnModel().getColumnIndexAtX(evt.getX());
   filas=evt.getY()/tabla.getRowHeight();
  if(columnas<=tabla.getColumnCount() && columnas>=0 && filas<=tabla.getRowCount() && filas>=0){
   Object objeto=tabla.getValueAt(filas, columnas);
  ((JButton)objeto).doClick(); botontable=(JButton)objeto;}return botontable;}

public void MostrarEmpleados(String sql,DefaultTableModel model,JTable TAB,JButton botonMODIF,JButton BOTONDELETE){
    LimpiarTabla(model);
    TAB.setDefaultRenderer(Object.class, new Render1());
    try {
     this.rs=DevolverRegistro(sql);
    while(this.rs.next()){
   Object Datos[]={this.rs.getString(1),this.rs.getString(2),this.rs.getString(3),this.rs.getString(4),
    this.rs.getString(5),this.rs.getString(6),this.rs.getString(7),this.rs.getString(8),botonMODIF,BOTONDELETE};model.addRow(Datos); }
    } catch (Exception e) {}}
public void MostrarClientes(String sql,DefaultTableModel model,JTable TAB,JButton botonMODIF,JButton BOTONDELETE){
    LimpiarTabla(model);
    TAB.setDefaultRenderer(Object.class, new Render1());
    try {
     this.rs=DevolverRegistro(sql);
    while(this.rs.next()){
   Object Datos[]={this.rs.getString(1),this.rs.getString(2),this.rs.getString(3),this.rs.getString(4),
    this.rs.getString(5),this.rs.getString(6), botonMODIF,BOTONDELETE};model.addRow(Datos); }
    } catch (Exception e) {}}
public String DevolverSerirVenta(String sql){
    String serie="";String mandoSQL="";
    try {
        this.rs=DevolverRegistro(sql);
        while(this.rs.next()){
            mandoSQL=this.rs.getString(1);
        }
        if(mandoSQL==null){
            serie="FAC-0000001";
        }else{
            serie= mandoSQL;
        }} catch (Exception e) {}
     return serie;}
public void MostrarProductosVenta(String sql,DefaultTableModel model,JTable TAB,JButton botonAgregar){
  LimpiarTabla(model);
    TAB.setDefaultRenderer(Object.class, new Render1());
    try {
     this.rs=DevolverRegistro(sql);
    while(this.rs.next()){
   Object Datos[]={this.rs.getString(1),this.rs.getString(2),this.rs.getString(3),this.rs.getString(4),
    this.rs.getString(5),this.rs.getString(6),this.rs.getString(7),this.rs.getString(8), botonAgregar};model.addRow(Datos); }
    } catch (Exception e) {}  
}
public void MostrarClientesVenta(String sql,DefaultTableModel model,JTable TAB,JButton Botonenviar){
    LimpiarTabla(model);
    TAB.setDefaultRenderer(Object.class, new Render1());
    try {
     this.rs=DevolverRegistro(sql);
    while(this.rs.next()){
   Object Datos[]={this.rs.getString(1),this.rs.getString(2),this.rs.getString(3),this.rs.getString(4),
    this.rs.getString(5),this.rs.getString(6), Botonenviar};model.addRow(Datos); }
    } catch (Exception e) {}}
public void MostrarFacturas(String sql,DefaultTableModel model,JTable TAB,JButton Botonprint,JButton botonanular){
    LimpiarTabla(model);
    TAB.setDefaultRenderer(Object.class, new Render1());
    try {
     this.rs=DevolverRegistro(sql);
    while(this.rs.next()){
 Object Datos[]={this.rs.getString(1),this.rs.getString(2),this.rs.getString(3),this.rs.getString(4),this.rs.getString(5),Botonprint,botonanular};
 model.addRow(Datos); }
    } catch (Exception e) {}}
}
