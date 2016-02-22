package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.modelo.Animal;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.modelo.Cruzamento;
import br.com.ti4b.modelo.Fecundacao;
import br.com.ti4b.modelo.Gestacao;
import br.com.ti4b.modelo.Veterinario;
import br.com.ti4b.entidadesGenericas.Ent_HistoricoReproducao;
import br.com.ti4b.visao.pesquisas.Seleciona_Veterinario;
import br.com.ti4b.visao.pesquisas.PesqusaCruzamento;
import br.com.ti4b.visao.pesquisas.SelecionaAnimal;
import br.com.ti4b.dao.CategoriaDAO;
import br.com.ti4b.dao.CruzamentoDAO;
import br.com.ti4b.dao.FecundacaoDAO;
import br.com.ti4b.dao.GestacaoDAO;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tarcila
 */
public final class CadastroCruzamento extends javax.swing.JInternalFrame {

    private String categoria;
    Cruzamento cruzamento = new Cruzamento();
    CruzamentoDAO funcoes_Cruzamento = new CruzamentoDAO();
    Fecundacao ent_fecundacao = new Fecundacao();
    FecundacaoDAO funcoues_Fecundacao = new FecundacaoDAO();
    Gestacao ent_Gestacao = new Gestacao();
    GestacaoDAO funcoes_Gestacao = new GestacaoDAO();
    MenuPrincipal<JInternalFrame> m;
    ConverterDatas cd = new ConverterDatas();
    String crmv = null;
    int cod_aimal_pai = -1;
    Calendar calendar;

    /**
     * Creates new form Artificial
     *
     */
    public CadastroCruzamento() {
        initComponents();
        Alterar.setEnabled(false);
        DataFecundacao.setVisible(false);
        prive();
    }

    public CadastroCruzamento(MenuPrincipal m) {
        initComponents();
        this.m = m;
        DataFecundacao.setEnabled(false);
        prive();
    }

    public void setMae(Animal ent_Animal) {
        cruzamento.setIdMae(ent_Animal.getIdAnimal());
        NomeMatriz.setText(ent_Animal.getNome());
        this.categoria = ent_Animal.getInformacao();
        jButton3.setEnabled(true);
    }

    public void setPai(Animal ent_Animal) {
        cod_aimal_pai = ent_Animal.getIdAnimal();
        NomeReprodutor.setText(ent_Animal.getNome());
    }

    public void setVeterinario(Veterinario ent_Veterinario) {
        this.crmv = ent_Veterinario.getCrmv();
        NomeVeterinario.setText(ent_Veterinario.getNome());
    }

    public void setValores(Ent_HistoricoReproducao cruzamento) {
        this.cruzamento.setIdCruzamento(cruzamento.getIdCruzamento());
        this.cruzamento.setIdMae(cruzamento.getIdAnimal());
        ent_fecundacao.setCod_fecundacao(cruzamento.getIdFecundacao());
        ent_Gestacao.setId(cruzamento.getIdGestacao());
        crmv = cruzamento.getIdVeterinario();
        NomeMatriz.setText(cruzamento.getNome());
        NomeVeterinario.setText(cruzamento.getNomeVeterinario());
        NomeReprodutor.setText(cruzamento.getPai());
        if (!String.valueOf(cruzamento.getDataCruzamento()).isEmpty()) {
            DataFecundacao.setDate(cruzamento.getDataFecundacao());
        } else {
            DataFecundacao.setDate(null);
        }
        if (!String.valueOf(cruzamento.getDataCruzamento()).isEmpty()) {
            DataInseminacao.setDate(cruzamento.getDataCruzamento());
        } else {
            DataInseminacao.setDate(null);
        }

        Tipo.setSelectedItem(String.valueOf(cruzamento.getTipoCruzamento()));
        Tentativa.setSelectedItem(cruzamento.getTentativas());
        status.setSelectedItem(cruzamento.getStatus());
    }

    public int setPeriodoDeGestacao() {
        int dias = 0;
        CategoriaDAO fc = new CategoriaDAO();
        String classif = String.valueOf(fc.retornaClassificacao(NomeMatriz.getText()));

        if (classif.equals("BOVINO")) {
            dias = 284;
        }
        if (classif.equals("OVINO")) {
            dias = 100;
        }
        if (classif.equals("CAPRINO")) {
            dias = 151;
        }
        if (classif.equals("SUÍNO")) {
            dias = 112;
        }

        return dias;
    }

