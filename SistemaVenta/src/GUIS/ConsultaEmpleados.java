/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import Controlador.*;
import static GUIS.Empleados.combocargo;
import static GUIS.Empleados.combogenero;
import static GUIS.Empleados.txtapellidos;
import static GUIS.Empleados.txtcodigo;
import static GUIS.Empleados.txtcorreo;
import static GUIS.Empleados.txtdireccion;
import static GUIS.Empleados.txtdni;
import static GUIS.Empleados.txtnombres;
import static GUIS.Empleados.txttelefono;
import javax.swing.JOptionPane;
public class ConsultaEmpleados extends javax.swing.JDialog {
int x,y;public static DefaultTableModel modeltabla=new DefaultTableModel(){
    public boolean isCellEditable(int row,int col){
        return false;
    }
};
public static String ID,ID1;
Controlador controlBase=new Controlador();
    public static JButton botonmodificar=new JButton();
    public static JButton botondelete=new JButton();
    public ConsultaEmpleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();this.setResizable(false);this.setLocationRelativeTo(null);
        modeltabla.setColumnIdentifiers(new String[]{"CÓDIGO","# DNI","APELLIDOS Y NOMBRES","GÉNERO",
        "DIRECCIÓN","CORREO ELECTRÓNICO","# TELÉFONO","CARGO","MODIFICAR","ELIMINAR"});TABLEEMPLEADOS.setModel(modeltabla);
        controlBase.InsertarIcono(botonmodificar, "/imagenes/Edit.png");controlBase.InsertarIcono(botondelete, "/imagenes/eliminar.png");
        MostrarEmpleados();TABLEEMPLEADOS.setRowHeight(34);
        TABLEEMPLEADOS.getColumnModel().getColumn(2).setPreferredWidth(200);
        TABLEEMPLEADOS.getColumnModel().getColumn(5).setPreferredWidth(200);
        TABLEEMPLEADOS.getColumnModel().getColumn(4).setPreferredWidth(130);
        botonmodificar.setName("btnmod");botondelete.setName("btndel");
    }
 public void MostrarEmpleados(){
     controlBase.MostrarEmpleados("exec  proc_listar_empleados '%"+txtbuscar.getText()+"%'", modeltabla, TABLEEMPLEADOS, botonmodificar, botondelete);
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LABELSALIR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLEEMPLEADOS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTAR EMPLEADOS");

        LABELSALIR.setBackground(new java.awt.Color(102, 102, 255));
        LABELSALIR.setFont(new java.awt.Font("Arial Black", 0, 29)); // NOI18N
        LABELSALIR.setForeground(new java.awt.Color(102, 102, 102));
        LABELSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LABELSALIR.setText("X");
        LABELSALIR.setOpaque(true);
        LABELSALIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LABELSALIRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LABELSALIRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LABELSALIRMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LABELSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(11, 11, 11))
            .addComponent(LABELSALIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa busqueda.png"))); // NOI18N
        jLabel2.setText("BUSCAR :  ");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });

        TABLEEMPLEADOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TABLEEMPLEADOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLEEMPLEADOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLEEMPLEADOS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LABELSALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseEntered
      LABELSALIR.setBackground(Color.red);LABELSALIR.setForeground(Color.white);
    }//GEN-LAST:event_LABELSALIRMouseEntered

    private void LABELSALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseExited
    LABELSALIR.setBackground(new Color(102,102,255));LABELSALIR.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_LABELSALIRMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
      x=evt.getX();y=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void TABLEEMPLEADOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLEEMPLEADOSMouseClicked
        try {
            if(controlBase.BotonTableDinamico(TABLEEMPLEADOS, evt).getName().equals("btnmod")){
         Empleados emp=new Empleados(null, rootPaneCheckingEnabled);
         emp.btnprincipal.setText("Guardar Cambios");emp.labeltitulo.setText("Editar Trabajadores");
        MandarDatosempleados(); emp.setVisible(true);
     }else{
         if(controlBase.BotonTableDinamico(TABLEEMPLEADOS, evt).getName().equals("btndel")){
                int resp=JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar al trabajador "
                + "\n"+TABLEEMPLEADOS.getValueAt(TABLEEMPLEADOS.getSelectedRow(), 2));
                if(resp==JOptionPane.YES_OPTION){
                     JOptionPane.showMessageDialog(null,controlBase.DevolverDatosSql("exec proc_empleados "+ID1+","+ID+",'"+txtcodigo.getText()+"','"+txtdni.getText()+"','"
    +txtnombres.getText()+"','"+txtapellidos.getText()+"','"+combogenero.getSelectedItem().toString()+"','"
    +txttelefono.getText()+"','"+txtdireccion.getText()+"','"+combocargo.getSelectedItem().toString()+"','"
     +txtcorreo.getText()+"',3",1)); 
                     MostrarEmpleados();
                }else{
                    TABLEEMPLEADOS.clearSelection();
                }
         }
     }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TABLEEMPLEADOSMouseClicked

    private void LABELSALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseClicked
      dispose();
    }//GEN-LAST:event_LABELSALIRMouseClicked

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
      MostrarEmpleados();
    }//GEN-LAST:event_txtbuscarKeyPressed

   public void MandarDatosempleados(){
       String sql="select e.codigo,p.dni, p.apellidos,p.nombres  ,p.genero,p.direccion,\n" +
       "e.correo,p.telefono,cg.cargo,e.id_empleado,p.id_persona from empleados e inner join persona p on \n" +
       "e.id_persona=p.id_persona inner join cargos cg on e.id_cargo=cg.id_cargo\n" +
       " where p.dni='"+TABLEEMPLEADOS.getValueAt(TABLEEMPLEADOS.getSelectedRow(), 1).toString()+"'";
       try {
          controlBase.rs=controlBase.DevolverRegistro(sql);
          while(controlBase.rs.next()){
              ID=controlBase.rs.getString(10);
              ID1=controlBase.rs.getString(11);
            Empleados.txtdni.setText(controlBase.rs.getString(2));
            Empleados.txtnombres.setText(controlBase.rs.getString(4));
            Empleados.txtapellidos.setText(controlBase.rs.getString(3));
            Empleados.txtcodigo.setText(controlBase.rs.getString(1));
            Empleados.combogenero.setSelectedItem(controlBase.rs.getString(5));
            Empleados.combocargo.setSelectedItem(controlBase.rs.getString(9));
            Empleados.txtdireccion.setText(controlBase.rs.getString(6));
            Empleados.txttelefono.setText(controlBase.rs.getString(8));
            Empleados.txtcorreo.setText(controlBase.rs.getString(7));
          }
       } catch (Exception e) {
       }
   }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultaEmpleados dialog = new ConsultaEmpleados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABELSALIR;
    public static javax.swing.JTable TABLEEMPLEADOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
