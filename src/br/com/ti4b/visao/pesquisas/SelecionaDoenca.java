/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Alimento;
import br.com.ti4b.modelo.Consulta;
import br.com.ti4b.modelo.Doencas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.cadastros.CadastroAlimentos;
import br.com.ti4b.visao.cadastros.CadastroDiagnostico;
import br.com.ti4b.visao.cadastros.CadastroDoencas;
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
public final class SelecionaDoenca extends javax.swing.JInternalFrame {

    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    MenuPrincipal m;
    ConectaBanco conecta = new ConectaBanco();
    List<Doencas> listDoenca = new ArrayList<>();
    CadastroDiagnostico cadastroDiagnostico;
    CadastroDoencas cadastroDoencas;

    public void listarDoenca() {

        try {
            String sql = "select * from doenca";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisa.getModel();
            tabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(250);

            modelo.setNumRows(0);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                Doencas ent_Doenca = new Doencas();
                modelo.addRow(new Object[]{RS.getString("cod_doenca"), RS.getString("descricao")});
                ent_Doenca.setCod_doenca(RS.getInt("cod_doenca"));
                ent_Doenca.setDescricao(RS.getString("descricao"));

                listDoenca.add(ent_Doenca);
            }
            conecta.desconecta();  // fecha conexão com BD
        } catch (SQLException e) { //trata os erros SQL
            JOptionPane.showMessageDialog(this, "Erro Comando SQL " + e.getMessage());
        }
    }

    public SelecionaDoenca() {
        initComponents();
        listarDoenca();
    }

    public SelecionaDoenca(CadastroDoencas CadastroDoencas, MenuPrincipal m) {
        initComponents();
        this.m = m;
        this.cadastroDoencas = CadastroDoencas;
        listarDoenca();
    }

    public SelecionaDoenca(CadastroDiagnostico cadastroDiagnostico, MenuPrincipal m) {
        initComponents();
        this.m = m;
        this.cadastroDiagnostico = cadastroDiagnostico;
        listarDoenca();
    }

    public SelecionaDoenca(MenuPrincipal m) {
        initComponents();
        this.m = m;
        listarDoenca();
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
        Selecionar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ScrollPane.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaPesquisa.setAutoCreateRowSorter(true);
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Doenca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
        jLabel1.setText("SELECIONE DOENÇA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel8.setText("Doença:");

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
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Selecionar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8)))
                            .addGap(10, 10, 10)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Selecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
            listarDoenca();
        }   
    }//GEN-LAST:event_pesquisarKeyReleased

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
          if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {

            for (int i = 0; i < listDoenca.size(); i++) {
                if (String.valueOf(listDoenca.get(i).getCod_doenca()).equals(String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0)))) {
                    Doencas ent_Doencas = listDoenca.get(i);
                    if (cadastroDoencas != null) {
                        cadastroDoencas.setDoencas(ent_Doencas);
                    } else if (cadastroDoencas == null && cadastroDiagnostico == null) {
                        CadastroDoencas cadastroDoencas = new CadastroDoencas(m);
                        MenuPrincipal.jDesktopPane1.add(cadastroDoencas);
                        cadastroDoencas.setVisible(true);
                        cadastroDoencas.setDoencas(ent_Doencas);
                        cadastroDoencas.setPosicao();
                    } else if (cadastroDiagnostico != null) {
                        cadastroDiagnostico.setDoenca(ent_Doencas); 
                    }
                }
            }
            m.fecharFrames(this);
         this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Item da tabela!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_SelecionarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        m.fecharFrames(this);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton Selecionar;
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