    public Date addDias(String data, int dias) {
        String dt = null;
        Date dataFec = cd.converterData(data);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataFec);
        cal.add(Calendar.DATE, dias);
        dt = String.valueOf(formato.format(cal.getTime()));
        dataFec = Date.valueOf(dt);
        return dataFec;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PainelCadastro = new javax.swing.JPanel();
        NomeReprodutor = new javax.swing.JTextField();
        NomeVeterinario = new javax.swing.JTextField();
        Tentativa = new javax.swing.JComboBox();
        NomeMatriz = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DataInseminacao = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox();
        DataFecundacao = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        DataFec = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();

        setTitle("Cadastro Cruzamento");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CRUZAMENTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
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
            .addGap(0, 0, Short.MAX_VALUE)
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

        PainelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        PainelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NomeReprodutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeReprodutorKeyReleased(evt);
            }
        });

        NomeVeterinario.setEditable(false);
        NomeVeterinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeVeterinarioKeyReleased(evt);
            }
        });

        Tentativa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Outros" }));

        NomeMatriz.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Matríz:");

        DataInseminacao.setDateFormatString("yyyy-MM-dd");

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("Status:");

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Observação", "Sucesso", "Falha" }));
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
        });
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        jButton5.setText("...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setText("Tipo:");

        Tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Natural", "Artificial" }));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        DataFecundacao.setDateFormatString("yyyy-MM-dd");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DataFec.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        DataFec.setForeground(new java.awt.Color(0, 153, 0));
        DataFec.setText("Data Fecundação:");

        jButton3.setText("...");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Data:");

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

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Nome Veterinário:");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel7.setText("Tentativa:");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Reprodutor:");

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

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addComponent(Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addContainerGap())
                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NomeVeterinario)
                                        .addComponent(NomeMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NomeReprodutor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addComponent(DataInseminacao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tentativa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PainelCadastroLayout.createSequentialGroup()
                                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DataFec)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PainelCadastroLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(DataFecundacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(8, 8, 8))))
        );

        PainelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DataFec, jLabel6, jLabel9});

        PainelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DataFecundacao, Tipo, status});

        PainelCadastroLayout.setVerticalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(12, 12, 12)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NomeMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton3)
                    .addComponent(jLabel5)
                    .addComponent(NomeReprodutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(DataFecundacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataFec)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(Tentativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataInseminacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Cadastrar)
                    .addComponent(Alterar)
                    .addComponent(jButton8)
                    .addComponent(Excluir))
                .addContainerGap())
        );

        PainelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DataFec, DataFecundacao, DataInseminacao, NomeMatriz, NomeReprodutor, NomeVeterinario, Tentativa, Tipo, info_error, jButton1, jButton3, jButton5, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel9, status});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cadastrarCruzamento(int tipo) {
        encapsularCruzamento();
        if (tipo == 1) {
            funcoes_Cruzamento.CadastrarCruzamento(cruzamento, tipo);
            encapsularFecundacao(1);
            if (status.getSelectedItem().equals("Sucesso")) {
                funcoues_Fecundacao.cadastrarFecundacao(ent_fecundacao);
                encapsularGestacao(1);
                funcoes_Gestacao.cadastrarGestacao(ent_Gestacao);
            }
        }
        if (tipo == 2) {
            funcoes_Cruzamento.CadastrarCruzamento(cruzamento, tipo);
            if (DataFecundacao.getDate() != null && ent_fecundacao.getCod_fecundacao() == 0) {
                encapsularFecundacao(1);
                funcoues_Fecundacao.cadastrarFecundacao(ent_fecundacao);
                encapsularGestacao(1);
                funcoes_Gestacao.cadastrarGestacao(ent_Gestacao);
            } else if (ent_fecundacao.getCod_fecundacao() != 0 && DataFecundacao.getDate() != null) {
                encapsularFecundacao(2);
                funcoues_Fecundacao.alterarfecundacao(ent_fecundacao);
                encapsularGestacao(2);
                funcoes_Gestacao.alterarGestacao(ent_Gestacao);
            } else if (ent_fecundacao.getCod_fecundacao() != 0 && DataFecundacao.getDate() == null) {
                funcoues_Fecundacao.excluirFecundacao(ent_fecundacao);
                funcoes_Gestacao.excluirGestacao(ent_Gestacao);
            }

        }

        if (tipo == 1 && DataFecundacao.getDate() != null) {
            if (cruzamento.getRetorno().equals("Cadastrado com Sucesso!")
                    && ent_fecundacao.getRetorno().equals("Cadastrado com Sucesso!")
                    && ent_Gestacao.getRetorno().equals("Cadastrado com Sucesso!")) {
                limparCampos();
                info_error.setText("Cadastrado com Sucesso!");
            }
        } else if (tipo == 1 && DataFecundacao.getDate() == null) {

            if (cruzamento.getRetorno().equals("Cadastrado com Sucesso!")) {
                limparCampos();
                info_error.setText("Cadastrado com Sucesso!");
            }
        } else if (tipo == 2 && DataFecundacao.getDate() != null) {
            if (cruzamento.getRetorno().equals("Alterado com Sucesso!")
                    && ent_fecundacao.getRetorno().equals("Alterado com Sucesso!")
                    && ent_Gestacao.getRetorno().equals("Alterado com Sucesso!")) {
                limparCampos();
                info_error.setText("Alterado com Sucesso!");

            } else if (cruzamento.getRetorno().equals("Alterado com Sucesso!")
                    && ent_fecundacao.getRetorno().equals("Cadastrado com Sucesso!")
                    && ent_Gestacao.getRetorno().equals("Cadastrado com Sucesso!")) {
                limparCampos();
                info_error.setText("Alterado com Sucesso!");
            }
        } else if (tipo == 2 && DataFecundacao.getDate() == null) {
            if (cruzamento.getRetorno().equals("Alterado com Sucesso!")) {
                limparCampos();
                info_error.setText("Alterado com Sucesso!");

            }
        }
    }

    public void encapsularCruzamento() {
        cruzamento.setNomeVeterinario(NomeVeterinario.getText());
        cruzamento.setPai(NomeReprodutor.getText());
        cruzamento.setCrmv(crmv.trim());
        cruzamento.setDataCruza(cd.converter(DataInseminacao));
        cruzamento.setStatus(String.valueOf(status.getSelectedItem()));
        cruzamento.setTipo(String.valueOf(Tipo.getSelectedItem()));
        cruzamento.setTentativa(Integer.parseInt(String.valueOf(Tentativa.getSelectedItem())));
        if (Tipo.getSelectedItem().equals("Artificial")) {
            cruzamento.setIdTipoCruza(1);
        }
        if (Tipo.getSelectedItem().equals("Natural")) {
            cruzamento.setIdTipoCruza(2);
        }
    }

    public void encapsularFecundacao(int tipo) {
        if (tipo == 1) {
            cruzamento.setIdCruzamento(funcoes_Cruzamento.pesquisarCodigo(cruzamento));
        }
        ent_fecundacao.setCod_cruzamento(cruzamento.getIdCruzamento());
        ent_fecundacao.setData_fecundacao(cd.converter(DataFecundacao));
    }

    public void encapsularGestacao(int tipo) {
        if (tipo == 1) {
            ent_fecundacao.setCod_fecundacao(funcoues_Fecundacao.pesquisarCodigoFecundacao(cruzamento.getIdCruzamento()));
        }
        ent_Gestacao.setCod_fecundacao(ent_fecundacao.getCod_fecundacao());
        if (DataFecundacao.getDate() != null) {
            ent_Gestacao.setPeriodo_aprox_de_parto(addDias(cd.converterForString(DataFecundacao), setPeriodoDeGestacao()));
        } else {
            ent_Gestacao.setPeriodo_aprox_de_parto(null);
        }
        ent_Gestacao.setObservacao("GESTANTE");
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limparCampos();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Seleciona_Veterinario vet = new Seleciona_Veterinario(this, m);
        MenuPrincipal.jDesktopPane1.add(vet);
        vet.setVisible(true);
        vet.setPosicao();
       // TODO add your handling code here:

        ///criar tabela de veterinários

    }//GEN-LAST:event_jButton5ActionPerformed


    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        if (String.valueOf(status.getSelectedItem()).trim().equals("Sucesso")) {
            DataFecundacao.setEnabled(true);

        } else {
            DataFecundacao.setEnabled(false);
            DataFecundacao.setDate(null);
        }


    }//GEN-LAST:event_statusActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_statusMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SelecionaAnimal animal = new SelecionaAnimal(this, "F");
        MenuPrincipal.jDesktopPane1.add(animal);
        animal.setVisible(true);
        animal.setPosicao();

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (categoria != null) {
            SelecionaAnimal animal = new SelecionaAnimal(this, "M", this.categoria.trim());
            MenuPrincipal.jDesktopPane1.add(animal);
            animal.setVisible(true);
            animal.setPosicao();
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NomeVeterinarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeVeterinarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeVeterinarioKeyReleased

    private void NomeReprodutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeReprodutorKeyReleased
        upperCase(NomeReprodutor);        // TODO add your handling code here:
    }//GEN-LAST:event_NomeReprodutorKeyReleased

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (cruzamento.getIdCruzamento() == 0) {
                Component components[] = PainelCadastro.getComponents();
                int o = 0;
                for (Component component : components) {
                    //Comparação com campoDeTexto
                    if (component instanceof JTextField) {
                        if (((JTextField) component).getText().isEmpty()) {
                            o++;
                        }
                    }
                }

                if (status.getSelectedItem().equals("Sucesso")) {
                    if (DataFecundacao.getDate() == null) {
                        o++;
                    }
                }

                if (DataInseminacao.getDate() == null) {
                    o++;
                }

                if (o == 0) {
                    cadastrarCruzamento(1);
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                info_error.setText("Cruzamento já está Cadastrado!");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // alterarCruzamento();
        if (m.usuarioLogado.isADM()) {
            if (cruzamento.getIdCruzamento() != 0) {
                Component components[] = PainelCadastro.getComponents();
                int o = 0;
                for (Component component : components) {
                    //Comparação com campoDeTexto
                    if (component instanceof JTextField) {
                        if (((JTextField) component).getText().isEmpty()) {
                            o++;
                        }
                    }
                }

                if (status.getSelectedItem().equals("Sucesso")) {
                    if (DataFecundacao.getDate() == null) {
                        o++;
                    }
                }

                if (DataInseminacao.getDate() == null) {
                    o++;
                }

                if (o == 0) {
                    cadastrarCruzamento(2);
                } else {
                    info_error.setText("Preenxa todos os campos!");
                }
            } else {
                int i = JOptionPane.showConfirmDialog(null, "O Cruzamento selecionado não esta cadastrado\n Deseja escolher um Cruzamento? ", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    PesqusaCruzamento ent_Cruzamento = new PesqusaCruzamento(m);
                    m.setPesqusaCruzamento(ent_Cruzamento);
                    MenuPrincipal.jDesktopPane1.add(ent_Cruzamento);
                    ent_Cruzamento.setVisible(true);
                    ent_Cruzamento.setPosicao();
                    this.dispose();
                }
            }
        }      // TODO add your handling code here:
    }//GEN-LAST:event_AlterarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        m.fecharFrames(this);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (cruzamento.getIdCruzamento() != 0) {
                CruzamentoDAO fc = new CruzamentoDAO();
                fc.excluirCruzamentos(cruzamento.getIdCruzamento());
                limparCampos();
            } else {
                int i = JOptionPane.showConfirmDialog(rootPane, "O Cruzamento selecionado não esta cadastrado\n Deseja escolher um Cruzamento? ", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    PesqusaCruzamento pesquisarCruzamento = new PesqusaCruzamento(m);
                    m.setPesqusaCruzamento(pesquisarCruzamento);
                    MenuPrincipal.jDesktopPane1.add(pesquisarCruzamento);
                    pesquisarCruzamento.setVisible(true);
                    pesquisarCruzamento.setPosicao();
                    this.dispose();
                }
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel DataFec;
    private com.toedter.calendar.JDateChooser DataFecundacao;
    private com.toedter.calendar.JDateChooser DataInseminacao;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField NomeMatriz;
    private javax.swing.JTextField NomeReprodutor;
    private javax.swing.JTextField NomeVeterinario;
    private javax.swing.JPanel PainelCadastro;
    private javax.swing.JComboBox Tentativa;
    private javax.swing.JComboBox Tipo;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox status;
    // End of variables declaration//GEN-END:variables
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    private void limparCampos() {
        categoria = null;
        jButton3.setEnabled(false);
        Tentativa.setSelectedIndex(0);
        info_error.setText(null);
        NomeMatriz.setText("");
        NomeReprodutor.setText("");
        NomeVeterinario.setText("");
        status.setSelectedIndex(0);
        DataFecundacao.setEnabled(false);
        DataFecundacao.setDate(null);
        DataInseminacao.setDate(null);
        crmv = null;
        cod_aimal_pai = -1;
        cruzamento = new Cruzamento();
        ent_Gestacao = new Gestacao();
        ent_fecundacao = new Fecundacao();
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    public void prive() {
        String privilegio = "Você não tem privilégios para executar essa ação!";
        if (m.usuarioLogado.isADM()) {
        } else {
            Cadastrar.setRolloverEnabled(false);
            Alterar.setRolloverEnabled(false);
            Excluir.setRolloverEnabled(false);
            Cadastrar.setToolTipText(privilegio);
            Alterar.setToolTipText(privilegio);
            Excluir.setToolTipText(privilegio);

        }
    }
}
