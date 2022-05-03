/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import notas.Consultar_Screen;
import java.awt.Color;
import notas.Home_screen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class Estudiante_Screen extends javax.swing.JFrame {
    ConexionBD con=new ConexionBD();
    Connection cn=con.Conexion();
    /**
     * Creates new form Estudiante_Screen
     * 
     */int xMouse,yMouse;
    public Estudiante_Screen() {

        initComponents();
        this.setLocationRelativeTo(null);
        mostrar("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSTableMetroBeanInfo1 = new rojerusan.RSTableMetroBeanInfo();
        rSTableMetroBeanInfo2 = new rojerusan.RSTableMetroBeanInfo();
        rSTableMetroBeanInfo3 = new rojerusan.RSTableMetroBeanInfo();
        estiloTablaHeader1 = new rojerusan.necesario.EstiloTablaHeader();
        rSPanelGradiente2 = new rspanelgradiente.RSPanelGradiente();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        documento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtbuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        rSButtonGradiente1 = new rsbuttongradiente.RSButtonGradiente();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new rojerusan.RSTableMetro();
        rSButtonGradiente2 = new rsbuttongradiente.RSButtonGradiente();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estudiante");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente2.setColorPrimario(new java.awt.Color(102, 16, 141));
        rSPanelGradiente2.setColorSecundario(new java.awt.Color(0, 255, 255));
        rSPanelGradiente2.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.CENTRAL);
        rSPanelGradiente2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("HOME");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        rSPanelGradiente2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 80, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CONSULTAR");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        rSPanelGradiente2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Insertar");
        rSPanelGradiente2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Estudiante");
        rSPanelGradiente2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8-persona-de-sexo-masculino-96.png"))); // NOI18N
        rSPanelGradiente2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 100));

        getContentPane().add(rSPanelGradiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel2.setText("T.I / C.C");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        documento.setBorder(null);
        documento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                documentoMouseClicked(evt);
            }
        });
        documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoActionPerformed(evt);
            }
        });
        jPanel1.add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel4.setText("Nombres");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel5.setText("Apellidos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        apellido.setBorder(null);
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidoMouseClicked(evt);
            }
        });
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel6.setText("Grado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        grado.setToolTipText("");
        grado.setBorder(null);
        grado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradoMouseClicked(evt);
            }
        });
        jPanel1.add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 30));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel7.setText("Telefono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        telefono.setBorder(null);
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonoMouseClicked(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, 30));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        jLabel8.setText("Correo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        correo.setBorder(null);
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoMouseClicked(evt);
            }
        });
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 200, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 200, 10));

        txtbuscar.setBorder(null);
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 200, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 200, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, 10));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 200, 10));

        rSButtonGradiente1.setText("Modificar");
        rSButtonGradiente1.setColorPrimario(new java.awt.Color(102, 16, 141));
        rSButtonGradiente1.setColorPrimarioHover(new java.awt.Color(148, 0, 153));
        rSButtonGradiente1.setColorSecundario(new java.awt.Color(0, 153, 204));
        rSButtonGradiente1.setColorSecundarioHover(new java.awt.Color(0, 194, 240));
        rSButtonGradiente1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        rSButtonGradiente1.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.HORIZONTAL);
        rSButtonGradiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 100, 30));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 10));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        jLabel12.setText("Documento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8-encuentra-usuario-masculino-tipo-de-piel-7-48.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 60, 50));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.setColorBackgoundHead(new java.awt.Color(102, 16, 141));
        Tabla.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        Tabla.setColorFilasForeground1(new java.awt.Color(87, 32, 204));
        Tabla.setColorFilasForeground2(new java.awt.Color(87, 32, 204));
        Tabla.setColorSelBackgound(new java.awt.Color(172, 153, 204));
        Tabla.setFont(new java.awt.Font("Roboto Black", 0, 11)); // NOI18N
        Tabla.setFuenteFilas(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Tabla.setFuenteFilasSelect(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        Tabla.setFuenteHead(new java.awt.Font("Roboto Black", 1, 15)); // NOI18N
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 560, 320));

        rSButtonGradiente2.setText("Entrar");
        rSButtonGradiente2.setColorPrimario(new java.awt.Color(102, 16, 141));
        rSButtonGradiente2.setColorPrimarioHover(new java.awt.Color(148, 0, 153));
        rSButtonGradiente2.setColorSecundario(new java.awt.Color(0, 153, 204));
        rSButtonGradiente2.setColorSecundarioHover(new java.awt.Color(0, 194, 240));
        rSButtonGradiente2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        rSButtonGradiente2.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.HORIZONTAL);
        rSButtonGradiente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonGradiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, 30));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));
        exitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitbtn.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        exitbtn.setPreferredSize(new java.awt.Dimension(40, 40));

        btnExitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        btnExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExitTxt.setText("X");
        btnExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        btnExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addComponent(btnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 760, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        // TODO add your handling code here:
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void documentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentoMouseClicked
        // TODO add your handling code here:
        /*documento.setText("");
        nombre.setText("Nombres");
        apellido.setText("Apellidos");
        grado.setText("Grado");
        telefono.setText("Telefono");
        correo.setText("Correo @");
        
        /*documento.setForeground(Color.black);
        nombre.setForeground(Color.GRAY);
        apellido.setForeground(Color.GRAY);
        grado.setForeground(Color.GRAY);
        telefono.setForeground(Color.GRAY);
        correo.setForeground(Color.GRAY);*/
        
    }//GEN-LAST:event_documentoMouseClicked

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked
        // TODO add your handling code here:
        /*documento.setText("Documento");
        nombre.setText("");
        apellido.setText("Apellidos");
        grado.setText("Grado");
        telefono.setText("Telefono");
        correo.setText("Correo @");
        
        /*nombre.setForeground(Color.black);
        documento.setForeground(Color.gray);
        apellido.setForeground(Color.GRAY);
        grado.setForeground(Color.GRAY);
        telefono.setForeground(Color.GRAY);
        correo.setForeground(Color.GRAY);*/
    }//GEN-LAST:event_nombreMouseClicked

    private void apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseClicked
        // TODO add your handling code here:
        /*documento.setText("Documento");
        nombre.setText("Nombres");
        apellido.setText("");
        grado.setText("Grado");
        telefono.setText("Telefono");
        correo.setText("Correo @");
        
        /*apellido.setForeground(Color.black);
        documento.setForeground(Color.gray);
        nombre.setForeground(Color.GRAY);
        grado.setForeground(Color.GRAY);
        telefono.setForeground(Color.GRAY);
        correo.setForeground(Color.GRAY);*/
    }//GEN-LAST:event_apellidoMouseClicked

    private void gradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradoMouseClicked
        // TODO add your handling code here:
        /*documento.setText("Documento");
        nombre.setText("Nombres");
        apellido.setText("Apellidos");
        grado.setText("");
        telefono.setText("Telefono");
        correo.setText("Correo @");
        
        grado.setForeground(Color.black);
        documento.setForeground(Color.gray);
        nombre.setForeground(Color.GRAY);
        apellido.setForeground(Color.GRAY);
        telefono.setForeground(Color.GRAY);
        correo.setForeground(Color.GRAY);*/
        
    }//GEN-LAST:event_gradoMouseClicked

    private void telefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseClicked
        // TODO add your handling code here:
        /*documento.setText("Documento");
        nombre.setText("Nombres");
        apellido.setText("Apellidos");
        grado.setText("Grado");
        telefono.setText("");
        correo.setText("Correo @");
        
        telefono.setForeground(Color.black);
        documento.setForeground(Color.gray);
        nombre.setForeground(Color.GRAY);
        apellido.setForeground(Color.GRAY);
        grado.setForeground(Color.GRAY);
        correo.setForeground(Color.GRAY);*/
    }//GEN-LAST:event_telefonoMouseClicked

    private void correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseClicked
        // TODO add your handling code here:
        /*documento.setText("Documento");
        nombre.setText("Nombres");
        apellido.setText("Apellidos");
        grado.setText("Grado");
        telefono.setText("Telefono");
        correo.setText("");
        
        correo.setForeground(Color.black);
        documento.setForeground(Color.gray);
        nombre.setForeground(Color.GRAY);
        apellido.setForeground(Color.GRAY);
        grado.setForeground(Color.GRAY);
        telefono.setForeground(Color.GRAY);*/

    }//GEN-LAST:event_correoMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        Consultar_Screen op=new Consultar_Screen();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
       jLabel11.setForeground(new Color(172,153,204)); 
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setForeground(Color.white);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        Home_screen ob= new Home_screen();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
        jLabel15.setForeground(new Color(172,153,204));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        // TODO add your handling code here:
        jLabel15.setForeground(Color.white);
    }//GEN-LAST:event_jLabel15MouseExited

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        Modificar();
    }//GEN-LAST:event_TablaMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void btnExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseExited
        exitbtn.setBackground(Color.white);
        btnExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_btnExitTxtMouseExited

    private void btnExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseEntered
        exitbtn.setBackground(Color.red);
        btnExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_btnExitTxtMouseEntered

    private void btnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitTxtMouseClicked

    private void rSButtonGradiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente1ActionPerformed
        ModificarDatos();
        documento.setText("");
        nombre.setText("");
        apellido.setText("");
        grado.setText("");
        telefono.setText("");
        correo.setText("");
        JOptionPane.showMessageDialog(null, "Datos Modificados");         
    }//GEN-LAST:event_rSButtonGradiente1ActionPerformed

    private void rSButtonGradiente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente2ActionPerformed
        guardar();
        mostrar("");
        documento.setText("");
        nombre.setText("");
        apellido.setText("");
        grado.setText("");
        telefono.setText("");
        correo.setText("");
    }//GEN-LAST:event_rSButtonGradiente2ActionPerformed
