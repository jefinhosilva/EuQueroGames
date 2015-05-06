
package br.com.EuQueroGames.GUI;

import br.com.EuQueroGames.ClassesBasicas.Fornecedor;

import javax.swing.JOptionPane;

public class BuscarFornecedor extends javax.swing.JFrame {

    Fornecedor f;
    //RepositorioFornecedores fdata;

    public BuscarFornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtnomeRep = new javax.swing.JTextField();
        jtregistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtdataCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtendereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtRSocial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtbairro = new javax.swing.JTextField();
        jtnomeFantasia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtcidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcUF = new javax.swing.JComboBox();
        jtCNPJ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtCEP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtemail = new javax.swing.JTextField();
        jbvoltar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtcontato = new javax.swing.JTextField();
        jbsalvar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jbcancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbpesquisar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtnomeRep.setEditable(false);
        jtnomeRep.setEnabled(false);

        jtregistro.setEditable(false);
        jtregistro.setEnabled(false);

        jLabel2.setText("Data Cadastro");

        jtdataCadastro.setEditable(false);
        jtdataCadastro.setEnabled(false);

        jLabel3.setText("Nome Completo");

        jtendereco.setEditable(false);
        jtendereco.setEnabled(false);

        jLabel4.setText("Endereço");

        jtRSocial.setEditable(false);
        jtRSocial.setEnabled(false);

        jLabel5.setText("Bairro");

        jLabel10.setText("Nome Fantasia");

        jtbairro.setEditable(false);
        jtbairro.setEnabled(false);

        jtnomeFantasia.setEditable(false);
        jtnomeFantasia.setEnabled(false);

        jLabel6.setText("Cidade");

        jtcidade.setEditable(false);
        jtcidade.setEnabled(false);

        jLabel7.setText("UF");

        jLabel12.setText("Nº CNPJ");

        jcUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "PE", "RJ", "RS", "SP" }));
        jcUF.setEnabled(false);

        jLabel8.setText("CEP");

        jtCEP.setEditable(false);
        jtCEP.setEnabled(false);

        jLabel9.setText("Email");

        jtemail.setEditable(false);
        jtemail.setEnabled(false);

        jbvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon voltar.png"))); // NOI18N
        jbvoltar.setText("Voltar");
        jbvoltar.setBorder(null);
        jbvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvoltarActionPerformed(evt);
            }
        });

        jLabel11.setText("Contato");

        jtcontato.setEditable(false);
        jtcontato.setEnabled(false);

        jbsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon salvar.png"))); // NOI18N
        jbsalvar.setText("Salvar");
        jbsalvar.setBorder(null);
        jbsalvar.setEnabled(false);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        jLabel13.setText("Nome Representante");

        jbcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon cancelar.png"))); // NOI18N
        jbcancelar.setText("Cancelar");
        jbcancelar.setBorder(null);
        jbcancelar.setEnabled(false);
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro");

        jbpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/icon Pesquisar.png"))); // NOI18N
        jbpesquisar.setText("Pesquisar");
        jbpesquisar.setBorder(null);
        jbpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpesquisarActionPerformed(evt);
            }
        });

        jbeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/EuQueroGames/Imagens/Mini icon edit.png"))); // NOI18N
        jbeditar.setText("Editar");
        jbeditar.setBorder(null);
        jbeditar.setEnabled(false);
        jbeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditarActionPerformed(evt);
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
                                .addComponent(jbeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGap(18, 18, 18)
                                .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jtnomeFantasia)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtnomeRep))))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(jtRSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(jtnomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
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
                    .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(jtcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(jtnomeRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbvoltarActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
        /*try {
         if (validarCampos()) {
         if (preencherObject()) {
         //salvar no banco
         int returno = fdata.inserir(f);
         if (returno == 0) {
         JOptionPane.showConfirmDialog(this, "Registro salvo com sucesso !");
         limparCampos();
         jtregistro.setEditable(false);
         jtregistro.setEnabled(false);
         jtdataCadastro.setEditable(false);
         jtdataCadastro.setEnabled(false);
         jtCNPJ.setEditable(false);
         jtCNPJ.setEnabled(false);
         jtRSocial.setEditable(false);
         jtRSocial.setEnabled(false);
         jtnomeFantasia.setEditable(false);
         jtnomeFantasia.setEnabled(false);
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
         jtcontato.setEditable(false);
         jtcontato.setEnabled(false);
         jtnomeRep.setEditable(false);
         jtnomeRep.setEnabled(false);
         jbeditar.setEnabled(false);
         jbsalvar.setEnabled(false);
         jbcancelar.setEnabled(false);
         jbvoltar.setEnabled(true);
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
        jtCNPJ.setEditable(false);
        jtCNPJ.setEnabled(false);
        jtRSocial.setEditable(false);
        jtRSocial.setEnabled(false);
        jtnomeFantasia.setEditable(false);
        jtnomeFantasia.setEnabled(false);
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
        jtcontato.setEditable(false);
        jtcontato.setEnabled(false);
        jtnomeRep.setEditable(false);
        jtnomeRep.setEnabled(false);
        jbeditar.setEnabled(false);
        jbsalvar.setEnabled(false);
        jbcancelar.setEnabled(false);
        jbvoltar.setEnabled(true);
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jbpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpesquisarActionPerformed
        /* if (jtCNPJ.getText().equals("")) {
         JOptionPane.showMessageDialog(this, "Digite o CPF do cliente!");
         jtCNPJ.requestFocus();
         } else {
         f = fdata.buscar(jtCNPJ.getText());
         if (f == null) {
         JOptionPane.showMessageDialog(this, "Registro não encontrado!");
         } else {
                
         jtdataCadastro.setText(f.getDataCadastro());
         jtCNPJ.setText(f.getCNPJ());
         jtRSocial.setText(f.getRSocial());
         jtnomeFantasia.setText(f.getNomeFantasia());
         jtendereco.setText(f.getEndereco());
         jcUF.setSelectedIndex(f.getUF());
         jtbairro.setText(f.getBairro());
         jtcidade.setText(f.getCidade());
         jtCEP.setText(f.getCEP());
         jtemail.setText(f.getEmail());
         jtnomeRep.setText(f.getNomeRep());
         jbeditar.setEnabled(true);
         jbsalvar.setEnabled(true);
         jbcancelar.setEnabled(true);
         jbvoltar.setEnabled(true);
                
         }
         }  */
    }//GEN-LAST:event_jbpesquisarActionPerformed

    private void jbeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeditarActionPerformed
        jtregistro.setEditable(false);
        jtregistro.setEnabled(false);
        jtdataCadastro.setEditable(false);
        jtdataCadastro.setEnabled(false);
        jtCNPJ.setEditable(false);
        jtCNPJ.setEnabled(true);
        jtRSocial.setEditable(true);
        jtRSocial.setEnabled(true);
        jtnomeFantasia.setEditable(true);
        jtnomeFantasia.setEnabled(true);
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
        jtcontato.setEditable(true);
        jtcontato.setEnabled(true);
        jtnomeRep.setEditable(true);
        jtnomeRep.setEnabled(true);
        jbeditar.setEnabled(false);
        jbsalvar.setEnabled(true);
        jbcancelar.setEnabled(true);
        jbvoltar.setEnabled(true);
    }//GEN-LAST:event_jbeditarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbeditar;
    private javax.swing.JButton jbpesquisar;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JButton jbvoltar;
    private javax.swing.JComboBox jcUF;
    private javax.swing.JTextField jtCEP;
    private javax.swing.JTextField jtCNPJ;
    private javax.swing.JTextField jtRSocial;
    private javax.swing.JTextField jtbairro;
    private javax.swing.JTextField jtcidade;
    private javax.swing.JTextField jtcontato;
    private javax.swing.JTextField jtdataCadastro;
    private javax.swing.JTextField jtemail;
    private javax.swing.JTextField jtendereco;
    private javax.swing.JTextField jtnomeFantasia;
    private javax.swing.JTextField jtnomeRep;
    private javax.swing.JTextField jtregistro;
    // End of variables declaration//GEN-END:variables
private boolean validarCampos() {
        if (jtdataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a data de cadastro");
            jtdataCadastro.requestFocus();
            return false;
        }
        if (jtCNPJ.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o CNPJ");
            jtCNPJ.requestFocus();
            return false;
        }

        if (jtRSocial.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Nome Completo da Empresa");
            jtRSocial.requestFocus();
            return false;
        }

        if (jtnomeFantasia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Nome Fantasia da Empresa");
            jtnomeFantasia.requestFocus();
            return false;
        }
        if (jtendereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Endereco da Empresa");
            jtendereco.requestFocus();
            return false;
        }
        if (jcUF.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o UF da Empresa");
            jcUF.requestFocus();
            return false;
        }
        if (jtbairro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Bairro da Empresa");
            jtbairro.requestFocus();
            return false;
        }

        if (jtcidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a Cidade da Empresa");
            jtcidade.requestFocus();
            return false;
        }
        if (jtCEP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o CEP da Empresa");
            jtCEP.requestFocus();
            return false;
        }
        if (jtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Email da Empresa");
            jtemail.requestFocus();
            return false;
        }

        if (jtcontato.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Contato da Empresa");
            jtcontato.requestFocus();
            return false;
        }

        if (jtnomeRep.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o Nome do Representante da Empresa");
            jtnomeRep.requestFocus();
            return false;
        }

        return true;
    }

    private boolean preencherObject() throws Exception {
        f = new Fornecedor();
        f.setDataCadastro(jtdataCadastro.getText());
        f.setCNPJ(jtCNPJ.getText());
        f.setRSocial(jtRSocial.getText());
        f.setNomeFantasia(jtcontato.getText());
        f.setEndereco(jtendereco.getText());
        f.setUF(jcUF.getSelectedIndex());
        f.setBairro(jtbairro.getText());
        f.setCidade(jtcidade.getText());
        f.setCEP(jtCEP.getText());
        f.setEmail(jtendereco.getText());
        f.setContato(jtcontato.getText());
        f.setNomeRep(jtnomeRep.getText());

        return true;
    }

    private void limparCampos() {
        jtregistro.setText("");
        jtdataCadastro.setText("");
        jtCNPJ.setText("");
        jtRSocial.setText("");
        jtnomeFantasia.setText("");
        jtendereco.setText("");
        jcUF.setSelectedIndex(0);
        jtbairro.setText("");
        jtcidade.setText("");
        jtCEP.setText("");
        jtemail.setText("");
        jtnomeRep.setText("");

    }

}
