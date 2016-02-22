/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.pesquisas;

import br.com.ti4b.util.FiltrosDeTabelas;
import br.com.ti4b.util.ConectaBanco;
import br.com.ti4b.modelo.Veterinario;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.cadastros.CadastroConsultas;
import br.com.ti4b.visao.cadastros.CadastroCruzamento;
import br.com.ti4b.visao.cadastros.CadastroVeterinarios;
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
 * @author Otavio Costa
 */
public final class Seleciona_Veterinario extends javax.swing.JInternalFrame {
    RelatoriosDAO funcao_Relatorios = new RelatoriosDAO();
    MenuPrincipal m;
    List<br.com.ti4b.modelo.Veterinario> ListVet = new ArrayList<>();
    CadastroCruzamento cadastroCruzamento;
    CadastroVeterinarios cadastroVeterinarios;
    CadastroConsultas cadastroConsultas;
    FiltrosDeTabelas filtros = new FiltrosDeTabelas();

    public Seleciona_Veterinario(MenuPrincipal m) {
        initComponents();
        this.m = m;
        povoaTabela();
    }

    public Seleciona_Veterinario(CadastroVeterinarios cadastroVeterinarios, MenuPrincipal m) {
        this.cadastroVeterinarios = cadastroVeterinarios;
        initComponents();
        this.m = m;
        povoaTabela();
        filtros.Ordenartabela(Tabela_vet);

    }

    public Seleciona_Veterinario(CadastroCruzamento cadastroCruzamento, MenuPrincipal m) {
        this.cadastroCruzamento = cadastroCruzamento;
        initComponents();
        this.m = m;
        povoaTabela();
        filtros.Ordenartabela(Tabela_vet);

    }

    public Seleciona_Veterinario(CadastroConsultas cadastroConsultas, MenuPrincipal m) {
        this.cadastroConsultas = cadastroConsultas;
        initComponents();
        this.m = m;
        povoaTabela();
        filtros.Ordenartabela(Tabela_vet);

    }

