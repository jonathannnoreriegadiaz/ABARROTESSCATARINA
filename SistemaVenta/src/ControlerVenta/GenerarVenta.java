 
package ControlerVenta;
 
import Controlador.NumeroLetras;
import GUIS.Ventas;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import PersonalizacionTable.*;
import javax.swing.JButton;

public class GenerarVenta {public GenerarVenta(){}DecimalFormat red=new DecimalFormat("#.00");
private String producto;private String descripcion;private double precio;private int unidades;
private double importe;NumeroLetras cambioDinero=new NumeroLetras();
public boolean ExisteTabla(DefaultTableModel mdt,String Dato, int pos){
    boolean bandera=false;
    for(int i=0;i<mdt.getRowCount();i++){
     if(mdt.getValueAt(i, pos).equals(Dato)){
     bandera=true;}}
     return bandera;}
public void RegistrarTablaDetalleVanta(JTable tab,DefaultTableModel mdt,String Dato, int pos,JTable tabla,int unidad,JButton btnquitar){
     tab.setDefaultRenderer(Object.class, new Render1());
    if(!ExisteTabla(mdt, Dato, pos)){ 
        producto=tabla.getValueAt(Ventas.fila,1).toString();descripcion=tabla.getValueAt(Ventas.fila, 2).toString();
        precio=Double.parseDouble(tabla.getValueAt(Ventas.fila, 3).toString());
        importe=precio*unidad;
        Object struct[]={producto,descripcion,red.format(precio),unidad,(double)Math.round(importe * 100d) / 100d,btnquitar};mdt.addRow(struct);
        Ventas.labelsubtotal.setText("$./ "+red.format(Subtotales(tab)));Ventas.labeliva.setText("$./ "+red.format(IVAGENERADO(tab)));
        Ventas.labeltotal.setText("$./ "+red.format(TotalPagoImporte(tab)));Ventas.labelcantidadtotal.setText(""+CantidadVendida(tab));
        Ventas.dinerotexto.setText(cambioDinero.ImprimirDineroLetra( TotalPagoImporte(tab)));
    }else{
        JOptionPane.showMessageDialog(null, "El producto "+producto+" ya está agregado a la lista de detalles de venta, escoja otro",
         "Mensaje del sistema",JOptionPane.WARNING_MESSAGE);}}
public int CantidadVendida(JTable table){
  int cantidadVendida=0;
  for(int i=0;i<table.getRowCount();i++){
      cantidadVendida+=Integer.parseInt(table.getValueAt(i,3).toString());
  }return cantidadVendida;}
public double TotalPagoImporte(JTable table){
    double totalpago=0.0;
    for(int i=0;i<table.getRowCount();i++){
      totalpago+=Double.parseDouble(table.getValueAt(i,4).toString());
  }return totalpago;}
public double Subtotales(JTable table){
    double subtotal=0.0;double total=0.0;
    total=TotalPagoImporte(table);
    subtotal=total/1.18;
   return subtotal;}
public double IVAGENERADO(JTable table){
    double IVA=0.0;double total=0.0;double subtot=0.0;
    subtot=Subtotales(table);
    total=TotalPagoImporte(table);
   IVA=total-subtot;
   return IVA;}
public void QuitarProductoLista(JTable tablaDetalle,DefaultTableModel mdt){
    int fila=tablaDetalle.getSelectedRow();
    if(fila>=0){
       mdt.removeRow(fila);
      if(tablaDetalle.getRowCount()>0){
         Ventas.labeltotal.setText("$ "+red.format(TotalPagoImporte(tablaDetalle)));
        Ventas.labelsubtotal.setText("$ "+red.format(Subtotales(tablaDetalle)));
         Ventas.labeliva.setText("$ "+red.format(IVAGENERADO(tablaDetalle)));
         Ventas.labelcantidadtotal.setText(" "+CantidadVendida(tablaDetalle));   
         Ventas.dinerotexto.setText(cambioDinero.ImprimirDineroLetra( TotalPagoImporte(tablaDetalle)));
      }else{
        Ventas.labeltotal.setText("$./ "+0.0);
        Ventas.labelsubtotal.setText("$./ "+0.0);
         Ventas.labeliva.setText("$./ "+0.0);
         Ventas.labelcantidadtotal.setText("0");
       Ventas.dinerotexto.setText("");
      }
       }else{
          
       }    

   }
    
}
