/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.modelo.Consulta;
import br.com.ti4b.modelo.Diagnostico;
import br.com.ti4b.modelo.Doencas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.pesquisas.SelecionaConsulta;
import br.com.ti4b.visao.pesquisas.SelecionaDiagnostico;
import br.com.ti4b.visao.pesquisas.SelecionaDoenca;
import br.com.ti4b.dao.DiagnosticoDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GC
 */
public class CadastroDiagnostico extends javax.swing.JInternalFrame {

    ConverterDatas cd = new ConverterDatas();
    Diagnostico ent_Diagnostico = new Diagnostico();
    DiagnosticoDAO funcaoDiagnostico = new DiagnosticoDAO();
    MenuPrincipal m;
    int codDoenca, codConsulta;

    private void cadastrar(int tipo) {
        ent_Diagnostico.setDataDiagnostico(cd.converter(DataDiag));
        if (radioNegativo.isSelected()) {
            ent_Diagnostico.setInformacao("NEGATIVO");
        } else if (radioPositivo.isSelected()) {
            ent_Diagnostico.setInformacao("POSITIVO");
        }
        funcaoDiagnostico.Cadastrar(ent_Diagnostico, tipo);

        if (ent_Diagnostico.getRetorno().equals("Cadastrado com sucesso!") || ent_Diagnostico.getRetorno().equals("Alterado com sucesso!")) {
            if (ent_Diagnostico.getRetorno().equals("Cadastrado com sucesso!")) {
                limpar_campos();
                info_error.setText("Cadastrado com sucesso!");
            } else {
                limpar_campos();
                info_error.setText("Alterado com sucesso!");
            }

        } else {
            info_error.setText(ent_Diagnostico.getRetorno());

        }
    }

    private void limpar_campos() {
        buttonGroup1.clearSelection();
        Cadastrar.setEnabled(true);
        ent_Diagnostico = new Diagnostico();
        nomeConsulta.setText(null);
        Doenca.setText(null);
        DataDiag.setDate(null);
        info_error.setText(null);
    }

