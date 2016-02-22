/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.modelo.Alimento;
import br.com.ti4b.modelo.FornecedorAlimento;
import br.com.ti4b.visao.pesquisas.SelecionaAlimentos;
import br.com.ti4b.visao.pesquisas.SelecionaFornecedorAlimentos;
import br.com.ti4b.dao.AlimentoDAO;
import br.com.ti4b.dao.FornecedorAlimentosDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hyllorran
 */
public final class CadastroAlimentos extends javax.swing.JInternalFrame {

    int codForAlimento;
    Alimento ent_Alimentos = new Alimento();
    AlimentoDAO lvd = new AlimentoDAO();
    private static final CadastroAlimentos CADASTRO_ALIMENTOS = new CadastroAlimentos();

    public static synchronized CadastroAlimentos getInstancia() {
        return CADASTRO_ALIMENTOS;
    }

    private CadastroAlimentos() {
        initComponents();
        radioConcentrado.setSelected(true);
        prive();
    }

    public void getInfo() {
        if (ent_Alimentos.getRetorno().equals("Cadastrado com Sucesso!") || ent_Alimentos.getRetorno().equals("Alterado com Sucesso!")
                || ent_Alimentos.getRetorno().equals("Deletado com sucesso!")) {
            switch (ent_Alimentos.getRetorno()) {
                case "Alterado com Sucesso!":
                    limpar_campos();
                    info_error.setText("Alterado com Sucesso!");
                    break;
                case "Cadastrado com Sucesso!":
                    limpar_campos();
                    info_error.setText("Cadastrado com Sucesso!");
                    break;
                case "Deletado com Sucesso!":
                    limpar_campos();
                    info_error.setText("Deletado com Sucesso!");
                    break;
                default:
                    info_error.setText(ent_Alimentos.getRetorno());
                    break;
            }

        }
    }