public void mostrar(String documento){
    ConexionBD con=new ConexionBD();
    Connection cn=con.Conexion();
    DefaultTableModel modelo= new  DefaultTableModel();
    modelo.addColumn("Documento");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("Grado");
    modelo.addColumn("Telefono");
    modelo.addColumn("Correo");
    Tabla.setModel(modelo);
    String sql= "";
    if(documento.equals("")){
        sql="Select* from estudiantes";
    }else{
        sql="Select*from estudiantes where documento like'%"+documento+"%'";
    }
        String estudiantes[]=new String[6];
    Statement set;
    try {
        set = cn.createStatement(); 
        ResultSet resul=set.executeQuery(sql);
        while(resul.next()){
            estudiantes[0]=resul.getString(1);
              estudiantes[1]=resul.getString(2);
                estudiantes[2]=resul.getString(3);  
                estudiantes[3]=resul.getString(4);
                  estudiantes[4]=resul.getString(5);
                    estudiantes[5]=resul.getString(6);
                  modelo.addRow(estudiantes);
                  
                
        }
        Tabla.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(Estudiante_Screen.class.getName()).log(Level.SEVERE, null, ex);
    }
   
}

public void guardar(){
                ConexionBD con=new ConexionBD();
                Connection cn=con.Conexion();
                String ti,nom,ape,tel,corr;
                int gra;
                
                String sSQL="";
                ti=documento.getText();
                nom=nombre.getText();
                ape=apellido.getText();
                gra=Integer.parseInt(grado.getText());
                tel=telefono.getText();
                corr=correo.getText();
                sSQL="INSERT INTO estudiantes(documento,nombre,apellido,curso,telefono,correo)VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement psd=(PreparedStatement) cn.prepareStatement(sSQL);
            psd.setString(1,ti);
            psd.setString(2,nom);
            psd.setString(3,ape);
            psd.setInt(4,gra);
            psd.setString(5,tel);
            psd.setString(6,corr);
            int n=psd.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }

}       catch (SQLException ex) {
            documento.setText(null);  
            nombre.setText(null);
            apellido.setText(null);
            grado.setText(null);
            telefono.setText(null);
            correo.setText(null);

}
        
}
 public void Modificar(){
     int fila=Tabla.getSelectedRow();
     if(fila>=0){
         documento.setText(Tabla.getValueAt(fila,0).toString());
          nombre.setText(Tabla.getValueAt(fila,1).toString());
           apellido.setText(Tabla.getValueAt(fila,2).toString());
            grado.setText(Tabla.getValueAt(fila,3).toString());
             telefono.setText(Tabla.getValueAt(fila,4).toString());
                correo.setText(Tabla.getValueAt(fila,5).toString());
             
     }else{
         JOptionPane.showMessageDialog(null,"Seleccione fila");
     }
 }
 public void ModificarDatos(){
    try {
        PreparedStatement pasar=cn.prepareStatement("Update estudiantes set documento='"+documento.getText()+"',nombre='"+nombre.getText()+"',apellido='"+apellido.getText()
                +"',curso='"+grado.getText()+"',telefono='"+telefono.getText()+"' where correo='"+correo.getText()+"'");
        pasar.executeUpdate();
        mostrar("");
        
    } catch (SQLException ex) {
        Logger.getLogger(Estudiante_Screen.class.getName()).log(Level.SEVERE, null, ex);
    }
 }
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
            java.util.logging.Logger.getLogger(Estudiante_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estudiante_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estudiante_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estudiante_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estudiante_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro Tabla;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel btnExitTxt;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField documento;
    private rojerusan.necesario.EstiloTablaHeader estiloTablaHeader1;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JTextField grado;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField nombre;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente1;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente2;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente2;
    private rojerusan.RSTableMetroBeanInfo rSTableMetroBeanInfo1;
    private rojerusan.RSTableMetroBeanInfo rSTableMetroBeanInfo2;
    private rojerusan.RSTableMetroBeanInfo rSTableMetroBeanInfo3;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}