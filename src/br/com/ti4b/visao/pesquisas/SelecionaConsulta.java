/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Consulta;
import br.com.ti4b.modelo.Doencas;
import br.com.ti4b.modelo.FornecedorAlimento;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.cadastros.CadastroConsultas;
import br.com.ti4b.visao.cadastros.CadastroDiagnostico;
import br.com.ti4b.dao.RelatoriosDAO;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GC
 */
public class SelecionaConsulta extends javax.swing.JInternalFrame {

    RelatoriosDAO funcao_Relatorios = new RelatoriosDAO();
    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    MenuPrincipal m;
    ConectaBanco conecta = new ConectaBanco();
    List<Consulta> listCons = new ArrayList<>();
    CadastroDiagnostico cadastroDiagnostico;
    CadastroConsultas cadastroConsulta;

    public void listarConsultas() {

        try {
            String sql = "select co.cod_consulta,a.cod_animal,a.nome as animal,co.cod_animal,co.informacao,co.crmv,co.data_consulta,co.tipo_exame_encam,v.nome from consulta co join animal a using(cod_animal)join veterinario v using(crmv)";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisa.getModel();
            tabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabelaPesquisa.getColumnModel().getColumn(5).setPreferredWidth(80);

            modelo.setNumRows(0);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                Consulta ent_Consulta = new Consulta();
                modelo.addRow(new Object[]{RS.getObject("cod_consulta"), RS.getObject("animal"), RS.getString("nome"), RS.getString("data_consulta"), RS.getString("tipo_exame_encam"), RS.getString("informacao")});
                ent_Consulta.setCod_consulta(RS.getInt("cod_consulta"));
                ent_Consulta.setNome_animal(RS.getString("animal"));
                ent_Consulta.setCrmv(RS.getString("crmv"));
                ent_Consulta.setCod_animal(RS.getInt("cod_animal"));
                ent_Consulta.setNome_veterinario(RS.getString("nome"));
                ent_Consulta.setData_consulta(RS.getDate("data_consulta"));
                ent_Consulta.setTipo_exame_encam(RS.getString("tipo_exame_encam"));
                ent_Consulta.setInformacao(RS.getString("informacao"));

                listCons.add(ent_Consulta);
            }
            conecta.desconecta();  // fecha conexão com BD
        } catch (SQLException e) { //trata os erros SQL
            JOptionPane.showMessageDialog(this, "Erro Comando SQL " + e.getMessage());
        }
    }

    public SelecionaConsulta() {
        initComponents();
        listarConsultas();
    }

    public SelecionaConsulta(CadastroDiagnostico cadastroDiagnostico, MenuPrincipal m) {
        this.m = m;
        initComponents();
        this.cadastroDiagnostico = cadastroDiagnostico;
        listarConsultas();
    }

    public SelecionaConsulta(CadastroConsultas cadastroConsultas, MenuPrincipal m) {
        this.m = m;
        initComponents();
        this.cadastroConsulta = cadastroConsultas;
        listarConsultas();
    }

    public SelecionaConsulta(MenuPrincipal m) {
        initComponents();
        this.m = m;
        listarConsultas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pesquisar = new javax.swing.JTextField();
        Selecionar1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ScrollPane.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaPesquisa.setAutoCreateRowSorter(true);
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Animal", "Veterinario", "Data da consulta", "Tipo de exame", "Informacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPesquisa.setAlignmentX(0.1F);
        tabelaPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaPesquisa.setSelectionBackground(new java.awt.Color(0, 153, 0));
        tabelaPesquisa.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(tabelaPesquisa);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("SELECIONE CONSULTA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel8.setText("Animal:");

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Selecionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Selecionar piqueno.png"))); // NOI18N
        Selecionar1.setBorder(null);
        Selecionar1.setBorderPainted(false);
        Selecionar1.setContentAreaFilled(false);
        Selecionar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Selecionar1.setFocusable(false);
        Selecionar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Selecionar Grande3.png"))); // NOI18N
        Selecionar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Selecionar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Selecionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selecionar1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Selecionar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selecionar1)
                    .addComponent(jButton8)
                    .addComponent(Imprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        pesquisar.setText(pesquisar.getText().toUpperCase());
        if (pesquisar.getText().length() > 0) {
            filtros.FiltrarNome(pesquisar.getText(), tabelaPesquisa, 1);
        } else {
            filtros.removerLinhasTabela(tabelaPesquisa);
            listarConsultas();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarKeyReleased

    private void Selecionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selecionar1ActionPerformed
        if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {

            for (int i = 0; i < listCons.size(); i++) {
                if (String.valueOf(listCons.get(i).getCod_consulta()).equals(String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0)))) {
                    Consulta ec = listCons.get(i);
                    if (cadastroDiagnostico != null) {
                        cadastroDiagnostico.setConsulta(ec);
                    } else if (cadastroConsulta != null) {
                        cadastroConsulta.setConsulta(ec);
                    } else if (cadastroConsulta == null && cadastroDiagnostico == null) {
                        CadastroConsultas cadastroConsulta1 = new CadastroConsultas(m);
                        MenuPrincipal.jDesktopPane1.add(cadastroConsulta1);
                        cadastroConsulta1.setVisible(true);
                        cadastroConsulta1.setConsulta(ec);
                        cadastroConsulta1.setPosicao();
                    }
                }
            }
            m.fecharFrames(this);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Item da tabela!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Selecionar1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        m.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
   if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
        String cod = String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0));
        funcao_Relatorios.relatoriosReproducao("relatorioConsultasIndividual", cod);       
   }// TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton Selecionar1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTable tabelaPesquisa;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }
}
