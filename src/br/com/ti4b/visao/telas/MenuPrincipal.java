package br.com.ti4b.visao.telas;

import br.com.ti4b.util.relatorios;
import br.com.ti4b.modelo.Usuario;
import br.com.ti4b.visao.cadastros.*;
import br.com.ti4b.visao.pesquisas.*;
import br.com.ti4b.dao.AcessoDAO;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Otavio Costa
 * @param <T>
 */
public final class MenuPrincipal<T extends javax.swing.JInternalFrame> extends javax.swing.JFrame {

    public final GerenciadorDeJanelas gerenciadorDeJanelas;

//    AtualisarDAO funcoes_Atualisar = new AtualisarDAO();
    public Usuario usuarioLogado = new Usuario();

    public MenuPrincipal() {
        initComponents();
        //  funcoes_Atualisar.atualisar();
        setExtendedState(MAXIMIZED_BOTH);
        addWindowListener();
        gerenciadorDeJanelas = GerenciadorDeJanelas.getInstancia();
        gerenciadorDeJanelas.setDESKTOP_PANE(jDesktopPane1);
    }

    public void addWindowListener() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                sair(0);

            }
        });
    }

    public static JDesktopPane getPainel() {
        return MenuPrincipal.jDesktopPane1;
    }

    /*  public void relogio() {
     new Thread() {
    
     @Override
     public void run() {
     while (0 == 0) {
     SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
     SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
    
     labelData.setText(hora.format(new Date()));
     labelHora.setText(data.format(new Date()));
     try {
     sleep(1000); //faz a thread entrar em estado de espera por 1000 milissegundo ou 1segundo
     } catch (Exception e) {
     }
     }
     }
     }.start();
     }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        prive = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("LEGADO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/LEGADO.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuário:");

        user.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("user");

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Privilégios:");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        prive.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        prive.setForeground(new java.awt.Color(255, 255, 255));
        prive.setText("prive");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("2016");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prive, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(822, 822, 822)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(user, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prive, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, "card2");

        jMenu2.setText(" Cadastrar ");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Fornecedor                                       ");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Movimentação");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Veterinários");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Alimentos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Medicamentos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Vacinas Obrigatorias");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);
        jMenu2.add(jSeparator10);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Animais");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem24.setText("Cruzamento");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem24);

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem26.setText("Parto");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem26);
        jMenu2.add(jSeparator9);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Doencas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem25.setText("Campanha");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem25);

        jMenuItem27.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem27.setText("Diagnostico");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem27);

        jMenuItem28.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem28.setText("Tratamento");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem28);

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem31.setText("Consultas");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem31);

        jMenuItem33.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem33.setText("Producao");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem33);

        jMenuItem34.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem34.setText("Consumo");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem34);

        jMenuItem43.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem43.setText("Producao");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem43);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Pesquisar");

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem17.setText("Fornecedores");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem17);

        jMenuItem42.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem42.setText("Consulta");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem42);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem18.setText("Movimentações");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem18);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem20.setText("Alimentos");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem20);

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem21.setText("Campanha");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem21);

        jMenuItem23.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem23.setText("Medicamentos");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem23);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem19.setText("Animais");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem19);

        jMenuItem29.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem29.setText("Gestação");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem29);

        jMenuItem30.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem30.setText("Cruzamento");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem30);

        jMenuItem32.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem32.setText("Parto");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem32);

        jMenuItem36.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem36.setText("Diagnostico");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem36);

        jMenuItem35.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem35.setText("Vacina");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem35);

        jMenuItem37.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem37.setText("Veterinario");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem37);

        jMenuItem38.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem38.setText("Tratamento");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem38);

        jMenuItem40.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem40.setText("Doenca");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem40);

        jMenuItem41.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem41.setText("Consumo");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem41);

        jMenuBar1.add(jMenu1);

        jMenu3.setText(" Relátorios ");

        jMenuItem15.setText("Veterinarios");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuItem44.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem44.setText("Alimentos Volumoso");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem44);

        jMenuItem45.setText("Alimentos Concentrado");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem45);

        jMenuItem46.setText("Animais");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem46);

        jMenuItem47.setText("Consultas");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem47);

        jMenuItem48.setText("Diagnostico");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem48);

        jMenuItem49.setText("Fornecedor Alimentos");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem49);

        jMenuItem50.setText("Fornecedor Animais");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem50);

        jMenuItem51.setText("Medicamentos");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem51);

        jMenuItem52.setText("Produção");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem52);

        jMenuItem53.setText("Saida Leilao");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem53);

        jMenuItem56.setText("Saida Morte");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem56);

        jMenuItem54.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem54.setText("Tratamento");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem54);

        jMenuItem55.setText("Vacinas");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem55);

        jMenuItem57.setText("Consumo Volumoso");
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem57);

        jMenuItem58.setText("Consumo Concentrado");
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem58);

        jMenuItem59.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem59.setText("Cruzamentos");
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem59);

        jMenuItem60.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem60.setText("Nascimentos");
        jMenuItem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem60ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem60);

        jMenuItem61.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem61.setText("Partos");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem61);

        jMenuItem62.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem62.setText("Vacas Gestantes");
        jMenuItem62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem62ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem62);

        jMenuBar1.add(jMenu3);

        jMenu4.setText(" Segurança ");

        jMenuItem14.setText("Usuários ");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Trocar Usuário");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);
        jMenu4.add(jSeparator4);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Salvar Dados                                                           ");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem1.setText("Excluir Logs do Sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Mais");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void sair(int tipo) {
        int i = 0;
        if (tipo == 1) {
            i = JOptionPane.showConfirmDialog(null, "Deseja trocar de usuario?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } else if (tipo == 0) {
            i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fechar o Programa?", "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }

        if (usuarioLogado.getCod_acesso() != 0) {
            Usuario login = new Usuario();
            login.setCod_acesso(usuarioLogado.getCod_acesso());
            AcessoDAO acesso = new AcessoDAO();
            acesso.sair(login);
        }
        if (i == 0) {
            if (tipo == 1) {
                new Tela_login().setVisible(true);
                dispose();
            } else if (tipo == 0) {
                System.exit(0);
            }

        }

    }

    public void retornaUsuario(Usuario login) {
        user.setText(login.getNome());
        prive.setText(login.getPrevilegio());
        this.usuarioLogado = login;
    }

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroParto.getInstancia());
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroAnimal.getInstancia());
        //   abrirFrames("cadastroAnimal");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroAlimentos.getInstancia());

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroVeterinarios.getInstancia());
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroMovimentacao.getInstancia());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroFornecedor.getInstancia());

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(CadastroCampanhaVacinas.getInstancia());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(BackupRestaure.getInstancia());
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        sair(1);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        String sql = "SELECT\n"
                + "veterinario.crmv AS veterinario_crmv,\n"
                + "veterinario.cpf AS veterinario_cpf,\n"
                + "veterinario.nome AS veterinario_nome,\n"
                + "veterinario.endereco AS veterinario_endereco,\n"
                + "veterinario.cidade AS veterinario_cidade,\n"
                + "veterinario.uf AS veterinario_uf,\n"
                + "veterinario.email AS veterinario_email,\n"
                + "veterinario.fone1 AS veterinario_fone1,\n"
                + "veterinario.fone2 AS veterinario_fone2,\n"
                + "veterinario.tipo_contrato AS veterinario_tipo_contrato,\n"
                + "veterinario.especialidade AS veterinario_especialidade,\n"
                + "veterinario.numero AS veterinario_numero,\n"
                + "veterinario.bairro AS veterinario_bairro\n"
                + "FROM\n"
                + "public.veterinario veterinario";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/VETERINARIO_POST.jasper");
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        String sql = "SELECT\n"
                + "volumoso.cod_volumoso AS volumoso_cod_volumoso,\n"
                + "volumoso.descricao AS volumoso_descricao,\n"
                + "volumoso.data_entrada AS volumoso_data_entrada,\n"
                + "volumoso.quant AS volumoso_quant,\n"
                + "volumoso.preco_unit AS volumoso_preco_unit\n"
                + "FROM\n"
                + "public.volumoso volumoso";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/alimentos_cadastrados_volumoso.jasper");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        String sql = "SELECT\n"
                + "*,\n"
                + "concentrado.cod_concentrado AS concentrado_cod_concentrado,\n"
                + "concentrado.cod_for_alimento AS concentrado_cod_for_alimento,\n"
                + "concentrado.descricao AS concentrado_descricao,\n"
                + "concentrado.data_entrada AS concentrado_data_entrada,\n"
                + "concentrado.quant AS concentrado_quant,\n"
                + "concentrado.preco_unit AS concentrado_preco_unit,\n"
                + "fornecedor_alimento.cod_for_alimento AS fornecedor_alimento_cod_for_alimento,\n"
                + "fornecedor_alimento.cnpj AS fornecedor_alimento_cnpj,\n"
                + "fornecedor_alimento.nome AS fornecedor_alimento_nome\n"
                + "FROM\n"
                + "public.fornecedor_alimento fornecedor_alimento INNER JOIN public.concentrado concentrado ON fornecedor_alimento.cod_for_alimento = concentrado.cod_for_alimento";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/alimentos_cadastrado_concentrado_post.jasper");       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        String sql = "SELECT\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.cod_instituicao AS animal_cod_instituicao,\n"
                + "     animal.cod_origem AS animal_cod_origem,\n"
                + "     animal.cod_fase AS animal_cod_fase,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     animal.sexo AS animal_sexo,\n"
                + "     animal.raca AS animal_raca,\n"
                + "     animal.cor AS animal_cor,\n"
                + "     animal.idade AS animal_idade,\n"
                + "     animal.peso AS animal_peso,\n"
                + "     animal.grau_sangue AS animal_grau_sangue,\n"
                + "     animal.informacao AS animal_informacao,\n"
                + "     fase.cod_fase AS fase_cod_fase,\n"
                + "     fase.cod_clasificacao AS fase_cod_clasificacao,\n"
                + "     fase.descricao AS fase_descricao,\n"
                + "     fase.período AS fase_período,\n"
                + "     origem.cod_origem AS origem_cod_origem,\n"
                + "     origem.cod_for_animal AS origem_cod_for_animal,\n"
                + "     origem.cod_leilao AS origem_cod_leilao,\n"
                + "     origem.cod_nascimento AS origem_cod_nascimento,\n"
                + "     origem.data_entrada AS origem_data_entrada,\n"
                + "     classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
                + "     classificacao.descricao AS classificacao_descricao,\n"
                + "     origem_A.cod_origem AS origem_A_cod_origem,\n"
                + "     origem_A.cod_for_animal AS origem_A_cod_for_animal,\n"
                + "     origem_A.cod_leilao AS origem_A_cod_leilao,\n"
                + "     origem_A.cod_nascimento AS origem_A_cod_nascimento,\n"
                + "     origem_A.data_entrada AS origem_A_data_entrada\n"
                + "FROM\n"
                + "     public.fase fase INNER JOIN public.animal animal ON fase.cod_fase = animal.cod_fase\n"
                + "     INNER JOIN public.origem origem ON animal.cod_origem = origem.cod_origem\n"
                + "     INNER JOIN public.origem origem_A ON animal.cod_origem = origem_A.cod_origem\n"
                + "     INNER JOIN public.classificacao classificacao ON fase.cod_clasificacao = classificacao.cod_classificacao";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/animais_cadastrados_post.jasper");  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        String sql = "SELECT\n"
                + "     consulta.cod_consulta AS consulta_cod_consulta,\n"
                + "     consulta.cod_animal AS consulta_cod_animal,\n"
                + "     consulta.crmv AS consulta_crmv,\n"
                + "     consulta.data_consulta AS consulta_data_consulta,\n"
                + "     consulta.tipo_exame_encam AS consulta_tipo_exame_encam,\n"
                + "     consulta.informacao AS consulta_informacao,\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     veterinario.cod_veterinario AS veterinario_cod_veterinario,\n"
                + "     veterinario.crmv AS veterinario_crmv,\n"
                + "     veterinario.nome AS veterinario_nome\n"
                + "FROM\n"
                + "     public.animal animal INNER JOIN public.consulta consulta ON animal.cod_animal = consulta.cod_animal\n"
                + "     INNER JOIN public.veterinario veterinario ON consulta.crmv = veterinario.crmv";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/consultas.jasper");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        String sql = "SELECT\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.cod_instituicao AS animal_cod_instituicao,\n"
                + "     animal.cod_origem AS animal_cod_origem,\n"
                + "     animal.cod_fase AS animal_cod_fase,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     animal.sexo AS animal_sexo,\n"
                + "     animal.raca AS animal_raca,\n"
                + "     animal.cor AS animal_cor,\n"
                + "     animal.idade AS animal_idade,\n"
                + "     animal.data_nascimento AS animal_data_nascimento,\n"
                + "     animal.peso AS animal_peso,\n"
                + "     animal.grau_sangue AS animal_grau_sangue,\n"
                + "     animal.informacao AS animal_informacao,\n"
                + "     consulta.cod_consulta AS consulta_cod_consulta,\n"
                + "     consulta.cod_animal AS consulta_cod_animal,\n"
                + "     consulta.crmv AS consulta_crmv,\n"
                + "     consulta.data_consulta AS consulta_data_consulta,\n"
                + "     consulta.tipo_exame_encam AS consulta_tipo_exame_encam,\n"
                + "     consulta.informacao AS consulta_informacao,\n"
                + "     diagnostico.cod_diagnostico AS diagnostico_cod_diagnostico,\n"
                + "     diagnostico.cod_consulta AS diagnostico_cod_consulta,\n"
                + "     diagnostico.cod_doenca AS diagnostico_cod_doenca,\n"
                + "     diagnostico.data_diagnostico AS diagnostico_data_diagnostico,\n"
                + "     diagnostico.informacao AS diagnostico_informacao,\n"
                + "     doenca.cod_doenca AS doenca_cod_doenca,\n"
                + "     doenca.descricao AS doenca_descricao\n"
                + "FROM\n"
                + "     public.animal animal INNER JOIN public.consulta consulta ON animal.cod_animal = consulta.cod_animal\n"
                + "     INNER JOIN public.diagnostico diagnostico ON consulta.cod_consulta = diagnostico.cod_consulta\n"
                + "     INNER JOIN public.doenca doenca ON diagnostico.cod_doenca = doenca.cod_doenca";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/diagnostico_individual_post.jasper");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        String sql = "SELECT\n"
                + "     fornecedor_alimento.cod_for_alimento AS fornecedor_alimento_cod_for_alimento,\n"
                + "     fornecedor_alimento.numero_licitacao AS fornecedor_alimento_numero_licitacao,\n"
                + "     fornecedor_alimento.cnpj AS fornecedor_alimento_cnpj,\n"
                + "     fornecedor_alimento.nome AS fornecedor_alimento_nome,\n"
                + "     fornecedor_alimento.endereco AS fornecedor_alimento_endereco,\n"
                + "     fornecedor_alimento.numero AS fornecedor_alimento_numero,\n"
                + "     fornecedor_alimento.bairro AS fornecedor_alimento_bairro,\n"
                + "     fornecedor_alimento.cidade AS fornecedor_alimento_cidade,\n"
                + "     fornecedor_alimento.uf AS fornecedor_alimento_uf,\n"
                + "     fornecedor_alimento.email AS fornecedor_alimento_email,\n"
                + "     fornecedor_alimento.fone1 AS fornecedor_alimento_fone1,\n"
                + "     fornecedor_alimento.fone2 AS fornecedor_alimento_fone2\n"
                + "FROM\n"
                + "     public.fornecedor_alimento fornecedor_alimento";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/fornecedor_alimentos_post.jasper");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        String sql = "SELECT\n"
                + "     fornecedor_animal.cod_for_animal AS fornecedor_animal_cod_for_animal,\n"
                + "     fornecedor_animal.cnpj AS fornecedor_animal_cnpj,\n"
                + "     fornecedor_animal.nome AS fornecedor_animal_nome,\n"
                + "     fornecedor_animal.nome_proprietario AS fornecedor_animal_nome_proprietario,\n"
                + "     fornecedor_animal.info AS fornecedor_animal_info,\n"
                + "     fornecedor_animal.endereco AS fornecedor_animal_endereco,\n"
                + "     fornecedor_animal.numero AS fornecedor_animal_numero,\n"
                + "     fornecedor_animal.bairro AS fornecedor_animal_bairro,\n"
                + "     fornecedor_animal.cidade AS fornecedor_animal_cidade,\n"
                + "     fornecedor_animal.uf AS fornecedor_animal_uf,\n"
                + "     fornecedor_animal.email AS fornecedor_animal_email,\n"
                + "     fornecedor_animal.fone1 AS fornecedor_animal_fone1,\n"
                + "     fornecedor_animal.fone2 AS fornecedor_animal_fone2\n"
                + "FROM\n"
                + "     public.fornecedor_animal fornecedor_animal";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/fornecedor_animais_post.jasper");  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
        String sql = "SELECT\n"
                + "     medicamento.cod_medicamento AS medicamento_cod_medicamento,\n"
                + "     medicamento.descricao AS medicamento_descricao,\n"
                + "     medicamento.eficacia AS medicamento_eficacia,\n"
                + "     medicamento.quant AS medicamento_quant,\n"
                + "     medicamento.preco_unit AS medicamento_preco_unit,\n"
                + "     medicamento.data_validade AS medicamento_data_validade\n"
                + "FROM\n"
                + "     public.medicamento medicamento";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/medicamentos_estoque_post.jasper");  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        String sql = "SELECT\n"
                + "     classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
                + "     classificacao.descricao AS classificacao_descricao,\n"
                + "     materia_prima.cod_materia AS materia_prima_cod_materia,\n"
                + "     materia_prima.cod_classificacao AS materia_prima_cod_classificacao,\n"
                + "     materia_prima.descricao AS materia_prima_descricao,\n"
                + "     producao.cod_producao AS producao_cod_producao,\n"
                + "     producao.cod_materia AS producao_cod_materia,\n"
                + "     producao.quant AS producao_quant,\n"
                + "     producao.data_producao AS producao_data_producao\n"
                + "FROM\n"
                + "     public.classificacao classificacao INNER JOIN public.materia_prima materia_prima ON classificacao.cod_classificacao = materia_prima.cod_classificacao\n"
                + "     INNER JOIN public.producao producao ON materia_prima.cod_materia = producao.cod_materia";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/produçao_especie_post.jasper");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        String sql = "SELECT\n"
                + "     saida.cod_saida AS saida_cod_saida,\n"
                + "     saida.cod_animal AS saida_cod_animal,\n"
                + "     saida.cod_leilao AS saida_cod_leilao,\n"
                + "     saida.cod_morte AS saida_cod_morte,\n"
                + "     saida.data_saida AS saida_data_saida,\n"
                + "     saida.destino AS saida_destino,\n"
                + "     saida.informacao AS saida_informacao,\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.cod_instituicao AS animal_cod_instituicao,\n"
                + "     animal.cod_origem AS animal_cod_origem,\n"
                + "     animal.cod_fase AS animal_cod_fase,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     animal.sexo AS animal_sexo,\n"
                + "     animal.raca AS animal_raca,\n"
                + "     animal.cor AS animal_cor,\n"
                + "     animal.idade AS animal_idade,\n"
                + "     animal.data_nascimento AS animal_data_nascimento,\n"
                + "     animal.peso AS animal_peso,\n"
                + "     animal.grau_sangue AS animal_grau_sangue,\n"
                + "     animal.informacao AS animal_informacao,\n"
                + "     leilao.cod_leilao AS leilao_cod_leilao,\n"
                + "     leilao.tipo_de_leilao AS leilao_tipo_de_leilao,\n"
                + "     leilao.data_leilao AS leilao_data_leilao,\n"
                + "     leilao.valor_arrebatado AS leilao_valor_arrebatado,\n"
                + "     leilao.local_realizacao AS leilao_local_realizacao,\n"
                + "     leilao.informacao AS leilao_informacao\n"
                + "FROM\n"
                + "     public.animal animal INNER JOIN public.saida saida ON animal.cod_animal = saida.cod_animal\n"
                + "     INNER JOIN public.leilao leilao ON saida.cod_leilao = leilao.cod_leilao";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/saida_leilao.jasper");         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        String sql = "SELECT\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.cod_instituicao AS animal_cod_instituicao,\n"
                + "     animal.cod_origem AS animal_cod_origem,\n"
                + "     animal.cod_fase AS animal_cod_fase,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     animal.sexo AS animal_sexo,\n"
                + "     animal.raca AS animal_raca,\n"
                + "     animal.cor AS animal_cor,\n"
                + "     animal.idade AS animal_idade,\n"
                + "     animal.peso AS animal_peso,\n"
                + "     animal.grau_sangue AS animal_grau_sangue,\n"
                + "     animal.informacao AS animal_informacao,\n"
                + "     consulta.cod_consulta AS consulta_cod_consulta,\n"
                + "     consulta.cod_animal AS consulta_cod_animal,\n"
                + "     consulta.crmv AS consulta_crmv,\n"
                + "     consulta.data_consulta AS consulta_data_consulta,\n"
                + "     consulta.tipo_exame_encam AS consulta_tipo_exame_encam,\n"
                + "     consulta.informacao AS consulta_informacao,\n"
                + "     medicamento.cod_medicamento AS medicamento_cod_medicamento,\n"
                + "     medicamento.descricao AS medicamento_descricao,\n"
                + "     medicamento.eficacia AS medicamento_eficacia,\n"
                + "     medicamento.quant AS medicamento_quant,\n"
                + "     medicamento.preco_unit AS medicamento_preco_unit,\n"
                + "     medicamento.data_validade AS medicamento_data_validade,\n"
                + "     tratamento.cod_tratamento AS tratamento_cod_tratamento,\n"
                + "     tratamento.cod_diagnostico AS tratamento_cod_diagnostico,\n"
                + "     tratamento.cod_medicamento AS tratamento_cod_medicamento,\n"
                + "     tratamento.data_tratamento AS tratamento_data_tratamento,\n"
                + "     tratamento.periodo_tratamento AS tratamento_periodo_tratamento,\n"
                + "     tratamento.quant AS tratamento_quant,\n"
                + "     diagnostico.cod_diagnostico AS diagnostico_cod_diagnostico,\n"
                + "     diagnostico.cod_consulta AS diagnostico_cod_consulta,\n"
                + "     diagnostico.cod_doenca AS diagnostico_cod_doenca,\n"
                + "     diagnostico.data_diagnostico AS diagnostico_data_diagnostico,\n"
                + "     diagnostico.informacao AS diagnostico_informacao\n"
                + "FROM\n"
                + "     public.animal animal INNER JOIN public.consulta consulta ON animal.cod_animal = consulta.cod_animal\n"
                + "     INNER JOIN public.diagnostico diagnostico ON consulta.cod_consulta = diagnostico.cod_consulta\n"
                + "     INNER JOIN public.tratamento tratamento ON diagnostico.cod_diagnostico = tratamento.cod_diagnostico\n"
                + "     INNER JOIN public.medicamento medicamento ON tratamento.cod_medicamento = medicamento.cod_medicamento";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/tratamento_post.jasper");         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        String sql = "SELECT\n"
                + "     vacina_obrigatoria.cod_vacina AS vacina_obrigatoria_cod_vacina,\n"
                + "     vacina_obrigatoria.descricao AS vacina_obrigatoria_descricao,\n"
                + "     vacina_obrigatoria.periodo_aplicacao AS vacina_obrigatoria_periodo_aplicacao,\n"
                + "     campanha.cod_campanha AS campanha_cod_campanha,\n"
                + "     campanha.cod_animal AS campanha_cod_animal,\n"
                + "     campanha.data_aplicacao AS campanha_data_aplicacao,\n"
                + "     campanha.quant AS campanha_quant,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     vacina_obrigatoria.preco_unit AS vacina_obrigatoria_preco_unit\n"
                + "FROM\n"
                + "     public.vacina_obrigatoria vacina_obrigatoria INNER JOIN public.campanha campanha ON vacina_obrigatoria.cod_vacina = campanha.cod_vacina\n"
                + "     INNER JOIN public.animal animal ON campanha.cod_animal = animal.cod_animal";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/vacinas_obrigatorias_post.jasper");  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        String sql = "SELECT\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.cod_instituicao AS animal_cod_instituicao,\n"
                + "     animal.cod_origem AS animal_cod_origem,\n"
                + "     animal.cod_fase AS animal_cod_fase,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     animal.sexo AS animal_sexo,\n"
                + "     animal.raca AS animal_raca,\n"
                + "     animal.cor AS animal_cor,\n"
                + "     animal.idade AS animal_idade,\n"
                + "     animal.data_nascimento AS animal_data_nascimento,\n"
                + "     animal.peso AS animal_peso,\n"
                + "     animal.grau_sangue AS animal_grau_sangue,\n"
                + "     animal.informacao AS animal_informacao,\n"
                + "     morte.cod_morte AS morte_cod_morte,\n"
                + "     morte.descricao AS morte_descricao,\n"
                + "     saida.cod_saida AS saida_cod_saida,\n"
                + "     saida.cod_animal AS saida_cod_animal,\n"
                + "     saida.cod_leilao AS saida_cod_leilao,\n"
                + "     saida.cod_morte AS saida_cod_morte,\n"
                + "     saida.data_saida AS saida_data_saida,\n"
                + "     saida.destino AS saida_destino,\n"
                + "     saida.informacao AS saida_informacao\n"
                + "FROM\n"
                + "     public.animal animal INNER JOIN public.saida saida ON animal.cod_animal = saida.cod_animal\n"
                + "     INNER JOIN public.morte morte ON saida.cod_morte = morte.cod_morte";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/saida_morte.jasper"); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
        String sql = "SELECT\n"
                + "     consumo.cod_consumo AS consumo_cod_consumo,\n"
                + "     consumo.cod_classificacao AS consumo_cod_classificacao,\n"
                + "     consumo.cod_volumoso AS consumo_cod_volumoso,\n"
                + "     consumo.cod_concentrado AS consumo_cod_concentrado,\n"
                + "     consumo.quantidade AS consumo_quantidade,\n"
                + "     consumo.data_consumo AS consumo_data_consumo,\n"
                + "     volumoso.cod_volumoso AS volumoso_cod_volumoso,\n"
                + "     volumoso.descricao AS volumoso_descricao,\n"
                + "     volumoso.data_entrada AS volumoso_data_entrada,\n"
                + "     volumoso.quant AS volumoso_quant,\n"
                + "     volumoso.preco_unit AS volumoso_preco_unit,\n"
                + "     classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
                + "     classificacao.descricao AS classificacao_descricao\n"
                + "FROM\n"
                + "     public.volumoso volumoso INNER JOIN public.consumo consumo ON volumoso.cod_volumoso = consumo.cod_volumoso\n"
                + "     INNER JOIN public.classificacao classificacao ON consumo.cod_classificacao = classificacao.cod_classificacao";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/consumo_volumoso.jasper"); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem57ActionPerformed

    private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
        String sql = "SELECT\n"
                + "     consumo.cod_consumo AS consumo_cod_consumo,\n"
                + "     consumo.cod_classificacao AS consumo_cod_classificacao,\n"
                + "     consumo.cod_volumoso AS consumo_cod_volumoso,\n"
                + "     consumo.cod_concentrado AS consumo_cod_concentrado,\n"
                + "     consumo.quantidade AS consumo_quantidade,\n"
                + "     consumo.data_consumo AS consumo_data_consumo,\n"
                + "     concentrado.cod_concentrado AS concentrado_cod_concentrado,\n"
                + "     concentrado.cod_for_alimento AS concentrado_cod_for_alimento,\n"
                + "     concentrado.descricao AS concentrado_descricao,\n"
                + "     concentrado.data_entrada AS concentrado_data_entrada,\n"
                + "     concentrado.quant AS concentrado_quant,\n"
                + "     concentrado.preco_unit AS concentrado_preco_unit,\n"
                + "     classificacao.cod_classificacao AS classificacao_cod_classificacao,\n"
                + "     classificacao.descricao AS classificacao_descricao\n"
                + "FROM\n"
                + "     public.concentrado concentrado INNER JOIN public.consumo consumo ON concentrado.cod_concentrado = consumo.cod_concentrado\n"
                + "     INNER JOIN public.classificacao classificacao ON consumo.cod_classificacao = classificacao.cod_classificacao";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/producao/consumo_concentrado.jasper");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem58ActionPerformed

    private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem59ActionPerformed
        String sql = "SELECT\n"
                + "     cruzamento.cod_cruzamento AS cruzamento_cod_cruzamento,\n"
                + "     cruzamento.cod_tipo_cruzamento AS cruzamento_cod_tipo_cruzamento,\n"
                + "     cruzamento.cod_animal_mae AS cruzamento_cod_animal_mae,\n"
                + "     cruzamento.crmv AS cruzamento_crmv,\n"
                + "     cruzamento.data_cruza AS cruzamento_data_cruza,\n"
                + "     cruzamento.pai AS cruzamento_pai,\n"
                + "     cruzamento.tentativa AS cruzamento_tentativa,\n"
                + "     cruzamento.status AS cruzamento_status,\n"
                + "     animal.cod_animal AS animal_cod_animal,\n"
                + "     animal.cod_instituicao AS animal_cod_instituicao,\n"
                + "     animal.cod_origem AS animal_cod_origem,\n"
                + "     animal.cod_fase AS animal_cod_fase,\n"
                + "     animal.nome AS animal_nome,\n"
                + "     animal.sexo AS animal_sexo,\n"
                + "     animal.raca AS animal_raca,\n"
                + "     animal.cor AS animal_cor,\n"
                + "     animal.idade AS animal_idade,\n"
                + "     animal.data_nascimento AS animal_data_nascimento,\n"
                + "     animal.peso AS animal_peso,\n"
                + "     animal.grau_sangue AS animal_grau_sangue,\n"
                + "     animal.informacao AS animal_informacao,\n"
                + "     veterinario.cod_veterinario AS veterinario_cod_veterinario,\n"
                + "     veterinario.crmv AS veterinario_crmv,\n"
                + "     veterinario.cpf AS veterinario_cpf,\n"
                + "     veterinario.nome AS veterinario_nome,\n"
                + "     veterinario.endereco AS veterinario_endereco,\n"
                + "     veterinario.numero AS veterinario_numero,\n"
                + "     veterinario.bairro AS veterinario_bairro,\n"
                + "     veterinario.cidade AS veterinario_cidade,\n"
                + "     veterinario.uf AS veterinario_uf,\n"
                + "     veterinario.email AS veterinario_email,\n"
                + "     veterinario.fone1 AS veterinario_fone1,\n"
                + "     veterinario.fone2 AS veterinario_fone2,\n"
                + "     veterinario.tipo_contrato AS veterinario_tipo_contrato,\n"
                + "     veterinario.especialidade AS veterinario_especialidade,\n"
                + "     tipo_cruzamento.cod_tipo_cruzamento AS tipo_cruzamento_cod_tipo_cruzamento,\n"
                + "     tipo_cruzamento.descricao AS tipo_cruzamento_descricao,\n"
                + "     tipo_cruzamento_A.cod_tipo_cruzamento AS tipo_cruzamento_A_cod_tipo_cruzamento,\n"
                + "     tipo_cruzamento_A.descricao AS tipo_cruzamento_A_descricao\n"
                + "FROM\n"
                + "     public.animal animal INNER JOIN public.cruzamento cruzamento ON animal.cod_animal = cruzamento.cod_animal_mae\n"
                + "     INNER JOIN public.veterinario veterinario ON cruzamento.crmv = veterinario.crmv\n"
                + "     INNER JOIN public.tipo_cruzamento tipo_cruzamento ON cruzamento.cod_tipo_cruzamento = tipo_cruzamento.cod_tipo_cruzamento\n"
                + "     INNER JOIN public.tipo_cruzamento tipo_cruzamento_A ON cruzamento.cod_tipo_cruzamento = tipo_cruzamento_A.cod_tipo_cruzamento";

        relatorios relatorios = new relatorios();
        // relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/reproducao/cruzamento.jasper"); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem59ActionPerformed

    private void jMenuItem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem60ActionPerformed
        String sql = "select \n"
                + " animal.nome as filho,anima1.*,anima1.nome as mae,cruzamento.*,animal.*,fase.*,classificacao.*,origem.*,fornecedor_animal.*,nascimento.*\n"
                + "  from animal \n"
                + " join fase using(cod_fase)\n"
                + " join classificacao on classificacao.cod_classificacao=fase .cod_clasificacao\n"
                + " join origem using(cod_origem)\n"
                + " join fornecedor_animal using(cod_for_animal)\n"
                + " join nascimento using(cod_nascimento) \n"
                + " join parto using(cod_parto) \n"
                + " join gestacao using(cod_gestacao)\n"
                + " join fecundacao using(cod_fecundacao)\n"
                + " join cruzamento using(cod_cruzamento)\n"
                + " join animal as anima1 on cruzamento.cod_animal_mae=anima1.cod_animal\n"
                + " where animal.cod_animal not in (select cod_animal from saida)";

        relatorios relatorios = new relatorios();
        //   relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/reproducao/nascimento.jasper"); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem60ActionPerformed

    private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem61ActionPerformed
        String sql = "select c.pai,a.cod_instituicao,\n"
                + " a.cod_animal,a.nome as mae\n"
                + " ,cc.descricao as categoria\n"
                + " ,p.cod_parto\n"
                + " ,p.data_parto\n"
                + " ,p.quantidade_crias\n"
                + " ,p.informacoes\n"
                + " ,g.cod_gestacao \n"
                + " ,f.cod_fecundacao\n"
                + " ,c.cod_cruzamento \n"
                + " ,a.cod_animal\n"
                + " from parto p\n"
                + " \n"
                + " join gestacao g on g.cod_gestacao=p.cod_gestacao \n"
                + " join fecundacao f on f.cod_fecundacao=g.cod_fecundacao\n"
                + " join cruzamento c on c.cod_cruzamento=f.cod_cruzamento\n"
                + " join animal a on c.cod_animal_mae=a.cod_animal \n"
                + " join fase fe on a.cod_fase=fe.cod_fase\n"
                + " join classificacao cc on cc.cod_classificacao=fe.cod_clasificacao and a.cod_animal not in (select cod_animal from saida)";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/reproducao/partos.jasper"); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem61ActionPerformed

    private void jMenuItem62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem62ActionPerformed
        String sql = "select a.cod_animal,a.nome,a.cod_instituicao,c.pai,f.cod_fecundacao,f.data_fecundacao,g.cod_gestacao,g.previsao_parto,g.situacao,fe.descricao as categoria,cc.descricao from cruzamento c\n"
                + "join animal a on a.cod_animal=c.cod_animal_mae\n"
                + "join fecundacao f on f.cod_cruzamento=c.cod_cruzamento\n"
                + "join gestacao g on g.cod_fecundacao=f.cod_fecundacao \n"
                + "join fase fe on a.cod_fase=fe.cod_fase\n"
                + "join classificacao cc on cc.cod_classificacao=fe.cod_clasificacao where g.situacao='GESTANTE' and a.cod_animal not in (select cod_animal from saida)";

        relatorios relatorios = new relatorios();
//        relatorios.gerar_relatorio(sql, "C:/LEGADO/relatorios/reproducao/vacas_gestantes.jasper"); // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem62ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AcessoDAO acesso = new AcessoDAO();
        acesso.logKill();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sair(0);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(PesquisarParto.getInstancia());
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(PesqusaCruzamento.getInstancia());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(PesquisarAnimal.getInstancia());
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(PesquisarMedicamentos.getInstancia());        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        SelecionaMovimentacao movimentacao2 = new SelecionaMovimentacao(this, true);
        movimentacao2.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        gerenciadorDeJanelas.openInternalFrame(null);// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        SelecionaFornecedor fornecedor2 = new SelecionaFornecedor(this, true);
        fornecedor2.setVisible(true);
        //  gerenciadorDeJanelas.openInternalFrame(SelecionaFornecedor.getInstancia());
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel prive;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    /*  public void blink() {
    
     blink = new Thread() {
     @Override
     public void run() {
     while (0 == 0) {
     labelBlink.setForeground(Color.GREEN);
     try {
     sleep(700);
     labelBlink.setForeground(Color.WHITE);
     sleep(700);
    
     //faz a thread entrar em estado de espera por 1000 milissegundo ou 1segundo
     } catch (InterruptedException e) {
     return;
    
     }
     }
     }
     };
     blink.start();
    
     }*/
}
