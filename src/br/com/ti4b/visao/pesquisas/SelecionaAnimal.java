/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.ClassificacaoAnimal;
import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Animal;
import br.com.ti4b.visao.cadastros.CadastroCampanhaVacinas;
import br.com.ti4b.visao.cadastros.CadastroConsultas;
import br.com.ti4b.visao.cadastros.CadastroCruzamento;
import br.com.ti4b.visao.cadastros.CadastroSaida;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Otavio Costa
 */
public final class SelecionaAnimal extends javax.swing.JInternalFrame {

    int codAnimal = 0;
    int todos = 1;
    String categoria;
    ClassificacaoAnimal classificacaoAnimal = new ClassificacaoAnimal();
    FiltrosDeTabelas fitros = new FiltrosDeTabelas();
    ConectaBanco conecta = new ConectaBanco();
    List<Animal> listaClac = new ArrayList<>();
    String sexo = null;
    CadastroCruzamento cadastroCruzamento;
    CadastroSaida cadastroSaida;
    CadastroConsultas cadastroConsultas;
    CadastroCampanhaVacinas cadastroCampanhaVacinas;

    public SelecionaAnimal(CadastroCruzamento cc, String sexo) {
        initComponents();
        this.cadastroCruzamento = cc;
        this.sexo = sexo;
        classificacaoAnimal.listarClacificacao(Classificacao);

    }

    public SelecionaAnimal(CadastroCruzamento cc, String sexo, String categoriaMacho) {
        initComponents();
        this.cadastroCruzamento = cc;
        this.categoria = categoriaMacho;
        this.sexo = sexo;
        classificacaoAnimal.listarClacificacao(Classificacao);
        Classificacao.setSelectedItem(categoria);
        Classificacao.setEnabled(false);

    }

    public SelecionaAnimal(int todos, CadastroSaida cs) {
        initComponents();
        this.todos = todos;
        this.cadastroSaida = cs;
        classificacaoAnimal.listarClacificacao(Classificacao);
    }

    public SelecionaAnimal(int todos, CadastroConsultas cadastroConsultas) {
        initComponents();
        this.todos = todos;
        this.cadastroConsultas = cadastroConsultas;
        classificacaoAnimal.listarClacificacao(Classificacao);
    }

    public SelecionaAnimal(int todos, CadastroCampanhaVacinas cadastroCampanhaVacinas) {
        initComponents();
        this.todos = todos;
        this.cadastroCampanhaVacinas = cadastroCampanhaVacinas;
        classificacaoAnimal.listarClacificacao(Classificacao);
    }

