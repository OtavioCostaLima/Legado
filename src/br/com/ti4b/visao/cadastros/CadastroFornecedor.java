package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ValidaCNPJ;
import br.com.ti4b.modelo.Fornecedor;
import br.com.ti4b.modelo.negocio.FornecedorRN;
import br.com.ti4b.visao.pesquisas.SelecionaFornecedor;
import br.com.ti4b.visao.pesquisas.SelecionaFornecedor;
import br.com.ti4b.visao.telas.GerenciadorDeJanelas;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroFornecedor extends javax.swing.JInternalFrame {

    private static CadastroFornecedor cadastroFornecedorAnimais;

    public static CadastroFornecedor getInstancia() {
        if (cadastroFornecedorAnimais == null) {
            cadastroFornecedorAnimais = new CadastroFornecedor();
        }
        return cadastroFornecedorAnimais;
    }

    public CadastroFornecedor() {
        initComponents();
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    private void limpar_campos() {
        info_error.setText("");
        nomeProprietario.setText("");
        Bairro.setText("");
        Cidade.setText("");
        CNPJ.setText("");
        email.setText("");
        Endereco.setText("");
        Celular.setText("");
        Telefone.setText("");
        nomeFornecedor.setText("");
        Numero.setText("");
        campoId.setText("");
    }

    private Fornecedor encapsular() throws NumberFormatException {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNumero(Integer.parseInt(Numero.getText()));
        fornecedor.setBairro(Bairro.getText());
        fornecedor.setCidade(Cidade.getText());
        fornecedor.setCnpj(CNPJ.getText());
        fornecedor.setEmail(email.getText());
        fornecedor.setEndereco(Endereco.getText());
        fornecedor.setFone1(Celular.getText());
        fornecedor.setFone2(Telefone.getText());
        fornecedor.setNome(nomeFornecedor.getText());
        fornecedor.setNomeProprietario(nomeProprietario.getText());
        fornecedor.setUf(UF.getSelectedItem().toString());
        return fornecedor;
    }

    //Todos os componentes do Painel do Frame  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cadastro = new javax.swing.ButtonGroup();
        painelMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        nomeProprietario = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Endereco = new javax.swing.JTextField();
        nomeFornecedor = new javax.swing.JTextField();
        Bairro = new javax.swing.JTextField();
        Cidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Celular = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JFormattedTextField();
        UF = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CNPJ = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        campoId = new javax.swing.JLabel();

        setTitle("Fornecedor de Animais");

        painelMain.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE FORNECEDORES");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
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
            .addGap(0, 340, Short.MAX_VALUE)
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
        painelCadastro.setForeground(new java.awt.Color(255, 255, 255));

        nomeProprietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeProprietarioKeyReleased(evt);
            }
        });

        Numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NumeroKeyReleased(evt);
            }
        });

        Endereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnderecoKeyReleased(evt);
            }
        });

        nomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeFornecedorKeyReleased(evt);
            }
        });

        Bairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BairroKeyReleased(evt);
            }
        });

        Cidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CidadeKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Cidade:");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("UF:");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("E-mail:");

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Telefone:");

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Celular:");

        try {
            Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneActionPerformed(evt);
            }
        });

        UF.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        UF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("Nº. Res.:");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Bairro:");

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Proprietario:");

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("CNPJ:");

        try {
            CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CNPJKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Endereço:");

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
                        .addComponent(Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Bairro)
                            .addComponent(Endereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeProprietario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CNPJ)
                                    .addGroup(painelCadastroLayout.createSequentialGroup()
                                        .addComponent(Numero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(Telefone)))))
                .addContainerGap())
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(nomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Sair))
                .addGap(18, 18, 18))
        );

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

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Id:");

        campoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout painelMainLayout = new javax.swing.GroupLayout(painelMain);
        painelMain.setLayout(painelMainLayout);
        painelMainLayout.setHorizontalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelMainLayout.createSequentialGroup()
                        .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(painelMainLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        painelMainLayout.setVerticalGroup(
            painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMainLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4)
                                .addComponent(jLabel13))
                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (campoId.getText().trim().isEmpty()) {
            // if (trataCampos()) {
            FornecedorRN fornecedorRN = new FornecedorRN();
            fornecedorRN.cadastrar(encapsular());
            //  }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    public boolean trataCampos() {
        Component components[] = painelCadastro.getComponents();
        int cont = 0;
        for (Component component : components) {
            if (component instanceof JTextField) {
                if (((JTextField) component).getText().isEmpty()) {
                    cont++;
                }
            }
        }
        if (!validaCNPJ()) {
            cont++;
        }
        if (cont == 0) {
            return true;
        } else {
            info_error.setText("Verifique todos os campos!");
            return false;
        }
    }

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (campoId.getText().trim().isEmpty()) {
            SelecionaFornecedor fornecedorAnimais = new SelecionaFornecedor(null, true);
            fornecedorAnimais.setVisible(true);
            setFornecedor(fornecedorAnimais.getFornecedor());
        } else {
            if (trataCampos()) {
                FornecedorRN fornecedorRN = new FornecedorRN();
                if (fornecedorRN.atualizar(encapsular())) {
                }
            }
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (campoId.getText().trim().isEmpty()) {
            SelecionaFornecedor fornecedorAnimais = new SelecionaFornecedor(null, true);
            fornecedorAnimais.setVisible(true);
            setFornecedor(fornecedorAnimais.getFornecedor());
        } else {
            if (trataCampos()) {
                FornecedorRN fornecedorRN = new FornecedorRN();
                fornecedorRN.deletar(encapsular().getId());
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        cloes();
    }//GEN-LAST:event_SairActionPerformed

    public void cloes() {
        cadastroFornecedorAnimais = null;
        this.dispose();
        // TODO add your handling code here:
    }

    private void nomeProprietarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeProprietarioKeyReleased
        upperCase(nomeProprietario);
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProprietarioKeyReleased

    private void nomeFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeFornecedorKeyReleased
        upperCase(nomeFornecedor);

        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFornecedorKeyReleased

    private void EnderecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnderecoKeyReleased
        upperCase(Endereco);
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecoKeyReleased

    private void BairroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BairroKeyReleased
        upperCase(Bairro);
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroKeyReleased

    private void CidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CidadeKeyReleased
        upperCase(Cidade);
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeKeyReleased

    private void NumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroKeyReleased
        Numero.setText(Numero.getText().replaceAll("[^0-9]", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroKeyReleased

    private void CNPJKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CNPJKeyReleased
        validaCNPJ(); // TODO add your handling code here:
    }//GEN-LAST:event_CNPJKeyReleased

    private void TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneActionPerformed

    public boolean validaCNPJ() {
        boolean ret;
        ValidaCNPJ validaCNPJ = new ValidaCNPJ();
        if (validaCNPJ.isCnpjValido(CNPJ.getText())) {
            ret = true;
            CNPJ.setForeground(Color.GREEN);
        } else {

            if (CNPJ.getText().equals("  .   .   /    -  ")) {
                ret = false;
                CNPJ.setForeground(Color.BLACK);
            } else {
                ret = false;
                CNPJ.setForeground(Color.red);
            }
        } // TODO add your handling code here:
        return ret; // TODO add your handling code here:
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JTextField Bairro;
    private javax.swing.JFormattedTextField CNPJ;
    private javax.swing.JButton Cadastrar;
    private javax.swing.ButtonGroup Cadastro;
    private javax.swing.JFormattedTextField Celular;
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Endereco;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField Numero;
    private javax.swing.JButton Sair;
    private javax.swing.JFormattedTextField Telefone;
    private javax.swing.JComboBox UF;
    private javax.swing.JLabel campoId;
    private javax.swing.JTextField email;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JTextField nomeProprietario;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelMain;
    // End of variables declaration//GEN-END:variables

    public void setFornecedor(Fornecedor fornecedor) {
        if (fornecedor != null) {
            nomeProprietario.setText(fornecedor.getNomeProprietario());
            Bairro.setText(fornecedor.getBairro());
            Cidade.setText(fornecedor.getCidade());
            CNPJ.setText(fornecedor.getCnpj());
            email.setText(fornecedor.getEmail());
            Endereco.setText(fornecedor.getEndereco());
            Celular.setText(fornecedor.getFone1());
            Telefone.setText(fornecedor.getFone2());
            nomeFornecedor.setText(fornecedor.getNome());
            Numero.setText(String.valueOf(fornecedor.getNumero()));
            UF.setSelectedItem(fornecedor.getUf());
            campoId.setText(String.valueOf(fornecedor.getId()));
        }
    }

}