    public void povoaTabela() {
        Tabela_vet.getColumnModel().getColumn(0).setPreferredWidth(100);
        Tabela_vet.getColumnModel().getColumn(1).setPreferredWidth(200);
        Tabela_vet.getColumnModel().getColumn(2).setPreferredWidth(200);
        Tabela_vet.getColumnModel().getColumn(3).setPreferredWidth(100);
        Tabela_vet.getColumnModel().getColumn(4).setPreferredWidth(100);
        Tabela_vet.getColumnModel().getColumn(5).setPreferredWidth(10);
        Tabela_vet.getColumnModel().getColumn(6).setPreferredWidth(200);
        Tabela_vet.getColumnModel().getColumn(7).setPreferredWidth(100);
        Tabela_vet.getColumnModel().getColumn(8).setPreferredWidth(100);
        Tabela_vet.getColumnModel().getColumn(9).setPreferredWidth(100);
        Tabela_vet.getColumnModel().getColumn(10).setPreferredWidth(100);
        ConectaBanco conecta = new ConectaBanco();
        try {
            String sql = "Select * from veterinario";
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            DefaultTableModel modelo = (DefaultTableModel) Tabela_vet.getModel();
            modelo.setNumRows(0);
            ResultSet RS = pst.executeQuery();
            while (RS.next()) {
                br.com.ti4b.modelo.Veterinario vet = new Veterinario();
                vet.setCod_veterinario(RS.getInt("cod_veterinario"));
                vet.setCrmv(RS.getString("crmv"));
                vet.setCpf(RS.getString("cpf"));
                vet.setNome(RS.getString("nome"));
                vet.setEndereco(RS.getString("endereco"));
                vet.setCidade(RS.getString("cidade"));
                vet.setBairro(RS.getString("bairro"));
                vet.setNumero(RS.getInt("numero"));
                vet.setUf(RS.getString("uf"));
                vet.setEmail(RS.getString("email"));
                vet.setFone1(RS.getString("fone1"));
                vet.setFone2(RS.getString("fone2"));
                vet.setEspecialidade(RS.getString("especialidade"));
                vet.setTipo_de_contrato(RS.getString("tipo_contrato"));
                ListVet.add(vet);
                modelo.addRow(new Object[]{RS.getString("crmv"), RS.getString("nome"), RS.getString("cpf"), RS.getString("endereco"),
                    RS.getString("cidade"), RS.getString("uf"), RS.getString("email"), RS.getString("fone1"),
                    RS.getString("fone2"), RS.getString("tipo_contrato"), RS.getString("especialidade")});
            }

            conecta.desconecta();  // fecha conexão com BD

        } catch (SQLException e) { //trata os erros SQL
            JOptionPane.showMessageDialog(this, "Erro Comando SQL " + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_vet = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        pesquisar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Selecionar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel3.setForeground(new java.awt.Color(0, 153, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("SELECIONE O VETERINÁRIO");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Tabela_vet.setAutoCreateRowSorter(true);
        Tabela_vet.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Tabela_vet.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        Tabela_vet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CRMV", "Veterinário", "cpf", "endereco", "cidade", "uf", "email", "fone1", "fone2", "tipo_contrato", "especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela_vet.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tabela_vet.setAutoscrolls(false);
        Tabela_vet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabela_vet.setGridColor(new java.awt.Color(0, 0, 0));
        Tabela_vet.setSelectionBackground(new java.awt.Color(0, 153, 0));
        Tabela_vet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_vetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_vet);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar:"));

        pesquisar.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
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

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        jLabel2.setText("Veterinário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Selecionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Imprimir)
                                .addGap(545, 545, 545)
                                .addComponent(jButton8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selecionar))
                    .addComponent(Imprimir))
                .addGap(740, 740, 740))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela_vetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_vetMouseClicked
        if (evt.getClickCount() == 2) {
            selecionar();
        }

    }//GEN-LAST:event_Tabela_vetMouseClicked

    private void pesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisarKeyReleased
        if (pesquisar.getText().length() > 0) {
            pesquisar.setText(pesquisar.getText().toUpperCase());
            filtros.FiltrarNome(pesquisar.getText(), Tabela_vet, 1);
        } else {
            filtros.removerLinhasTabela(Tabela_vet);
            povoaTabela();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarKeyReleased

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        selecionar();
    }//GEN-LAST:event_SelecionarActionPerformed

    public void selecionar() {
        for (int i = 0; i < ListVet.size(); i++) {
             if (String.valueOf(Tabela_vet.getValueAt(Tabela_vet.getSelectedRow(), 0)).equals(String.valueOf(ListVet.get(i).getCrmv()))) {
                Veterinario ent_Veterinario = ListVet.get(i);
                if (cadastroCruzamento != null) {
                    cadastroCruzamento.setVeterinario(ent_Veterinario);
                } else if (cadastroVeterinarios != null) {
                    cadastroVeterinarios.setVeterinario(ent_Veterinario);
                } else if (cadastroConsultas != null) {
                    cadastroConsultas.setVeterinario(ent_Veterinario);
                } else if (cadastroCruzamento == null && cadastroConsultas == null && cadastroVeterinarios == null) {
                    CadastroVeterinarios cadastroVeterinario = new CadastroVeterinarios(m);
                    MenuPrincipal.jDesktopPane1.add(cadastroVeterinario);
                    cadastroVeterinario.setVisible(true);
                    cadastroVeterinario.setPosicao();
                    cadastroVeterinario.setVeterinario(ent_Veterinario);
                }
            }

        }
        m.fecharFrames(this);
        this.dispose();
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        m.fecharFrames(this);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
   if (Tabela_vet.isRowSelected(Tabela_vet.getSelectedRow())) {
        String cod = String.valueOf(Tabela_vet.getValueAt(Tabela_vet.getSelectedRow(), 0));
        funcao_Relatorios.relatoriosReproducao("relatorioVeterinarioIndividual", cod);    
   }// TODO add your handling code here:
    }//GEN-LAST:event_ImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Selecionar;
    private javax.swing.JTable Tabela_vet;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pesquisar;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

}
