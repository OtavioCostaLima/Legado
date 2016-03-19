/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.telas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.modelo.Usuario;
import br.com.ti4b.dao.AcessoDAO;
import br.com.ti4b.dao.UsuarioDAO;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Otavio Costa
 */
public final class TelaUsuario extends javax.swing.JInternalFrame {

    UsuarioDAO funcoes_Usuario = new UsuarioDAO();
    List<Usuario> listLoguin = new ArrayList<>();
    AcessoDAO acesso = new AcessoDAO();
    Usuario usuario = new Usuario();

    private static TelaUsuario telaUsuario;

    public static TelaUsuario getInstancia() {
        if (telaUsuario == null) {
            telaUsuario = new TelaUsuario();
        }
        return telaUsuario;
    }

    /**
     * Creates new form Usuario
     */
    public TelaUsuario() {
        initComponents();
    }

    public TelaUsuario(MenuPrincipal m) {
        initComponents();
        Alterar1.setVisible(false);
        prive();
    }

    public void povoartabela() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setNumRows(0);
       
    }

    public boolean encapsulaUsuario() {
        if (Arrays.equals(senha1.getPassword(), senha2.getPassword())) {

            usuario.setNome(nome.getText());
            usuario.setNome_usuario(user.getText());
            usuario.setSenha(new String(senha1.getPassword()));
            if (RadioAdm.isSelected()) {
                usuario.setPrevilegio("ADMINISTRADOR");
            } else if (raLimitado.isSelected()) {
                usuario.setPrevilegio("LIMITADO");
            }
            return true;
        } else {
            info_error.setText("As senhas são diferentes!");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoDeUser = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senha1 = new javax.swing.JPasswordField();
        senha2 = new javax.swing.JPasswordField();
        pesquisar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        RadioAdm = new javax.swing.JRadioButton();
        raLimitado = new javax.swing.JRadioButton();
        info_error = new javax.swing.JLabel();
        Alterar1 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Usuário", "Privilégios", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setSelectionBackground(new java.awt.Color(0, 153, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel4.setText("Repita a senha:");

        pesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar nome"));
        pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisarKeyReleased(evt);
            }
        });

        jLabel5.setText("Usuário:");

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senha1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(senha2)
                    .addComponent(nome)
                    .addComponent(user))
                .addGap(64, 64, 64)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(senha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, nome});

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel6.setText("Privilégios:");

        RadioAdm.setBackground(new java.awt.Color(255, 255, 255));
        tipoDeUser.add(RadioAdm);
        RadioAdm.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        RadioAdm.setText("Adminstrador");

        raLimitado.setBackground(new java.awt.Color(255, 255, 255));
        tipoDeUser.add(raLimitado);
        raLimitado.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        raLimitado.setText("Limitado");
        raLimitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raLimitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioAdm)
                .addGap(18, 18, 18)
                .addComponent(raLimitado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RadioAdm)
                    .addComponent(raLimitado))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Alterar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Alterar1.setForeground(new java.awt.Color(255, 0, 0));
        Alterar1.setText("EXCLUIR");
        Alterar1.setContentAreaFilled(false);
        Alterar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Alterar1.setFocusable(false);
        Alterar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Grande.png"))); // NOI18N
        Alterar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Alterar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Alterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alterar1ActionPerformed(evt);
            }
        });

        Excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Excluir.setForeground(new java.awt.Color(255, 0, 0));
        Excluir.setText("ALTERAR");
        Excluir.setContentAreaFilled(false);
        Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Excluir.setFocusable(false);
        Excluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Grande.png"))); // NOI18N
        Excluir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(255, 0, 0));
        Cadastrar.setText("CADASTRAR");
        Cadastrar.setContentAreaFilled(false);
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cadastrar.setFocusable(false);
        Cadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Cadastrar Grande.png"))); // NOI18N
        Cadastrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("SAIR");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alterar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Alterar1, Cadastrar, Excluir, jButton8});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar1)
                    .addComponent(jButton8)
                    .addComponent(Excluir))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUÁRIOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        //  if (m.usuarioLogado.isADM()) {
        if (encapsulaUsuario()) {
            funcoes_Usuario.cadastrar(usuario);
            povoartabela();
            //   }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_CadastrarActionPerformed

    private void Alterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alterar1ActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // if (m.usuarioLogado.isADM()) {
        if (encapsulaUsuario()) {
            funcoes_Usuario.deletar(usuario);
            povoartabela();
            //  }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//        m.fecharFrames(this);
        this.dispose();                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyReleased
        upperCase(nome);        // TODO add your handling code here:
    }//GEN-LAST:event_nomeKeyReleased

    private void raLimitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raLimitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raLimitadoActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        FiltrosDeTabelas filtros = new FiltrosDeTabelas();
        if (pesquisar.getText().length() > 0) {
            filtros.FiltrarNome(pesquisar.getText(), jTable1, 0);
        } else {
            filtros.removerLinhasTabela(jTable1);
            povoartabela();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 1) {
            nome.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0)));
            user.setText(String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 1)));
            senha1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            senha2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            if (String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)).equals("ADMINISTRADOR")) {
                RadioAdm.setSelected(true);
            } else if (String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 2)).equals("LIMITADO")) {
                raLimitado.setSelected(true);
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar1;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Excluir;
    private javax.swing.JRadioButton RadioAdm;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JRadioButton raLimitado;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JPasswordField senha2;
    private javax.swing.ButtonGroup tipoDeUser;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
 public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    public void prive() {
//        if (m.usuarioLogado.isADM()) {
        povoartabela();

        // } else {
        pesquisar.setEditable(false);
        Cadastrar.setRolloverEnabled(false);
        Excluir.setRolloverEnabled(false);
        Cadastrar.setToolTipText("Você não tem privilégios para executar essa ação!");
        Excluir.setToolTipText("Você não tem privilégios para executar essa ação!");

        // }
    }

}
