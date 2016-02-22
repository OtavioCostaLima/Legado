/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.modelo.Alimento;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.cadastros.CadastroAlimentos;
import br.com.ti4b.visao.cadastros.CadastroConsumo;
import br.com.ti4b.dao.AlimentoDAO;
import br.com.ti4b.dao.RelatoriosDAO;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GC
 */
public final class SelecionaAlimentos extends javax.swing.JInternalFrame {

    RelatoriosDAO funcao_Relatorios = new RelatoriosDAO();
    List<Alimento> ListAlimentos = new ArrayList<>();
    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    MenuPrincipal m;
    CadastroAlimentos alimentos;
    CadastroConsumo consumo;

    public SelecionaAlimentos() {
        initComponents();
        povoaTabela();
    }

    public SelecionaAlimentos(MenuPrincipal m) {
        initComponents();
        this.m = m;
        povoaTabela();
    }

    public SelecionaAlimentos(CadastroAlimentos alimentos, MenuPrincipal m) {
        initComponents();
        this.m = m;
        povoaTabela();
        this.alimentos = alimentos;
    }

    public SelecionaAlimentos(CadastroConsumo consumo, MenuPrincipal m) {
        initComponents();
        this.m = m;
        povoaTabela();
        this.consumo = consumo;
    }

    public void povoaTabela() {
        tabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(250);
        tabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(80);
        tabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(80);
        AlimentoDAO fa = new AlimentoDAO();
        DefaultTableModel dtm = (DefaultTableModel) tabelaPesquisa.getModel();
        dtm.setNumRows(0);
        if (comboTipo.getSelectedIndex() == 0) {
            ListAlimentos = fa.pesquisarAlimento(dtm, 1);
        }
        if (comboTipo.getSelectedIndex() == 1) {
            ListAlimentos = fa.pesquisarAlimento(dtm, 2);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pesquisar = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Selecionar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ScrollPane.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaPesquisa.setAutoCreateRowSorter(true);
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descricao", "Data", "quantidade", "Preço unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("SELECIONE O ALIMENTO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel8.setText("Nome:");

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
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        comboTipo.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Concentrado", "Volumoso" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        jLabel2.setText("Tipo:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Selecionar)
                    .addComponent(jButton8)
                    .addComponent(Imprimir))
                .addGap(10, 10, 10))
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
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        if (pesquisar.getText().length() > 0) {
            pesquisar.setText(pesquisar.getText().toUpperCase());
            filtros.FiltrarNome(pesquisar.getText(), tabelaPesquisa, 1);
        } else {
            filtros.removerLinhasTabela(tabelaPesquisa);
            povoaTabela();
            //PovoaTabela();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarKeyReleased

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        filtros.removerLinhasTabela(tabelaPesquisa);
        povoaTabela();        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {

            for (int i = 0; i < ListAlimentos.size(); i++) {
                if (String.valueOf(ListAlimentos.get(i).getIdAlimento()).equals(String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0)))) {
                    Alimento eal = ListAlimentos.get(i);
                    if (alimentos != null) {
                        if (comboTipo.getSelectedIndex() == 0) {
                            alimentos.setvaloresLeilao(eal, 1);
                        } else {
                            alimentos.setvaloresLeilao(eal, 2);
                        }
                    } else if (alimentos == null && consumo == null) {
                        CadastroAlimentos cadastroAlimentos = CadastroAlimentos.getInstancia();
                        MenuPrincipal.jDesktopPane1.add(cadastroAlimentos);
                        cadastroAlimentos.setVisible(true);
                        cadastroAlimentos.setPosicao();
                        if (comboTipo.getSelectedIndex() == 0) {
                            cadastroAlimentos.setvaloresLeilao(eal, 1);
                        } else {
                            cadastroAlimentos.setvaloresLeilao(eal, 2);
                        }

                    } else if (consumo != null) {
                        if (comboTipo.getSelectedIndex() == 0) {
                            consumo.setAlimento(eal, 1);
                        }

                        if (comboTipo.getSelectedIndex() == 1) {
                            consumo.setAlimento(eal, 2);
                        }

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

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
            String cod = String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0));

            if (comboTipo.getSelectedIndex() == 0) {
                funcao_Relatorios.relatoriosReproducao("relatorioAlimentoslIndividualConcentrado", cod);
            } else if (comboTipo.getSelectedIndex() == 1) {
                funcao_Relatorios.relatoriosReproducao("relatorioAlimentoslIndividualVolumoso", cod);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton Selecionar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField pesquisar;
    private javax.swing.JTable tabelaPesquisa;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

}
