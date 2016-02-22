/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.cadastros;

import br.com.ti4b.util.ConverterDatas;
import br.com.ti4b.modelo.Animal;
import br.com.ti4b.modelo.Consulta;
import br.com.ti4b.modelo.Veterinario;
import br.com.ti4b.visao.telas.MenuPrincipal;
import br.com.ti4b.visao.pesquisas.SelecionaAnimal;
import br.com.ti4b.visao.pesquisas.SelecionaConsulta;
import br.com.ti4b.visao.pesquisas.Seleciona_Veterinario;
import br.com.ti4b.dao.ConsultaDAO;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GC
 */
public class CadastroConsultas extends javax.swing.JInternalFrame {

    ConverterDatas cd = new ConverterDatas();
    MenuPrincipal m;
    Animal ent_Animal = new Animal();
    Veterinario ent_Veterinario = new Veterinario();
    ConsultaDAO f_cons = new ConsultaDAO();
    Consulta ent_Consulta = new Consulta();

    public CadastroConsultas() {
        initComponents();
        prive();
    }

    public CadastroConsultas(MenuPrincipal m) {
        initComponents();
        this.m = m;
        prive();
    }

    public void upperCase(JTextField modelo) {
        modelo.setText(modelo.getText().toUpperCase());
    }

    private void trataCampos(int tipo) {
        Component components[] = painelCadastro.getComponents();
        int o = 0;
        for (int i = 0; i < components.length; i++) {
            //Comparação com campoDeTexto
            if (components[i] instanceof JTextField) {
                if (((JTextField) components[i]).getText().isEmpty()) {
                    o++;
                }
            }
        }
        if (DataConsulta.getDate() == null) {
            o++;
        }
        if (o == 0) {
            cadastrar(tipo);
        } else {
            info_error.setText("Preenxa todos os campos!");
        }
    }

    public void setAnimal(Animal animal) {
        NomeAnimal.setText(animal.getNome());
        ent_Animal = animal;
        ent_Consulta.setCod_animal(animal.getIdAnimal());
    }

    private void cadastrar(int tipo) {
        ent_Consulta.setData_consulta(cd.converter(DataConsulta));
        ent_Consulta.setTipo_exame_encam((TipoExame.getText()));
        ent_Consulta.setInformacao((Informacoes.getText()));
        f_cons.Cadastrar(ent_Consulta, tipo);
        getInfo();
    }

    public void getInfo() {
        if (ent_Consulta.getRetorno().equals("Cadastrado com sucesso!") || ent_Consulta.getRetorno().equals("Alterado com sucesso!")) {
            String rs = ent_Consulta.getRetorno();
            limpar_campos();
            info_error.setText(rs);
        }
    }

    public void setVeterinario(Veterinario ent_Veterinario) {
        nomeVeterinario.setText(ent_Veterinario.getNome());
        this.ent_Veterinario = ent_Veterinario;
        ent_Consulta.setCrmv(ent_Veterinario.getCrmv());
    }

    private void limpar_campos() {
        info_error.setText(null);
        Cadastrar.setEnabled(true);
        ent_Consulta = new Consulta();
        NomeAnimal.setText(null);
        nomeVeterinario.setText(null);
        DataConsulta.setDate(null);
        TipoExame.setText(null);
        Informacoes.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        painelCadastro = new javax.swing.JPanel();
        TipoExame = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataConsulta = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        info_error = new javax.swing.JLabel();
        NomeAnimal = new javax.swing.JTextField();
        selecionaAnimal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        nomeVeterinario = new javax.swing.JTextField();
        selecionaVeterinario = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Infiormacoes = new javax.swing.JScrollPane();
        Informacoes = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setFrameIcon(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jPanel4.setForeground(new java.awt.Color(0, 153, 0));

        jPanel5.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO CONSULTAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(11, 11, 11))
        );

        painelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        painelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TipoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoExameActionPerformed(evt);
            }
        });
        TipoExame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TipoExameKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText("Tipo Exame:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Data Consulta:");

        DataConsulta.setBackground(new java.awt.Color(255, 255, 255));
        DataConsulta.setToolTipText("Selecione a data de realização do leilão");
        DataConsulta.setDateFormatString("yyyy-MM-dd");

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Veterinario:");

        info_error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        info_error.setForeground(new java.awt.Color(255, 0, 0));
        info_error.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NomeAnimal.setEditable(false);
        NomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAnimalActionPerformed(evt);
            }
        });
        NomeAnimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NomeAnimalKeyReleased(evt);
            }
        });

        selecionaAnimal.setText("...");
        selecionaAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaAnimalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Animal:");

        nomeVeterinario.setEditable(false);
        nomeVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeVeterinarioActionPerformed(evt);
            }
        });
        nomeVeterinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeVeterinarioKeyReleased(evt);
            }
        });

        selecionaVeterinario.setText("...");
        selecionaVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionaVeterinarioActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Informações:");

        Informacoes.setColumns(20);
        Informacoes.setRows(5);
        Informacoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InformacoesKeyReleased(evt);
            }
        });
        Infiormacoes.setViewportView(Informacoes);

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

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Cadastrar Pequeno.png"))); // NOI18N
        Cadastrar.setBorder(null);
        Cadastrar.setBorderPainted(false);
        Cadastrar.setContentAreaFilled(false);
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Cadastrar.setFocusable(false);
        Cadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Cadastrar Grande.png"))); // NOI18N
        Cadastrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Cadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Pequeno.png"))); // NOI18N
        Alterar.setBorder(null);
        Alterar.setBorderPainted(false);
        Alterar.setContentAreaFilled(false);
        Alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Alterar.setFocusable(false);
        Alterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Alterar Grande.png"))); // NOI18N
        Alterar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Pequeno.png"))); // NOI18N
        Excluir.setBorder(null);
        Excluir.setBorderPainted(false);
        Excluir.setContentAreaFilled(false);
        Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Excluir.setFocusable(false);
        Excluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Excluir Grande.png"))); // NOI18N
        Excluir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomeVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(selecionaAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addComponent(selecionaVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Infiormacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(10, 10, 10))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addComponent(Cadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sair)
                        .addContainerGap())))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selecionaAnimal)
                        .addComponent(jLabel12)
                        .addComponent(info_error, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(selecionaVeterinario))
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipoExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(Infiormacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cadastrar)
                            .addComponent(Alterar)
                            .addComponent(Excluir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sair)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAnimalActionPerformed

    private void NomeAnimalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomeAnimalKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_NomeAnimalKeyReleased

    private void selecionaAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaAnimalActionPerformed

        SelecionaAnimal animal = new SelecionaAnimal(0, this);
        MenuPrincipal.jDesktopPane1.add(animal);
        animal.setVisible(true);
        animal.setPosicao();
    }//GEN-LAST:event_selecionaAnimalActionPerformed

    private void nomeVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeVeterinarioActionPerformed

    private void nomeVeterinarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeVeterinarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeVeterinarioKeyReleased

    private void selecionaVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionaVeterinarioActionPerformed
        Seleciona_Veterinario vet = new Seleciona_Veterinario(this, m);
        MenuPrincipal.jDesktopPane1.add(vet);
        vet.setVisible(true);
        vet.setPosicao();
    }//GEN-LAST:event_selecionaVeterinarioActionPerformed

    private void InformacoesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InformacoesKeyReleased
        Informacoes.setText(Informacoes.getText().toUpperCase());
// TODO add your handling code here:

    }//GEN-LAST:event_InformacoesKeyReleased

    private void TipoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoExameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoExameActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpar_campos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Consulta.getCod_consulta() == 0) {
                trataCampos(1);
            } else {
                info_error.setText("Consulta já está Cadastrada!");
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Consulta.getCod_consulta() != 0) {
                trataCampos(2);
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou a Consulta não está Cadastrada!Deseja escolher uma Consulta?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    SelecionaConsulta seleciona_Consulta = new SelecionaConsulta(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Consulta);
                    seleciona_Consulta.setVisible(true);
                    seleciona_Consulta.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        if (m.usuarioLogado.isADM()) {
            if (ent_Consulta.getCod_consulta() != 0) {
                excluir();
            } else {
                int i = JOptionPane.showConfirmDialog(null, "Os Campos estão vazios ou a Consulta não está Cadastrada!\nDeseja escolher uma Consulta?", "INFORMAÇÃO", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    SelecionaConsulta seleciona_Consulta = new SelecionaConsulta(this, m);
                    MenuPrincipal.jDesktopPane1.add(seleciona_Consulta);
                    seleciona_Consulta.setVisible(true);
                    seleciona_Consulta.setPosicao();
                }
            }
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        m.fecharFrames(this);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

    private void TipoExameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipoExameKeyReleased
        upperCase(TipoExame);
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoExameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private com.toedter.calendar.JDateChooser DataConsulta;
    private javax.swing.JButton Excluir;
    private javax.swing.JScrollPane Infiormacoes;
    private javax.swing.JTextArea Informacoes;
    private javax.swing.JTextField NomeAnimal;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField TipoExame;
    private javax.swing.JLabel info_error;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nomeVeterinario;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JButton selecionaAnimal;
    private javax.swing.JButton selecionaVeterinario;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    public void excluir() {
        f_cons.excluir(ent_Consulta);
        if (ent_Consulta.getRetorno().equals("Deletado com sucesso!")) {
            limpar_campos();
            info_error.setText("Deletado com sucesso!");
        }
    }

    public void setConsulta(Consulta ec) {
        ent_Consulta = ec;
        NomeAnimal.setText(ec.getNome_animal());
        nomeVeterinario.setText(ec.getNome_veterinario());
        TipoExame.setText(ec.getTipo_exame_encam());
        DataConsulta.setDate(ec.getData_consulta());
        Informacoes.setText(ec.getInformacao());
    }

    public void prive() {

        if (m.usuarioLogado.isADM()) {
        } else {
            Cadastrar.setRolloverEnabled(false);
            Alterar.setRolloverEnabled(false);
            Excluir.setRolloverEnabled(false);
            Cadastrar.setToolTipText("Você não tem privilégios para executar essa ação!");
            Alterar.setToolTipText("Você não tem privilégios para executar essa ação!");
            Excluir.setToolTipText("Você não tem privilégios para executar essa ação!");

        }
    }

}
