 
package PersonalizacionTable;
 
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render1 extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JButton){
            JButton botontable=(JButton)value;
            return botontable;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);  
    }
    
    
}