    public void comparaDados(int tipo) {
        Component components[] = painelCadastro.getComponents();
        int o = 0;
        for (int i = 0; i < components.length; i++) {
            //Comparação com campoDeTexto
            if (components[i] instanceof JTextField) {
                if (radioVolumoso.isSelected()) {
                    if (components[i] != nomeFornecedor) {
                        if (((JTextField) components[i]).getText().isEmpty()) {
                            o++;
                        }
                    }
                } else if (radioConcentrado.isSelected()) {
                    if (((JTextField) components[i]).getText().isEmpty()) {
                        o++;
                    }
                }
            }
        }
        if (jDate_entrada.getDate() == null) {
            o++;
        }
        if ((!radioConcentrado.isSelected()) && (!radioVolumoso.isSelected())) {
            o++;
        }
        if (o == 0) {

            cadastrar(tipo);

        } else {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    public void setAlimento(FornecedorAlimento fornecedor_Alimento) {
        codForAlimento = fornecedor_Alimento.getCod_for_alimento();
        nomeFornecedor.setText(fornecedor_Alimento.getNome());
    }

    private void cadastrar(int tipo) {
        ConverterDatas cd = new ConverterDatas();
        ent_Alimentos.setDataEntrada(cd.converter(jDate_entrada));
        ent_Alimentos.setDescricao(nomeAlimento.getText());
        ent_Alimentos.setPrecoUnitario(Float.parseFloat(jt_preco_unit.getText().replaceAll("\\,", ".")));
        ent_Alimentos.setQuantidade(Integer.parseInt(jT_quant.getText()));
        if (radioConcentrado.isSelected()) {
            //seta o codigo do fornecedor
            ent_Alimentos.setIdFornecedorAlimento(codForAlimento);
            lvd.Cadastrar_C(ent_Alimentos, tipo);
        } else if (radioVolumoso.isSelected()) {
            lvd.Cadastrar_V(ent_Alimentos, tipo);
        }
        getInfo();
    }

    private void excluir() {
        AlimentoDAO fa = new AlimentoDAO();
        Alimento ea = new Alimento();
        ea.setIdAlimento(ent_Alimentos.getIdAlimento());
        if (radioVolumoso.isSelected()) {
            fa.excluir(ea, 1);
        }
        if (radioConcentrado.isSelected()) {
            fa.excluir(ea, 2);
        }
        if (ea.getRetorno().equals("Deletado com sucesso!")) {
            limpar_campos();
            info_error.setText(ea.getRetorno());
        } else {
            info_error.setText(ea.getRetorno());
        }
    }

    private void limpar_campos() {
        radioConcentrado.setSelected(true);
        botaoFornecedor.setEnabled(true);
        info_error.setText(null);
        jDate_entrada.setDate(null);
        nomeFornecedor.setText(null);
        nomeAlimento.setText(null);
        jT_quant.setText(null);
        jt_preco_unit.setText(null);
        ent_Alimentos = new Alimento();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        nomeAlimento = new javax.swing.JTextField();
        jT_quant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDate_entrada = new com.toedter.calendar.JDateChooser();
        jt_preco_unit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeFornecedor = new javax.swing.JTextField();
        info_error = new javax.swing.JLabel();
        botaoFornecedor = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        radioConcentrado = new javax.swing.JRadioButton();
        radioVolumoso = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setBackground(new java.awt.Color(0, 153, 0));
        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE ALIMENTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(5, 420));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Nome:");

        nomeAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlimentoActionPerformed(evt);
            }
        });
        nomeAlimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeAlimentoKeyReleased(evt);
            }
        });

        jT_quant.setToolTipText("Quantidade Volumoso dado em Kg");
        jT_quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_quantActionPerformed(evt);
            }
        });
        jT_quant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_quantKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Validade:");

        jDate_entrada.setBackground(new java.awt.Color(255, 255, 255));
        jDate_entrada.setDateFormatString("yyyy-MM-dd");

        jt_preco_unit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_preco_unitKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Preço unitario:");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Fornecedor:");

        nomeFornecedor.setEditable(false);
        nomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFornecedorActionPerformed(evt);
            }
        });

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        botaoFornecedor.setText("...");
        botaoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFornecedorActionPerformed(evt);
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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        cadastrar.setText("CADASTRAR");
        cadastrar.setToolTipText("");
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Cadastrar Grande.png"))); // NOI18N
        cadastrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Pequeno.png"))); // NOI18N
        alterar.setBorder(null);
        alterar.setBorderPainted(false);
        alterar.setContentAreaFilled(false);
        alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alterar.setFocusable(false);
        alterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Grande.png"))); // NOI18N
        alterar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Pequeno.png"))); // NOI18N
        excluir.setBorder(null);
        excluir.setBorderPainted(false);
        excluir.setContentAreaFilled(false);
        excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excluir.setFocusable(false);
        excluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Grande.png"))); // NOI18N
        excluir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Pequeno.png"))); // NOI18N
        sair.setBorder(null);
        sair.setBorderPainted(false);
        sair.setContentAreaFilled(false);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sair.setFocusable(false);
        sair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        sair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(3, 3, 3)
                                .addComponent(jDate_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(info_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(painelCadastroLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(botaoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painelCadastroLayout.createSequentialGroup()
                                            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painelCadastroLayout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jT_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                                    .addComponent(alterar)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painelCadastroLayout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jt_preco_unit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(excluir)))))
                                .addGap(0, 70, Short.MAX_VALUE))))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sair)))
                .addContainerGap())
        );

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel3, jLabel4, jLabel8, jLabel9});

        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jDate_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFornecedor))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nomeAlimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jT_quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jt_preco_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(alterar)
                    .addComponent(excluir)
                    .addComponent(sair)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {info_error, jDate_entrada, jLabel11, jLabel3, jLabel4, jLabel8, jLabel9, jT_quant, jt_preco_unit, nomeAlimento, nomeFornecedor});

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        radioConcentrado.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioConcentrado);
        radioConcentrado.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        radioConcentrado.setForeground(new java.awt.Color(0, 153, 0));
        radioConcentrado.setText("CONCENTRADO");
        radioConcentrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioConcentradoActionPerformed(evt);
            }
        });

        radioVolumoso.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioVolumoso);
        radioVolumoso.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        radioVolumoso.setForeground(new java.awt.Color(0, 153, 0));
        radioVolumoso.setText("VOLUMOSO");
        radioVolumoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioVolumosoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Tipo de Alimento:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(radioConcentrado)
                .addGap(27, 27, 27)
                .addComponent(radioVolumoso)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioConcentrado)
                    .addComponent(radioVolumoso)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlimentoActionPerformed

    }//GEN-LAST:event_nomeAlimentoActionPerformed

    private void radioConcentradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConcentradoActionPerformed
        botaoFornecedor.setEnabled(true);
    }//GEN-LAST:event_radioConcentradoActionPerformed

    private void radioVolumosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioVolumosoActionPerformed
        codForAlimento = WIDTH;
        botaoFornecedor.setEnabled(false);
        jt_preco_unit.setText("0");         // TODO add your handling code here:
    }//GEN-LAST:event_radioVolumosoActionPerformed

    private void nomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFornecedorActionPerformed

    private void jT_quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_quantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_quantActionPerformed

    private void jT_quantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_quantKeyReleased
        jT_quant.setText(jT_quant.getText().replaceAll("[^0-9]", ""));      // TODO add your handling code here:
    }//GEN-LAST:event_jT_quantKeyReleased

    private void jt_preco_unitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_preco_unitKeyReleased
        jt_preco_unit.setText(jt_preco_unit.getText().replaceAll("[^0-9 | ^.]", ""));        // TODO add your handling code here:
    }//GEN-LAST:event_jt_preco_unitKeyReleased

    private void botaoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFornecedorActionPerformed
        SelecionaFornecedorAlimentos fa = new SelecionaFornecedorAlimentos(this, MenuPrincipal.p);
        MenuPrincipal.jDesktopPane1.add(fa);
        fa.setVisible(true);
        fa.setPosicao();        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFornecedorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        if (MenuPrincipal.p.usuarioLogado.isADM()) {
            if (ent_Alimentos.getIdAlimento() == 0) {
                comparaDados(1);
            } else {
                info_error.setText("Alimento já está cadastrado!");
            }
        } else {
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    public void verificaCampos(int tipo) {
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
        if (jDate_entrada.getDate() == null) {
            o++;
        }
        if (o == 0) {
            cadastrar(tipo);
        } else {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        if (MenuPrincipal.p.usuarioLogado.isADM()) {

            if (ent_Alimentos.getIdAlimento() != 0) {
                comparaDados(2);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou o Alimento não está Cadastrado!\nDeseja escolher um Alimento?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    limpar_campos();
                    SelecionaAlimentos pesquisar_For_Ali = new SelecionaAlimentos(this, MenuPrincipal.p);
                    MenuPrincipal.jDesktopPane1.add(pesquisar_For_Ali);
                    pesquisar_For_Ali.setVisible(true);
                    pesquisar_For_Ali.setPosicao();
                }

            }
        } else {
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        if (MenuPrincipal.p.usuarioLogado.isADM()) {
            if (ent_Alimentos.getIdAlimento() != 0) {
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
                if (jDate_entrada.getDate() == null) {
                    o++;
                }
                if (o == 0) {
                    excluir();
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Alimento não está Cadastrado!\nDeseja escolher um Alimento?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    SelecionaAlimentos pesquisar_For_Ali = new SelecionaAlimentos(this, MenuPrincipal.p);
                    MenuPrincipal.jDesktopPane1.add(pesquisar_For_Ali);
                    pesquisar_For_Ali.setVisible(true);
                    pesquisar_For_Ali.setPosicao();
                }
            }
        }    // TODO add your handling code here:
    }//GEN-LAST:event_excluirActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        MenuPrincipal.p.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed

    private void nomeAlimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeAlimentoKeyReleased
        upperCase(nomeAlimento);
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlimentoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton botaoFornecedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDate_entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jT_quant;
    private javax.swing.JTextField jt_preco_unit;
    private javax.swing.JTextField nomeAlimento;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JRadioButton radioConcentrado;
    private javax.swing.JRadioButton radioVolumoso;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

    public void setvaloresLeilao(Alimento ent_Alimentos, int tipo) {
        this.ent_Alimentos = ent_Alimentos;
        FornecedorAlimentosDAO fa = new FornecedorAlimentosDAO();

        if (tipo == 1) {
            codForAlimento = ent_Alimentos.getIdFornecedorAlimento();
            nomeFornecedor.setText(fa.selecionaPorCodigo(codForAlimento));
            radioConcentrado.setSelected(true);
        }
        if (tipo == 2) {
            radioVolumoso.setSelected(true);
            botaoFornecedor.setEnabled(false);
        }
        jDate_entrada.setDate(ent_Alimentos.getDataEntrada());
        nomeAlimento.setText(ent_Alimentos.getDescricao());
        jT_quant.setText(String.valueOf(ent_Alimentos.getQuantidade()));
        jt_preco_unit.setText(String.valueOf(ent_Alimentos.getPrecoUnitario()));
    }

    public void prive() {

        if (MenuPrincipal.p.usuarioLogado.isADM()) {
        } else {
            cadastrar.setRolloverEnabled(false);
            alterar.setRolloverEnabled(false);
            excluir.setRolloverEnabled(false);
            cadastrar.setToolTipText("Você não tem privilégios para executar essa ação!");
            alterar.setToolTipText("Você não tem privilégios para executar essa ação!");
            excluir.setToolTipText("Você não tem privilégios para executar essa ação!");

        }
    }

}