    public void listarAnimais(String classificacao) {
        fitros.Ordenartabela(TabelaPesquisa);
        ConectaBanco conecta = new ConectaBanco();
        listaClac.clear();
        String sql = null;
        try {
            if (todos == 0) {
                sql = "select a.cod_animal,a.cod_instituicao,a.nome,a.raca,a.idade,f.descricao as sub_categoria,c.descricao as categoria from animal a "
                        + "join fase f on f.cod_fase=a.cod_fase "
                        + "join classificacao c on c.cod_classificacao=f.cod_clasificacao where c.descricao='" + classificacao + "' and a.cod_animal not in (select cod_animal from saida)";
            } else {
                if (sexo.equals("M")) {
                    sql = "select a.cod_animal,a.cod_instituicao,a.nome,a.raca,a.idade,f.descricao as sub_categoria,c.descricao as categoria from animal a "
                            + "join fase f on f.cod_fase=a.cod_fase "
                            + "join classificacao c on c.cod_classificacao=f.cod_clasificacao where c.descricao='" + classificacao + "' and a.sexo='" + sexo + "' and a.cod_animal not in (select cod_animal from saida)";
                } else if (sexo.equals("F")) {
                    sql = "select a.cod_animal,a.cod_instituicao,a.nome,a.raca,a.idade,f.descricao as sub_categoria,c.descricao as categoria from animal a\n"
                            + "left join cruzamento cu on a.cod_animal=cu.cod_animal_mae\n"
                            + "join fase f on f.cod_fase=a.cod_fase\n"
                            + "join classificacao c on c.cod_classificacao=f.cod_clasificacao where c.descricao='" + classificacao + "' and a.sexo='" + sexo + "' and cu.cod_cruzamento is null and a.cod_animal not in (select cod_animal from saida)";
                }
            }
            conecta.conexao();
            DefaultTableModel modelo = (DefaultTableModel) TabelaPesquisa.getModel();
            modelo.setNumRows(0);
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                modelo.addRow(new Object[]{RS.getObject("cod_instituicao"), RS.getObject("nome"), RS.getObject("raca"), RS.getObject("categoria"), RS.getObject("sub_categoria"),
                    RS.getObject("idade")});
                Animal C_animal = new Animal();
                C_animal.setIdAnimal(RS.getInt("cod_animal"));
                C_animal.setIdInstituicao(RS.getString("cod_instituicao"));
                C_animal.setNome(RS.getString("nome"));
                C_animal.setRaca(RS.getString("raca"));
                C_animal.setIdade(RS.getString("idade"));
                C_animal.setInformacao(RS.getString("categoria"));

                listaClac.add(C_animal);

            }
            TabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(100);
            TabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(250);
            TabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(200);
            TabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(200);
            TabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(100);
            TabelaPesquisa.getColumnModel().getColumn(5).setPreferredWidth(70);
            conecta.desconecta();  // fecha conexão com BD
        } catch (SQLException e) { //trata os erros SQL
            JOptionPane.showMessageDialog(this, "Erro Comando SQL\n" + e.getMessage(), "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Classificacao = new javax.swing.JComboBox();
        ScrollPane = new javax.swing.JScrollPane();
        TabelaPesquisa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pesquisar = new javax.swing.JTextField();
        Selecionar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setToolTipText("Seleciona Animal");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel3.setForeground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Classificacao.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        Classificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassificacaoActionPerformed(evt);
            }
        });

        ScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ScrollPane.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ScrollPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScrollPaneMouseClicked(evt);
            }
        });

        TabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Raça", "Categoria", "Sub. Categoria", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaPesquisa.setSelectionBackground(new java.awt.Color(0, 153, 0));
        TabelaPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPesquisaMouseClicked(evt);
            }
        });
        ScrollPane.setViewportView(TabelaPesquisa);

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Animal:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("SELECIONE O ANIMAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel10.setText("Registro:");

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

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selecionar)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassificacaoActionPerformed
        listarAnimais(String.valueOf(Classificacao.getSelectedItem()));
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassificacaoActionPerformed

    public void selecionaAnimal() throws HeadlessException, NumberFormatException {
        if (TabelaPesquisa.isRowSelected(TabelaPesquisa.getSelectedRow())) {
            for (int i = 0; i < listaClac.size(); i++) {
                if ((String.valueOf(TabelaPesquisa.getValueAt(TabelaPesquisa.getSelectedRow(), 0)).trim().equals(String.valueOf(listaClac.get(i).getIdInstituicao()).trim()))) {
                    Animal animal = listaClac.get(i);
                    codAnimal = Integer.parseInt(String.valueOf(listaClac.get(i).getIdAnimal()));
                    if (cadastroCruzamento != null) {
                        if (sexo.equals("F")) {
                            cadastroCruzamento.setMae(animal);
                        }
                        if (sexo.equals("M")) {
                            cadastroCruzamento.setPai(animal);
                        }
                    } else if (cadastroSaida != null) {
                        cadastroSaida.setAnimal(animal);

                    } else if (cadastroConsultas != null) {
                        cadastroConsultas.setAnimal(animal);

                    } else if (cadastroCampanhaVacinas != null) {
                        cadastroCampanhaVacinas.setAnimal(animal);
                    }
                    this.dispose();
                } else {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Animal!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        if (pesquisar.getText().length() > 0) {
            pesquisar.setText(pesquisar.getText().toUpperCase());
            fitros.FiltrarNome(pesquisar.getText(), TabelaPesquisa, 0);
        } else {
            fitros.removerLinhasTabela(TabelaPesquisa);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarKeyReleased

    private void ScrollPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneMouseClicked

    private void TabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPesquisaMouseClicked
        if (evt.getClickCount() == 2) {
            for (int i = 0; i < listaClac.size(); i++) {
                selecionaAnimal();
            }

        }        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaPesquisaMouseClicked

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        selecionaAnimal();
    }//GEN-LAST:event_SelecionarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Classificacao;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton Selecionar;
    private javax.swing.JTable TabelaPesquisa;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pesquisar;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }
}
