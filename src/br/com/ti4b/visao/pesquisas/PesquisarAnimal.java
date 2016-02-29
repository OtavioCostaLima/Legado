package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.dao.AnimalDAO;
import br.com.ti4b.modelo.negocio.AnimalRN;
import br.com.ti4b.visao.telas.tables.TabelaAnimal;
import java.awt.HeadlessException;

public final class PesquisarAnimal extends javax.swing.JInternalFrame {

    TabelaAnimal tabelaAnimal = new TabelaAnimal();
    AnimalDAO funcoes_Animal = new AnimalDAO();
    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    private static PesquisarAnimal pesquisarAnimal;

    public static PesquisarAnimal getInstancia() {
        if (pesquisarAnimal == null) {
            pesquisarAnimal = new PesquisarAnimal();
        }
        return pesquisarAnimal;
    }

    public PesquisarAnimal() {
        initComponents();
        tabelaPesquisa.setModel(tabelaAnimal);
    }

    public void PovoarTabelaPadrao() {
        //     filtros.removerLinhasTabela(tabelaPesquisa);
        AnimalRN animalRN = new AnimalRN();
        tabelaAnimal.inserirAnimals(animalRN.buscarTodos());
        tabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(200);
        tabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(50);
        tabelaPesquisa.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabelaPesquisa.getColumnModel().getColumn(6).setPreferredWidth(70);
        tabelaPesquisa.getColumnModel().getColumn(7).setPreferredWidth(70);
        tabelaPesquisa.getColumnModel().getColumn(8).setPreferredWidth(100);
        tabelaPesquisa.getColumnModel().getColumn(9).setPreferredWidth(70);
        tabelaPesquisa.getColumnModel().getColumn(10).setPreferredWidth(75);
        tabelaPesquisa.getColumnModel().getColumn(11).setPreferredWidth(200);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoPesquisa = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Classificacao = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        ModoDeEntrada = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        Fase = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        Selecionar = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        RResgistro = new javax.swing.JRadioButton();
        RNome = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setTitle("PESQUISAR ANIMAL");

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setText("CATEGORIA:");

        Classificacao.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        Classificacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        Classificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificacaoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setText("MODO ENTRADA:");

        ModoDeEntrada.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        ModoDeEntrada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LEILÃO", "NASCIMENTO", "DOAÇÃO" }));
        ModoDeEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoDeEntradaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 0));
        jLabel23.setText("SUB. CATEGORIA:");

        Fase.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        Fase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        Fase.setToolTipText("");
        Fase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModoDeEntrada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fase, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Classificacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ModoDeEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaPesquisa.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Categoria", "Sub. Categoria", "Sexo", "Raça", "Cor", "Idade", "Peso", "Grau", "Data Entrada", "Informação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaPesquisa.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaPesquisa.setSelectionBackground(new java.awt.Color(0, 153, 0));
        tabelaPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPesquisa);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("Sair");
        jButton8.setToolTipText("");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        Selecionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Selecionar.setForeground(new java.awt.Color(255, 0, 0));
        Selecionar.setText("Selecionar");
        Selecionar.setToolTipText("");
        Selecionar.setContentAreaFilled(false);
        Selecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Selecionar.setFocusable(false);
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });

        Imprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(255, 0, 0));
        Imprimir.setText("Imprimir");
        Imprimir.setToolTipText("");
        Imprimir.setContentAreaFilled(false);
        Imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Imprimir.setFocusable(false);
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar por"));

        RResgistro.setBackground(new java.awt.Color(255, 255, 255));
        grupoPesquisa.add(RResgistro);
        RResgistro.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        RResgistro.setForeground(new java.awt.Color(0, 153, 0));
        RResgistro.setText("Registro");

        RNome.setBackground(new java.awt.Color(255, 255, 255));
        grupoPesquisa.add(RNome);
        RNome.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        RNome.setForeground(new java.awt.Color(0, 153, 0));
        RNome.setText("Nome");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RResgistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(RNome, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addComponent(RResgistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setText("Pesquisar:");

        jTextField1.setToolTipText("Pesquisa padrão por nome!");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Pesquisar Animais");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Imprimir, Selecionar, jButton8});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton8)
                    .addComponent(Selecionar)
                    .addComponent(Imprimir))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Imprimir, Selecionar, jButton8});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificacaoActionPerformed
        if (Classificacao.getSelectedIndex() >= 0) {
            //  ca.listarFase(Classificacao, Fase);
        }
    }//GEN-LAST:event_ClassificacaoActionPerformed

    private void tabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisaMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }
    }//GEN-LAST:event_tabelaPesquisaMouseClicked

    private void ModoDeEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoDeEntradaActionPerformed
        modeDeEntrada();
    }//GEN-LAST:event_ModoDeEntradaActionPerformed

    public void modeDeEntrada() {
        if (ModoDeEntrada.getSelectedItem().equals("LEILÃO")) {
//            ListAnimal = PovoarTabelaPadrao(1);
            filtros.FiltrarNome(String.valueOf(Fase.getSelectedItem()), tabelaPesquisa, 3);

        } else if (ModoDeEntrada.getSelectedItem().equals("NASCIMENTO")) {
            //    ListAnimal = PovoarTabelaPadrao(2);
            filtros.FiltrarNome(String.valueOf(Fase.getSelectedItem()), tabelaPesquisa, 3);
        } else if (ModoDeEntrada.getSelectedItem().equals("DOAÇÃO")) {
            //    ListAnimal = PovoarTabelaPadrao(3);
            filtros.FiltrarNome(String.valueOf(Fase.getSelectedItem()), tabelaPesquisa, 3);
        }

// TODO add your handling code here:
    }

    private void FaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaseActionPerformed
        filtros.FiltrarNome(String.valueOf(Fase.getSelectedItem()), tabelaPesquisa, 3);        // TODO add your handling code here:
    }//GEN-LAST:event_FaseActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jTextField1.setText(jTextField1.getText().toUpperCase());
        if (jTextField1.getText().length() > 0) {
            if (RResgistro.isSelected()) {
                filtros.FiltrarNome(jTextField1.getText(), tabelaPesquisa, 0);
            } else if (RNome.isSelected()) {
                filtros.FiltrarNome(jTextField1.getText(), tabelaPesquisa, 1);

            } else {
                modeDeEntrada();
                //   PovoarTabelaPadrao(1);
                //  filtros.FiltrarNome(String.valueOf(Fase.getSelectedItem()), TabelaPesquisa, 1);
            }

        } else {
            modeDeEntrada();
            //PovoarTabelaPadrao(1);
            //filtros.FiltrarNome(String.valueOf(Fase.getSelectedItem()), TabelaPesquisa, 1);

        }

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pesquisarAnimal = null;
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        selecionar();
    }//GEN-LAST:event_SelecionarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
            String cod = String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0));
