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
public class cambiarDatos extends javax.swing.JFrame {

    public cambiarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setSize(900, 550);

        ImageIcon fondo = new ImageIcon("src/supermercadopro/fondo.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(LabelFondo.getWidth(),
                LabelFondo.getHeight(), Image.SCALE_DEFAULT));

        LabelFondo.setIcon(icono);
        this.repaint();

        if (verEmpleados.infoEmp == true) {
            mNombre1.setText(verDatos.cNombre);
            mCedula.setText(String.valueOf(verDatos.cCedula));
            mDepart.setSelectedItem(verDatos.cDepart);
            mCargo.setSelectedItem(verDatos.cCargo);
            mSalario.setText(String.valueOf(verDatos.cSalario));
        } else {
            try {
                Empleado c = bd.queryForId(verDatos.id);
                mNombre1.setText(c.getNombre());
                mCedula.setText(String.valueOf(c.getCedula()));
                mDepart.setSelectedItem(c.getDepartamento());
                mCargo.setSelectedItem(c.getCargo());
                mSalario.setText(String.valueOf(c.getSalario()));
            } catch (SQLException ex) {
                Logger.getLogger(cambiarDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mCedula = new javax.swing.JTextField();
        mSalario = new javax.swing.JTextField();
        mDepart = new javax.swing.JComboBox<>();
        mCargo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mNombre1 = new javax.swing.JTextField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 102, 153));
        jLabel9.setFont(new java.awt.Font("Meiryo UI", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Supermercado Fontibón");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/uno.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 0, 385, -1));

        mCedula.setEditable(false);
        mCedula.setBackground(new java.awt.Color(204, 204, 204));
        mCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(mCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 221, -1));

        mSalario.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(mSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 221, -1));

        mDepart.setBackground(new java.awt.Color(204, 204, 204));
        mDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajas", "Domicilios", "Oficina", "Distribución" }));
        getContentPane().add(mDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 221, -1));

        mCargo.setBackground(new java.awt.Color(204, 204, 204));
        mCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajero", "Domiciliario", "Administrador", "Distribuidor", "Jefe" }));
        getContentPane().add(mCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 221, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 124, -1, -1));

        jLabel3.setText("Departamento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel4.setText("Cargo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jLabel5.setText("Salario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 102, 153));
        jLabel8.setFont(new java.awt.Font("Meiryo UI", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Supermercado Fontibón");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 160, 50));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 160, 50));

        jLabel6.setText("Cédula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        mNombre1.setBackground(new java.awt.Color(204, 204, 204));
        mNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(mNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 116, 221, -1));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCedulaActionPerformed

    }//GEN-LAST:event_mCedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        verDatos ver = new verDatos();
        ver.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nNombre = mNombre1.getText();
        long nCedula = Long.parseLong(mCedula.getText());
        String nDepart = mDepart.getSelectedItem().toString();
        String nCargo = mCargo.getSelectedItem().toString();
        long nSalario = Long.parseLong(mSalario.getText());

        Empleado ec = new Empleado(nNombre, nCedula, "", nDepart,
                nCargo, nSalario, null);
        try {
            bd.update(ec);
            JOptionPane.showMessageDialog(null, "¡Cambios guardados exitosamente!");
        } catch (SQLException ex) {
            Logger.getLogger(cambiarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNombre1ActionPerformed

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
            java.util.logging.Logger.getLogger(cambiarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cambiarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cambiarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cambiarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cambiarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mCargo;
    private javax.swing.JTextField mCedula;
    private javax.swing.JComboBox<String> mDepart;
    private javax.swing.JTextField mNombre1;
    private javax.swing.JTextField mSalario;
    // End of variables declaration//GEN-END:variables
}
