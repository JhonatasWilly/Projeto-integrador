/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teladelogin;

import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CastroCliente
     */
    public CadastroCliente() {
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

        jTextFieldNomeCliente = new javax.swing.JTextField();
        jTextFieldCPFCliente = new javax.swing.JTextField();
        jTextFieldEstadoCleinte = new javax.swing.JTextField();
        jTextFieldCIdadeCliente = new javax.swing.JTextField();
        jTextFieldEndereçoCliente = new javax.swing.JTextField();
        jTextFieldContatoCliente = new javax.swing.JTextField();
        jTextFieldDataCliente = new javax.swing.JTextField();
        jTextFieldSobrenomeCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro De Clientes");
        getContentPane().setLayout(null);

        jTextFieldNomeCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldNomeCliente);
        jTextFieldNomeCliente.setBounds(90, 40, 200, 30);

        jTextFieldCPFCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPFCliente);
        jTextFieldCPFCliente.setBounds(90, 80, 200, 30);

        jTextFieldEstadoCleinte.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldEstadoCleinte);
        jTextFieldEstadoCleinte.setBounds(90, 120, 200, 30);

        jTextFieldCIdadeCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldCIdadeCliente);
        jTextFieldCIdadeCliente.setBounds(400, 80, 200, 30);

        jTextFieldEndereçoCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldEndereçoCliente);
        jTextFieldEndereçoCliente.setBounds(400, 120, 200, 30);

        jTextFieldContatoCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldContatoCliente);
        jTextFieldContatoCliente.setBounds(90, 160, 200, 30);

        jTextFieldDataCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextFieldDataCliente.setMargin(new java.awt.Insets(2, 33, 2, 2));
        jTextFieldDataCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDataCliente);
        jTextFieldDataCliente.setBounds(460, 160, 140, 30);

        jTextFieldSobrenomeCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldSobrenomeCliente);
        jTextFieldSobrenomeCliente.setBounds(400, 40, 200, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 200, 80, 30);

        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 353, 90, 30);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Nascimento:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 170, 160, 19);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contato:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 170, 90, 19);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereço:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(315, 120, 90, 30);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cidade:");
        jLabel6.setAlignmentY(0.7F);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(334, 90, 70, 19);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 130, 60, 19);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sobrenome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 50, 120, 19);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 80, 40, 30);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 40, 60, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\thiag\\Pictures\\PlanoDeFUNdo Roxo.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-330, 0, 1040, 430);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 170, 34, 14);

        setSize(new java.awt.Dimension(653, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFClienteActionPerformed

    private void jTextFieldDataClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    
    StringBuilder mensagem = new StringBuilder();

   
    mensagem.append("Salvo com Sucesso ").append("!");
    JOptionPane.showMessageDialog(null, mensagem);
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCIdadeCliente;
    private javax.swing.JTextField jTextFieldCPFCliente;
    private javax.swing.JTextField jTextFieldContatoCliente;
    private javax.swing.JTextField jTextFieldDataCliente;
    private javax.swing.JTextField jTextFieldEndereçoCliente;
    private javax.swing.JTextField jTextFieldEstadoCleinte;
    private javax.swing.JTextField jTextFieldNomeCliente;
    private javax.swing.JTextField jTextFieldSobrenomeCliente;
    // End of variables declaration//GEN-END:variables
}

