/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ClassificacaoAnimal;
import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.util.ListaMateriaPrima;
import br.com.ti4b.modelo.Producao;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.pesquisas.Seleciona_Producao;
import br.com.ti4b.dao.ProducaoDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GC
 */
public class CadastroProducao extends javax.swing.JInternalFrame {

    MenuPrincipal m;
    Producao ent_Producao = new Producao();
    ProducaoDAO f_pro = new ProducaoDAO();
    ClassificacaoAnimal classificacao = new ClassificacaoAnimal();
    ListaMateriaPrima materia = new ListaMateriaPrima();

    private void trataCampos(int tipo) {
        Component components[] = painelCadastro.getComponents();
        int o = 0;
        for (int i = 0; i < components.length; i++) {
            //Comparação com campoDeTexto
            if (components[i] instanceof JTextField) {
                if (((JTextField) components[i]).getText().isEmpty()) {
                    o++;
                }
            }
        }
        if (DataProducao.getDate() == null) {
            o++;
        }

        if (o == 0) {
            if (tipo == 1 || tipo == 2) {
                cadastrar(tipo);
            } else if (tipo == 3) {
                excluir();
            }
        } else {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    public CadastroProducao(MenuPrincipal m) {
        initComponents();
        this.m = m;
        classificacao.listarClacificacao(Classificacao);
        prive();

    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    private void cadastrar(int tipo) {
        ConverterDatas cd = new ConverterDatas();
        ent_Producao.setData_producao(cd.converter(DataProducao));
        ent_Producao.setQuant(Integer.parseInt(Quant.getText()));
        ent_Producao.setCod_classificacao(classificacao.retornaCodClassificacao((String) Classificacao.getSelectedItem()));
        ent_Producao.setCod_materia(materia.retornaCodMateria((String) materiaPrima.getSelectedItem()));
        f_pro.Cadastrar(ent_Producao, tipo);
        if (ent_Producao.getRetorno().equals("Cadastrado com sucesso!") || ent_Producao.getRetorno().equals("Alterado com sucesso!")) {
            String rs = ent_Producao.getRetorno();
            limpar_campos();

            info_error.setText(rs);
        } else {
            info_error.setText(ent_Producao.getRetorno());
        }
    }

    private void excluir() {
        f_pro.excluirProducao(ent_Producao);
        if (ent_Producao.getRetorno().equals("Deletado com sucesso!")) {
            limpar_campos();
            info_error.setText("Deletado com sucesso!");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        Quant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataProducao = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Classificacao = new javax.swing.JComboBox();
        materiaPrima = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel4.setForeground(new java.awt.Color(0, 153, 0));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO PRODUÇÃO ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(11, 11, 11))
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Quant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Data Produção:");

        DataProducao.setBackground(new java.awt.Color(255, 255, 255));
        DataProducao.setToolTipText("Selecione a data de realização do leilão");
        DataProducao.setDateFormatString("yyyy-MM-dd");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Materia-Prima");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Categoria:");

        Classificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificacaoActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash2.png"))); // NOI18N
        jButton4.setToolTipText("Limpar Campos");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusPainted(false);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash2.png"))); // NOI18N
        jButton4.setRequestFocusEnabled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash1.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Cadastrar Pequeno.png"))); // NOI18N
        Cadastrar.setBorder(null);
        Cadastrar.setBorderPainted(false);
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

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Pequeno.png"))); // NOI18N
        Alterar.setBorder(null);
        Alterar.setBorderPainted(false);
        Alterar.setContentAreaFilled(false);
        Alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Alterar.setFocusable(false);
        Alterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Grande.png"))); // NOI18N
        Alterar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Pequeno.png"))); // NOI18N
        Excluir.setBorder(null);
        Excluir.setBorderPainted(false);
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

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Pequeno.png"))); // NOI18N
        Sair.setBorder(null);
        Sair.setBorderPainted(false);
        Sair.setContentAreaFilled(false);
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sair.setFocusable(false);
        Sair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        Sair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(DataProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sair))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCadastroLayout.createSequentialGroup()
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(Classificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4))
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(materiaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Quant, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 13, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10))))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(materiaPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Sair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificacaoActionPerformed
        materia.listarMateria(materiaPrima, String.valueOf(Classificacao.getSelectedItem()));
    }//GEN-LAST:event_ClassificacaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Producao.getCod_producao() == 0) {
                trataCampos(1);
            } else {
                info_error.setText("Produção já está cadastrada!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Producao.getCod_producao() != 0) {
                trataCampos(2);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Produção não está Cadastrado! Deseja selecionar uma Produção? ", "Alerta", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    Seleciona_Producao seleciona_Producao = new Seleciona_Producao(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Producao);
                    seleciona_Producao.setVisible(true);
                    seleciona_Producao.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Producao.getCod_producao() != 0) {
                trataCampos(3);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Alimento não está Cadastrado!\nDeseja escolher um Alimento?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    Seleciona_Producao pesquisarProducao = new Seleciona_Producao(this, m);
                    MenuPrincipal.jDesktopPane1.add(pesquisarProducao);
                    pesquisarProducao.setVisible(true);
                    pesquisarProducao.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        m.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void QuantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantKeyReleased
        Quant.setText(Quant.getText().replaceAll("[^0-9]", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JComboBox Classificacao;
    private com.toedter.calendar.JDateChooser DataProducao;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Quant;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox materiaPrima;
    private javax.swing.JPanel painelCadastro;
    // End of variables declaration//GEN-END:variables

    private void limpar_campos() {
        info_error.setText(null);
        Quant.setText(null);
        DataProducao.setDate(null);
        Classificacao.setSelectedIndex(0);
        materiaPrima.setSelectedIndex(0);
        ent_Producao = new Producao();
    }

    public void setProducao(Producao ent_Producao) {
        this.ent_Producao = ent_Producao;
        Classificacao.setSelectedItem(ent_Producao.getCategoria());
        materiaPrima.setSelectedItem(ent_Producao.getDescricao_materia());
        Quant.setText(String.valueOf(ent_Producao.getQuant()));
        DataProducao.setDate(ent_Producao.getData_producao());

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    public void prive() {

        if (m.usuarioLogado.isADM()) {
        } else {
            Cadastrar.setRolloverEnabled(false);
            Alterar.setRolloverEnabled(false);
            Excluir.setRolloverEnabled(false);
            Cadastrar.setToolTipText("Você não tem privilégios para executar essa ação!");
            Alterar.setToolTipText("Você não tem privilégios para executar essa ação!");
            Excluir.setToolTipText("Você não tem privilégios para executar essa ação!");

        }
    }
}
