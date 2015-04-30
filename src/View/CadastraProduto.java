package View;

import Model.Games;
import data.RepositorioGames;
import javax.swing.JOptionPane;

public class CadastraProduto extends javax.swing.JFrame {

    Games obj;
    RepositorioGames repositoriogame = new RepositorioGames();

    public CadastraProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtdataCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtdesenvolvedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jbnovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbgenero = new javax.swing.JComboBox();
        jtregistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcbplataforma = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jtdescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtfornecedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcbano = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jtpreco = new javax.swing.JTextField();
        jbcancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cadastro de Produtos");

        jLabel2.setText("Data Cadastro");

        jtdataCadastro.setEditable(false);
        jtdataCadastro.setEnabled(false);

        jLabel3.setText("Código do Produto");

        jtnome.setEditable(false);
        jtnome.setEnabled(false);

        jLabel4.setText("Nome do Produto");

        jtcodigo.setEditable(false);
        jtcodigo.setEnabled(false);

        jLabel5.setText("Desenvolvedor");

        jtdesenvolvedor.setEditable(false);
        jtdesenvolvedor.setEnabled(false);

        jLabel7.setText("Gênero");

        jbnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon add.png"))); // NOI18N
        jbnovo.setText("Novo");
        jbnovo.setBorder(null);
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });

        jbsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon salvar.png"))); // NOI18N
        jbsalvar.setText("Salvar");
        jbsalvar.setBorder(null);
        jbsalvar.setEnabled(false);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        jbcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon cancelar.png"))); // NOI18N
        jbcancelar.setText("Cancelar");
        jbcancelar.setBorder(null);
        jbcancelar.setEnabled(false);
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Registro");

        jcbgenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "XBOX360", "PC", "PS3", "NITENDO WII" }));
        jcbgenero.setEnabled(false);

        jtregistro.setEditable(false);
        jtregistro.setEnabled(false);

        jLabel9.setText("Plataforma");

        jcbplataforma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "AÇÃO", "AVENTURA", "CORRIDA", "ESPORTES", "RPG" }));
        jcbplataforma.setEnabled(false);

        jLabel6.setText("Descrição do Produto");

        jtdescricao.setEditable(false);
        jtdescricao.setEnabled(false);

        jLabel8.setText("Foto do Produto");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel10.setText("Fornecedor");

        jtfornecedor.setEditable(false);
        jtfornecedor.setEnabled(false);

        jLabel11.setText("Ano");

        jcbano.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jcbano.setEnabled(false);

        jLabel12.setText("Preço do Produto");

        jtpreco.setEditable(false);
        jtpreco.setEnabled(false);

        jbcancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon voltar.png"))); // NOI18N
        jbcancelar1.setText("Voltar");
        jbcancelar1.setBorder(null);
        jbcancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtdesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcbplataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jcbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel6))
                            .addComponent(jtnome)
                            .addComponent(jtdescricao))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(78, 78, 78))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtdataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbcancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jcbano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 315, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbcancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtdesenvolvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbplataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtdescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        limparCampos();
        jtregistro.setEditable(false);
        jtregistro.setEnabled(false);
        jtdataCadastro.setEditable(false);
        jtdataCadastro.setEnabled(false);
        jtcodigo.setEditable(false);
        jtcodigo.setEnabled(false);
        jtnome.setEditable(false);
        jtnome.setEnabled(false);
        jtpreco.setEditable(false);
        jtpreco.setEnabled(false);
        jtdesenvolvedor.setEditable(false);
        jtdesenvolvedor.setEnabled(false);
        jtfornecedor.setEditable(false);
        jtfornecedor.setEnabled(false);
        jtdescricao.setEditable(false);
        jtdescricao.setEnabled(false);
        jcbgenero.setEnabled(false);
        jcbplataforma.setEnabled(false);
        jcbano.setEnabled(false);
        jbnovo.setEnabled(true);
        jbsalvar.setEnabled(false);
        jbcancelar.setEnabled(false);
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
        limparCampos();
        jtregistro.setEditable(false);
        jtregistro.setEnabled(true);
        jtdataCadastro.setEditable(true);
        jtdataCadastro.setEnabled(true);
        jtcodigo.setEditable(true);
        jtcodigo.setEnabled(true);
        jtnome.setEditable(true);
        jtnome.setEnabled(true);
        jtpreco.setEditable(true);
        jtpreco.setEnabled(true);
        jtdesenvolvedor.setEditable(true);
        jtdesenvolvedor.setEnabled(true);
        jtfornecedor.setEditable(true);
        jtfornecedor.setEnabled(true);
        jtdescricao.setEditable(true);
        jtdescricao.setEnabled(true);
        jcbgenero.setEnabled(true);
        jcbano.setEnabled(true);
        jcbplataforma.setEnabled(true);
        jbnovo.setEnabled(false);
        jbsalvar.setEnabled(true);
        jbcancelar.setEnabled(true);
    }//GEN-LAST:event_jbnovoActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObject()) {
                    //salvar no banco
                    int returno = repositoriogame.inserir(obj);
                    if (returno == 0) {
                        JOptionPane.showConfirmDialog(this, "Registro salvo com sucesso !");
                        limparCampos();
                        jtregistro.setEditable(false);
                        jtregistro.setEnabled(false);
                        jtdataCadastro.setEditable(false);
                        jtdataCadastro.setEnabled(false);
                        jtcodigo.setEditable(false);
                        jtcodigo.setEnabled(false);
                        jtnome.setEditable(false);
                        jtnome.setEnabled(false);
                        jtpreco.setEditable(false);
                        jtpreco.setEnabled(false);
                        jtdesenvolvedor.setEditable(false);
                        jtdesenvolvedor.setEnabled(false);
                        jtfornecedor.setEditable(false);
                        jtfornecedor.setEnabled(false);
                        jtdescricao.setEditable(false);
                        jtdescricao.setEnabled(false);
                        jcbgenero.setEnabled(false);
                        jcbplataforma.setEnabled(false);
                        jcbano.setEnabled(false);
                        jbnovo.setEnabled(true);
                        jbsalvar.setEnabled(false);
                        jbcancelar.setEnabled(false);
                    } else {
                        if (returno == -1) {
                            JOptionPane.showMessageDialog(this, "Codigo Já Cadastrado!");
                        }else{
                        JOptionPane.showMessageDialog(this, "Não possivel inserir o registro !");
                        }
                    }
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: "
                    + erro.getMessage());

        }

    }//GEN-LAST:event_jbsalvarActionPerformed

    private void jbcancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbcancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastraProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbcancelar1;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JComboBox jcbano;
    private javax.swing.JComboBox jcbgenero;
    private javax.swing.JComboBox jcbplataforma;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtdataCadastro;
    private javax.swing.JTextField jtdescricao;
    private javax.swing.JTextField jtdesenvolvedor;
    private javax.swing.JTextField jtfornecedor;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jtpreco;
    private javax.swing.JTextField jtregistro;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos() {
        if (jtdataCadastro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a data de cadastro");
            jtdataCadastro.requestFocus();
            return false;
        }
        if (jtcodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o código");
            jtcodigo.requestFocus();
            return false;
        }
        if (jcbano.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o ano");
            jcbano.requestFocus();
            return false;
        }
        if (jtnome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o nome");
            jtnome.requestFocus();
            return false;
        }
          if (jtdesenvolvedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o desenvolvedor");
            jtdesenvolvedor.requestFocus();
            return false;
        }
        if (jcbgenero.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o gênero");
            jcbgenero.requestFocus();
            return false;
        }
        if (jcbplataforma.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Selecione a plataforma");
            jcbplataforma.requestFocus();
            return false;
        }
        if (jtfornecedor.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selecione a plataforma");
            jcbplataforma.requestFocus();
            return false;
        }
        
        if (jtpreco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o preço");
            jtpreco.requestFocus();
            return false;
        }
      
        if (jtdescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a descrição");
            jtdescricao.requestFocus();
            return false;
        }

        return true;
    }

    private boolean preencherObject() throws Exception {
        obj = new Games();
        obj.setCodigo(jtcodigo.getText());
        obj.setNomeGame(jtnome.getText());
        obj.setPreco(Double.parseDouble(jtpreco.getText()));
        obj.setDesenvolvedor(jtdescricao.getText());
        obj.setDescricao(jtdesenvolvedor.getText());
        obj.setGenero(jcbgenero.getSelectedIndex());
        obj.setPlataforma(jcbplataforma.getSelectedIndex());
        obj.setAno(jcbano.getSelectedIndex());
        return true;
    }

    private void limparCampos() {
        jtcodigo.setText("");
        jtnome.setText("");
        jtpreco.setText("");
        jtdesenvolvedor.setText("");
        jtdescricao.setText("");
        jcbgenero.setSelectedIndex(0);
        jcbplataforma.setSelectedIndex(0);
        jcbano.setSelectedIndex(0);

    }

}
