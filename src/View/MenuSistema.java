package View;

import data.RepositorioGames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;

public class MenuSistema extends javax.swing.JFrame {

    RepositorioGames repositoriogame = new RepositorioGames();

    public MenuSistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jldata = new javax.swing.JLabel();
        jlhora = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuCadastraClientes = new javax.swing.JMenu();
        menuInserir1 = new javax.swing.JMenuItem();
        menuBuscar1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuCadastraFornecedor = new javax.swing.JMenu();
        menuInserir2 = new javax.swing.JMenuItem();
        menuBuscar2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuCadastraFuncionarios = new javax.swing.JMenu();
        menuInserir3 = new javax.swing.JMenuItem();
        menuBuscar3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuCadastraProdutos = new javax.swing.JMenu();
        menuInserir = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu do Sistema");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(90, 28));

        jldata.setBackground(new java.awt.Color(0, 0, 255));
        jldata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jldata.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlhora.setBackground(new java.awt.Color(0, 0, 255));
        jlhora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlhora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(593, Short.MAX_VALUE)
                .addComponent(jldata, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlhora, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jldata, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jlhora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 432, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BarraMenu.setPreferredSize(new java.awt.Dimension(90, 28));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini cadastro.png"))); // NOI18N
        menuCadastros.setText("CADASTROS");

        menuCadastraClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Icon Clientes.png"))); // NOI18N
        menuCadastraClientes.setText("1-Cadastros de Clientes");

        menuInserir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Add Cliente.png"))); // NOI18N
        menuInserir1.setText("Inserir");
        menuInserir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserir1ActionPerformed(evt);
            }
        });
        menuCadastraClientes.add(menuInserir1);

        menuBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Buscar Cliente.png"))); // NOI18N
        menuBuscar1.setText("Buscar");
        menuBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscar1ActionPerformed(evt);
            }
        });
        menuCadastraClientes.add(menuBuscar1);

        menuCadastros.add(menuCadastraClientes);
        menuCadastros.add(jSeparator1);

        menuCadastraFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Icon Fornecedores.png"))); // NOI18N
        menuCadastraFornecedor.setText("2-Cadastros de Fornecedores");

        menuInserir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Add Fornecedores.png"))); // NOI18N
        menuInserir2.setText("Inserir");
        menuInserir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserir2ActionPerformed(evt);
            }
        });
        menuCadastraFornecedor.add(menuInserir2);

        menuBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Buscar Fornecedores.png"))); // NOI18N
        menuBuscar2.setText("Buscar");
        menuBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscar2ActionPerformed(evt);
            }
        });
        menuCadastraFornecedor.add(menuBuscar2);

        menuCadastros.add(menuCadastraFornecedor);
        menuCadastros.add(jSeparator2);

        menuCadastraFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Icon Funcionarios.png"))); // NOI18N
        menuCadastraFuncionarios.setText("3-Cadastros de Funcionários");

        menuInserir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Add Funcionarios.png"))); // NOI18N
        menuInserir3.setText("Inserir");
        menuInserir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserir3ActionPerformed(evt);
            }
        });
        menuCadastraFuncionarios.add(menuInserir3);

        menuBuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Buscar Funcionarios.png"))); // NOI18N
        menuBuscar3.setText("Buscar");
        menuBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscar3ActionPerformed(evt);
            }
        });
        menuCadastraFuncionarios.add(menuBuscar3);

        menuCadastros.add(menuCadastraFuncionarios);
        menuCadastros.add(jSeparator3);

        menuCadastraProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Icon Games.png"))); // NOI18N
        menuCadastraProdutos.setText("4-Cadastros de Produtos");
        menuCadastraProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastraProdutosActionPerformed(evt);
            }
        });

        menuInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Add Games.png"))); // NOI18N
        menuInserir.setText("Inserir");
        menuInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInserirActionPerformed(evt);
            }
        });
        menuCadastraProdutos.add(menuInserir);

        menuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Buscar Games.png"))); // NOI18N
        menuBuscar.setText("Buscar");
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        menuCadastraProdutos.add(menuBuscar);

        menuCadastros.add(menuCadastraProdutos);

        BarraMenu.add(menuCadastros);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mini Sair2.png"))); // NOI18N
        menuSair.setText("SAIR");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        BarraMenu.add(menuSair);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserirActionPerformed
        CadastraProduto game = new CadastraProduto();
        game.pack();
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_menuInserirActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        BuscarProduto bp = new BuscarProduto();
        bp.pack();
        bp.setVisible(true);
        bp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuBuscarActionPerformed
    private void menuCadastraProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastraProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastraProdutosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
        System.exit(0);
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuInserir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserir1ActionPerformed
        CadastraCliente cl = new CadastraCliente();
        cl.pack();
        cl.setVisible(true);
        cl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuInserir1ActionPerformed

    private void menuBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscar1ActionPerformed
        BuscarCliente bc = new BuscarCliente();
        bc.pack();
        bc.setVisible(true);
        bc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuBuscar1ActionPerformed

    private void menuInserir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserir2ActionPerformed
        CadastraFornecedor cf = new CadastraFornecedor();
        cf.pack();
        cf.setVisible(true);
        cf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuInserir2ActionPerformed

    private void menuBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscar2ActionPerformed
        BuscarFornecedor bf = new BuscarFornecedor();
        bf.pack();
        bf.setVisible(true);
        bf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuBuscar2ActionPerformed

    private void menuInserir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInserir3ActionPerformed
      CadastraFuncionario cf = new CadastraFuncionario();
      cf.pack();
      cf.setVisible(true);
      cf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuInserir3ActionPerformed

    private void menuBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscar3ActionPerformed
       BuscarFuncionario bf = new BuscarFuncionario();
       bf.pack();
       bf.setVisible(true);
       bf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menuBuscar3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(" dd/MM/yy");
        jldata.setText(formato.format(dataSistema));
        
        Timer timer = new Timer(1000,new hora());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSistema().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel jldata;
    private javax.swing.JLabel jlhora;
    private javax.swing.JMenuItem menuBuscar;
    private javax.swing.JMenuItem menuBuscar1;
    private javax.swing.JMenuItem menuBuscar2;
    private javax.swing.JMenuItem menuBuscar3;
    private javax.swing.JMenu menuCadastraClientes;
    private javax.swing.JMenu menuCadastraFornecedor;
    private javax.swing.JMenu menuCadastraFuncionarios;
    private javax.swing.JMenu menuCadastraProdutos;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuInserir;
    private javax.swing.JMenuItem menuInserir1;
    private javax.swing.JMenuItem menuInserir2;
    private javax.swing.JMenuItem menuInserir3;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
class hora implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
Calendar  now = Calendar.getInstance();
jlhora.setText(String.format("  %1$tH:%1$tM",now));
}
}

}

