/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import Controlador.AccesoSistema;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;
import Controlador.Controlador;
import javax.swing.UIManager;

public class Logín extends javax.swing.JFrame {
 int x,y;AccesoSistema acceso=new AccesoSistema();  MenuSistema menu=new MenuSistema();
 String sqlperfil="";
 Controlador controlbase=new Controlador();
 
    public Logín() { 
        initComponents();this.setDefaultCloseOperation(EXIT_ON_CLOSE);comoperfil.grabFocus();this.setResizable(false);this.setLocationRelativeTo(null);
        comoperfil.addItem("Administrador");comoperfil.addItem("Vendedor");comoperfil.setSelectedIndex(-1);
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelsalir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comoperfil = new javax.swing.JComboBox<>();
        txtuser = new javax.swing.JTextField();
        txtclave = new javax.swing.JPasswordField();
        BotonEntrarSistema = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
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

        jPanel3.setBackground(new java.awt.Color(51, 0, 255));

        labelsalir.setBackground(new java.awt.Color(255, 0, 0));
        labelsalir.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        labelsalir.setForeground(new java.awt.Color(102, 102, 102));
        labelsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsalir.setText("X");
        labelsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelsalir.setOpaque(true);
        labelsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelsalirMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bernard MT Condensed", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Acceso Al Sistema de Ventas ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Perfíl : ");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User (Nick): ");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password : ");

        comoperfil.setBorder(null);
        comoperfil.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comoperfilPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtuser.setBackground(new java.awt.Color(102, 102, 102));
        txtuser.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setBorder(null);
        txtuser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        txtclave.setBackground(new java.awt.Color(102, 102, 102));
        txtclave.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtclave.setForeground(new java.awt.Color(255, 255, 255));
        txtclave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtclave.setBorder(null);
        txtclave.setCaretColor(new java.awt.Color(255, 255, 255));

        BotonEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Accept.png"))); // NOI18N
        BotonEntrarSistema.setText("Entrar");
        BotonEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEntrarSistemaActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton2.setText("Salir");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actions-edit-delete-icon.png"))); // NOI18N
        jButton3.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BotonEntrarSistema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtclave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comoperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtclave)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x=evt.getX();y=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
          Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void labelsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelsalirMouseEntered
      labelsalir.setForeground(Color.white);
    }//GEN-LAST:event_labelsalirMouseEntered

    private void labelsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelsalirMouseExited
       labelsalir.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_labelsalirMouseExited

    private void labelsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelsalirMouseClicked
     System.exit(0);
    }//GEN-LAST:event_labelsalirMouseClicked
public String  AsiganrUsuario(){
    String usuario="";
    sqlperfil="select cargo from usuarios us inner join cargos cg on "
            + "us.id_cargo=cg.id_cargo where us.usuario='"+txtuser.getText()+"'";
   usuario="Usuario Conectado : "+controlbase.DevolverDatosSql(sqlperfil,1)+" -- > "+
        acceso.CapturarUsuarioSistema("select concat(apellidos,' , ',nombres) from persona p inner join empleados e"
         + " on e.id_persona=p.id_persona inner join usuarios u on u.id_persona=p.id_persona "
          +" where u.usuario='"+txtuser.getText()+"'", 1);return usuario;}
    private void BotonEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEntrarSistemaActionPerformed
       if(comoperfil.getSelectedIndex()>=0){
            String sql="select *from usuarios where usuario='"+txtuser.getText()+"' and contraseña='"+txtclave.getText()+"' and id_cargo=(select id_cargo from cargos "
           + "where cargo='"+comoperfil.getSelectedItem().toString()+"')";
        if(acceso.EntrarSistema(sql).equals("1")){dispose();
          menu.setVisible(true);menu.setTitle(AsiganrUsuario());menu.LABELUSUARIO.setText(
          controlbase.DevolverDatosSql( "select concat(apellidos,' , ',nombres) from persona p inner join empleados e"
         + " on e.id_persona=p.id_persona inner join usuarios u on u.id_persona=p.id_persona "
          +" where u.usuario='"+txtuser.getText()+"'",1));menu.PERFIL.setText(controlbase.DevolverDatosSql(sqlperfil,1));
          MenuSistema.dniusuari=(controlbase.DevolverDatosSql("select p.dni from persona p inner join empleados e "
        + " on e.id_persona=p.id_persona inner join  usuarios u on u.id_persona=p.id_persona "
       + "where u.usuario='"+txtuser.getText()+"'", 1));
          menu.codigousuario=(controlbase.DevolverDatosSql("select emp.codigo from empleados emp inner join persona p "
          + "on emp.id_persona=p.id_persona inner join usuarios us on us.id_persona=p.id_persona"
         + " where us.usuario='"+txtuser.getText()+"'",1));
           PermisoUsuario();
        }else{
            if(acceso.EntrarSistema(sql).equals("0")){
        JOptionPane.showMessageDialog(null, "Error en las credenciales","Error Acceso!!",JOptionPane.ERROR_MESSAGE);txtclave.setText("");txtuser.setText("");comoperfil.setSelectedIndex(-1);comoperfil.grabFocus();}}
       }else{comoperfil.grabFocus();}
    }//GEN-LAST:event_BotonEntrarSistemaActionPerformed

    private void comoperfilPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comoperfilPopupMenuWillBecomeInvisible
       if(comoperfil.getSelectedIndex()>=0){txtuser.grabFocus();}
    }//GEN-LAST:event_comoperfilPopupMenuWillBecomeInvisible

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if(evt.getKeyChar()==java.awt.event.KeyEvent.VK_ENTER){
            if(txtuser.getText().trim().length()==0){txtuser.grabFocus();}else{txtclave.grabFocus();}
        }
    }//GEN-LAST:event_txtuserKeyPressed
public void PermisoUsuario(){
    String perf=controlbase.DevolverDatosSql(sqlperfil, 1);
   if(perf.equals("Administrador")){ menu.itemventa.setEnabled(false);
   menu.itemclientes.setEnabled(false);
   menu.Reportes.setEnabled(false);
   }else{if(perf.equals("Vendedor")){
   menu.itemconsultausuarios.setEnabled(false);
   menu.itemempleados.setEnabled(false);menu.itemnuevousuarios.setEnabled(false);
   menu.itemproductos.setEnabled(false);menu.itemtipoproductos.setEnabled(false);
   menu.itemtrabajadores.setEnabled(false);menu.itemconsultaclientes.setEnabled(false);menu.itemconsultaprod.setEnabled(false);
   menu.menuconsulta.setEnabled(false);}}
   
     
}
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
                  UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Logín.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logín.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logín.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logín.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logín().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEntrarSistema;
    private javax.swing.JComboBox<String> comoperfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelsalir;
    public static javax.swing.JPasswordField txtclave;
    public static javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
