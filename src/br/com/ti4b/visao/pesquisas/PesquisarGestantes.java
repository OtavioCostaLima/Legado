package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.AlertasReproducao;
import br.com.ti4b.util.ClassificacaoAnimal;
import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Gestacao;
import br.com.ti4b.visao.cadastros.CadastroParto;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.dao.RelatoriosDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author StreamRead
 */
public final class PesquisarGestantes extends javax.swing.JInternalFrame {

    RelatoriosDAO funcoes_Relatorios = new RelatoriosDAO();
    ClassificacaoAnimal classificacao = new ClassificacaoAnimal();
    CadastroParto cadastroParto;
    List<Gestacao> listG = new ArrayList<>();
    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    AlertasReproducao alertasReproducao = new AlertasReproducao();
    int cod_gestacao;
    String mae;

    private static PesquisarGestantes pesquisarGestantes;

    public static PesquisarGestantes getInstancia() {
        if (pesquisarGestantes == null) {
            pesquisarGestantes = new PesquisarGestantes();
        }
        return pesquisarGestantes;
    }

    public PesquisarGestantes() {
    }

    public PesquisarGestantes(MenuPrincipal m) {
        initComponents();
        //  this.m = m;
        classificacao.listarClacificacao(Classificacao);
        filtros.Ordenartabela(tabelaPesquisa);
    }

    public PesquisarGestantes(MenuPrincipal m, CadastroParto cadastroParto) {
        initComponents();
        pesquisarGestantes = null;
        classificacao.listarClacificacao(Classificacao);

        this.cadastroParto = cadastroParto;
    }

