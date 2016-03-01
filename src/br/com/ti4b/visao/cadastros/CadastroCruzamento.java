package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.modelo.Cruzamento;
import br.com.ti4b.modelo.Fecundacao;
import br.com.ti4b.modelo.Gestacao;
import br.com.ti4b.dao.CruzamentoDAO;
import br.com.ti4b.dao.FecundacaoDAO;
import br.com.ti4b.dao.GestacaoDAO;
import java.util.Calendar;
import javax.swing.JInternalFrame;
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
          }

   
   
    /*    public int setPeriodoDeGestacao() {
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
    }*/
    /*
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
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
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
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

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
        jLabel2.setText("Veterinário:");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel7.setText("Tentativa:");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Reprodutor:");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout PainelCadastroLayout = new javax.swing.GroupLayout(PainelCadastro);
        PainelCadastro.setLayout(PainelCadastroLayout);
        PainelCadastroLayout.setHorizontalGroup(
            PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCadastroLayout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(8, 8, 8))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DataFec, DataFecundacao, DataInseminacao, NomeMatriz, NomeReprodutor, NomeVeterinario, Tentativa, Tipo, info_error, jButton1, jButton3, jButton5, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel9, status});

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Sair)))
                        .addGap(24, 24, 24)))
                .addGap(0, 0, 0))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Alterar, Cadastrar, Excluir, Sair});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Sair)
                    .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

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

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed

    }//GEN-LAST:event_CadastrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

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

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_statusMouseClicked

    private void NomeVeterinarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeVeterinarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeVeterinarioKeyReleased

    private void NomeReprodutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeReprodutorKeyReleased
        upperCase(NomeReprodutor);        // TODO add your handling code here:
    }//GEN-LAST:event_NomeReprodutorKeyReleased

  


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
    private javax.swing.JButton Sair;
    private javax.swing.JComboBox Tentativa;
    private javax.swing.JComboBox Tipo;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox status;
    // End of variables declaration//GEN-END:variables
  

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

  }