    public CadastroDiagnostico() {
        initComponents();
        prive();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        DataDiag = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        nomeConsulta = new javax.swing.JTextField();
        selecionaConsulta = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Doenca = new javax.swing.JTextField();
        selecionaDoenca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        radioPositivo = new javax.swing.JRadioButton();
        radioNegativo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel4.setForeground(new java.awt.Color(0, 153, 0));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO DIAGNOSTICO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        DataDiag.setBackground(new java.awt.Color(255, 255, 255));
        DataDiag.setToolTipText("Selecione a data de realização do leilão");
        DataDiag.setDateFormatString("yyyy-MM-dd");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Doença:");

        nomeConsulta.setEditable(false);
        nomeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeConsultaActionPerformed(evt);
            }
        });
        nomeConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeConsultaKeyReleased(evt);
            }
        });

        selecionaConsulta.setText("...");
        selecionaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaConsultaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Descricao:");

        Doenca.setEditable(false);
        Doenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoencaActionPerformed(evt);
            }
        });
        Doenca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DoencaKeyReleased(evt);
            }
        });

        selecionaDoenca.setText("...");
        selecionaDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaDoencaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Data Diag:");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(32, 32, 32)
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecionaDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(nomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selecionaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(107, 107, 107))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(DataDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(Cadastrar)
                        .addGap(4, 4, 4)
                        .addComponent(Alterar)
                        .addGap(4, 4, 4)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair)))
                .addGap(27, 27, 27))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(nomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaConsulta)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaDoenca)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DataDiag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Sair))
                .addGap(10, 10, 10))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        radioPositivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioPositivo);
        radioPositivo.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        radioPositivo.setForeground(new java.awt.Color(0, 153, 0));
        radioPositivo.setText("POSITIVO");
        radioPositivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPositivoActionPerformed(evt);
            }
        });

        radioNegativo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioNegativo);
        radioNegativo.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        radioNegativo.setForeground(new java.awt.Color(0, 153, 0));
        radioNegativo.setText("NEGATIVO");
        radioNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNegativoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Resultado da Consulta:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(radioPositivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioNegativo)
                .addGap(57, 57, 57))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPositivo)
                    .addComponent(radioNegativo)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comparaDados(int tipo) {
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
        if (DataDiag.getDate() == null) {
            o++;
        }
        if ((!radioNegativo.isSelected()) && (!radioPositivo.isSelected())) {
            o++;
        }
        if (o == 0) {

            cadastrar(tipo);

        } else {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    private void nomeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeConsultaActionPerformed

    private void nomeConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeConsultaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeConsultaKeyReleased

    private void selecionaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaConsultaActionPerformed

        SelecionaConsulta seleciona_Consulta = new SelecionaConsulta(this, m);
        MenuPrincipal.jDesktopPane1.add(seleciona_Consulta);
        seleciona_Consulta.setVisible(true);
        seleciona_Consulta.setPosicao();
    }//GEN-LAST:event_selecionaConsultaActionPerformed

    private void DoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoencaActionPerformed

    private void DoencaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DoencaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DoencaKeyReleased

    private void selecionaDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaDoencaActionPerformed
        SelecionaDoenca seleciona_Doenca = new SelecionaDoenca(this, m);
        MenuPrincipal.jDesktopPane1.add(seleciona_Doenca);
        seleciona_Doenca.setVisible(true);
        seleciona_Doenca.setPosicao();        // TODO add your handling code here:
    }//GEN-LAST:event_selecionaDoencaActionPerformed

    private void radioPositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPositivoActionPerformed

    }//GEN-LAST:event_radioPositivoActionPerformed

    private void radioNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNegativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNegativoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Diagnostico.getIdDiagnostico() == 0) {
                comparaDados(1);
            } else {
                info_error.setText("Diagnostico já está cadastrada!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Diagnostico.getIdDiagnostico() != 0) {
                comparaDados(2);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o Diagnostico não está Cadastrada!\nDeseja escolher uma Diagnostico?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    limpar_campos();
                    SelecionaDiagnostico seleciona_Diagnostico = new SelecionaDiagnostico(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Diagnostico);
                    seleciona_Diagnostico.setVisible(true);
                    seleciona_Diagnostico.setPosicao();
                }

            }
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Diagnostico.getIdDiagnostico() != 0) {
                excluir();
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o Diagnostico não está Cadastrada!\nDeseja escolher uma Diagnostico?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    limpar_campos();
                    SelecionaDiagnostico seleciona_Diagnostico = new SelecionaDiagnostico(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Diagnostico);
                    seleciona_Diagnostico.setVisible(true);
                    seleciona_Diagnostico.setPosicao();
                }

            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        m.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private com.toedter.calendar.JDateChooser DataDiag;
    private javax.swing.JTextField Doenca;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Sair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField nomeConsulta;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JRadioButton radioNegativo;
    private javax.swing.JRadioButton radioPositivo;
    private javax.swing.JButton selecionaConsulta;
    private javax.swing.JButton selecionaDoenca;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    public CadastroDiagnostico(MenuPrincipal m) {
        initComponents();
        this.m = m;
        prive();

    }

    public void setDoenca(Doencas ea) {

        ent_Diagnostico.setIdDoenca(ea.getCod_doenca());

        Doenca.setText(ea.getDescricao());
    }

    public void setConsulta(Consulta ec) {

        ent_Diagnostico.setIdConsulta(ec.getCod_consulta());

        nomeConsulta.setText(ec.getInformacao());
    }

    public void setDiagnostico(Diagnostico ent_Diagnostico) {
        this.ent_Diagnostico = ent_Diagnostico;
        nomeConsulta.setText(ent_Diagnostico.getTipoDeExame());
        Doenca.setText(ent_Diagnostico.getNomeDoenca());
        DataDiag.setDate(ent_Diagnostico.getDataDiagnostico());
        if (ent_Diagnostico.getInformacao() != null) {
            if (ent_Diagnostico.getInformacao().equals("NEGATIVO")) {
                radioNegativo.setSelected(true);
            } else if (ent_Diagnostico.getInformacao().equals("POSITIVO")) {
                radioPositivo.setSelected(true);
            }
        }
    }

    private void excluir() {
        funcaoDiagnostico.excluirDiagnostico(ent_Diagnostico);
        if (ent_Diagnostico.getRetorno().equals("Deletado com sucesso!")) {
            info_error.setText("Deletado com sucesso!");
        } else {
            limpar_campos();
            info_error.setText(ent_Diagnostico.getRetorno());
        }
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
