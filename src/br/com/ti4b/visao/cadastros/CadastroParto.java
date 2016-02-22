/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.modelo.Gestacao;
import br.com.ti4b.modelo.Parto;
import br.com.ti4b.entidadesGenericas.Ent_HistoricoReproducao;
import br.com.ti4b.visao.pesquisas.PesquisarGestantes;
import br.com.ti4b.visao.pesquisas.SelecionaAnimalParida;
import br.com.ti4b.dao.PartoDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author OtavioCosta
 */
public final class CadastroParto extends javax.swing.JInternalFrame {

    ConverterDatas cd = new ConverterDatas();
    MenuPrincipal m;
    Parto ent_Parto = new Parto();
    PartoDAO funcoes_Parto = new PartoDAO();

    public CadastroParto(MenuPrincipal m) {
        initComponents();
        this.m = m;
        RGestante.setEnabled(false);
        RParida.setEnabled(false);
        prive();
    }

    public CadastroParto() {
        initComponents();
        RGestante.setEnabled(false);
        RParida.setEnabled(false);
        prive();
    }

    public void setGestante(Gestacao eg) {
        ent_Parto.setCod_gestacao(eg.getId());
        NomeMae.setText(eg.getNome_gestante());

        if (eg.getObservacao().equals("PARIDA")) {
        }
        RParida.setSelected(true);
        if (eg.getObservacao().equals("GESTANTE")) {
        }
        RGestante.setSelected(true);
    }

    public void setValoresParto(Ent_HistoricoReproducao ent_Parto) {
        this.ent_Parto.setCod_gestacao(ent_Parto.getIdGestacao());
        this.ent_Parto.setCod_parto(ent_Parto.getIdParto());
        NomeMae.setText(ent_Parto.getNome());
        this.ent_Parto.setCod_parto(ent_Parto.getIdParto());
        this.ent_Parto.setCod_gestacao(ent_Parto.getIdGestacao());
        Qantidade.setText(String.valueOf(ent_Parto.getQuantidadeCrias()));
        Informacoes.setText(ent_Parto.getInformacoes());
        DataParto.setDate(ent_Parto.getData_parto());
        RParida.setSelected(true);
        RGestante.setEnabled(true);
        RParida.setEnabled(true);
    }

    public void limparCampos() {
        RGestante.setEnabled(false);
        RParida.setEnabled(false);
        ent_Parto = new Parto();
        NomeMae.setText(null);
        Qantidade.setText(null);
        Informacoes.setText(null);
        DataParto.setDate(null);
        GrupoSituacao.clearSelection();
        info_error.setText(null);
    }

