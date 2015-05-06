package br.com.EuQueroGames.GUI;

import br.com.EuQueroGames.ClassesBasicas.Cliente;
import javax.swing.JOptionPane;

public class CadastraCliente extends javax.swing.JFrame {

    Cliente c;

    public CadastraCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtregistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtdataCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtendereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtbairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtcidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcUF = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jtCEP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtemail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtcontato = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtCPF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtRG = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcsexo = new javax.swing.JComboBox();
        jbvoltar = new javax.swing.JButton();
        jbnovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Cadastro de Clientes");
        setResizable(false);

        jLabel1.setText("Registro");

        jtregistro.setEditable(false);
        jtregistro.setEnabled(false);

        jLabel2.setText("Data Cadastro");

        jtdataCadastro.setEditable(false);
        jtdataCadastro.setEnabled(false);

        jLabel3.setText("Nome Completo");

        jtendereco.setEditable(false);
        jtendereco.setEnabled(false);

        jLabel4.setText("Endereço");

        jtnome.setEditable(false);
        jtnome.setEnabled(false);

        jLabel5.setText("Bairro");

        jtbairro.setEditable(false);
        jtbairro.setEnabled(false);

        jLabel6.setText("Cidade");

        jtcidade.setEditable(false);
        jtcidade.setEnabled(false);

        jLabel7.setText("UF");

        jcUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "PE", "RJ", "RS", "SP" }));
        jcUF.setEnabled(false);

        jLabel8.setText("CEP");

        jtCEP.setEditable(false);
        jtCEP.setEnabled(false);

        jLabel9.setText("Email");

        jtemail.setEditable(false);
        jtemail.setEnabled(false);

        jLabel10.setText("Contato");

        jtcontato.setEditable(false);
        jtcontato.setEnabled(false);

        jLabel12.setText("N° CPF");

        jtCPF.setEditable(false);
        jtCPF.setEnabled(false);

        jLabel13.setText("N° RG");

        jtRG.setEditable(false);
        jtRG.setEnabled(false);

        jLabel14.setText("Sexo");

        jcsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Masculino", "Feminino" }));
        jcsexo.setEnabled(false);

        jbvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon voltar.png"))); // NOI18N
        jbvoltar.setText("Voltar");
        jbvoltar.setBorder(null);
        jbvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltarActionPerformed(evt);
            }
        });

        jbnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon add.png"))); // NOI18N
        jbnovo.setText("Novo");
        jbnovo.setBorder(null);
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });

        jbsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon salvar.png"))); // NOI18N
        jbsalvar.setText("Salvar");
        jbsalvar.setBorder(null);
        jbsalvar.setEnabled(false);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        jbcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon cancelar.png"))); // NOI18N
        jbcancelar.setText("Cancelar");
        jbcancelar.setBorder(null);
        jbcancelar.setEnabled(false);
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtdataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jbnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)
                            .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(290, 290, 290)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jcsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(485, 485, 485)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(180, 180, 180)
                                .addComponent(jLabel6)
                                .addGap(288, 288, 288)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtemail)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addGap(6, 6, 6)
                .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(jtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbvoltarActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
        limparCampos();
        jtregistro.setEditable(true);
        jtregistro.setEnabled(true);
        jtdataCadastro.setEditable(true);
        jtdataCadastro.setEnabled(true);
        jtnome.setEditable(true);
        jtnome.setEnabled(true);
        jcsexo.setEnabled(true);
        jtcontato.setEditable(true);
        jtcontato.setEnabled(true);
        jtendereco.setEditable(true);
        jtendereco.setEnabled(true);
        jcUF.setEnabled(true);
        jtbairro.setEditable(true);
        jtbairro.setEnabled(true);
        jtcidade.setEditable(true);
        jtcidade.setEnabled(true);
        jtemail.setEditable(true);
        jtemail.setEnabled(true);
        jtCEP.setEditable(true);
        jtCEP.setEnabled(true);
        jtCPF.setEditable(true);
        jtCPF.setEnabled(true);
        jtRG.setEditable(true);
        jtRG.setEnabled(true);
        jbnovo.setEnabled(false);
        jbsalvar.setEnabled(true);
        jbcancelar.setEnabled(true);
    }//GEN-LAST:event_jbnovoActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
        /*try {
         if (validarCampos()) {
         if (preencherObject()) {
         int returno = cdata.inserir(c);
         if (returno == 0) {
         JOptionPane.showConfirmDialog(this, "Registro salvo com sucesso !");
         limparCampos();
         jtregistro.setEditable(false);
         jtregistro.setEnabled(false);
         jtdataCadastro.setEditable(false);
         jtdataCadastro.setEnabled(false);
         jtnome.setEditable(false);
         jtnome.setEnabled(false);
         jcsexo.setEnabled(false);
         jtcontato.setEditable(false);
         jtcontato.setEnabled(false);
         jtendereco.setEditable(false);
         jtendereco.setEnabled(false);
         jcUF.setEnabled(false);
         jtbairro.setEditable(false);
         jtbairro.setEnabled(false);
         jtcidade.setEditable(false);
         jtcidade.setEnabled(false);
         jtemail.setEditable(false);
         jtemail.setEnabled(false);
         jtCEP.setEditable(false);
         jtCEP.setEnabled(false);
         jtCPF.setEditable(false);
         jtCPF.setEnabled(false);
         jtRG.setEditable(false);
         jtRG.setEnabled(false);
         jbnovo.setEnabled(true);
         jbsalvar.setEnabled(false);
         jbcancelar.setEnabled(false);
         } else {
         if (returno == -1) {
         JOptionPane.showMessageDialog(this, "Codigo Já Cadastrado!");
         } else {
         JOptionPane.showMessageDialog(this, "Não possivel inserir o registro !");
         }
         }
         }
         }
         } catch (Exception erro) {
         JOptionPane.showMessageDialog(this, "Erro: "
         + erro.getMessage());

         }*/
    }//GEN-LAST:event_jbsalvarActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        limparCampos();
        jtregistro.setEditable(false);
        jtregistro.setEnabled(false);
        jtdataCadastro.setEditable(false);
        jtdataCadastro.setEnabled(false);
        jtnome.setEditable(false);
        jtnome.setEnabled(false);
        jcsexo.setEnabled(false);
        jtcontato.setEditable(false);
        jtcontato.setEnabled(false);
        jtendereco.setEditable(false);
        jtendereco.setEnabled(false);
        jcUF.setEnabled(false);
        jtbairro.setEditable(false);
        jtbairro.setEnabled(false);
        jtcidade.setEditable(false);
        jtcidade.setEnabled(false);
        jtemail.setEditable(false);
        jtemail.setEnabled(false);
        jtCEP.setEditable(false);
        jtCEP.setEnabled(false);
        jtCPF.setEditable(false);
        jtCPF.setEnabled(false);
        jtRG.setEditable(false);
        jtRG.setEnabled(false);
        jbnovo.setEnabled(true);
        jbsalvar.setEnabled(false);
        jbcancelar.setEnabled(false);
    }//GEN-LAST:event_jbcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JButton jbvoltar;
    private javax.swing.JComboBox jcUF;
    private javax.swing.JComboBox jcsexo;
    private javax.swing.JTextField jtCEP;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtRG;
    private javax.swing.JTextField jtbairro;
    private javax.swing.JTextField jtcidade;
    private javax.swing.JTextField jtcontato;
    private javax.swing.JTextField jtdataCadastro;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtendereco;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jtregistro;
    // End of variables declaration//GEN-END:variables
 private boolean validarCampos() {
        if (jtdataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a data de cadastro");
            jtdataCadastro.requestFocus();
            return false;
        }
        if (jtnome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o nome");
            jtnome.requestFocus();
            return false;
        }
        if (jcsexo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o sexo");
            jcsexo.requestFocus();
            return false;
        }

        if (jtcontato.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o cotato");
            jtcontato.requestFocus();
            return false;
        }

        if (jtendereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o endereço");
            jtendereco.requestFocus();
            return false;
        }

        if (jcUF.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o UF");
            jcUF.requestFocus();
            return false;
        }
        if (jtbairro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o bairro");
            jtbairro.requestFocus();
            return false;
        }
        if (jtcidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a cidade");
            jtcidade.requestFocus();
            return false;
        }
        if (jtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o email");
            jtemail.requestFocus();
            return false;
        }
        if (jtCEP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o CEP");
            jtCEP.requestFocus();
            return false;
        }

        if (jtCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o CPF");
            jtCPF.requestFocus();
            return false;
        }

        if (jtRG.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o RG");
            jtRG.requestFocus();
            return false;
        }

        return true;
    }

    private boolean preencherObject() throws Exception {
        c = new Cliente();
        c.setNome(jtnome.getText());
        c.setDataCadastro(jtdataCadastro.getText());
        c.setSexo(jcsexo.getSelectedIndex());
        c.setContato(jtcontato.getText());
        c.setEndereco(jtendereco.getText());
        c.setUF(jcUF.getSelectedIndex());
        c.setBairro(jtbairro.getText());
        c.setCidade(jtcidade.getText());
        c.setEmail(jtendereco.getText());
        c.setCEP(jtCEP.getText());
        c.setCPF(jtCPF.getText());
        c.setRG(jtRG.getText());
        return true;
    }

    private void limparCampos() {
        jtregistro.setText("");
        jtdataCadastro.setText("");
        jtnome.setText("");
        jcsexo.setSelectedIndex(0);
        jtcontato.setText("");
        jtendereco.setText("");
        jcUF.setSelectedIndex(0);
        jtbairro.setText("");
        jtcidade.setText("");
        jtemail.setText("");
        jtCEP.setText("");
        jtCPF.setText("");
        jtRG.setText("");

    }

}
