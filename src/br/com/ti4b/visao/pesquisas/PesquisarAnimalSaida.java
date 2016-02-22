/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.modelo.Saida;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.cadastros.CadastroSaida;
import br.com.ti4b.dao.RelatoriosDAO;
import br.com.ti4b.dao.SaidaDAO;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Otavio Costa
 */
public final class PesquisarAnimalSaida extends javax.swing.JInternalFrame {

    RelatoriosDAO funcao_Relatorios = new RelatoriosDAO();
    ClassificacaoAnimal ca = new ClassificacaoAnimal();
    SaidaDAO funcoes_Saida = new SaidaDAO();
    List<Saida> listSaida = new ArrayList<>();
    CadastroSaida cadastroSaida;
    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    //MenuPrincipal m;
    private static PesquisarAnimalSaida pesquisarAnimalSaida;

    public static PesquisarAnimalSaida getInstancia() {
        if (pesquisarAnimalSaida == null) {
            pesquisarAnimalSaida = new PesquisarAnimalSaida();
        }
        return pesquisarAnimalSaida;
    }

    public PesquisarAnimalSaida() {
        initComponents();
    }

    public PesquisarAnimalSaida(MenuPrincipal m) {
        initComponents();
        ca.listarClacificacao(Classiificacao);
        RLeilao.setSelected(true);
        povoaTabela();
    }

    public PesquisarAnimalSaida(CadastroSaida cadastroSaida, MenuPrincipal m) {
        initComponents();
        FiltrosDeTabelas filtros = new FiltrosDeTabelas();
        ca.listarClacificacao(Classiificacao);
        RLeilao.setSelected(true);
        this.cadastroSaida = cadastroSaida;
        povoaTabela();
    }

    public void povoaTabela() {
        filtros.Ordenartabela(tabelaPesquisa);
        filtros.removerLinhasTabela(tabelaPesquisa);
        DefaultTableModel modelo = (DefaultTableModel) tabelaPesquisa.getModel();
        if (RLeilao.isSelected()) {
            listSaida = funcoes_Saida.listaSaidas(modelo, 1, String.valueOf(Classiificacao.getSelectedItem()));
        } else if (RMorte.isSelected()) {
            listSaida = funcoes_Saida.listaSaidas(modelo, 2, String.valueOf(Classiificacao.getSelectedItem()));
        }

    }

    public void seleciona() {
        /*  if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
        for (Saida listSaida1 : listSaida) {
        if (true) {
        Saida saida = listSaida1;
        if (cadastroSaida != null) {
        cadastroSaida.setSaida(saida);
        } else if (cadastroSaida == null) {
        CadastroSaida cadastroSaidas = new CadastroSaida(m);
        MenuPrincipal.jDesktopPane1.add(cadastroSaidas);
        cadastroSaidas.setVisible(true);
        cadastroSaidas.setSaida(saida);
        cadastroSaidas.setPosicao();
        
        }
        pesquisarAnimalSaida = null;
        this.dispose();
        } else {
        }
        }
        } else {
        JOptionPane.showMessageDialog(null, "Selecione um Animal!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();
        textoPesquisar = new javax.swing.JTextField();
        Classiificacao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RMorte = new javax.swing.JRadioButton();
        RLeilao = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Selecionar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();

        setTitle("SELECIONA SAÍDA");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel3.setForeground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabelaPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaPesquisa.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Registro", "Animal", "Raça", "Descrição", "Data Saída", "Destino", "Informações"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        textoPesquisar.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        textoPesquisar.setForeground(new java.awt.Color(0, 153, 0));
        textoPesquisar.setToolTipText("Pesquisar");
        textoPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        textoPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoPesquisarKeyReleased(evt);
            }
        });

        Classiificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassiificacaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Categoria:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Saída"));

        RMorte.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RMorte);
        RMorte.setForeground(new java.awt.Color(0, 153, 0));
        RMorte.setText("MORTE");
        RMorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RMorteActionPerformed(evt);
            }
        });

        RLeilao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RLeilao);
        RLeilao.setForeground(new java.awt.Color(0, 153, 0));
        RLeilao.setText("LEILÃO/DOAÇÃO");
        RLeilao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RLeilaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RLeilao)
                .addGap(18, 18, 18)
                .addComponent(RMorte, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RMorte, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {RLeilao, RMorte});

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Nome:");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Selecione o Animal");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoPesquisar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Classiificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Classiificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Selecionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8)
                    .addComponent(Selecionar)
                    .addComponent(Imprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPesquisaMouseClicked
        if (evt.getClickCount() == 2) {
            seleciona();
        }

    }//GEN-LAST:event_tabelaPesquisaMouseClicked

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        seleciona();
    }//GEN-LAST:event_SelecionarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pesquisarAnimalSaida = null;
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void textoPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoPesquisarKeyReleased
        textoPesquisar.setText(textoPesquisar.getText().toUpperCase());
        if (textoPesquisar.getText().length() > 0) {
            filtros.FiltrarNome(textoPesquisar.getText(), tabelaPesquisa, 2);
        } else {
            filtros.removerLinhasTabela(tabelaPesquisa);
            povoaTabela();
        }
    }//GEN-LAST:event_textoPesquisarKeyReleased

    private void RLeilaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RLeilaoActionPerformed
        povoaTabela();// TODO add your handling code here:
    }//GEN-LAST:event_RLeilaoActionPerformed

    private void RMorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RMorteActionPerformed
        povoaTabela();        // TODO add your handling code here:
    }//GEN-LAST:event_RMorteActionPerformed

    private void ClassiificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassiificacaoActionPerformed
        povoaTabela();
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassiificacaoActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        if (tabelaPesquisa.isRowSelected(tabelaPesquisa.getSelectedRow())) {
            String cod = String.valueOf(tabelaPesquisa.getValueAt(tabelaPesquisa.getSelectedRow(), 0));
            if (RLeilao.isSelected()) {
                funcao_Relatorios.relatoriosReproducao("relatorioSaidaIndividualLeilao", cod);
            } else if (RMorte.isSelected()) {
                funcao_Relatorios.relatoriosReproducao("relatorioSaidaIndividualMorte", cod);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Classiificacao;
    private javax.swing.JButton Imprimir;
    private javax.swing.JRadioButton RLeilao;
    private javax.swing.JRadioButton RMorte;
    private javax.swing.JButton Selecionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPesquisa;
    private javax.swing.JTextField textoPesquisar;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
}
