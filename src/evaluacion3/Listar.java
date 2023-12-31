/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package evaluacion3;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cetecom
 */
public class Listar extends javax.swing.JFrame {
    
    private DefaultTableModel modelo;

    /**
     * Creates new form Listar
     */
    public Listar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultadoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tallerLabel = new javax.swing.JLabel();
        dInscLabel = new javax.swing.JLabel();
        diasInsComboBox = new javax.swing.JComboBox<>();
        jBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tallerComboBox1 = new javax.swing.JComboBox<>();
        lobbyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(resultadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 115, -1, -1));

        listaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Apellido Paterno", "Apellido Materno", "Taller", "Dias Inscritos", "Cuota Mensual"
            }
        ));
        jScrollPane1.setViewportView(listaTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 990, 350));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evaluacion3/gymblck.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 300, 250));

        tallerLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tallerLabel.setText("Taller:");
        tallerLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(tallerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        dInscLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dInscLabel.setText("Dias de Inscripción:");
        dInscLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(dInscLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        diasInsComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        diasInsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "30", "90", "180" }));
        diasInsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasInsComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(diasInsComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel7.setText("Miembros");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GYM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 210, 70));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel2.setText("|");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 330, 70));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BlackHouse");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 330, 70));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel5.setText("|");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 330, 70));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel6.setText("|");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 330, 70));

        tallerComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tallerComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todo", "Karate", "Judo", "Kung-fu", "Boxeo", "Jiu-jitsu", "Capoeira", "Muay Thai", "Krav Maga", "Kendo", "Aikido", "Taekwondo", "Esgrima" }));
        tallerComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallerComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(tallerComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        lobbyButton.setBackground(new java.awt.Color(0, 0, 0));
        lobbyButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lobbyButton.setForeground(new java.awt.Color(255, 255, 255));
        lobbyButton.setText("Volver");
        lobbyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lobbyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(lobbyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diasInsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diasInsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diasInsComboBoxActionPerformed

    private void lobbyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lobbyButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Lobby().setVisible(true);
    }//GEN-LAST:event_lobbyButtonActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:
        if (modelo != null) {
            modelo.setRowCount(0);
        }
        
        try {
            String sql = "SELECT * FROM miembro";
            //String sql = "SELECT * FROM miembro WHERE dias_inscritos = " + diasInsComboBox.getSelectedItem().toString() + " AND taller = '" + tallerComboBox1.getSelectedItem().toString() + "'";
            
            if (tallerComboBox1.getSelectedIndex() != 0 || diasInsComboBox.getSelectedIndex() != 0) {
                sql = sql + " WHERE ";
                
                if (tallerComboBox1.getSelectedIndex() != 0 && diasInsComboBox.getSelectedIndex() == 0) {
                    sql = sql + "taller = '" + tallerComboBox1.getSelectedItem().toString() + "'";
                }
                else if (tallerComboBox1.getSelectedIndex() == 0 && diasInsComboBox.getSelectedIndex() != 0) {
                    sql = sql + "dias_inscritos = " + diasInsComboBox.getSelectedItem().toString();
                }
                else {
                    sql = sql + "dias_inscritos = " + diasInsComboBox.getSelectedItem().toString() + " AND taller = '" + tallerComboBox1.getSelectedItem().toString() + "'";
                }
            }
            
            ResultSet result = Lobby.st.executeQuery(sql);
            
            modelo = (DefaultTableModel) listaTable.getModel();
            
            while (result.next()) {
                // Obtener datos del ResultSet
                Object rut = result.getObject(2);
                Object nombre = result.getObject(3);
                Object apPaterno = result.getObject(4);
                Object apMaterno = result.getObject(5);
                Object taller = result.getObject(6);
                Object diasInscritosResult = result.getObject(7);
                Object cuotaMensual = result.getObject(8);
                
                modelo.addRow(new Object[]{rut, nombre, apPaterno, apMaterno, taller, diasInscritosResult, cuotaMensual});
            }
            
            listaTable.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void tallerComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallerComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tallerComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dInscLabel;
    private javax.swing.JComboBox<String> diasInsComboBox;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTable;
    private javax.swing.JButton lobbyButton;
    private javax.swing.JLabel resultadoLabel;
    private javax.swing.JComboBox<String> tallerComboBox1;
    private javax.swing.JLabel tallerLabel;
    // End of variables declaration//GEN-END:variables
}
