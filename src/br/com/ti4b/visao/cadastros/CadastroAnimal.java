package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverteIdade;
import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.util.SubCategoriaUtil;
import br.com.ti4b.modelo.Animal;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.pesquisas.SelecionaAnimalParida;
import br.com.ti4b.visao.pesquisas.SelecionaFornecedor;
import br.com.ti4b.visao.pesquisas.SelecionaMovimentacao;
import br.com.ti4b.modelo.Matriz;
import br.com.ti4b.modelo.Reprodutor;
import br.com.ti4b.modelo.negocio.AnimalRN;
import br.com.ti4b.visao.telas.GerenciadorDeJanelas;
import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Otavio Costa
 */
public final class CadastroAnimal extends javax.swing.JInternalFrame {

    ConverterDatas cd = new ConverterDatas();

    private static CadastroAnimal CADASTRO_ANIMAL = new CadastroAnimal();

    private CadastroAnimal() {
        initComponents();
    }

    public static CadastroAnimal getInstancia() {
        return CADASTRO_ANIMAL;
    }

    public void encapsularAnimal() throws NumberFormatException {
        Animal animal = null;
        if (Masculino.isSelected()) {
            animal = new Reprodutor();
            animal.setSexo("M");
        }
        if (Feminino.isSelected()) {
            animal = new Matriz();
            animal.setSexo("F");

        }
        ConverteIdade converteIdade = new ConverteIdade();
        SubCategoriaUtil subCategoria = new SubCategoriaUtil();
        String classificacao = String.valueOf(Classificacao.getSelectedItem());
        int idade = Integer.parseInt(converteIdade.retornaNumeroIdade(converteIdade.retornaIdadeAnimal(DataNascimento)));
        String DAM = converteIdade.retornaDMA((converteIdade.retornaIdadeAnimal(DataNascimento)));
        animal.setIdInstituicao(Registro.getText());
        animal.setDataNascimento(DataNascimento.getDate());

        String fase = subCategoria.setarSubCategoria(classificacao, idade, DAM, animal.getSexo(), 0);
        animal.setNome(NomeAnimal.getText());
        animal.setPelagem(Pelagem.getText());
        animal.setRaca(Raca.getText());

        animal.setIdade(converteIdade.retornaIdadeAnimal(DataNascimento));
        animal.setInformacao(Informacoes.getText());
        animal.setGrauSanguineo(jt_grau_sangue.getText());
        animal.setPeso(Float.parseFloat((Peso.getText().replaceAll("\\,", "."))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NomeAnimal = new javax.swing.JTextField();
        Raca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        NomeFornecedor = new javax.swing.JTextField();
        Pelagem = new javax.swing.JTextField();
        NomeMae = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Registro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NomePai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Circunferencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        selecionaFornecedor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Masculino = new javax.swing.JRadioButton();
        Feminino = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jt_grau_sangue = new javax.swing.JTextField();
        Classificacao = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DataNascimento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        DataEntrada = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Informacoes = new javax.swing.JTextArea();
        info_error = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        RadioDoacao = new javax.swing.JRadioButton();
        RadioFazenda = new javax.swing.JRadioButton();
        RadioLeilao = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoLeilao = new javax.swing.JLabel();

        setTitle("CADASTRO DE ANIMAIS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/icone_legado.png"))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(0, 153, 0));
        jPanel8.setForeground(new java.awt.Color(0, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Raça:");

        NomeAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeAnimalKeyReleased(evt);
            }
        });

        Raca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RacaKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("Pelagem:");

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("PESO:");

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Fornecedor:");

