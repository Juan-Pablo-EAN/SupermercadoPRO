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
public class verDatos extends javax.swing.JFrame {

    static String cNombre;
    static long cCedula;
    static String cDepart;
    static String cCargo;
    static long cSalario;
    static long id;

    public verDatos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        setSize(900, 550);

        ImageIcon fondo = new ImageIcon("src/supermercadopro/fondo.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(LabelFondo.getWidth(),
                LabelFondo.getHeight(), Image.SCALE_DEFAULT));
        LabelFondo.setIcon(icono);
        this.repaint();

        condiciones();
    }

    public void condiciones() {
        if (verEmpleados.infoEmp == true) {
            label.setVisible(false);
            textfield.setVisible(false);
            buscar.setVisible(false);
            try {
                Empleado em = bd.queryForId(verEmpleados.cc);
                area.setText("\n\n" + "Nombre: " + em.getNombre() + "\n\n"
                        + "Cèdula: " + em.getCedula() + "\n\n"
                        + "Departamento: " + em.getDepartamento() + "\n\n"
                        + "Cargo: " + em.getCargo() + "\n\n"
                        + "Salario: " + em.getSalario() + "\n");
                cNombre = em.getNombre();
                cCedula = em.getCedula();
                cDepart = em.getDepartamento();
                cCargo = em.getCargo();
                cSalario = em.getSalario();
                if (inicio.ide == cCedula) {
                    change.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(verDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            label.setVisible(true);
            textfield.setVisible(true);
            buscar.setVisible(true);
            area.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        change = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        buscar = new javax.swing.JButton();
        textfield = new javax.swing.JTextField();
        label = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermercadopro/dos.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        change.setBackground(new java.awt.Color(51, 51, 51));
        change.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        change.setForeground(new java.awt.Color(255, 255, 255));
        change.setText("Cambiar Datos");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        getContentPane().add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 417, 135, 60));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 417, 135, 60));

        jLabel8.setBackground(new java.awt.Color(0, 102, 153));
        jLabel8.setFont(new java.awt.Font("Meiryo UI", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Supermercado Fontibón");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 27, -1, -1));

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 123, 435, 256));

        buscar.setBackground(new java.awt.Color(51, 51, 51));
        buscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 76, -1, -1));

        textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 82, 133, -1));

        label.setText("Cédula del empleado:");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 86, -1, -1));
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        cambiarDatos cd = new cambiarDatos();
        cd.setVisible(true);
        this.hide();
    }//GEN-LAST:event_changeActionPerformed

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (verEmpleados.infoEmp == true) {
            verEmpleados ve = new verEmpleados();
            ve.setVisible(true);
            this.hide();
        } else {
            subprincipal v = new subprincipal();
            v.setVisible(true);
            this.hide();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            Empleado b = bd.queryForId(Long.parseLong(textfield.getText().trim()));
            try {
                id = b.getCedula();
                area.setText("\n\n" + "Nombre: " + b.getNombre() + "\n\n"
                        + "Cèdula: " + b.getCedula() + "\n\n"
                        + "Correo: " + b.getCorreo() + "\n\n"
                        + "Departamento: " + b.getDepartamento() + "\n\n"
                        + "Cargo: " + b.getCargo() + "\n\n"
                        + "Salario: " + b.getSalario() + "\n");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Cedula no registrada en la base de datos");
                System.out.println(e);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "¡Ocurrio un error!");
            Logger.getLogger(verDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(verDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTextArea area;
    private javax.swing.JButton buscar;
    private javax.swing.JButton change;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTextField textfield;
    // End of variables declaration//GEN-END:variables
}
