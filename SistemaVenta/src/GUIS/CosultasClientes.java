/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS;

import static GUIS.ConsultaClientes.modeltabla;
import javax.swing.table.DefaultTableModel;
import Controlador.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author Adrian
 */
public class CosultasClientes extends javax.swing.JDialog {
    DefaultTableModel modeltabla=new DefaultTableModel();
    Controlador controlbase=new Controlador();JButton botonenviar=new JButton();int confirmar;
    public CosultasClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();modeltabla.setColumnIdentifiers(new String[]{"# DNI","# RUC"," APELLIDOS Y NOMBRES","GÉNERO",
        "# TELÉFONO","DIRECCIÓN","ENVIAR"});TABLACLIENTES.setModel(modeltabla);
        this.setResizable(false);this.setLocationRelativeTo(null);this.setTitle("Los Clientes");
        MostrarClientes();
        TABLACLIENTES.getColumnModel().getColumn(2).setPreferredWidth(230);
        controlbase.InsertarIcono(botonenviar,"/imagenes1/envios.png");
        TABLACLIENTES.setRowHeight(46);botonenviar.setName("btnenvio");
    }
    public void MostrarClientes(){
    controlbase.MostrarClientesVenta("exec  proc_mostrar_clientes '%"+TXTCLIENTES.getText()+"%'", modeltabla, TABLACLIENTES, botonenviar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXTCLIENTES = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLACLIENTES = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 4, true));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("CONSULTAR CLIENTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa busqueda.png"))); // NOI18N
        jLabel2.setText("BUSCAR :  ");

        TXTCLIENTES.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTCLIENTES.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        TXTCLIENTES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTCLIENTESKeyPressed(evt);
            }
        });

        TABLACLIENTES.setModel(new javax.swing.table.DefaultTableModel(
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
        TABLACLIENTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLACLIENTESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLACLIENTES);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTCLIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTCLIENTES, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTCLIENTESKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTCLIENTESKeyPressed
      MostrarClientes();
    }//GEN-LAST:event_TXTCLIENTESKeyPressed

    private void TABLACLIENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLACLIENTESMouseClicked
        try {
            if(controlbase.BotonTableDinamico(TABLACLIENTES, evt).getName().equals("btnenvio")){
        int filas=TABLACLIENTES.getSelectedRow();
        while(confirmar<=0 || confirmar>2){
            confirmar=Integer.parseInt(JOptionPane.showInputDialog(null,"¿ Que documento desea Ingresar ?"
                + "\n 1 : # DNI "
                + "\n 2:  # RUC","escoja una opción!!",JOptionPane.CLOSED_OPTION));
        }
       
        if(confirmar==1){
        Ventas.labelnombresapellidoscliente.setText(TABLACLIENTES.getValueAt(filas, 2).toString());
        Ventas.labeldireccion.setText(TABLACLIENTES.getValueAt(filas,5).toString());
        Ventas.labeldocumento.setText(TABLACLIENTES.getValueAt(filas, 0).toString());
         Ventas.botonclientes.setEnabled(false);
        dispose();
        }else{
            if(confirmar==2){
        Ventas.labelnombresapellidoscliente.setText(TABLACLIENTES.getValueAt(filas, 2).toString());
        Ventas.labeldireccion.setText(TABLACLIENTES.getValueAt(filas,5).toString());
        Ventas.labeldocumento.setText(TABLACLIENTES.getValueAt(filas, 1).toString());
          Ventas.botonclientes.setEnabled(false);
        dispose();
            }
        }
            
    }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TABLACLIENTESMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CosultasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CosultasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CosultasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CosultasClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CosultasClientes dialog = new CosultasClientes(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TABLACLIENTES;
    private javax.swing.JTextField TXTCLIENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
