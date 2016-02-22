/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ClassificacaoAnimal;
import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.util.ListaMateriaPrima;
import br.com.ti4b.modelo.Alimento;
import br.com.ti4b.modelo.Consumo;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.pesquisas.SelecionaAlimentos;
import br.com.ti4b.visao.pesquisas.SelecionaConsumo;
import br.com.ti4b.dao.AlimentoDAO;
import br.com.ti4b.dao.CategoriaDAO;
import br.com.ti4b.dao.ConsumoDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GC
 */
public final class CadastroConsumo extends javax.swing.JInternalFrame {

    CategoriaDAO fc = new CategoriaDAO();
    ListaMateriaPrima listaMateriaPrima = new ListaMateriaPrima();
    ClassificacaoAnimal classificacao = new ClassificacaoAnimal();
    Consumo ent_consumo = new Consumo();
    ConsumoDAO f_cons = new ConsumoDAO();
    AlimentoDAO funcoes_Alimentos = new AlimentoDAO();
    MenuPrincipal m;

    private void cadastrar(int tipo) {
        ConverterDatas cd = new ConverterDatas();
        ent_consumo.setData_Consumo(cd.converter(DataConsumo));
        ent_consumo.setCod_Classificacao(fc.retornaCod_Clacificacao(String.valueOf(Classificcao.getSelectedItem())));
        if (RadioConcentrado.isSelected()) {
            //seta o codigo do fornecedor
            f_cons.Cadastrar(ent_consumo, tipo, 1);
            int quant = (ent_consumo.getQuantidade() - Integer.parseInt(QuantConce.getText()));
            ent_consumo.setQuantidade(quant);
            funcoes_Alimentos.updateQuantConcentrado(ent_consumo);

        }
        if (RadioVolumoso.isSelected()) {
            f_cons.Cadastrar(ent_consumo, tipo, 2);
            int quant = (ent_consumo.getQuantidade() - Integer.parseInt(QuantConce.getText()));
            ent_consumo.setQuantidade(quant);
            funcoes_Alimentos.updateQuantVolumoso(ent_consumo);
        }
        if (ent_consumo.getRetorno().equals("Cadastrado com sucesso!") || ent_consumo.getRetorno().equals("Alterado com sucesso!")) {
            String rs = ent_consumo.getRetorno();
            limpar_campos();
            info_error.setText(rs);
        } else {
            info_error.setText(ent_consumo.getRetorno());
        }
    }

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
        if (DataConsumo.getDate() == null) {
            o++;
        }
        if ((!RadioConcentrado.isSelected()) && (!RadioVolumoso.isSelected())) {
            o++;
        }

        if (!(ent_consumo.getQuantidade() >= Double.parseDouble(QuantConce.getText()))) {
            o++;
        }
        if (o == 0) {

            cadastrar(tipo);

        } else {
            info_error.setText("Preenxa todos os campos!");
            if (ent_consumo.getQuantidade() >= Double.parseDouble(QuantConce.getText())) {

            } else if (ent_consumo.getQuantidade() < Double.parseDouble(QuantConce.getText())) {
                info_error.setText("Quantidade Consumido inválido!");
            }
        }
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    public CadastroConsumo(MenuPrincipal m) {
        initComponents();
        this.m = m;
        classificacao.listarClacificacao(Classificcao);
        prive();

    }

    public void retornaInfo() {
        if (ent_consumo.getRetorno().equals("Cadastrado com sucesso!") || ent_consumo.getRetorno().equals("Alterado com sucesso!") || ent_consumo.getRetorno().equals("Deletado com sucesso!")) {
            if (ent_consumo.getRetorno().equals("Cadastrado com sucesso!")) {
                limpar_campos();
                info_error.setText("Cadastrado com sucesso!");
            } else if (ent_consumo.getRetorno().equals("Alterado com sucesso!")) {
                limpar_campos();
                info_error.setText("Alterado com sucesso!");
            } else if (ent_consumo.getRetorno().equals("Deletado com sucesso!")) {
                limpar_campos();
                info_error.setText("Deletado com sucesso!");
            } else {
                info_error.setText(ent_consumo.getRetorno());
            }
        }
    }

    private void limpar_campos() {
        Descricao.setText(null);
        Cadastrar.setEnabled(true);
        ent_consumo = new Consumo();
        RadioConcentrado.setSelected(true);
        RadioVolumoso.setSelected(true);
        Classificcao.setEnabled(true);
        info_error.setText(null);
        DataConsumo.setDate(null);
        QuantConce.setText(null);

    }

    br.com.ti4b.util.ClassificacaoAnimal classificacaoAnimal = new ClassificacaoAnimal();

    public CadastroConsumo() {
        initComponents();
        classificacaoAnimal.listarClacificacao(Classificcao);
        prive();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoAlimento = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        QuantConce = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataConsumo = new com.toedter.calendar.JDateChooser();
        info_error = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Classificcao = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Descricao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        RadioConcentrado = new javax.swing.JRadioButton();
        RadioVolumoso = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel4.setForeground(new java.awt.Color(0, 153, 0));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO CONSUMO ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(140, 140, 140))
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

        QuantConce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantConceKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Quant Consumida:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Data Consumo:");

        DataConsumo.setBackground(new java.awt.Color(255, 255, 255));
        DataConsumo.setToolTipText("Selecione a data de realização do leilão");
        DataConsumo.setDateFormatString("yyyy-MM-dd");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Classificação:");

        Classificcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificcaoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Descrição:");

        Descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DescricaoKeyReleased(evt);
            }
        });

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sair))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(27, 27, 27))
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(37, 37, 37)))
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(Classificcao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QuantConce, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(DataConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(info_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(2, 2, 2)
                                .addComponent(jButton4)))
                        .addGap(10, 10, 10))))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton4))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(Classificcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantConce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DataConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Sair))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RadioConcentrado.setBackground(new java.awt.Color(255, 255, 255));
        grupoAlimento.add(RadioConcentrado);
        RadioConcentrado.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        RadioConcentrado.setForeground(new java.awt.Color(0, 153, 0));
        RadioConcentrado.setText("CONCENTRADO");
        RadioConcentrado.setEnabled(false);
        RadioConcentrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioConcentradoActionPerformed(evt);
            }
        });

        RadioVolumoso.setBackground(new java.awt.Color(255, 255, 255));
        grupoAlimento.add(RadioVolumoso);
        RadioVolumoso.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        RadioVolumoso.setForeground(new java.awt.Color(0, 153, 0));
        RadioVolumoso.setText("VOLUMOSO");
        RadioVolumoso.setEnabled(false);
        RadioVolumoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioVolumosoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Tipo de Alimento:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(RadioConcentrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RadioVolumoso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioConcentrado)
                    .addComponent(RadioVolumoso)
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
                    .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioConcentradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioConcentradoActionPerformed

    }//GEN-LAST:event_RadioConcentradoActionPerformed

    private void RadioVolumosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioVolumosoActionPerformed

    }//GEN-LAST:event_RadioVolumosoActionPerformed

    private void ClassificcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificcaoActionPerformed
    }//GEN-LAST:event_ClassificcaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SelecionaAlimentos sa = new SelecionaAlimentos(this, m);
        MenuPrincipal.jDesktopPane1.add(sa);
        sa.setVisible(true);
        sa.setPosicao();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_consumo.getCod_Consumo() == 0) {
                comparaDados(1);
            } else {
                info_error.setText("Consumo já está cadastrada!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_consumo.getCod_Consumo() != 0) {
                comparaDados(2);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o Consumo não está Cadastrado!\nDeseja escolher um Consumo?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    limpar_campos();
                    SelecionaConsumo selecionaConsumo = new SelecionaConsumo(this, m);
                    MenuPrincipal.jDesktopPane1.add(selecionaConsumo);
                    selecionaConsumo.setVisible(true);
                    selecionaConsumo.setPosicao();
                }

            }
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_consumo.getCod_Consumo() != 0) {
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
                if (DataConsumo.getDate() == null) {
                    o++;
                }
                if (o == 0) {
                    excluir();
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o Consumo não está Cadastrado!\nDeseja escolher um Consumo?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    SelecionaConsumo selecionaConsumo = new SelecionaConsumo(this, m);
                    MenuPrincipal.jDesktopPane1.add(selecionaConsumo);
                    selecionaConsumo.setVisible(true);
                    selecionaConsumo.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        m.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void DescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescricaoKeyReleased
        upperCase(Descricao);
        // TODO add your handling code here:
    }//GEN-LAST:event_DescricaoKeyReleased

    private void QuantConceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantConceKeyReleased
  QuantConce.setText(QuantConce.getText().replaceAll("[^0-9 | ^/]", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantConceKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JComboBox Classificcao;
    private com.toedter.calendar.JDateChooser DataConsumo;
    private javax.swing.JTextField Descricao;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField QuantConce;
    private javax.swing.JRadioButton RadioConcentrado;
    private javax.swing.JRadioButton RadioVolumoso;
    private javax.swing.JButton Sair;
    private javax.swing.ButtonGroup grupoAlimento;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel painelCadastro;
    // End of variables declaration//GEN-END:variables

    public void setAlimento(Alimento eal, int tipo) {
        //  List<Ent_Consumo> listConsumo = f_cons.pesquisa_consumo(eal.getCod_alimento());
        if (tipo == 1) {
            RadioConcentrado.setSelected(true);
            ent_consumo.setCod_Concentrado(eal.getIdAlimento());
            ent_consumo.setQuantidade(eal.getQuantidade());
        }
        if (tipo == 2) {
            RadioVolumoso.setSelected(true);
            ent_consumo.setCod_Volumoso(eal.getIdAlimento());
            ent_consumo.setQuantidade(eal.getQuantidade());
        }
        Descricao.setText(eal.getDescricao());
    }

    public void setConsumo(Consumo ent_Consumo, int tipo) {
        this.ent_consumo = ent_Consumo;
        if (tipo == 1) {
            RadioConcentrado.setSelected(true);
            //ent_consumo.setCod_Concentrado(ent_Consumo.getCod_Concentrado());

        }
        if (tipo == 2) {
            RadioVolumoso.setSelected(true);
            ent_consumo.setCod_Volumoso(ent_Consumo.getCod_Volumoso());
        }
        Descricao.setText(ent_Consumo.getDescricao());
        Classificcao.setSelectedItem(ent_Consumo.getCategoria());
        QuantConce.setText(String.valueOf(ent_Consumo.getQuantidade()));
        DataConsumo.setDate(ent_Consumo.getData_Consumo());
    }

    private void excluir() {
        f_cons.excluirConsumo(ent_consumo);
        retornaInfo();

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