        Peso.setToolTipText("Peso em Kg");
        Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesoKeyReleased(evt);
            }
        });

        NomeFornecedor.setEditable(false);
        NomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeFornecedorActionPerformed(evt);
            }
        });
        NomeFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeFornecedorKeyReleased(evt);
            }
        });

        Pelagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PelagemKeyReleased(evt);
            }
        });

        NomeMae.setEnabled(false);
        NomeMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeMaeActionPerformed(evt);
            }
        });
        NomeMae.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeMaeKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setText("Registro:");

        Registro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RegistroKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Mãe:");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Pai:");

        NomePai.setEnabled(false);
        NomePai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomePaiActionPerformed(evt);
            }
        });
        NomePai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomePaiKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Circunferencia:");

        jLabel19.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 0));
        jLabel19.setText("Kg");

        Circunferencia.setToolTipText("Circunferência Testicular!");
        Circunferencia.setEnabled(false);
        Circunferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CircunferenciaKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Nome:");

        selecionaFornecedor.setText("...");
        selecionaFornecedor.setEnabled(false);
        selecionaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaFornecedorActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Masculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Masculino);
        Masculino.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        Masculino.setForeground(new java.awt.Color(0, 153, 0));
        Masculino.setText("Macho");
        Masculino.setFocusable(false);
        Masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoActionPerformed(evt);
            }
        });

        Feminino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(Feminino);
        Feminino.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        Feminino.setForeground(new java.awt.Color(0, 153, 0));
        Feminino.setText("Femêa");
        Feminino.setFocusable(false);
        Feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemininoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Masculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Feminino)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Masculino)
                    .addComponent(Feminino))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Feminino, Masculino});

        jLabel17.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 0));
        jLabel17.setText("Sexo:");

        jLabel21.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 0));
        jLabel21.setText("Grau:");
        jLabel21.setToolTipText("Grau de Sangue");

        jt_grau_sangue.setToolTipText("Ex: 1/2");
        jt_grau_sangue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_grau_sangueKeyReleased(evt);
            }
        });

        Classificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificacaoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setText("Categoria:");

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("Data do Nascimento:");

        DataNascimento.setToolTipText("Data nascimento");
        DataNascimento.setDateFormatString("yyyy-MM-dd");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setText("Date de Entrada:");

        DataEntrada.setBackground(new java.awt.Color(255, 255, 255));
        DataEntrada.setToolTipText("Data entrada");
        DataEntrada.setDateFormatString("yyyy-MM-dd");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Informações:");

        Informacoes.setColumns(20);
        Informacoes.setRows(5);
        Informacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InformacoesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Informacoes);

        info_error.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(info_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Raca, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Circunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Pelagem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19))
                            .addComponent(NomePai, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(NomeMae)
                            .addComponent(NomeAnimal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecionaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_grau_sangue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel16, jLabel2, jLabel3, jLabel4, jLabel5, jLabel9});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Registro))
                    .addComponent(info_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionaFornecedor)
                    .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21)
                    .addComponent(jt_grau_sangue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(NomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(DataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(NomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4)
                            .addComponent(Raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(Circunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pelagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        botaoSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(0, 153, 0));
        botaoSair.setText("SAIR");
        botaoSair.setContentAreaFilled(false);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoSair.setFocusable(false);
        botaoSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
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
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Cadastrar)
                        .addGap(9, 9, 9)
                        .addComponent(Alterar)
                        .addGap(9, 9, 9)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoSair)))
                .addContainerGap())
        );

        painelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Alterar, Cadastrar, Excluir, botaoSair});

        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RadioDoacao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioDoacao);
        RadioDoacao.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        RadioDoacao.setForeground(new java.awt.Color(51, 153, 0));
        RadioDoacao.setText("DOAÇÃO");
        RadioDoacao.setFocusable(false);
        RadioDoacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDoacaoActionPerformed(evt);
            }
        });

        RadioFazenda.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioFazenda);
        RadioFazenda.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        RadioFazenda.setForeground(new java.awt.Color(51, 153, 0));
        RadioFazenda.setText("FAZENDA");
        RadioFazenda.setFocusable(false);
        RadioFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioFazendaActionPerformed(evt);
            }
        });

        RadioLeilao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RadioLeilao);
        RadioLeilao.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        RadioLeilao.setForeground(new java.awt.Color(51, 153, 0));
        RadioLeilao.setText("LEILÃO");
        RadioLeilao.setFocusable(false);
        RadioLeilao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioLeilaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("MODO DE RECEBIMENTO:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(70, 70, 70)
                .addComponent(RadioLeilao)
                .addGap(39, 39, 39)
                .addComponent(RadioFazenda)
                .addGap(49, 49, 49)
                .addComponent(RadioDoacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RadioDoacao, RadioFazenda, RadioLeilao});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RadioFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RadioLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(RadioDoacao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash2.png"))); // NOI18N
        jButton1.setToolTipText("Limpar Campos");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash2.png"))); // NOI18N
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/trash1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE ANIMAIS");

        textoLeilao.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioLeilaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioLeilaoActionPerformed
        SelecionaMovimentacao leilao = new SelecionaMovimentacao(this, MenuPrincipal.p);
        MenuPrincipal.jDesktopPane1.add(leilao);
        leilao.setVisible(true);

    }//GEN-LAST:event_RadioLeilaoActionPerformed

    private void RadioDoacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDoacaoActionPerformed
        DataNascimento.setDate(null);
        DataEntrada.setDate(null);
        NomeMae.setText(null);
        NomePai.setText(null);
        NomeFornecedor.setText(null);
        SelecionaMovimentacao instancia = SelecionaMovimentacao.getInstancia();
        GerenciadorDeJanelas.getInstancia().openInternalFrame(instancia);
        instancia.getLeilao();
        instancia = null;

    }//GEN-LAST:event_RadioDoacaoActionPerformed

    private void ClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificacaoActionPerformed
        if (Classificacao.getSelectedIndex() >= 0) {
            // ca.listarFase(Classificacao, Fase);
        }
    }//GEN-LAST:event_ClassificacaoActionPerformed

    private void RadioFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioFazendaActionPerformed
        NomeFornecedor.setText(null);
        if (MenuPrincipal.p.getSelecionaAnimalParida() == null) {
            SelecionaAnimalParida parida = new SelecionaAnimalParida(this, MenuPrincipal.p);
            MenuPrincipal.jDesktopPane1.add(parida);
            parida.setVisible(true);
            parida.setPosicao();
        } else {
            GerenciadorDeJanelas.getInstancia().openInternalFrame(SelecionaAnimalParida.g);
        }
    }//GEN-LAST:event_RadioFazendaActionPerformed

    private void NomeMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeMaeActionPerformed

    private void NomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeFornecedorActionPerformed

    private void MasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasculinoActionPerformed
        Circunferencia.setEnabled(true);
    }//GEN-LAST:event_MasculinoActionPerformed

    private void FemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemininoActionPerformed
        Circunferencia.setEnabled(false);
        Circunferencia.setText(null);
    }//GEN-LAST:event_FemininoActionPerformed

    private void selecionaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaFornecedorActionPerformed
        if (RadioFazenda.isSelected()) {
            SelecionaFornecedor instancia = SelecionaFornecedor.getInstancia();
            GerenciadorDeJanelas.getInstancia().openInternalFrame(instancia);
            instancia.getFornecedor();
        }
    }//GEN-LAST:event_selecionaFornecedorActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void PesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesoKeyReleased
        // TODO add your handling code here:
        Peso.setText(Peso.getText().replaceAll("[^0-9 | ^.]", ""));
    }//GEN-LAST:event_PesoKeyReleased

    private void RegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RegistroKeyReleased
        // TODO add your handling code here:
        Registro.setText(Registro.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_RegistroKeyReleased

    private void NomeAnimalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeAnimalKeyReleased
        // TODO add your handling code here:
        upperCase(NomeAnimal);
    }//GEN-LAST:event_NomeAnimalKeyReleased

    private void RacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RacaKeyReleased
        // TODO add your handling code here:
        upperCase(Raca);
    }//GEN-LAST:event_RacaKeyReleased

    private void PelagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PelagemKeyReleased
        // TODO add your handling code here:
        upperCase(Pelagem);
    }//GEN-LAST:event_PelagemKeyReleased

    private void InformacoesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InformacoesKeyReleased
        // TODO add your handling code here:
        Informacoes.setText(Informacoes.getText().toUpperCase());
    }//GEN-LAST:event_InformacoesKeyReleased

    private void NomeFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeFornecedorKeyReleased
        // TODO add your handling code here:
        upperCase(NomeFornecedor);
    }//GEN-LAST:event_NomeFornecedorKeyReleased

    private void NomeMaeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeMaeKeyReleased
        upperCase(NomeMae);        // TODO add your handling code here:
    }//GEN-LAST:event_NomeMaeKeyReleased

    private void NomePaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomePaiKeyReleased
        upperCase(NomePai);        // TODO add your handling code here:
    }//GEN-LAST:event_NomePaiKeyReleased

    private void CircunferenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CircunferenciaKeyReleased
        Circunferencia.setText(Circunferencia.getText().replaceAll("[^0-9 | ^.]", ""));        // TODO add your handling code here:
    }//GEN-LAST:event_CircunferenciaKeyReleased

    private void jt_grau_sangueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_grau_sangueKeyReleased
        jt_grau_sangue.setText(jt_grau_sangue.getText().replaceAll("[^0-9 | ^/]", ""));
    }//GEN-LAST:event_jt_grau_sangueKeyReleased

    private void NomePaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomePaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomePaiActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        AnimalRN animalRN = new AnimalRN();
        if (animalRN.cadastrar(entAnimal)) {
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    public void tratamentoDeBotoes(int tipo) {
        Component components[] = painelCadastro.getComponents();
        int o = 0;
        for (int i = 0; i < components.length; i++) {
            //Comparação com campoDeTexto
            if (components[i] instanceof JTextField) {
                if (RadioDoacao.isSelected() || RadioLeilao.isSelected()) {
                    if (components[i] != NomeMae && components[i] != NomePai) {
                        if (components[i] == Circunferencia) {
                            if (Circunferencia.isEnabled() && (Circunferencia.getText().isEmpty() || Circunferencia.getText().equals(""))) {
                                o++;
                            }
                        } else {
                            if (((JTextField) components[i]).getText().isEmpty()) {
                                o++;
                            }
                        }
                    }
                }
                if (RadioFazenda.isSelected()) {
                    if (components[i] == Circunferencia) {
                        if (Circunferencia.isEnabled() && (Circunferencia.getText().isEmpty() || Circunferencia.getText().equals(""))) {
                            o++;
                        }
                    } else {
                        if (((JTextField) components[i]).getText().isEmpty()) {
                            o++;
                        }
                    }
                }
            }
        }
        if (DataEntrada.getDate() == null) {
            o++;
        }
        if (DataNascimento.getDate() == null) {
            o++;
        }

        if (!RadioDoacao.isSelected() && !RadioFazenda.isSelected() && !RadioLeilao.isSelected()) {
            o++;
        }
        if (o == 0) {
            if (DataEntrada.getDate() != null && DataNascimento.getDate() != null) {
                int i = trataData(DataEntrada);
                int a = trataData(DataNascimento);
                if (i == 0 && a == 0) {
                    cadastrar(tipo);
                }
            }

        } else {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (MenuPrincipal.p.usuarioLogado.isADM()) {
            if (entAnimal.getIdAnimal() != 0) {
                tratamentoDeBotoes(2);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Informe um Animal");
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (MenuPrincipal.p.usuarioLogado.isADM()) {
            if (entAnimal.getIdAnimal() != 0) {
                excluirAnimal();
            } else {
                JOptionPane.showMessageDialog(null, "Informe um Animal");
            }
        }   // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        CADASTRO_ANIMAL = null;
        this.dispose();                   // TODO add your handling code here:
    }//GEN-LAST:event_botaoSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Circunferencia;
    private javax.swing.JComboBox Classificacao;
    private com.toedter.calendar.JDateChooser DataEntrada;
    private com.toedter.calendar.JDateChooser DataNascimento;
    private javax.swing.JButton Excluir;
    private javax.swing.JRadioButton Feminino;
    private javax.swing.JTextArea Informacoes;
    private javax.swing.JRadioButton Masculino;
    private javax.swing.JTextField NomeAnimal;
    private javax.swing.JTextField NomeFornecedor;
    private javax.swing.JTextField NomeMae;
    private javax.swing.JTextField NomePai;
    private javax.swing.JTextField Pelagem;
    private javax.swing.JTextField Peso;
    private javax.swing.JTextField Raca;
    private javax.swing.JRadioButton RadioDoacao;
    private javax.swing.JRadioButton RadioFazenda;
    private javax.swing.JRadioButton RadioLeilao;
    private javax.swing.JTextField Registro;
    private javax.swing.JButton botaoSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jt_grau_sangue;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JButton selecionaFornecedor;
    private javax.swing.JLabel textoLeilao;
    // End of variables declaration//GEN-END:variables

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    private int trataData(JDateChooser chooser) {
        ConverterDatas cd = new ConverterDatas();
        Calendar calendar = Calendar.getInstance();
        Date date = cd.converter(chooser);
        if ((date.compareTo(cd.CalendarForDate(calendar))) > 0) {
            info_error.setText(chooser.getToolTipText() + " não é válida!");
            return 1;
        } else {
            return 0;
        }

    }
}
