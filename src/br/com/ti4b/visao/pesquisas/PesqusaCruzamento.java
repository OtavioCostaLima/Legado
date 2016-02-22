package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.dao.CruzamentoDAO;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.dao.RelatoriosDAO;
import java.awt.Color;
import java.awt.Component;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Otavio Costa
 */
public final class PesqusaCruzamento extends javax.swing.JInternalFrame {

    FiltrosDeTabelas filtros = new FiltrosDeTabelas();
    Calendar calendario = Calendar.getInstance();
    ConverterDatas cd = new ConverterDatas();

    private static PesqusaCruzamento pesqusaCruzamento;

    public static PesqusaCruzamento getInstancia() {
        if (pesqusaCruzamento == null) {
            pesqusaCruzamento = new PesqusaCruzamento();
        }
        return pesqusaCruzamento;
    }

    /**
     * Creates new form Usuario
     */
    public PesqusaCruzamento() {
        initComponents();
    }

    /**
     * Creates new form Pes_Ens_Artificial
     *
     * @param date
     * @return
     *
     */
    public String alertaCruzamento(Date date) {
        calendario.setTime(date);
        calendario.add(Calendar.DATE, 40);
        java.util.Date n = calendario.getTime();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String dataDeNIver = formato.format(n);
        return dataDeNIver;
    }

    public void pintarTabela() {

        TabelaPesquisa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                Calendar c = Calendar.getInstance();
                String dateAtual = cd.converterString(c.getTime());
                String dataCruza = String.valueOf(TabelaPesquisa.getValueAt(row, 7));
                String status = String.valueOf(TabelaPesquisa.getValueAt(row, 8));
                Date dt = Date.valueOf(dataCruza);
                setForeground(Color.BLACK);
                if (alertaCruzamento(dt).equals(dateAtual) && status.equals("Observação")) {
                    setForeground(Color.WHITE);
                    setBackground(Color.red);
                } else {
                    setBackground(Color.WHITE);
                }
                return this;
            }
        });

    }

    public PesqusaCruzamento(MenuPrincipal m) {
        initComponents();
        PovoarTabelaPadrao();
    }

    public void PovoarTabelaPadrao() {
        filtros.Ordenartabela(TabelaPesquisa);
        TabelaPesquisa.getColumnModel().getColumn(0).setPreferredWidth(40);
        TabelaPesquisa.getColumnModel().getColumn(1).setPreferredWidth(70);
        TabelaPesquisa.getColumnModel().getColumn(2).setPreferredWidth(250);
        TabelaPesquisa.getColumnModel().getColumn(3).setPreferredWidth(250);
        TabelaPesquisa.getColumnModel().getColumn(4).setPreferredWidth(250);
        TabelaPesquisa.getColumnModel().getColumn(5).setPreferredWidth(70);
        TabelaPesquisa.getColumnModel().getColumn(6).setPreferredWidth(70);
        TabelaPesquisa.getColumnModel().getColumn(7).setPreferredWidth(70);
        TabelaPesquisa.getColumnModel().getColumn(8).setPreferredWidth(80);
        TabelaPesquisa.getColumnModel().getColumn(9).setPreferredWidth(70);
        CruzamentoDAO Cruz = new CruzamentoDAO();
        DefaultTableModel dtm = (DefaultTableModel) TabelaPesquisa.getModel();
        dtm.setNumRows(0);
        pintarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPesquisa = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cruzamento = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NomeVet = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        Selecionar = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TabelaPesquisa.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        TabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Registro", "Matriz", "Reprodutor", "Veterinário", "Tipo", "Tentativa", "Data Cruzamento", "Status", "Data Fecundação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TabelaPesquisa);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel6.setText("Tipo de Cruzamento:");

        cruzamento.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        cruzamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Natural", "Artificial" }));
        cruzamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cruzamentoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("PESQUISAR CRUZAMENTO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        NomeVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeVetActionPerformed(evt);
            }
        });
        NomeVet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeVetKeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel16.setText("Veterinário:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(NomeVet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
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

        jLabel1.setText("Situação:");

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Pequeno.png"))); // NOI18N
        Sair.setBorder(null);
        Sair.setBorderPainted(false);
        Sair.setContentAreaFilled(false);
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Sair.setFocusable(false);
        Sair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        Sair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Sair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

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
                .addGap(6, 6, 6)
                .addComponent(Selecionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sair)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(cruzamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cruzamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Selecionar)
                    .addComponent(Sair)
                    .addComponent(Imprimir))
                .addGap(27, 27, 27))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cruzamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cruzamentoActionPerformed

        if ((cruzamento.getSelectedItem()).equals("Artificial")) {

        }
        if ((cruzamento.getSelectedItem()).equals("Natural")) {
            filtros.FiltrarNome("Natural", TabelaPesquisa, 5);

        }
        if (cruzamento.getSelectedItem().equals("Todos")) {
            filtros.removerLinhasTabela(TabelaPesquisa);
            PovoarTabelaPadrao();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cruzamentoActionPerformed

    private void NomeVetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeVetKeyReleased
        NomeVet.setText(NomeVet.getText().toUpperCase());
        if (NomeVet.getText().trim().length() > 0) {
            filtros.FiltrarNome(NomeVet.getText().trim(), TabelaPesquisa, 1);
        } else {
            filtros.removerLinhasTabela(TabelaPesquisa);
            PovoarTabelaPadrao();
        }// TODO add your handling code here:
    }//GEN-LAST:event_NomeVetKeyReleased

    private void NomeVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeVetActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        pesqusaCruzamento = null;
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        /*  if (!List.isEmpty()) {
         if (TabelaPesquisa.isRowSelected(TabelaPesquisa.getSelectedRow())) {
        
         for (int i = 0; i < List.size(); i++) {
         if (String.valueOf(List.get(i).getIdCruzamento()).equals(String.valueOf(TabelaPesquisa.getValueAt(TabelaPesquisa.getSelectedRow(), 0)))) {
        
         }
         }
        
         pesqusaCruzamento = null;
         this.dispose();
        
         } else {
         JOptionPane.showMessageDialog(null, "Selecione um Indice!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
         }
         } else {
         JOptionPane.showMessageDialog(null, "A tabela está vázia!", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
         }*/
    }//GEN-LAST:event_SelecionarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        RelatoriosDAO funcoes_Relatorios = new RelatoriosDAO();
        if (TabelaPesquisa.isRowSelected(TabelaPesquisa.getSelectedRow())) {
            String cod = String.valueOf(TabelaPesquisa.getValueAt(TabelaPesquisa.getSelectedRow(), 0));
            funcoes_Relatorios.relatoriosReproducao("relatorioCruzamentoIndividual", cod);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JTextField NomeVet;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Selecionar;
    private javax.swing.JTable TabelaPesquisa;
    private javax.swing.JComboBox cruzamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    /*    public Cruzamento getCruzamento() {
     return cruzamentos;
     }*/
}
