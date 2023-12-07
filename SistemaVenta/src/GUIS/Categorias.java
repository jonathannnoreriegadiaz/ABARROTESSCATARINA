/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import Controlador.*;
import static GUIS.categoriaconsulta.modelotabla1;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author INNOVA
 */
public class Categorias extends javax.swing.JDialog {

 
int x,y;Controlador controlbase=new Controlador(); 
    public Categorias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();LABELSALIR.setOpaque(true);Inicio(); 
        try {
             txtcategorias.setText(categoriaconsulta.tablaCategorias.getValueAt(categoriaconsulta.tablaCategorias.getSelectedRow(), 0).toString());
        } catch (Exception e) {
        }
        
    }
  
     public void Inicio(){this.setResizable(false);this.setLocationRelativeTo(null);}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LABELTITULO = new javax.swing.JLabel();
        LABELSALIR = new javax.swing.JLabel();
        txtcategorias = new javax.swing.JTextField();
        botonprincipal = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setText("Categoría :  ");

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        LABELTITULO.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        LABELTITULO.setForeground(new java.awt.Color(255, 255, 255));
        LABELTITULO.setText("Nuevas Categorias de Productos");

        LABELSALIR.setBackground(new java.awt.Color(0, 51, 204));
        LABELSALIR.setFont(new java.awt.Font("Arial Black", 0, 21)); // NOI18N
        LABELSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LABELSALIR.setText("X");
        LABELSALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(LABELTITULO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(LABELSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(LABELTITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(LABELSALIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botonprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Accept.png"))); // NOI18N
        botonprincipal.setText("Registrar");
        botonprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonprincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcategorias)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonprincipal)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonprincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LABELSALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseEntered
     LABELSALIR.setBackground(Color.red);LABELSALIR.setForeground(Color.white);
      
    }//GEN-LAST:event_LABELSALIRMouseEntered

    private void LABELSALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseExited
         LABELSALIR.setBackground(new Color(0,51,204));LABELSALIR.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_LABELSALIRMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
      x=evt.getX();y=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
     Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void LABELSALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseClicked
       hide();
        try {
            categoriaconsulta.tablaCategorias.clearSelection();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_LABELSALIRMouseClicked

    private void botonprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonprincipalActionPerformed
         
        if(botonprincipal.getText().equals("Registrar")){
             if(txtcategorias.getText().trim().length()==0){
           txtcategorias.grabFocus();
       }else{
           JOptionPane.showMessageDialog(null, controlbase.DevolverDatosSql("exec proc_tipoproductos 0,'"+txtcategorias.getText()+"',1",1));
           txtcategorias.setText("");txtcategorias.grabFocus();
           try {Productos.comboproducto.removeAllItems();
              controlbase.LlenarCombo("select *from categorias",Productos.comboproducto,2);
              Productos.comboproducto.setSelectedIndex(-1);
              hide();
        } catch (Exception e) {
        }
       }
         }else{
             if(botonprincipal.getText().equals("Actualizar")){  
             
             if(txtcategorias.getText().trim().length()==0){
                 txtcategorias.grabFocus();
             }else{
                  JOptionPane.showMessageDialog(null, controlbase.DevolverDatosSql("exec proc_tipoproductos "+categoriaconsulta.ID+",'"+txtcategorias.getText()+"',2",1));
             txtcategorias.setText("");txtcategorias.grabFocus(); 
             controlbase.LlenarTablaBaseDatos("select NombreCategoria from categorias", 1,  modelotabla1 );
             dispose();
             }
            
             }
         }
    }//GEN-LAST:event_botonprincipalActionPerformed

    
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
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Categorias dialog = new Categorias(new javax.swing.JFrame(), true);
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
    public static javax.swing.JLabel LABELTITULO;
    public static javax.swing.JButton botonprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField txtcategorias;
    // End of variables declaration//GEN-END:variables
}
