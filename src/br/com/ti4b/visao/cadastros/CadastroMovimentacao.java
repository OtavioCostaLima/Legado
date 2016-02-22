package br.com.ti4b.visao.cadastros;

import br.com.ti4b.modelo.Movimentacao;
import br.com.ti4b.modelo.negocio.MovimentacaoRN;
import br.com.ti4b.util.ConverterDatas;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public final class CadastroMovimentacao extends javax.swing.JInternalFrame {

    ConverterDatas cd = new ConverterDatas();
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(new String[]{"LEILÃO", "DOAÇÃO"});
    private static CadastroMovimentacao cadastroLeilao;

    public static CadastroMovimentacao getInstancia() {
        if (cadastroLeilao == null) {
            cadastroLeilao = new CadastroMovimentacao();
        }
        return cadastroLeilao;
    }

    private CadastroMovimentacao() {
        initComponents();
        comboTipo.setModel(comboBoxModel);
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    public void limparcampos() {
        info_error.setText(null);
        informacao.setText(null);
        DataLeilao.setDate(null);
        Local.setText(null);
        Valor.setText(null);
        GrupoLeilao.clearSelection();

    }

    public Movimentacao encapsular() {
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setAnimal(null);
        movimentacao.setDataMovimentacao(DataLeilao.getDate());
        movimentacao.setDestino(jT_destino.getText());
        movimentacao.setTipoLD(comboTipo.getSelectedItem().toString());
        if (REntrada.isSelected()) {
            movimentacao.setTipoES("ENTRADA");
        } else if (RSaida.isSelected()) {
            movimentacao.setTipoES("SAIDA");
        }
        if (!Valor.getText().trim().isEmpty()) {
            movimentacao.setValorArrebatado(Double.valueOf(Valor.getText()));
        }
        return movimentacao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoLeilao = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        Valor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataLeilao = new com.toedter.calendar.JDateChooser();
        informacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Local = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RSaida = new javax.swing.JRadioButton();
        REntrada = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jT_destino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel3.setForeground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE MOVIMENTAÇÃO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(11, 11, 11))
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ValorKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Valor Arrebatado:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Data Realização:");

        DataLeilao.setBackground(new java.awt.Color(255, 255, 255));
        DataLeilao.setToolTipText("Selecione a data de realização do leilão");
        DataLeilao.setDateFormatString("dd-MM-yyyy");

        informacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                informacaoKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Informações:");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Local:");

        Local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalActionPerformed(evt);
            }
        });
        Local.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LocalKeyReleased(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LEILÃO", "DOAÇÃO" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tipo:");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RSaida.setBackground(new java.awt.Color(255, 255, 255));
        GrupoLeilao.add(RSaida);
        RSaida.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        RSaida.setForeground(new java.awt.Color(0, 153, 0));
        RSaida.setText("Saida");
        RSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSaidaActionPerformed(evt);
            }
        });

        REntrada.setBackground(new java.awt.Color(255, 255, 255));
        GrupoLeilao.add(REntrada);
        REntrada.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        REntrada.setForeground(new java.awt.Color(0, 153, 0));
        REntrada.setText("Entrada");
        REntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REntradaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Modo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(REntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RSaida)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(REntrada, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(RSaida, javax.swing.GroupLayout.Alignment.CENTER)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {REntrada, RSaida, jLabel3});

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

        Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cadastrar.setForeground(new java.awt.Color(0, 153, 0));
        Cadastrar.setText("CADASTRAR");
        Cadastrar.setContentAreaFilled(false);
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cadastrar.setFocusable(false);
        Cadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Cadastrar Grande.png"))); // NOI18N
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Alterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Alterar.setForeground(new java.awt.Color(0, 153, 0));
        Alterar.setText("ALTERAR");
        Alterar.setToolTipText("");
        Alterar.setContentAreaFilled(false);
        Alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Alterar.setFocusable(false);
        Alterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Grande.png"))); // NOI18N
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Excluir.setForeground(new java.awt.Color(0, 153, 0));
        Excluir.setText("EXCLUIR");
        Excluir.setContentAreaFilled(false);
        Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Excluir.setFocusable(false);
        Excluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Grande.png"))); // NOI18N
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sair.setForeground(new java.awt.Color(0, 153, 0));
        Sair.setText("SAIR");
        Sair.setContentAreaFilled(false);
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sair.setFocusable(false);
        Sair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Destino:");

        jT_destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_destinoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_destinoKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Animal:");

        jButton1.setText("...");

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(454, 454, 454))
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DataLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(30, 30, 30)
                                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Local)
                                    .addComponent(jT_destino)
                                    .addComponent(informacao)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 2, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                        .addComponent(Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair)))
                .addContainerGap())
        );

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Alterar, Cadastrar, Excluir, Sair});

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel2, jLabel5, jLabel6, jLabel9});

        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_error, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2))
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DataLeilao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jT_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(informacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Sair)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DataLeilao, Local, Valor, informacao, jLabel11, jLabel4, jLabel8, jLabel9});

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {info_error, jPanel1});

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Alterar, Cadastrar, Excluir, Sair});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalActionPerformed


    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        if (comboTipo.getSelectedIndex() == 0) {
            Valor.setEnabled(true);
            Valor.setText(null);
        }
        if (comboTipo.getSelectedIndex() == 1) {
            Valor.setEnabled(false);
            Valor.setText("0");
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void RSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSaidaActionPerformed
        comboBoxModel.addElement("MORTE");

    }//GEN-LAST:event_RSaidaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limparcampos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        MovimentacaoRN movimentacaoRN = new MovimentacaoRN();
        if (movimentacaoRN.cadastrar(encapsular())) {
        }

    }//GEN-LAST:event_CadastrarActionPerformed

    private void trataCampos(int tipo) {
        Component components[] = painelCadastro.getComponents();
        int cont = 0;
        for (Component component : components) {
            if (component instanceof JTextField) {
                if (((JTextField) component).getText().isEmpty()) {
                    cont++;
                }
            }
        }
        if (DataLeilao.getDate() == null) {
            cont++;
        }
        if (!RSaida.isSelected() && !REntrada.isSelected()) {
            cont++;
        }
        if (cont != 0) {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed

        /*if (ent_Leilao.getCod_leilao() != 0) {
         trataCampos(2);
         } else {
         int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Leilão não está Cadastrado! ", "Alerta", JOptionPane.YES_NO_OPTION);
         if (i == 0) {
         SelecionaMovimentacao selecionaLeilao = new SelecionaMovimentacao(this, m);
         MenuPrincipal.jDesktopPane1.add(selecionaLeilao);
         selecionaLeilao.setVisible(true);
         selecionaLeilao.setPosicao();
         }
         }*/

    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        /*  if (m.usuarioLogado.isADM()) {
         if (ent_Leilao.getCod_leilao() != 0) {
         LeilaoDAO fl = new LeilaoDAO();
         fl.excluirLeilao(ent_Leilao);
         if (ent_Leilao.getRetormo().equals("Deletado com sucesso!")) {
         limparcampos();
         ent_Leilao.setRetormo("Deletado com sucesso!");
         }
        
         } else {
         int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou Leilão não está Cadastrado! ", "Alerta", JOptionPane.YES_NO_OPTION);
         if (i == 0) {
         SelecionaMovimentacao selecionaLeilao = new SelecionaMovimentacao(this, m);
         MenuPrincipal.jDesktopPane1.add(selecionaLeilao);
         selecionaLeilao.setVisible(true);
         selecionaLeilao.setPosicao();
         }
         }
         }*/
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        cadastroLeilao = null;
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void LocalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LocalKeyReleased
        upperCase(Local);
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalKeyReleased

    private void ValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ValorKeyReleased
        Valor.setText(Valor.getText().replaceAll("[^0-9]", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorKeyReleased

    private void informacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_informacaoKeyReleased
        upperCase(informacao);

// TODO add your handling code here:
    }//GEN-LAST:event_informacaoKeyReleased

    private void jT_destinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_destinoKeyPressed
        upperCase(jT_destino);        // TODO add your handling code here:
    }//GEN-LAST:event_jT_destinoKeyPressed

    private void jT_destinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_destinoKeyReleased
        upperCase(jT_destino);
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_destinoKeyReleased

    private void REntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REntradaActionPerformed
        comboBoxModel.removeElement("MORTE");
        // TODO add your handling code here:
    }//GEN-LAST:event_REntradaActionPerformed
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private com.toedter.calendar.JDateChooser DataLeilao;
    private javax.swing.JButton Excluir;
    private javax.swing.ButtonGroup GrupoLeilao;
    private javax.swing.JTextField Local;
    private javax.swing.JRadioButton REntrada;
    private javax.swing.JRadioButton RSaida;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField Valor;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel info_error;
    private javax.swing.JTextField informacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jT_destino;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel painelCadastro;
    // End of variables declaration//GEN-END:variables

}
