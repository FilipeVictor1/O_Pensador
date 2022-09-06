package o_pensador;

import java.text.SimpleDateFormat;
import java.util.Date;

public class oPensador extends javax.swing.JFrame {
    public oPensador() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxOPensador = new javax.swing.JButton();
        txtFrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 500));
        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        boxOPensador.setBorder(null);
        boxOPensador.setBorderPainted(false);
        boxOPensador.setContentAreaFilled(false);
        boxOPensador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOPensadorActionPerformed(evt);
            }
        });
        getContentPane().add(boxOPensador);
        boxOPensador.setBounds(180, 80, 270, 420);

        txtFrase.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        txtFrase.setForeground(new java.awt.Color(71, 71, 71));
        txtFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(txtFrase);
        txtFrase.setBounds(10, 200, 210, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/oPensador.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxOPensadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOPensadorActionPerformed
        Date hora = new Date();
        String data = new SimpleDateFormat("HH:mm:ss").format(hora);
        txtFrase.setText("Pensando bem são " + data);
    }//GEN-LAST:event_boxOPensadorActionPerformed

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
            java.util.logging.Logger.getLogger(oPensador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(oPensador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(oPensador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(oPensador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new oPensador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boxOPensador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtFrase;
    // End of variables declaration//GEN-END:variables
}
