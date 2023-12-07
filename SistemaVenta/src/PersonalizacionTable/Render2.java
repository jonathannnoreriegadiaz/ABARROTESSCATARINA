/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonalizacionTable;
 
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render2 extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JLabel labelresultado=(JLabel) super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);  
        if(o instanceof String){
            String Dato=(String)o;
            if(Dato.equals("Pagado")  ){
                labelresultado.setBackground(Color.GREEN);
                labelresultado.setForeground(Color.white);
              
            }else{
                if(Dato.equals("Anulado")  ){
                       labelresultado.setBackground(Color.red);
                labelresultado.setForeground(Color.white);
                  
                }
            }
        }
        return labelresultado;
    }
    
    
}