    public void pintarTabela() {

        tabelaPesquisa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String dataParto = String.valueOf(tabelaPesquisa.getValueAt(row, 3));
                String categoria = String.valueOf(Classificacao.getSelectedItem());
                setForeground(Color.BLACK);
                if (alertasReproducao.isParto(dataParto, categoria)) {
                    setForeground(Color.WHITE);
                    setBackground(Color.red);
                } else {
                    setBackground(Color.WHITE);
                }
                return this;
            }
        });

    }

    public void povoarTabela(String classi) {
        listG.clear();
        filtros.removerLinhasTabela(tabelaPesquisa);
        filtros.Ordenartabela(tabelaPesquisa);
        ConectaBanco conecta = new ConectaBanco();

        try {
            String sql = "select a.nome,f.cod_fecundacao,f.data_fecundacao,g.cod_gestacao,g.previsao_parto,g.situacao,fe.descricao as categoria,cc.descricao from cruzamento c\n"
                    + "join animal a on a.cod_animal=c.cod_animal_mae\n"
                    + "join fecundacao f on f.cod_cruzamento=c.cod_cruzamento\n"
                    + "join gestacao g on g.cod_fecundacao=f.cod_fecundacao \n"
                    + "join fase fe on a.cod_fase=fe.cod_fase\n"
                    + "join classificacao cc on cc.cod_classificacao=fe.cod_clasificacao where cc.descricao='" + classi + "' and g.situacao='GESTANTE'";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisa.getModel();
            modelo.setNumRows(0);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                Gestacao eg = new Gestacao();
                modelo.addRow(new Object[]{RS.getString("cod_gestacao"), RS.getString("nome"), RS.getString("data_fecundacao"), RS.getDate("previsao_parto"), RS.getString("situacao")});
                eg.setCod_fecundacao(RS.getInt("cod_fecundacao"));
                eg.setId(RS.getInt("cod_gestacao"));
                eg.setNome_gestante(RS.getString("nome"));
                eg.setObservacao(RS.getString("situacao"));
                eg.setPeriodo_aprox_de_parto(RS.getDate("previsao_parto"));
                listG.add(eg);
            }
            tabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(90);
            tabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(70);
            conecta.desconecta();
            pintarTabela();// fecha conexão com BD
        } catch (SQLException e) { //trata os erros SQL
            JOptionPane.showMessageDialog(this, "Erro Comando SQL " + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Classificacao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        pesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Selecionar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel3.setForeground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Classificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificacaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Categoria:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matríz Gestante", "Data de Prechêz", "Previsão do Parto", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaPesquisa.setSelectionBackground(new java.awt.Color(0, 153, 0));
        tabelaPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPesquisa);

        pesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        pesquisar.setSelectionColor(new java.awt.Color(0, 153, 0));
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });
        pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisarKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Matríz:");

        Selecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Selecionar piqueno.png"))); // NOI18N
        Selecionar.setBorder(null);
        Selecionar.setBorderPainted(false);
        Selecionar.setContentAreaFilled(false);
        Selecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Selecionar.setFocusable(false);
        Selecionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Selecionar Grande3.png"))); // NOI18N
        Selecionar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Selecionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
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

        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Imprimir Pequeno.png"))); // NOI18N
        Imprimir.setBorder(null);
        Imprimir.setBorderPainted(false);
        Imprimir.setContentAreaFilled(false);
        Imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Imprimir.setFocusable(false);
        Imprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Imprimir Grande.png"))); // NOI18N
        Imprimir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Imprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 51, 0));
        jPanel9.setToolTipText("Situação de Alerta: Verifique se o animal foi fecundado com sucesso!");
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 0));
        jPanel8.setToolTipText("Situação Média");
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.setPreferredSize(new java.awt.Dimension(14, 14));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel4.setText("Situação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selecionar)
                    .addComponent(jButton8)
                    .addComponent(Imprimir))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Animais Gestantes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
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

    public void selecionaGestantes() throws HeadlessException {
        if (listG.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe Gestantes Cadastradas!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
                for (int i = 0; i < listG.size(); i++) {
                    if (String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0)).trim().equals(String.valueOf(listG.get(i).getId()).trim())) {
                        Gestacao gestacao = listG.get(i);
                        if (gestacao.getObservacao().trim().equals("GESTANTE")) {
                            int confirme = JOptionPane.showConfirmDialog(null, "Tem certeza que a vaca pariu?", "CONFIRMAÇÃO!",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            if (confirme == 0) {
                                if (cadastroParto != null) {
                                    cadastroParto.setGestante(gestacao);
                                    pesquisarGestantes = null;
                                    this.dispose();
                                } else {
                                    // cadastroParto = new CadastroParto(m);
                                    pesquisarGestantes = null;
                                    MenuPrincipal.jDesktopPane1.add(cadastroParto);
                                    cadastroParto.setVisible(true);
                                    cadastroParto.setGestante(gestacao);
                                    cadastroParto.setPosicao();
                                    pesquisarGestantes = null;
                                    this.dispose();
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Este Animal não está mais gestante!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um Animal", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    private void ClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificacaoActionPerformed
        filtros.removerLinhasTabela(tabelaPesquisa);
        povoarTabela(String.valueOf(Classificacao.getSelectedItem()));
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassificacaoActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        if (pesquisar.getText().length() > 0) {
            pesquisar.setText(pesquisar.getText().toUpperCase());
            filtros.FiltrarNome(pesquisar.getText(), tabelaPesquisa, 1);
        } else {
            povoarTabela(String.valueOf(Classificacao.getSelectedItem()));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarKeyReleased

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void tabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisaMouseClicked
        tabelaPesquisa.setSelectionBackground(new Color(0, 153, 0));
        if (evt.getClickCount() == 2) {
            for (int i = 0; i < listG.size(); i++) {
                selecionaGestantes();
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaPesquisaMouseClicked

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        selecionaGestantes();
    }//GEN-LAST:event_SelecionarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pesquisarGestantes = null;
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
            String cod = String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0));

            funcoes_Relatorios.relatoriosReproducao("relatorioGestantesIndividual", cod);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Classificacao;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Selecionar;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTable tabelaPesquisa;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

}
