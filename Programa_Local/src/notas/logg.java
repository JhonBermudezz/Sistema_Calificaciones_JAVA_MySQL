
package notas;

import notas.Home_screen;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import notas.ConexionBD;
import notas.Home_screen;

public class logg extends javax.swing.JFrame {
    ConexionBD con=new ConexionBD();
    Connection cn=con.Conexion();
    
    int xMouse, yMouse;
    public logg() {
        initComponents();
        TextPrompt Prueba = new TextPrompt("Ingrese su nombre de usuario",userTxt);
        TextPrompt Prueba1 = new TextPrompt("Contraseña",passTxt);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        namelabel = new javax.swing.JLabel();
        logolabel = new javax.swing.JLabel();
        rSPanelGradiente1 = new rspanelgradiente.RSPanelGradiente();
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExitTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UserLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        PassLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        rSButtonGradiente1 = new rsbuttongradiente.RSButtonGradiente();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(844, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namelabel.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(255, 255, 255));
        namelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelabel.setText("BASE DE DATOS ESTUDIANTES");
        jPanel1.add(namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 290, -1));

        logolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8-aceptar-la-base-de-datos-96.png"))); // NOI18N
        jPanel1.add(logolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 290, 140));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(102, 16, 141));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 255, 255));
        rSPanelGradiente1.setGradiente(rspanelgradiente.RSPanelGradiente.Gradiente.CENTRAL);

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 290, 500));

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
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 810, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/icons8-logotipo-de-java-coffee-cup-64.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel5.setText("INCIAR SESIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        UserLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        UserLabel.setText("USUARIO");
        jPanel1.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        userTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        userTxt.setBorder(null);
        userTxt.setCaretColor(new java.awt.Color(204, 204, 204));
        userTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxtMousePressed(evt);
            }
        });
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 400, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 400, 10));

        PassLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        PassLabel.setText("CONTRASEÑA");
        jPanel1.add(PassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 400, 20));

        passTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 400, 30));

        rSButtonGradiente1.setText("Entrar");
        rSButtonGradiente1.setColorPrimario(new java.awt.Color(102, 16, 141));
        rSButtonGradiente1.setColorPrimarioHover(new java.awt.Color(148, 0, 153));
        rSButtonGradiente1.setColorSecundario(new java.awt.Color(0, 153, 204));
        rSButtonGradiente1.setColorSecundarioHover(new java.awt.Color(0, 194, 240));
        rSButtonGradiente1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        rSButtonGradiente1.setGradiente(rsbuttongradiente.RSButtonGradiente.Gradiente.HORIZONTAL);
        rSButtonGradiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonGradiente1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTxtActionPerformed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitTxtMouseClicked

    private void btnExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseEntered
        exitbtn.setBackground(Color.red);
        btnExitTxt.setForeground(Color.white); 
        
    }//GEN-LAST:event_btnExitTxtMouseEntered

    private void btnExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTxtMouseExited
        exitbtn.setBackground(Color.white);
        btnExitTxt.setForeground(Color.black);        
    }//GEN-LAST:event_btnExitTxtMouseExited

    private void userTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMousePressed
        /*if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_userTxtMousePressed

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        /*if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_passTxtMousePressed

    private void userTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseEntered
        /*if (userTxt.getText().equals("Ingrese su nombre de usuario")) {
            userTxt.setText("");
            userTxt.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }   */     
    }//GEN-LAST:event_userTxtMouseEntered

    private void userTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseExited
        /*if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_userTxtMouseExited

    private void passTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMouseEntered
       /* if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (userTxt.getText().isEmpty()) {
            userTxt.setText("Ingrese su nombre de usuario");
            userTxt.setForeground(Color.gray);
        }*/
    }//GEN-LAST:event_passTxtMouseEntered

    private void passTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMouseExited
        /*if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        } */
    }//GEN-LAST:event_passTxtMouseExited

    private void userTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxtMouseClicked

    }//GEN-LAST:event_userTxtMouseClicked

    private void passTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMouseClicked

    }//GEN-LAST:event_passTxtMouseClicked

    private void rSButtonGradiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonGradiente1ActionPerformed
        validar();
    }//GEN-LAST:event_rSButtonGradiente1ActionPerformed
    public void validar(){
        int resultado=0;
        String pass= String.valueOf(passTxt.getPassword());
        String usuario = userTxt.getText();
        String sql="select * from usuario where usuario='"+usuario+"'and clave='"+pass+"'";
        java.sql.Statement set;
        try{
            set = cn.createStatement(); 
            ResultSet resul=set.executeQuery(sql);
            if(resul.next()){
                resultado=1;
                if(resultado==1){
                    Home_screen ob= new Home_screen();
                    ob.setVisible(true);
                    this.dispose();
                }
            }
            
                else{
                    JOptionPane.showMessageDialog(null,"No eres admin");        
                            }
                }
            
        
            
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error"+ e.getMessage());
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
            java.util.logging.Logger.getLogger(logg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel btnExitTxt;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logolabel;
    private javax.swing.JLabel namelabel;
    private javax.swing.JPasswordField passTxt;
    private rsbuttongradiente.RSButtonGradiente rSButtonGradiente1;
    private rspanelgradiente.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
