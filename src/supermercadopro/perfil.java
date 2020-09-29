package supermercadopro;

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
public class perfil extends javax.swing.JFrame {

    public perfil() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(false);
        setSize(900, 550);

        ImageIcon fondo = new ImageIcon("src/supermercadopro/fondo.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(LabelFondo.getWidth(),
                LabelFondo.getHeight(), Image.SCALE_DEFAULT));
        LabelFondo.setIcon(icono);
        this.repaint();
        
        titulo.setText("Perfil de " + inicio.name);
        name1.setText(subprincipal.pn);
        cc1.setText(String.valueOf(subprincipal.pcc));
        dpt1.setText(subprincipal.pd);
        cargo1.setText(subprincipal.pca);
        sal1.setText(String.valueOf(subprincipal.ps));
        mail1.setText(subprincipal.pco);
        pass1.setText(subprincipal.ppass);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        cc1 = new javax.swing.JTextField();
        dpt1 = new javax.swing.JTextField();
        cargo1 = new javax.swing.JTextField();
        sal1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pass1 = new javax.swing.JTextField();
        mail1 = new javax.swing.JFormattedTextField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/uno.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 385, -1));

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setText("Perfil de");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 300, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 139, -1, -1));

        jLabel4.setText("Cédula:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 177, -1, -1));

        jLabel5.setText("Departamento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 223, -1, -1));

        jLabel6.setText("Cargo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 265, -1, -1));

        jLabel7.setText("Salario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 303, -1, -1));
        getContentPane().add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 135, 200, -1));

        cc1.setEditable(false);
        getContentPane().add(cc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 177, 200, -1));
        getContentPane().add(dpt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 219, 200, -1));

        cargo1.setEditable(false);
        getContentPane().add(cargo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 261, 200, -1));

        sal1.setEditable(false);
        getContentPane().add(sal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 303, 200, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 150, 61));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 150, 61));

        jLabel8.setText("Correo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        jLabel9.setText("Contraseña:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 391, -1, -1));

        pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass1ActionPerformed(evt);
            }
        });
        getContentPane().add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 387, 200, -1));
        getContentPane().add(mail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 200, 27));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass1ActionPerformed

    }//GEN-LAST:event_pass1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        subprincipal ps = new subprincipal();
        ps.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String n = name1.getText();
        long c = Long.parseLong(cc1.getText());
        String d = dpt1.getText();
        String ca = cargo1.getText();
        long s = Long.parseLong(sal1.getText());
        String co = mail1.getText();
        String p = pass1.getText();

        Empleado act = new Empleado(n, c, co, d, ca, s, p);
        try {
            bd.update(act);
            JOptionPane.showMessageDialog(null, "¡Datos actualizados exitosamente!");
        } catch (SQLException ex) {
            Logger.getLogger(perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTextField cargo1;
    private javax.swing.JTextField cc1;
    private javax.swing.JTextField dpt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField mail1;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField pass1;
    private javax.swing.JTextField sal1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