//            funcao_Relatorios.relatoriosReproducao("relatorioAnimalIndividual", cod);
        }// TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed

    public void selecionar() throws HeadlessException {
        /* if (ListAnimal.isEmpty()) {
         JOptionPane.showMessageDialog(null, "A lista está vazia!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
         } else {
         if (CadastroAnimal.getInstancia().isVisible()) {
         JOptionPane.showMessageDialog(null, "Painel de Cadastro já está aberto!\nFeixe o painel de Cadastro e tente de novmente!");
         } else {
         if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
         int tipoDeEntrada = 0;
         for (Ent_HistoricoAnimal ListAnimal1 : ListAnimal) {
         if (String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0)).equals(String.valueOf(ListAnimal1.getCod_instituicao()))) {
         Ent_HistoricoAnimal ent_HistoricoAnimal = ListAnimal1;
         CadastroAnimal animal = CadastroAnimal.getInstancia();
         GerenciadorDeJanelas.getInstancia().openInternalFrame(animal);
         animal.setVisible(true);
         if (ModoDeEntrada.getSelectedItem().equals("LEILÃO")) {
         tipoDeEntrada = 1;
         animal.setAnimal(ent_HistoricoAnimal, tipoDeEntrada, null);
         } else if (ModoDeEntrada.getSelectedItem().toString().equals("NASCIMENTO")) {
         tipoDeEntrada = 2;
         Ent_HistoricoReproducao historicoAnimal = funcoes_Animal.retornaTudoAnimal(ent_HistoricoAnimal.getCod_origem());
         animal.setAnimal(ent_HistoricoAnimal, tipoDeEntrada, historicoAnimal);
         } else if (ModoDeEntrada.getSelectedItem().equals("DOAÇÃO")) {
         tipoDeEntrada = 3;
         animal.setAnimal(ent_HistoricoAnimal, tipoDeEntrada, null);
         }
         animal.setPosicao();
         pesquisarAnimal = null;
         this.dispose();
         }
         }
        
         } else {
         JOptionPane.showMessageDialog(null, "Selecione um Indice!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
         }
         }
         }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Classificacao;
    private javax.swing.JComboBox Fase;
    private javax.swing.JButton Imprimir;
    private javax.swing.JComboBox ModoDeEntrada;
    private javax.swing.JRadioButton RNome;
    private javax.swing.JRadioButton RResgistro;
    private javax.swing.JButton Selecionar;
    private javax.swing.ButtonGroup grupoPesquisa;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaPesquisa;
    // End of variables declaration//GEN-END:variables
}
