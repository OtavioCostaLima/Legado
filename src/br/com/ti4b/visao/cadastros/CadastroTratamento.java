/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.modelo.Diagnostico;
import br.com.ti4b.modelo.Medicamentos;
import br.com.ti4b.modelo.Tratamento;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.pesquisas.PesquisarMedicamentos;
import br.com.ti4b.visao.pesquisas.SelecionaDiagnostico;
import br.com.ti4b.visao.pesquisas.Seleciona_Tratamento;
import br.com.ti4b.dao.TratamentoDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GC
 */
public class CadastroTratamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Tratamento
     */
    ConverterDatas cd = new ConverterDatas();
    Tratamento ent_Tratamento = new Tratamento();
    TratamentoDAO funcaoTratamento = new TratamentoDAO();
    MenuPrincipal m;

    public CadastroTratamento() {
        initComponents();
        prive();
    }

    public CadastroTratamento(MenuPrincipal m) {
        initComponents();
        this.m = m;
        prive();
    }

    private void trataCampos(int tipo) {
        Component components[] = painelCadastro1.getComponents();
        int o = 0;
        for (int i = 0; i < components.length; i++) {
            //Comparação com campoDeTexto
            if (components[i] instanceof JTextField) {
                if (((JTextField) components[i]).getText().isEmpty()) {
                    o++;
                }
            }
        }
        if (DataTratamento.getDate() == null) {
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

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    public void retornaInfo() {
        if (ent_Tratamento.getRetorno().equals("Cadastrado com sucesso!") || ent_Tratamento.getRetorno().equals("Alterado com sucesso!") || ent_Tratamento.getRetorno().equals("Deletado com sucesso!")) {
            if (ent_Tratamento.getRetorno().equals("Cadastrado com sucesso!")) {
                limpar_campos();
                info_error.setText("Cadastrado com sucesso!");
            } else if (ent_Tratamento.getRetorno().equals("Alterado com sucesso!")) {
                limpar_campos();
                info_error.setText("Alterado com sucesso!");
            } else if (ent_Tratamento.getRetorno().equals("Deletado com sucesso!")) {
                limpar_campos();
                info_error.setText("Deletado com Sucesso!");
            } else {
                info_error.setText(ent_Tratamento.getRetorno());
            }
        }
    }

    public void cadastrar(int tipo) {
        ent_Tratamento.setData_tratamento(cd.converter(DataTratamento));
        ent_Tratamento.setQuant(Integer.parseInt(Quantidade.getText()));
        ent_Tratamento.setPeriodo_tratamento(Integer.parseInt(Periodo.getText()));
        funcaoTratamento.Cadastrar(ent_Tratamento, tipo);
        retornaInfo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelCadastro1 = new javax.swing.JPanel();
        Quantidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataTratamento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        Informacao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Descricao = new javax.swing.JTextField();
        selecionaDiagnostico = new javax.swing.JButton();
        pesquisarMedicamentos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Periodo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2.setText("CADASTRO TRATAMENTO ");

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

        painelCadastro1.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantidadeKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Data Tratamento:");

        DataTratamento.setBackground(new java.awt.Color(255, 255, 255));
        DataTratamento.setToolTipText("Selecione a data de realização do leilão");
        DataTratamento.setDateFormatString("yyyy-MM-dd");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Medicamento:");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Informacao.setEditable(false);
        Informacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InformacaoKeyReleased(evt);
            }
        });
        Informacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformacaoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Informacao:");

        Descricao.setEditable(false);
        Descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DescricaoKeyReleased(evt);
            }
        });
        Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescricaoActionPerformed(evt);
            }
        });

        selecionaDiagnostico.setText("...");
        selecionaDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaDiagnosticoActionPerformed(evt);
            }
        });

        pesquisarMedicamentos.setText("...");
        pesquisarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarMedicamentosActionPerformed(evt);
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

        Periodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PeriodoKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Período:");

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

        javax.swing.GroupLayout painelCadastro1Layout = new javax.swing.GroupLayout(painelCadastro1);
        painelCadastro1.setLayout(painelCadastro1Layout);
        painelCadastro1Layout.setHorizontalGroup(
            painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelCadastro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastro1Layout.createSequentialGroup()
                        .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastro1Layout.createSequentialGroup()
                        .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastro1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(24, 24, 24)
                                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DataTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Informacao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Sair)
                                    .addGroup(painelCadastro1Layout.createSequentialGroup()
                                        .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(painelCadastro1Layout.createSequentialGroup()
                                                .addComponent(pesquisarMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Quantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Periodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(painelCadastro1Layout.createSequentialGroup()
                                                .addComponent(selecionaDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4)))
                                .addGap(10, 10, 10))
                            .addGroup(painelCadastro1Layout.createSequentialGroup()
                                .addComponent(Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        painelCadastro1Layout.setVerticalGroup(
            painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastro1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Informacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButton4)
                    .addComponent(selecionaDiagnostico))
                .addGap(10, 10, 10)
                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(pesquisarMedicamentos)
                    .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DataTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastro1Layout.createSequentialGroup()
                        .addGroup(painelCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cadastrar)
                            .addComponent(Alterar)
                            .addComponent(Excluir))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastro1Layout.createSequentialGroup()
                        .addComponent(Sair)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
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

    private void InformacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformacaoActionPerformed

    private void InformacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InformacaoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_InformacaoKeyReleased

    private void DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescricaoActionPerformed

    private void DescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescricaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DescricaoKeyReleased

    private void selecionaDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaDiagnosticoActionPerformed
        SelecionaDiagnostico diag = new SelecionaDiagnostico(this, m);
        MenuPrincipal.jDesktopPane1.add(diag);
        diag.setVisible(true);
        diag.setPosicao();
    }//GEN-LAST:event_selecionaDiagnosticoActionPerformed

    private void pesquisarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarMedicamentosActionPerformed
        PesquisarMedicamentos med = new PesquisarMedicamentos(this, m);
        MenuPrincipal.jDesktopPane1.add(med);
        med.setVisible(true);
        med.setPosicao();
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarMedicamentosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Tratamento.getCod_tratamento() == 0) {
                trataCampos(1);
            } else {
                info_error.setText("Tratamento já está cadastrado!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Tratamento.getCod_tratamento() != 0) {
                trataCampos(2);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o Tratamento não está Cadastrado! Deseja selecionar um Tratamento? ", "Alerta", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    Seleciona_Tratamento seleciona_Tratamento = new Seleciona_Tratamento(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Tratamento);
                    seleciona_Tratamento.setVisible(true);
                    seleciona_Tratamento.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Tratamento.getCod_tratamento() != 0) {
                Component components[] = painelCadastro1.getComponents();
                int o = 0;
                for (int i = 0; i < components.length; i++) {
                    //Comparação com campoDeTexto
                    if (components[i] instanceof JTextField) {
                        if (((JTextField) components[i]).getText().isEmpty()) {
                            o++;
                        }
                    }
                }
                if (DataTratamento.getDate() == null) {
                    o++;
                }
                if (o == 0) {
                    excluir();
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o tratamento não está Cadastrado!\nDeseja escolher uma tratamento?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    Seleciona_Tratamento seleciona_Tratamento = new Seleciona_Tratamento(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Tratamento);
                    seleciona_Tratamento.setVisible(true);
                    seleciona_Tratamento.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        m.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void QuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantidadeKeyReleased
        Quantidade.setText(Quantidade.getText().replaceAll("[^0-9]", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantidadeKeyReleased

    private void PeriodoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PeriodoKeyReleased
        Periodo.setText(Periodo.getText().replaceAll("[^0-9]", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_PeriodoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private com.toedter.calendar.JDateChooser DataTratamento;
    private javax.swing.JTextField Descricao;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Informacao;
    private javax.swing.JTextField Periodo;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel painelCadastro1;
    private javax.swing.JButton pesquisarMedicamentos;
    private javax.swing.JButton selecionaDiagnostico;
    // End of variables declaration//GEN-END:variables

    private void limpar_campos() {
        Informacao.setText(null);
        Descricao.setText(null);
        info_error.setText(null);
        DataTratamento.setDate(null);
        Quantidade.setText(null);
        ent_Tratamento = new Tratamento();
        Periodo.setText(null);

    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    public void setMedicamentos(Medicamentos eme) {
        ent_Tratamento.setCod_medicamento(eme.getCod_medicamento());
        Descricao.setText(eme.getDesricao());
    }

    public void setDiagnostico(Diagnostico ent_Diagnostico) {
        Informacao.setText(ent_Diagnostico.getInformacao());
        ent_Tratamento.setCod_diagnostico(ent_Diagnostico.getIdDiagnostico());
    }

    public void setTratamento(Tratamento etra) {
        ent_Tratamento = etra;
        Informacao.setText(etra.getInformacao());
        Descricao.setText(etra.getDescricao());
        DataTratamento.setDate(etra.getData_tratamento());
        Quantidade.setText(String.valueOf(etra.getQuant()));
        Periodo.setText(String.valueOf(etra.getPeriodo_tratamento()));

    }

    public void excluir() {
        funcaoTratamento.excluirTratamento(ent_Tratamento);
        retornaInfo();;

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