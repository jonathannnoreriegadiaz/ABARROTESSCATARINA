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
import ControlerVenta.GenerarVenta;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 
 */
public class Ventas extends javax.swing.JDialog {
 Controlador con=new Controlador();GenerarVenta generarventa=new GenerarVenta();
    JButton botonagregar=new JButton();int unidadesventa=0,stocksqlproducto;public static int fila;
    GenerarReportes gr=new GenerarReportes();
    NumeroLetras cambioDinero=new NumeroLetras();
    JButton BOTNQUITAR=new JButton();
    DefaultTableModel modelTabla=new DefaultTableModel(){
        public boolean isCellEditable(int row, int col){
            return false;}
    };
    DefaultTableModel modeltabledetalles=new DefaultTableModel(){
        public boolean isCellEditable(int row, int col){
            return false;}
    };
    int x,y;
    public Ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();this.setResizable(false);this.setLocationRelativeTo(null);
        labelnumeroventas.setText(con.DevolverSerirVenta("SELECT right( 'FAC-000000' + cast( (select max( id_venta)+1 from ventas) AS varchar(13)), 13 );"));
        try {
            labelvendedor.setText(con.DevolverDatosSql("select concat(p.nombres,' , ',p.apellidos) from persona p inner join "
        + "empleados e on e.id_persona=p.id_persona inner join usuarios us on "
          + " us.id_persona=p.id_persona where p.dni='"+MenuSistema.dniusuari +"'",1));
        } catch (Exception e) {
        }
        con.InsertarIcono(botonagregar, "/imagenes1/agregar.png");
        modelTabla.setColumnIdentifiers(new String[]{"CATEGORÍA","PRODUCTO","DESCRIPCIÓN","PRECIO","STOCK",
        "FECHA REGISTRO","FECHA DE SALIDA","ESTADO","Vender"});
        tableproductosventa.setModel(modelTabla);MostrarProductoVenta();
        tableproductosventa.getColumnModel().getColumn(2).setPreferredWidth(455);
        tableproductosventa.getColumnModel().getColumn(5).setPreferredWidth(140);
        tableproductosventa.getColumnModel().getColumn(6).setPreferredWidth(170);
        tableproductosventa.getColumnModel().getColumn(0).setPreferredWidth(150);
        tableproductosventa.getColumnModel().getColumn(1).setPreferredWidth(180);txtunidades.setDescripcion("Unidades...");
        botonagregar.setName("btnagregar");
        modeltabledetalles.setColumnIdentifiers(new String[]{"PRODUCTO","DESCRIPCIÓN","PRECIO","UNIDADES","IMPORTE","QUITAR"});
        tabledetallesventa.setModel(modeltabledetalles);
        tabledetallesventa.getColumnModel().getColumn(1).setPreferredWidth(490);
        labelcantidadtotal.setText("0");labeliva.setText("$./ 0.0");labelsubtotal.setText("$./ 0.0");labeltotal.setText("$./ 0.0");
        btnlistar.setEnabled(false);txtunidades.setEnabled(false);
        tableproductosventa.setRowHeight(41);botonnuevaventa.setEnabled(false);
        con.InsertarIcono(BOTNQUITAR, "/imagenes1/quitarproducto.png");
        tabledetallesventa.setRowHeight(43);BOTNQUITAR.setName("btnquitar");
        tabledetallesventa.getColumnModel().getColumn(0).setPreferredWidth(180);
       dinerotexto.setEditable(false);dinerotexto.setBackground(Color.black);dinerotexto.setOpaque(true);
       dinerotexto.setForeground(Color.white);botonimprimir.setEnabled(false);
        
       
    }

    public void MostrarProductoVenta(){
        con.MostrarProductosVenta("exec proc_mostrar_productoVenta '%"+txtbuscar.getText()+"%'", modelTabla, tableproductosventa, botonagregar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LABELSALIR = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelnumeroventas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelnombresapellidoscliente = new javax.swing.JLabel();
        labeldireccion = new javax.swing.JLabel();
        labeldocumento = new javax.swing.JLabel();
        botonclientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelvendedor = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableproductosventa = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnlistar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtunidades = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledetallesventa = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        botonimprimir = new javax.swing.JButton();
        botonnuevaventa = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        labeliva = new javax.swing.JLabel();
        labelsubtotal = new javax.swing.JLabel();
        labeltotal = new javax.swing.JLabel();
        labelcantidadtotal = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dinerotexto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
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

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Venta ");

        LABELSALIR.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        LABELSALIR.setForeground(new java.awt.Color(204, 204, 204));
        LABELSALIR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LABELSALIR.setText("X");
        LABELSALIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("# VENTA  :  ");

        labelnumeroventas.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        labelnumeroventas.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelnumeroventas, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LABELSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LABELSALIR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelnumeroventas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel7.setText("Apellidos y Nombres   :  ");

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel9.setText("Dirección  : ");

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel10.setText("# documento  :  ");

        labelnombresapellidoscliente.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        labelnombresapellidoscliente.setForeground(new java.awt.Color(255, 51, 51));
        labelnombresapellidoscliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelnombresapellidoscliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        labelnombresapellidoscliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labeldireccion.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        labeldireccion.setForeground(new java.awt.Color(51, 51, 255));
        labeldireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeldireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        labeldireccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labeldocumento.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labeldocumento.setForeground(new java.awt.Color(102, 102, 102));
        labeldocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeldocumento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        labeldocumento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botonclientes.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        botonclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Clientes_1.png"))); // NOI18N
        botonclientes.setText("Consultar Clientes ");
        botonclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonclientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelnombresapellidoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeldocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonclientes))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelnombresapellidoscliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labeldireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labeldocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonclientes))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("VENDEDOR   :  ");

        labelvendedor.setFont(new java.awt.Font("Calisto MT", 0, 21)); // NOI18N
        labelvendedor.setForeground(new java.awt.Color(0, 0, 204));
        labelvendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tableproductosventa.setModel(new javax.swing.table.DefaultTableModel(
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
        tableproductosventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproductosventaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableproductosventaMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tableproductosventa);

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa busqueda.png"))); // NOI18N
        jLabel15.setText("BUSCAR :  ");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
        });

        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes1/VENDIDO.png"))); // NOI18N
        btnlistar.setText("Listar ");
        btnlistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actions-edit-delete-icon.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtunidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlistar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txtunidades, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de Venta", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tabledetallesventa.setModel(new javax.swing.table.DefaultTableModel(
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
        tabledetallesventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledetallesventaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabledetallesventa);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MINUEVAVENTASS.png"))); // NOI18N
        jButton4.setText("Grabar Venta");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        botonimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BRIGHTS PRINTER.png"))); // NOI18N
        botonimprimir.setText("Imprimir");
        botonimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonimprimirActionPerformed(evt);
            }
        });

        botonnuevaventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprass.png"))); // NOI18N
        botonnuevaventa.setText("Nueva Venta");
        botonnuevaventa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonnuevaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonnuevaventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonnuevaventa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonnuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel16.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel16.setText("SUB TOTAL  : ");

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel17.setText("IVA  : ");

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel18.setText("TOTAL  :  ");

        jLabel19.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel19.setText("CANTIDAD TOTAL  :  ");

        labeliva.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        labeliva.setForeground(new java.awt.Color(102, 102, 255));
        labeliva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeliva.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelsubtotal.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        labelsubtotal.setForeground(new java.awt.Color(102, 102, 255));
        labelsubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelsubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labeltotal.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        labeltotal.setForeground(new java.awt.Color(102, 102, 255));
        labeltotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeltotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelcantidadtotal.setFont(new java.awt.Font("Arial Black", 0, 22)); // NOI18N
        labelcantidadtotal.setForeground(new java.awt.Color(102, 102, 255));
        labelcantidadtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcantidadtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(labeliva, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelcantidadtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelcantidadtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeliva, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dinerotexto.setColumns(20);
        dinerotexto.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        dinerotexto.setForeground(new java.awt.Color(51, 51, 51));
        dinerotexto.setRows(5);
        dinerotexto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jScrollPane3.setViewportView(dinerotexto);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("SON : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(labelvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       x=evt.getX();y=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
          Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void LABELSALIRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseEntered
     LABELSALIR.setBackground(Color.red);LABELSALIR.setForeground(Color.white);
    }//GEN-LAST:event_LABELSALIRMouseEntered

    private void LABELSALIRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseExited
        LABELSALIR.setBackground(new Color(240,240,240));LABELSALIR.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_LABELSALIRMouseExited

    private void LABELSALIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LABELSALIRMouseClicked
       dispose();
    }//GEN-LAST:event_LABELSALIRMouseClicked

    private void tableproductosventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductosventaMouseClicked
        try {
      if(con.BotonTableDinamico(tableproductosventa, evt).getName().equals("btnagregar")){
          txtunidades.grabFocus();
         fila=tableproductosventa.getSelectedRow();btnlistar.setEnabled(true);
         txtunidades.setEnabled(true) ;  
        
        this.pack();
      }else{
          JOptionPane.showMessageDialog(null, "seleccione un producto");
      }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tableproductosventaMouseClicked

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
      MostrarProductoVenta();
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
      if(fila>=0){ 
          // 
     con.consultasql="select *from productos where Nombreproducto='"+tableproductosventa.getValueAt(fila,1).toString()+"'";
          try {
              con.rs=con.DevolverRegistro(con.consultasql);
              while(con.rs.next()){
            stocksqlproducto=con.rs.getInt("stock");}
           if(txtunidades.getText().trim().length()==0){
               txtunidades.grabFocus();
           }else{
              if(Integer.parseInt(txtunidades.getText())<=0){txtunidades.setText("");txtunidades.grabFocus();
             JOptionPane.showMessageDialog(null, "Error!! , ingrese una cantidad que sea mayor a cero y "
             + "\n y menor al stock del producto a vender","Mensaje de aviso!!",JOptionPane.WARNING_MESSAGE);
              }else{
                if(stocksqlproducto>0){
            if(Integer.parseInt(txtunidades.getText())>stocksqlproducto){txtunidades.setText("");txtunidades.grabFocus();
                 JOptionPane.showMessageDialog(null, "Error!! ,porfavor ingrese una cantidad"
            + "\n menor al stock del producto, stock insufieciente","Mensaje de aviso!!",JOptionPane.WARNING_MESSAGE);        
                 }else{unidadesventa=Integer.parseInt(txtunidades.getText());
                  generarventa.RegistrarTablaDetalleVanta(tabledetallesventa,modeltabledetalles,tableproductosventa.getValueAt(tableproductosventa.getSelectedRow(), 1).toString(), 0, tableproductosventa,unidadesventa,BOTNQUITAR);  
                   btnlistar.setEnabled(false);txtunidades.setEnabled(false);txtunidades.setText("");
                   tabledetallesventa.clearSelection();
                 }
                }else{
                  JOptionPane.showMessageDialog(null, "Error!! , el producto "
              + "\n "+tableproductosventa.getValueAt(fila, 1).toString()+"se ha agotado , porfavor contacte"
             + "\n con su administrador para que actualice el stock ","Mensaje de aviso!!",JOptionPane.ERROR_MESSAGE);         
                }
              }
           }
          } catch (Exception e) {
          }
      }else{
          JOptionPane.showMessageDialog(null, "Porfavor!! seleccione un producto para añadir a carrito","Mensaje del ssitema",JOptionPane.WARNING_MESSAGE);
      }
    }//GEN-LAST:event_btnlistarActionPerformed

    private void botonclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonclientesActionPerformed
     CosultasClientes cst=new CosultasClientes(null, rootPaneCheckingEnabled); 
     cst.setVisible(true);
    }//GEN-LAST:event_botonclientesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String ventagenerada="";
        if(tabledetallesventa.getRowCount()>0){
          if(labeldocumento.getText().trim().length()==0){
              JOptionPane.showMessageDialog(null, "Le falta los Datos del cliente","Mensaje del sistema",JOptionPane.WARNING_MESSAGE);
          }else{
      botonclientes.setEnabled(false);
      System.out.println(con.DevolverDatosSql(" exec proc_facturas '"+labelnumeroventas.getText()+"','"+MenuSistema.codigousuario+"','"
     +labeldocumento.getText()+"',"+generarventa.CantidadVendida(tabledetallesventa)+","+generarventa.Subtotales(tabledetallesventa)+","
     +generarventa.IVAGENERADO(tabledetallesventa)+","+generarventa.TotalPagoImporte(tabledetallesventa)+",'"+dinerotexto.getText()+"'",1));
    for(int i=0;i<tabledetallesventa.getRowCount();i++){
        ventagenerada=""+con.DevolverDatosSql("exec proc_detallesVenta '"+labelnumeroventas.getText()+"','"
        +tabledetallesventa.getValueAt(i, 0).toString()+"',"
        +tabledetallesventa.getValueAt(i, 3).toString()+","+tabledetallesventa.getValueAt(i, 4).toString()+"",1);
    }
    JOptionPane.showMessageDialog(null,ventagenerada,"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
    botonnuevaventa.setEnabled(true);botonimprimir.setEnabled(true);
          }
      }else{
          JOptionPane.showMessageDialog(null, "La lista de productos a vender se encuentra vacía ,"
         + "\n porfavor proceda a ingresar algunos productos para la venta ","Mensaje del sistema",JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonnuevaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonnuevaventaActionPerformed
      Reiniciar();labelnumeroventas.setText(con.DevolverSerirVenta("SELECT right( 'FAC-000000' + cast( (select max( id_venta)+1 from ventas) AS varchar(13)), 13 );"));
     dinerotexto.setText(""); MostrarProductoVenta();
    }//GEN-LAST:event_botonnuevaventaActionPerformed

    private void tableproductosventaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproductosventaMouseEntered
        
       //  
    }//GEN-LAST:event_tableproductosventaMouseEntered

    private void tabledetallesventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledetallesventaMouseClicked
        try {
            if(con.BotonTableDinamico(tabledetallesventa, evt).getName().equals("btnquitar")){
              
                   generarventa.QuitarProductoLista(tabledetallesventa, modeltabledetalles);
               
             }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tabledetallesventaMouseClicked

    private void botonimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonimprimirActionPerformed
        gr.ImprimirInformesConParametros("/Reportes/Facturas.jasper","factura empresas S.A","numeroventa",labelnumeroventas.getText());
    }//GEN-LAST:event_botonimprimirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      botonclientes.setEnabled(true);labeldireccion.setText("");labelnombresapellidoscliente.setText("");
      labeldocumento.setText("");tableproductosventa.clearSelection();tabledetallesventa.clearSelection();
      con.LimpiarTabla(modeltabledetalles);dinerotexto.setText("");
        labelcantidadtotal.setText("0");labeliva.setText("$./ 0.0");labelsubtotal.setText("$./ 0.0");labeltotal.setText("$./ 0.0");
    }//GEN-LAST:event_jButton3ActionPerformed

  public void Reiniciar(){
        botonclientes.setEnabled(true);tabledetallesventa.clearSelection();
      tableproductosventa.clearSelection();labelnombresapellidoscliente.setText("");labeldocumento.setText("");
      labeldireccion.setText("");txtunidades.setText("");con.LimpiarTabla(modeltabledetalles);
       labelcantidadtotal.setText("0");labeliva.setText("$./ 0.0");labelsubtotal.setText("$./ 0.0");labeltotal.setText("$./ 0.0");
       txtunidades.setEnabled(false);btnlistar.setEnabled(false);botonnuevaventa.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventas dialog = new Ventas(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton botonclientes;
    private javax.swing.JButton botonimprimir;
    private javax.swing.JButton botonnuevaventa;
    private javax.swing.JButton btnlistar;
    public static javax.swing.JTextArea dinerotexto;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JLabel labelcantidadtotal;
    public static javax.swing.JLabel labeldireccion;
    public static javax.swing.JLabel labeldocumento;
    public static javax.swing.JLabel labeliva;
    public static javax.swing.JLabel labelnombresapellidoscliente;
    private javax.swing.JLabel labelnumeroventas;
    public static javax.swing.JLabel labelsubtotal;
    public static javax.swing.JLabel labeltotal;
    private javax.swing.JLabel labelvendedor;
    private javax.swing.JTable tabledetallesventa;
    private javax.swing.JTable tableproductosventa;
    private javax.swing.JTextField txtbuscar;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtunidades;
    // End of variables declaration//GEN-END:variables
}
