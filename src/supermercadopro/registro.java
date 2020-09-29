package supermercadopro;

import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static supermercadopro.inicio.bd;

/**
 *
 * @author Juan Pablo
 */
public class registro extends javax.swing.JFrame {

    private String nombre;
    private long cedula;
    private String correo;
    private String departamento;
    private String cargo;
    private long salario;
    private String password;

    public registro() {
        initComponents();
        setSize(900, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);

        ImageIcon fondo = new ImageIcon("src/supermercadopro/fondo.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(LabelFondo.getWidth(),
                LabelFondo.getHeight(), Image.SCALE_DEFAULT));

        LabelFondo.setIcon(icono);
        this.repaint();

        if (inicio.admis == true) {
            regis.setText("Registrate");
            eDepart.setVisible(false);
            eCargo.setVisible(false);
            rDepart.setVisible(true);
            rCargo.setVisible(true);
            labelN.setVisible(true);
            labelNC.setVisible(true);
            rPass.setVisible(true);
            rPass2.setVisible(true);
        }
        if (subprincipal.nuevoE == true) {
            regis.setText("Nuevo empleado");
            rDepart.setVisible(false);
            rCargo.setVisible(false);
            labelN.setVisible(false);
            labelNC.setVisible(false);
            rPass.setVisible(false);
            rPass2.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regis = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelN = new javax.swing.JLabel();
        labelNC = new javax.swing.JLabel();
        rNombre = new javax.swing.JTextField();
        rCC = new javax.swing.JTextField();
        rCorreo = new javax.swing.JTextField();
        eDepart = new javax.swing.JComboBox<>();
        eCargo = new javax.swing.JComboBox<>();
        rSalario = new javax.swing.JTextField();
        rPass = new javax.swing.JPasswordField();
        rPass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        rDepart = new javax.swing.JComboBox<>();
        rCargo = new javax.swing.JComboBox<>();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/uno.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        regis.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        regis.setText("Registrate");
        getContentPane().add(regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 105, -1, -1));

        jLabel4.setText("Cedula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 147, -1, -1));

        jLabel5.setText("Correo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 193, -1, -1));

        jLabel6.setText("Departamento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 236, -1, -1));

        jLabel7.setText("Cargo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 275, -1, -1));

        jLabel8.setText("Salario:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 323, -1, -1));

        labelN.setText("Nueva contraseña:");
        getContentPane().add(labelN, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 364, -1, -1));

        labelNC.setText("Confirma la contraseña:");
        getContentPane().add(labelNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 404, -1, -1));

        rNombre.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(rNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 101, 220, -1));

        rCC.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(rCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 143, 220, -1));

        rCorreo.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(rCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 189, 220, -1));

        eDepart.setBackground(new java.awt.Color(102, 102, 102));
        eDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajas", "Domicilios", "Distribución" }));
        eDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDepartActionPerformed(evt);
            }
        });
        getContentPane().add(eDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 231, 220, -1));

        eCargo.setBackground(new java.awt.Color(102, 102, 102));
        eCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Domiciliario", "Administrador", "Distribuidor" }));
        getContentPane().add(eCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 275, 220, -1));

        rSalario.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(rSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 319, 220, -1));

        rPass.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(rPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 361, 220, -1));

        rPass2.setBackground(new java.awt.Color(204, 204, 204));
        rPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rPass2KeyPressed(evt);
            }
        });
        getContentPane().add(rPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 401, 220, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 461, 120, 45));

        volver.setBackground(new java.awt.Color(51, 51, 51));
        volver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 461, 130, 45));

        rDepart.setBackground(new java.awt.Color(102, 102, 102));
        rDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oficina" }));
        rDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDepartActionPerformed(evt);
            }
        });
        getContentPane().add(rDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 231, 220, -1));

        rCargo.setBackground(new java.awt.Color(102, 102, 102));
        rCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Jefe" }));
        getContentPane().add(rCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 275, 220, -1));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDepartActionPerformed

    }//GEN-LAST:event_eDepartActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        if (subprincipal.nuevoE == true) {
            subprincipal sb = new subprincipal();
            sb.setVisible(true);
            this.dispose();
            subprincipal.nuevoE = false;
        } else if (inicio.admis == true) {
            inicio i = new inicio();
            i.setVisible(true);
            this.dispose();
            inicio.admis = false;
        }
    }//GEN-LAST:event_volverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!rNombre.getText().equals("") || !rCC.getText().equals("")
                || !rCorreo.getText().equals("") || !rSalario.getText().equals("")) {
            try {
                nombre = rNombre.getText();
                cedula = Long.parseLong(rCC.getText());
                correo = rCorreo.getText();
                if (inicio.admis == true) {
                    departamento = rDepart.getSelectedItem().toString();
                    cargo = rCargo.getSelectedItem().toString();
                } else if (subprincipal.nuevoE == true) {
                    departamento = eDepart.getSelectedItem().toString();
                    cargo = eCargo.getSelectedItem().toString();
                }
                salario = Long.parseLong(rSalario.getText());
                password = rPass.getText();
                String passw2 = rPass2.getText();

                if (passw2.equals(password)) {
                    for (Empleado emp : bd.queryForAll()) {
                        if (cedula == emp.getCedula()) {
                            JOptionPane.showMessageDialog(null, "El usuario con la cédula " + cedula + " ya está registrado");
                        }
                    }
                    Empleado em = new Empleado(nombre, cedula, correo, departamento, cargo, salario, password);
                    bd.create(em);
                    JOptionPane.showMessageDialog(null, "¡Empleado registrado exitosamente!");
                    if (inicio.admis == true) {
                        inicio i2 = new inicio();
                        i2.setVisible(true);
                        this.dispose();
                        inicio.admis = false;
                    } else if (subprincipal.nuevoE == true) {
                        subprincipal sp = new subprincipal();
                        sp.setVisible(true);
                        this.dispose();
                        subprincipal.nuevoE = false;
                    }

                } else {
                    labelNC.setForeground(Color.RED);
                    JOptionPane.showMessageDialog(null, "No escribiste bien la contraseña");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Ha ocurrio un error");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los espacios!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rPass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rPass2KeyPressed

    }//GEN-LAST:event_rPass2KeyPressed

    private void rDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDepartActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JComboBox<String> eCargo;
    private javax.swing.JComboBox<String> eDepart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelN;
    private javax.swing.JLabel labelNC;
    private javax.swing.JTextField rCC;
    private javax.swing.JComboBox<String> rCargo;
    private javax.swing.JTextField rCorreo;
    private javax.swing.JComboBox<String> rDepart;
    private javax.swing.JTextField rNombre;
    private javax.swing.JPasswordField rPass;
    private javax.swing.JPasswordField rPass2;
    private javax.swing.JTextField rSalario;
    private javax.swing.JLabel regis;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