    public void Cadastrar(int tipo) {
        ent_Parto.setData_parto(cd.converter(DataParto));
        ent_Parto.setInfomacoes(Informacoes.getText());
        ent_Parto.setQuantidade(Integer.parseInt(Qantidade.getText()));
        ent_Parto.setInfomacoes(Informacoes.getText());
        if (tipo == 1) {
            funcoes_Parto.cadastrarParto(ent_Parto);
        } else if (tipo == 2) {
            if (RParida.isSelected()) {
                funcoes_Parto.alterarParto(ent_Parto, 1);
            } else if (RGestante.isSelected()) {
                funcoes_Parto.alterarParto(ent_Parto, 2);
            }
        }
        if (ent_Parto.getRetorno().equals("Alterado com Sucesso!") || ent_Parto.getRetorno().equals("Cadastrado com Sucesso!")) {
            if (ent_Parto.getRetorno().equals("Alterado com Sucesso!")) {
                limparCampos();
                info_error.setText("Alterado com Sucesso!");
            } else if (ent_Parto.getRetorno().equals("Cadastrado com Sucesso!")) {
                limparCampos();
                info_error.setText("Cadastrado com Sucesso!");
            } else {
                info_error.setText(ent_Parto.getRetorno());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSituacao = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        BarraVerde2 = new javax.swing.JPanel();
        BarraVerde1 = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        jLabelInformacao = new javax.swing.JLabel();
        jLabelCrias = new javax.swing.JLabel();
        Qantidade = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        DataParto = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Informacoes = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        NomeMae = new javax.swing.JTextField();
        LbMatriz = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelSituacao = new javax.swing.JLabel();
        RGestante = new javax.swing.JRadioButton();
        RParida = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        info_error = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setTitle("Cadastro Parto");
        setAutoscrolls(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        Logo.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setText("PARTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(Logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        BarraVerde2.setBackground(new java.awt.Color(0, 153, 0));
        BarraVerde2.setPreferredSize(new java.awt.Dimension(5, 420));

        javax.swing.GroupLayout BarraVerde2Layout = new javax.swing.GroupLayout(BarraVerde2);
        BarraVerde2.setLayout(BarraVerde2Layout);
        BarraVerde2Layout.setHorizontalGroup(
            BarraVerde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        BarraVerde2Layout.setVerticalGroup(
            BarraVerde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        BarraVerde1.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout BarraVerde1Layout = new javax.swing.GroupLayout(BarraVerde1);
        BarraVerde1.setLayout(BarraVerde1Layout);
        BarraVerde1Layout.setHorizontalGroup(
            BarraVerde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        BarraVerde1Layout.setVerticalGroup(
            BarraVerde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelInformacao.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabelInformacao.setText("Informações:");

        jLabelCrias.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabelCrias.setText("Qtd. Crias:");
        jLabelCrias.setToolTipText("Quantidade de Crias!");

        Qantidade.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        Qantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QantidadeKeyReleased(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabelData.setText("Data do Parto:");

        DataParto.setDateFormatString("yyyy-MM-dd");

        Informacoes.setColumns(20);
        Informacoes.setRows(5);
        Informacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InformacoesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Informacoes);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NomeMae.setEnabled(false);
        NomeMae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeMaeKeyReleased(evt);
            }
        });

        LbMatriz.setText("Matríz:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelSituacao.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jLabelSituacao.setText("Situação atual:");

        RGestante.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituacao.add(RGestante);
        RGestante.setText("G");
        RGestante.setToolTipText("Gestante");

        RParida.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSituacao.add(RParida);
        RParida.setText("P");
        RParida.setToolTipText("Parida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RGestante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RParida))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelSituacao)
                    .addComponent(RParida)
                    .addComponent(RGestante)))
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash2.png"))); // NOI18N
        jButton3.setToolTipText("Limpar Campos");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash2.png"))); // NOI18N
        jButton3.setRequestFocusEnabled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        info_error.setBackground(new java.awt.Color(255, 255, 255));
        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Pequeno.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
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

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(Cadastrar)
                                .addGap(10, 10, 10)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Excluir)
                                .addGap(134, 134, 134)
                                .addComponent(jButton8))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabelCrias)
                                        .addGap(18, 18, 18)
                                        .addComponent(Qantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelData)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DataParto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(LbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInformacao)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInformacao))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelData)
                            .addComponent(DataParto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCrias)
                            .addComponent(Qantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar)
                    .addComponent(jButton8)
                    .addComponent(Excluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BarraVerde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarraVerde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraVerde2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(BarraVerde1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (m.getPesquisarGestantes() == null) {
            PesquisarGestantes gestantes = new PesquisarGestantes(m, this);
            MenuPrincipal.jDesktopPane1.add(gestantes);
            gestantes.setVisible(true);
            gestantes.setPosicao();
        } else {
            JOptionPane.showMessageDialog(null, "O painel Pesquisar Gestante já está aberto.\n Por motivos de segurança feixe-o caso esteja utilizando e tente novamento!", "INFORMAÇÃO!", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void NomeMaeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeMaeKeyReleased
        NomeMae.setText(NomeMae.getText().toUpperCase());

    }//GEN-LAST:event_NomeMaeKeyReleased

    private void QantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QantidadeKeyReleased
        Qantidade.setText(Qantidade.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_QantidadeKeyReleased

    private void InformacoesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InformacoesKeyReleased
        // TODO add your handling code here:
        Informacoes.setText(Informacoes.getText().toUpperCase());
    }//GEN-LAST:event_InformacoesKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        limparCampos();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Parto.getCod_parto() == 0) {
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
                if (DataParto.getDate() == null) {
                    o++;
                }
                if (o == 0) {
                    Cadastrar(1);
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                info_error.setText("Parto já está Cadastrado!");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Parto.getCod_parto() != 0) {
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
                if (DataParto.getDate() == null) {
                    o++;
                }
                if (o == 0) {
                    Cadastrar(2);
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Animal não está Cadastrado!\nDeseja escolher um Animal?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    if (m.getSelecionaAnimalParida() == null) {
                        SelecionaAnimalParida animal_Parida = new SelecionaAnimalParida(this, m);
                        MenuPrincipal.jDesktopPane1.add(animal_Parida);
                        animal_Parida.setVisible(true);
                        animal_Parida.setPosicao();
                    } else {
                        m.abrirFrames("selecionaAnimalParida");
                    }
                }
            }
        }  // alterarCruzamento();
        // TODO add your handling code here:
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Parto.getCod_parto() != 0) {
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
                if (DataParto.getDate() == null) {
                    o++;
                }
                if (o == 0) {
                    int j = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse parto?\nEssa ação poderá apagar dados importantes no banco de dados de forma que não possam ser recuperados!", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                    if (j == 0) {
                        Excluir();
                    } else {
                    }
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Animal não está Cadastrado!\nDeseja escolher um Animal?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    if (m.getSelecionaAnimalParida() == null) {
                        SelecionaAnimalParida animal_Parida = new SelecionaAnimalParida(this, m);
                        MenuPrincipal.jDesktopPane1.add(animal_Parida);
                        animal_Parida.setVisible(true);
                        animal_Parida.setPosicao();
                    } else {
                        m.abrirFrames("selecionaAnimalParida");
                    }
                }
            }
        }          // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        m.fecharFrames(this);
        this.dispose();               // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JPanel BarraVerde1;
    private javax.swing.JPanel BarraVerde2;
    private javax.swing.JButton Cadastrar;
    private com.toedter.calendar.JDateChooser DataParto;
    private javax.swing.JButton Excluir;
    private javax.swing.ButtonGroup GrupoSituacao;
    private javax.swing.JTextArea Informacoes;
    private javax.swing.JLabel LbMatriz;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField NomeMae;
    private javax.swing.JTextField Qantidade;
    private javax.swing.JRadioButton RGestante;
    private javax.swing.JRadioButton RParida;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabelCrias;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelInformacao;
    private javax.swing.JLabel jLabelSituacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelCadastro;
    // End of variables declaration//GEN-END:variables
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    private void Excluir() {
        funcoes_Parto.excluirParto(ent_Parto);
        if (ent_Parto.getRetorno().equals("Deletado com Sucesso!")) {
            limparCampos();
            info_error.setText("Deletado com Sucesso!");
        } else {
            info_error.setText(ent_Parto.getRetorno());
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
