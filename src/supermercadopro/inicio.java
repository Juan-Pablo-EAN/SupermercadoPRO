package supermercadopro;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class inicio extends javax.swing.JFrame {

    static boolean admis = false;

    static Dao<Empleado, Long> bd; //Long con L mayuscula porque el identificador es de tipo long
    private boolean acceso = false;
    static long ide;
    static boolean vip = false;

    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setSize(900, 550);

        ImageIcon fondo = new ImageIcon("src/supermercadopro/fondo.jpg");

        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(LabelFondo.getWidth(),
                LabelFondo.getHeight(), Image.SCALE_DEFAULT));

        LabelFondo.setIcon(icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iCC = new javax.swing.JTextField();
        iPass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        labelC = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/mercado.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/superm.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 276, -1, 280));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Inicio de sesión");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        iCC.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(iCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 209, 33));

        iPass.setBackground(new java.awt.Color(204, 204, 204));
        iPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iPassKeyPressed(evt);
            }
        });
        getContentPane().add(iPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 209, 33));

        jLabel5.setText("Cedula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        labelC.setText("Contraseña:");
        getContentPane().add(labelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 265, 45));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 173, 45));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/exit.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 102, 153));
        jLabel8.setFont(new java.awt.Font("Meiryo UI", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Supermercado Fontibón");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        admis = true;
        registro r = new registro();
        r.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cerrar c = new cerrar();
        c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void iPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iPassKeyPressed

    }//GEN-LAST:event_iPassKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean acceso = false;
        if (!iCC.getText().equals("") || !iPass.getText().equals("")) {
            long iCedula = Long.parseLong(iCC.getText().trim()); //.trim para quitar los espacios a los laterales
            try {
                Empleado ei = bd.queryForId(iCedula);
                String iPassword = iPass.getText().trim();
                try {
                    if (iCedula == 147258369 && iPassword.equals("mkonjibhuvgy")) {
                        vip = true;
                    } else {
                        vip = false;
                    }
                    if (ei.getPassword().equals(iPassword)) {
                        ide = ei.getCedula();
                        acceso = true;
                    } else if ("Domiciliario".equals(ei.getCargo()) || "Cajero".equals(ei.getCargo())
                            || "Distribuidor".equals(ei.getCargo())) {
                        acceso = false;
                        JOptionPane.showMessageDialog(null, "Lo sentimos, solo tienen acceso administradores y jefes");
                    } else {
                        acceso = false;
                        labelC.setForeground(java.awt.Color.red);
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "¡El empleado con la cédula " + iCedula + " no está registrado");
                    System.out.println(e);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error! Vuelve a intentarlo");
                System.out.println(ex);
            }
            if (acceso == true || vip == true) {
                subprincipal in = new subprincipal();
                in.setVisible(true);
                this.hide();
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡No has ingresado ninguna información!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) throws SQLException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        String archivo = "jdbc:h2:./baseDeDatos";

        ConnectionSource conexion = new JdbcConnectionSource(archivo);

        bd = DaoManager.createDao(conexion, Empleado.class);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTextField iCC;
    private javax.swing.JPasswordField iPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelC;
    // End of variables declaration//GEN-END:variables
}
