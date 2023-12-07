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
import static GUIS.Clientes.combogenero;
import static GUIS.Clientes.txtapellidos;
import static GUIS.Clientes.txtdireccion;
import static GUIS.Clientes.txtdni;
import static GUIS.Clientes.txtnombres;
import static GUIS.Clientes.txtruc;
import static GUIS.Clientes.txttelefono;
import static GUIS.ConsultaEmpleados.TABLEEMPLEADOS;
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
public class ConsultaClientes extends javax.swing.JDialog {
int x,y;public static DefaultTableModel modeltabla=new DefaultTableModel(){
    public boolean isCellEditable(int row,int col){
        return false;
    }
};
public static String IDcliente;public static String idPersona;
Controlador controlBase=new Controlador();
    public static JButton botonmodificar=new JButton();
    public static JButton botondelete=new JButton();
    public ConsultaClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();this.setResizable(false);this.setLocationRelativeTo(null);
        modeltabla.setColumnIdentifiers(new String[]{"# DNI","# RUC"," APELLIDOS Y NOMBRES","GÉNERO",
        "# TELÉFONO","DIRECCIÓN","MODIFICAR","ELIMINAR"});tablaclientes.setModel(modeltabla);
        controlBase.InsertarIcono(botonmodificar, "/imagenes/Edit.png");controlBase.InsertarIcono(botondelete, "/imagenes/eliminar.png");
        MostrarClientes();tablaclientes.setRowHeight(38);
        tablaclientes.getColumnModel().getColumn(2).setPreferredWidth(210);
        
        botonmodificar.setName("btnmod");botondelete.setName("btndel");
    }
 public void MostrarClientes(){
     controlBase.MostrarClientes("exec  proc_mostrar_clientes '%"+txtbuscar.getText()+"%'", modeltabla, tablaclientes, botonmodificar, botondelete);
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
        tablaclientes = new javax.swing.JTable();

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
        jLabel1.setText("CONSULTAR CLIENTES");

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

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

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

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
       MostrarClientes();
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        try {
         if(controlBase.BotonTableDinamico(tablaclientes, evt).getName().equals("btnmod")){
         Clientes cl=new Clientes(null, rootPaneCheckingEnabled);
         cl.labeltitulo.setText("Editar Clientes");cl.btnprincipal.setText("Guardar Cambios");
         MandarDatosClientes();cl.setVisible(true);
     }else{
             if(controlBase.BotonTableDinamico(tablaclientes, evt).getName().equals("btndel")){
           int resp=JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar al Cliente "
                + "\n"+tablaclientes.getValueAt(tablaclientes.getSelectedRow(), 2));
                 if(resp==JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, controlBase.DevolverDatosSql("exec proc_clientes "+idPersona+","+IDcliente+",'"+""+"','"
       +""+"','"+""+"','"+""+"','"
       +""+"','"+""+"','"+""+"',3 ",1)); MostrarClientes();
                 }else{
                     tablaclientes.clearSelection();
                 }
             }
         }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void LABELSALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseClicked
      dispose();
    }//GEN-LAST:event_LABELSALIRMouseClicked

   public void MandarDatosClientes(){
       String sql="select p.dni,c.ruc, p.apellidos,p.nombres  ,p.genero,p.direccion,\n" +
       "p.telefono,c.id_cliente,p.id_persona from clientes c inner join persona p on \n" +
       "c.id_persona=p.id_persona\n" +
       " where c.ruc='"+tablaclientes.getValueAt(tablaclientes.getSelectedRow(), 1).toString()+"'";
       try {
          controlBase.rs=controlBase.DevolverRegistro(sql);
          while(controlBase.rs.next()){
           IDcliente=controlBase.rs.getString(8);
           idPersona=controlBase.rs.getString(9);
           Clientes.txtdni.setText(controlBase.rs.getString(1));
           Clientes.txtnombres.setText(controlBase.rs.getString(4));
           Clientes.txtapellidos.setText(controlBase.rs.getString(3));
           Clientes.combogenero.setSelectedItem(controlBase.rs.getString(5));
            Clientes.txtdireccion.setText(controlBase.rs.getString(6));
           Clientes.txttelefono.setText(controlBase.rs.getString(7));
            Clientes.txtruc.setText(controlBase.rs.getString(2));
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
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultaClientes dialog = new ConsultaClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaclientes;
    public static javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
