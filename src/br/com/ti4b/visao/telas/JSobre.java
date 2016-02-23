/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.telas;

import java.awt.Dimension;

/**
 *
 * @author StreamRead
 */
public class JSobre extends javax.swing.JInternalFrame {

    /**
     * Creates new form JSobre
     */
    MenuPrincipal m;

    private static JSobre jSobre;

    public static JSobre getInstancia() {
        if (jSobre == null) {
            jSobre = new JSobre();
        }
        return jSobre;
    }

    public JSobre() {
        initComponents();
    }

    public JSobre(MenuPrincipal m) {
        this.m = m;
        initComponents();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        sair = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 0));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Autores");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Licença");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/LEGADO1.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Sistema de Gerênciamento de Produção e Reprodução de Animais Especificos.");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("info.:");

        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Versão 1.0.0 ");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 153, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("  O LEGADO FOI CONSTRUIDO PARA \n  FORNECER MELHOR GERÊNCIAMENTO \n DOS AGRO PRODUTOS E DE ANIMAIS \n CADASTRADOS EM SEU BANCO, FORNE-\n CENDO ASSIM, RELATÓRIOS GERADOS \nCOM BASES NOS EVENTOS CORRENTES \nDOS MESMOS.  \n\n");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );

        sair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 0, 0));
        sair.setText("SAIR");
        sair.setContentAreaFilled(false);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sair.setFocusable(false);
        sair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ti4b/icons/botoes/botao Sair Grande.png"))); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(159, 159, 159)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        StringBuffer buffer = new StringBuffer();
        buffer.append("Otavio Costa\nFranscisco Hylorran\nGeferson Kaique\nHebecy\nDarlan Pereira\nDanilo Cassimiro\nTarcisio Leal\nAcawana Karmel");
        jTextArea2.setText(buffer.toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        StringBuffer buffer = new StringBuffer();
        buffer.append("GNU General PÚBLICO\n"
                + "                        Versão 2, junho 1991\n"
                + "\n"
                + "  Copyright (C) 1989, 1991 Free Software Foundation, Inc.,\n"
                + "  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 EUA\n"
                + "  A todos é permitido copiar e distribuir cópias\n"
                + "  deste documento de licença, mas a mudança não é permitido.\n"
                + "\n"
                + "                             preâmbulo\n"
                + "\n"
                + "   As licenças de software são projetados para tirar o seu\n"
                + "liberdade de compartilhar e alterar. Em contrapartida, a GNU General Public License\n"
                + "Licença destina-se a garantir a sua liberdade de compartilhar e modificar livre\n"
                + "software - para garantir que o software é livre para todos os seus usuários. este\n"
                + "Licença Pública Geral aplica-se à maioria do Software Livre\n"
                + "Software da Fundação e para qualquer outro programa cujos autores se comprometam a\n"
                + "usá-lo. (Alguns outros software da FSF são cobertos pela\n"
                + "a Licença Pública Geral GNU.) Você pode aplicá-lo\n"
                + "seus programas, também.\n"
                + "\n"
                + "   Quando falamos de software livre, estamos nos referindo à liberdade, não\n"
                + "preço. Nossa Licença Pública Geral foi desenvolvida para se certificar de que você\n"
                + "tem a liberdade de distribuir cópias de software livre (e cobrar por\n"
                + "este serviço, se desejar), que recebe o código fonte ou pode obtê-lo\n"
                + "se você quer, que você pode mudar o software ou utilizar partes dele\n"
                + "em novos programas livres; e que você sabe que pode fazer essas coisas.\n"
                + "\n"
                + "   Para proteger seus direitos, precisamos fazer restrições que impeçam\n"
                + "qualquer um negar estes direitos ou de pedir-lhe para libertar os direitos.\n"
                + "Estas restrições traduzem-se em certas responsabilidades para você, se você\n"
                + "distribuir cópias do software, ou se o modificar.\n"
                + "\n"
                + "   Por exemplo, se você distribuir cópias de um programa desse tipo, se\n"
                + "gratuitamente ou por uma taxa, você deve dar aos destinatários todos os direitos que\n"
                + "você tem. Você deve se certificar de que eles também recebam ou possam obter o\n"
                + "código-fonte. E você tem que mostrar-lhes estes termos para que eles sabem o seu\n"
                + "direitos.\n"
                + "\n"
                + "   Nós protegemos os seus direitos em duas etapas: (1) com copyright do software e\n"
                + "(2) com a oferta desta licença, que lhe dá permissão legal para copiar,\n"
                + "distribuir e / ou modificar o software.\n"
                + "\n"
                + "   Além disso, para nossa protecção e de cada autor, nós queremos ter a certeza\n"
                + "que todos entendam que não há nenhuma garantia para este livre\n"
                + "software. Se o software é modificado por alguém e passado adiante, nós\n"
                + "quer que seus destinatários saibam que o que eles têm não é o original, de modo\n"
                + "que quaisquer problemas introduzidos por terceiros não interfira no original\n"
                + "reputações dos autores.\n"
                + "\n"
                + "   Finalmente, qualquer programa é ameaçado constantemente por software\n"
                + "patentes. Queremos evitar o perigo de que distribuidores de livre\n"
                + "programa individualmente obter licenças de patentes, com o efeito de tornar o\n"
                + "programa proprietário. Para evitar isso, nós deixamos claro que qualquer\n"
                + "patente deve ser licenciada para uso livre de todos ou não licenciada.\n"
                + "\n"
                + "   Os termos e condições precisas para cópia, distribuição e\n"
                + "acompanhamento modificação.\n"
                + "\n"
                + "                     GNU General PÚBLICO\n"
                + "    TERMOS E CONDIÇÕES PARA CÓPIA, DISTRIBUIÇÃO E MODIFICAÇÃO\n"
                + "\n"
                + "   0. Esta licença se aplica a qualquer programa ou outro trabalho que contenha\n"
                + "um aviso colocado pelo detentor dos direitos autorais dizendo que pode ser distribuído\n"
                + "sob os termos desta Licença Pública Geral. O \"Programa\", abaixo,\n"
                + "refere-se a qualquer programa ou trabalho, e um \"trabalho baseado no Programa\"\n"
                + "significa que o Programa ou qualquer trabalho derivado sob a lei de direitos autorais:\n"
                + "ou seja, um trabalho que contenha o Programa ou uma parte dele,\n"
                + "tanto originalmente ou com modificações e / ou traduzido para outra\n"
                + "língua. (Doravante, a tradução é incluída sem limitações no\n"
                + "o termo \"modificação\".) Cada licenciado é mencionado como \"você\".\n"
                + "\n"
                + "Outras que a cópia, distribuição e modificação não são\n"
                + "cobertas por esta Licença; estão fora do seu alcance. O ato de\n"
                + "executar o Programa não é restringido eo resultado do Programa\n"
                + "é coberto apenas se seu conteúdo constituir um trabalho baseado no\n"
                + "Programa (independentemente de terem sido gerados pela execução do Programa).\n"
                + "Se isso é verdadeiro depende do que o programa faz.\n"
                + "\n"
                + "   1. Você pode copiar e distribuir cópias do Programa de\n"
                + "código-fonte ao recebê-lo, em qualquer meio, desde que você\n"
                + "conspícua e apropriadamente publique em cada cópia um adequado\n"
                + "aviso de direitos autorais e exoneração de garantia; manter intactos todos os\n"
                + "avisos que se referem a esta Licença e à ausência de qualquer garantia;\n"
                + "e forneça a outros recebedores do Programa uma cópia desta Licença\n"
                + "junto com o Programa.\n"
                + "\n"
                + "Você pode cobrar uma taxa pelo ato físico de transferir uma cópia, e\n"
                + "você pode, opcionalmente, oferecer garantia em troca de uma taxa.\n"
                + "\n"
                + "   2. Você pode modificar sua cópia ou cópias do Programa ou qualquer parte\n"
                + "dele, assim formando um trabalho baseado no Programa, e copiar e\n"
                + "distribuir essas modificações ou trabalhos sob os termos da seção 1\n"
                + "acima, desde que você também se enquadre em todas estas condições:\n"
                + "\n"
                + "     a) Você deve fazer com que os arquivos modificados levem avisos proeminentes\n"
                + "     afirmando que você alterou os arquivos, incluindo a data de qualquer alteração.\n"
                + "\n"
                + "     b) Você deve fazer com que qualquer trabalho que distribua ou publique, que, em\n"
                + "     todo ou em parte contenha ou seja derivado do Programa ou qualquer\n"
                + "     parte dele, seja licenciada como um todo, sem custo para todos terceiro\n"
                + "     partes sob os termos desta Licença.\n"
                + "\n"
                + "     c) Se o programa modificado normalmente lê comandos interativamente\n"
                + "     quando executado, você deve fazer com que, quando iniciada a execução para tal\n"
                + "     uso interativo da forma mais simples, seja impresso ou mostrado um\n"
                + "     anúncio incluindo um aviso de copyright apropriado e um\n"
                + "     notar que não há qualquer garantia (ou então, dizer que você forneça\n"
                + "     a garantia) e que os usuários podem redistribuir o programa sob\n"
                + "     estas condições, e dizer ao usuário como visualizar uma cópia deste\n"
                + "     License. (Exceção: se o Programa em si é interativo mas\n"
                + "     normalmente não mostra um desses avisos, seu trabalho baseado no\n"
                + "     o Programa não precisa imprimir um anúncio.)\n"
                + "\n"
                + "Estas exigências aplicam-se ao trabalho modificado como um todo. se\n"
                + "seções identificáveis de tal trabalho não são derivadas do Programa,\n"
                + "e podem ser razoavelmente consideradas trabalhos independentes e separados por\n"
                + "eles mesmos, então esta Licença, e seus termos, não se aplicam aos\n"
                + "seções quando você distribui-las como obras separadas. Mas quando você\n"
                + "distribuir as mesmas seções como parte de um todo que é um trabalho baseado\n"
                + "no Programa, a distribuição do todo tem de ser nos termos de\n"
                + "desta Licença, cujas permissões para outros licenciados se estendem para o\n"
                + "toda inteira, e, portanto, a cada parte, independentemente de quem a escreveu.\n"
                + "\n"
                + "Assim, não é a intenção desta seção para reivindicar direitos ou contestar\n"
                + "os seus direitos ao trabalho escrito inteiramente por você; em vez disso, a intenção é\n"
                + "exercer o direito de controlar a distribuição de derivado ou\n"
                + "trabalhos coletivos, baseados no Programa.\n"
                + "\n"
                + "Além disso, a mera agregação de outro trabalho não baseado no Programa\n"
                + "com o Programa (ou com um trabalho baseado no Programa) em um volume de\n"
                + "um meio de armazenamento ou distribuição não traz o outro trabalho sob\n"
                + "o âmbito desta Licença.\n"
                + "\n"
                + "   3. Você pode copiar e distribuir o Programa (ou um trabalho baseado nele,\n"
                + "sob a Seção 2) em código-objeto ou em forma executável sob os termos da\n"
                + "Seções 1 e 2 acima, desde que você faça um dos seguintes procedimentos:\n"
                + "\n"
                + "     a) O acompanhe com a correspondente completo machine-readable\n"
                + "     código-fonte, o que deve ser distribuído sob os termos das Seções\n"
                + "     1 e 2 acima e em meio normalmente utilizado para o intercâmbio de software; ou,\n"
                + "\n"
                + "     b) O acompanhe com uma oferta escrita, válida por pelo menos três\n"
                + "     anos, para dar a quaisquer terceiros, por um custo não superior ao\n"
                + "     custo de distribuição física do material, uma completa\n"
                + "     cópia legível por máquina do código-fonte correspondente, para ser\n"
                + "     distribuído sob os termos das Seções 1 e 2 acima e em meio\n"
                + "     normalmente utilizado para o intercâmbio de software; ou,\n"
                + "\n"
                + "     c) O acompanhe com a informação que você recebeu em relação à oferta\n"
                + "     para distribuir o correspondente código fonte. (Esta alternativa é\n"
                + "     permitida apenas para distribuição não-comercial e apenas se você\n"
                + "     recebeu o programa em código-objeto ou formato executável com essa\n"
                + "     oferta, de acordo com a Subseção b acima.)\n"
                + "\n"
                + "O código fonte para um trabalho significa a forma preferida do trabalho para\n"
                + "fazer modificações nele. Para um trabalho executável, fonte completo\n"
                + "código significa que todo o código fonte para todos os módulos que ele contém, além de qualquer\n"
                + "associado arquivos de definição de interface, além dos scripts usados para\n"
                + "controlar a compilação e instalação do executável. No entanto, como um\n"
                + "exceção especial, o código-fonte distribuído não precisa incluir\n"
                + "nada do que é normalmente distribuído (em qualquer fonte ou binário\n"
                + "forma) com os componentes principais (compilador, kernel e assim por diante) do\n"
                + "sistema operacional no qual o executável é executado, a menos que o componente\n"
                + "em si acompanhe o executável.\n"
                + "\n"
                + "Se a distribuição do executável ou código-objeto é feita através da oferta\n"
                + "acesso a uma cópia de um local designado, então oferecer equivalente\n"
                + "acesso para copiar o código-fonte do mesmo lugar conta como\n"
                + "distribuição do código fonte, mesmo que terceiros não são\n"
                + "compelidos a copiar o código fonte junto com o código objeto.\n"
                + "\n"
                + "   4. Você não pode copiar, modificar, sublicenciar ou distribuir o Programa\n"
                + "exceto conforme expressamente estabelecido nesta Licença. qualquer tentativa\n"
                + "outro modo, copiar, modificar, sublicenciar ou distribuir o Programa é\n"
                + "anular, e cancelará automaticamente os seus direitos sob esta licença.\n"
                + "No entanto, terceiros que tenham recebido cópias, ou direitos, de você sob\n"
                + "esta Licença não terão suas licenças terminadas, desde que tais\n"
                + "permaneçam em total cumprimento.\n"
                + "\n"
                + "   5. Você não é obrigado a aceitar esta Licença já que não tem\n"
                + "assinou. No entanto, nada garante a sua permissão para modificar ou\n"
                + "distribuir o Programa ou seus trabalhos derivados. Essas ações são\n"
                + "proibido por lei se você não aceitar esta licença. Portanto, pela\n"
                + "modificar ou distribuir o Programa (ou qualquer trabalho baseado no\n"
                + "Programa), você indica a sua aceitação desta Licença para fazê-lo, e\n"
                + "todos os seus termos e condições para copiar, distribuir ou modificar\n"
                + "o Programa ou trabalhos baseados nele.\n"
                + "\n"
                + "   6. Cada vez que você redistribuir o Programa (ou qualquer trabalho baseado no\n"
                + "Program), o destinatário recebe automaticamente uma licença do\n"
                + "licenciador original para copiar, distribuir ou modificar o Programa sujeito a\n"
                + "estes termos e condições. Você não pode impor qualquer outra\n"
                + "restrições ao exercício dos direitos aqui concedidos aos destinatários.\n"
                + "Você não é responsável em garantir a concordância de terceiros a\n"
                + "esta Licença.\n"
                + "\n"
                + "   7. Se, em conseqüência de decisões judiciais ou alegações de patente\n"
                + "infracção ou por qualquer outro motivo (não restrito às questões de patentes),\n"
                + "condições forem impostas a você (por ordem judicial, acordos ou\n"
                + "de outro modo) que contradigam as condições desta Licença, eles não\n"
                + "livram das condições desta Licença. Se você não puder\n"
                + "distribuir de forma a satisfazer simultaneamente as suas obrigações decorrentes do presente\n"
                + "Licença e quaisquer outras obrigações pertinentes, então como conseqüência você\n"
                + "não poderá distribuir o Programa. Por exemplo, se uma patente\n"
                + "licença não permitir a redistribuição livre de royalties do Programa por\n"
                + "todos aqueles que receberem cópias direta ou indiretamente de você, em seguida,\n"
                + "a única forma de você satisfazer a ela ea esta Licença seria a\n"
                + "abster-se totalmente da distribuição do Programa.\n"
                + "\n"
                + "Se qualquer parte desta seção for considerada inválida ou não aplicável em\n"
                + "qualquer circunstância particular, o equilíbrio da secção destina-se a\n"
                + "aplicar ea secção como um todo é para aplicar nas outras\n"
                + "circunstâncias.\n"
                + "\n"
                + "Não é o propósito desta secção induzi-lo a infringir qualquer\n"
                + "patentes ou outras reivindicações de direitos de propriedade ou contestar a validade de qualquer\n"
                + "tais reivindicações; esta seção tem como único propósito de proteger a\n"
                + "integridade do sistema de distribuição de software livre, que é\n"
                + "implementado pela prática de licenças públicas. Muitas pessoas têm feito\n"
                + "generosas contribuições à ampla gama de software distribuído\n"
                + "através desse sistema, confiando na aplicação consistente deste\n"
                + "sistema; cabe ao autor / doador decidir se ele ou ela está disposto\n"
                + "para distribuir software através de qualquer outro sistema e um licenciado não pode\n"
                + "impor essa escolha.\n"
                + "\n"
                + "Esta seção destina-se a tornar bastante claro o que se acredita\n"
                + "ser uma conseqüência do restante desta Licença.\n"
                + "\n"
                + "   8. Se a distribuição e / ou utilização do Programa está restrito em\n"
                + "certos países por patentes ou direitos autorais, o\n"
                + "detentor dos direitos autorais original que coloca o Programa sob esta Licença\n"
                + "pode incluir uma limitação geográfica de distribuição, excluindo\n"
                + "esses países, de modo que a distribuição seja permitida apenas naqueles ou entre\n"
                + "países não excluídos. Nesse caso, esta Licença incorpora\n"
                + "a limitação como se estivesse escrita no corpo desta Licença.\n"
                + "\n"
                + "   9. A Free Software Foundation pode publicar versões revisadas e / ou novas versões\n"
                + "da Licença Pública Geral de tempos em tempos. Tais versões novas\n"
                + "ser semelhante em espírito à versão atual, mas podem diferir em detalhes para\n"
                + "abordar novos problemas ou preocupações.\n"
                + "\n"
                + "Cada versão recebe um número de versão distinto. Se o programa\n"
                + "especifica um número de versão desta Licença que se aplica a ele ea \"qualquer\n"
                + "versão posterior \", você tem a opção de seguir os termos e condições\n"
                + "ou daquela versão ou de qualquer versão posterior publicada pela Free\n"
                + "Software Foundation. Se o programa não especifica um número de versão\n"
                + "desta Licença, você pode escolher qualquer versão já publicada pela Free Software\n"
                + "Fundação.\n"
                + "\n"
                + "   10. Se você pretende incorporar partes do Programa em outros livre\n"
                + "programas cujas condições de distribuição são diferentes, escreva ao autor\n"
                + "para pedir permissão. Para software cujos direitos autorais pela Free\n"
                + "Software Foundation, escreva para a Free Software Foundation; às vezes\n"
                + "abrimos exceções para isso. Nossa decisão será guiada pelos dois objetivos\n"
                + "de preservar o estado livre de todos os derivados do nosso software livre e\n"
                + "de promover o compartilhamento e reutilização de software em geral.\n"
                + "\n"
                + "                             NENHUMA GARANTIA\n"
                + "\n"
                + "   11. COMO O PROGRAMA É LICENCIADO SEM ÔNUS, NÃO HÁ GARANTIA\n"
                + "PARA O PROGRAMA, ATÉ AO LIMITE PERMITIDO POR LEI. EXCETO QUANDO\n"
                + "CASO CONTRÁRIO MENCIONADO POR ESCRITO OS DETENTORES DE DIREITOS AUTORAIS E / OU OUTRAS PARTES\n"
                + "FORNECER O PROGRAMA \"COMO ESTÁ\" SEM GARANTIA DE NENHUM TIPO, SEJA EXPRESSA\n"
                + "OU IMPLÍCITA, INCLUINDO, SEM LIMITAÇÃO, AS GARANTIAS DE\n"
                + "COMERCIALIZAÇÃO E ADEQUAÇÃO A UM DETERMINADO FIM. A TOTALIDADE DO RISCO\n"
                + "À QUALIDADE E DESEMPENHO DO PROGRAMA É SEU. Caso o\n"
                + "PROGRAMA APRESENTAR DEFEITOS, VOCÊ ASSUME OS CUSTOS DE TODOS OS SERVIÇOS,\n"
                + "REPAROS E CORREÇÕES.\n"
                + "\n"
                + "   12. EM NENHUM EVENTO EXCEPTO PEDIDO PELA LEI APLICÁVEL OU ACORDO ESCRITO\n"
                + "Qualquer detentor, OU QUALQUER OUTRA PARTE QUE POSSA MODIFICAR E / OU\n"
                + "REDISTRIBUIR O PROGRAMA COMO PERMITIDO ACIMA, SERÁ RESPONSÁVEL POR DANOS,\n"
                + "INCLUINDO QUALQUER GERAL, ESPECIAL, ACIDENTAL OU DANOS DECORRENTES\n"
                + "DO USO OU INCAPACIDADE DE USO DO PROGRAMA (INCLUINDO, SEM LIMITAÇÃO\n"
                + "A PERDA DE DADOS OU DADOS IMPRECISOS ou perdas sustentadas BY\n"
                + "VOCÊ OU TERCEIROS OU UMA FALHA DO PROGRAMA OPERAR COM QUALQUER OUTRO\n"
                + "PROGRAMAS), MESMO QUE TAL DETENTOR OU OUTROS TENHAM SIDO AVISADO DA\n"
                + "POSSIBILIDADE DE TAIS DANOS.\n"
                + "\n"
                + "                      FIM DOS TERMOS E CONDIÇÕES\n"
                + "\n"
                + "             Como aplicar estes termos aos seus novos programas\n"
                + "\n"
                + "   Se você desenvolver um novo programa, e você quer que ele seja da maior\n"
                + "possível uso para o público, a melhor maneira de conseguir isso é para torná-lo\n"
                + "software livre que todos possam redistribuir e modificar sob estes termos.\n"
                + "\n"
                + "   Para isso, anexe os seguintes avisos ao programa. É mais seguro\n"
                + "anexá-los ao início de cada arquivo-fonte para ser mais eficaz\n"
                + "transmitir a exclusão de garantia; e cada arquivo deve ter, pelo menos,\n"
                + "a linha de \"copyright\" e uma indicação de onde o texto completo se encontra.\n"
                + "\n"
                + "     <uma linha para dar o nome do programa e uma breve idéia do que ele faz.>\n"
                + "     Copyright (C) <ano> <nome do autor>\n"
                + "\n"
                + "     Este programa é software livre; você pode redistribuí-lo e / ou modificá-\n"
                + "     -lo sob os termos da GNU General Public License conforme publicada pela\n"
                + "     Free Software Foundation; tanto a versão 2 da Licença, ou\n"
                + "     (a seu critério) qualquer versão posterior.\n"
                + "\n"
                + "     Este programa é distribuído na esperança de que ele vai ser útil,\n"
                + "     mas SEM QUALQUER GARANTIA; inclusive, sem a garantia implícita de\n"
                + "     COMERCIALIZAÇÃO ou de ADEQUAÇÃO A UM DETERMINADO FIM. veja a\n"
                + "     GNU General Public License para mais detalhes.\n"
                + "\n"
                + "     Você deve ter recebido uma cópia da Licença Pública Geral GNU junto\n"
                + "     com este programa; se não, escreva para a Free Software Foundation, Inc.,\n"
                + "     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 EUA.\n"
                + "\n"
                + "Inclua também informações sobre como contactá-lo por correio electrónico e em papel.\n"
                + "\n"
                + "Se o programa é interativo, faça-o mostrar um pequeno aviso como este\n"
                + "quando for iniciado em um modo interativo:\n"
                + "\n"
                + "     Gnomovision versão 69, Copyright (C) ano nome do autor\n"
                + "     Gnomovision vem com ABSOLUTAMENTE NENHUMA GARANTIA; para detalhes escreva `show w '.\n"
                + "     Este é um software livre, e você está convidado a redistribui-lo\n"
                + "     sob certas condições; digite `show c 'para obter detalhes.\n"
                + "\n"
                + "Os comandos hipotéticos `show w 'e` show c' devem mostrar o apropriado\n"
                + "partes da Licença Pública Geral. Claro, os comandos que você pode usar\n"
                + "ser chamado de outra forma que `show w 'e` show c'; eles podem até ser\n"
                + "cliques do mouse ou itens de menu - o que for adequado ao seu programa.\n"
                + "\n"
                + "Você também deve obter do seu empregador (se você trabalha como programador) ou a sua\n"
                + "escola, se houver, para assinar uma \"declaração de direitos autorais\" sobre o programa, se\n"
                + "necessário. Aqui está um exemplo; alterar os nomes:\n"
                + "\n"
                + "   Yoyodyne, Inc., renuncia a todos direitos autorais sobre o programa\n"
                + "   `Gnomovision '(que faz passagens em compiladores) escrito por James Hacker.\n"
                + "\n"
                + "   <assinatura de Ty Coon>, 01 abril de 1989\n"
                + "   Ty Coon, Vice-presidente\n"
                + "\n"
                + "Esta Licença Pública Geral não permite incorporar seu programa em\n"
                + "programas proprietários. Se o seu programa é uma biblioteca de sub-rotina, você pode\n"
                + "considerar mais útil permitir ligar aplicações proprietárias com a\n"
                + "biblioteca. Se é isso que você quer fazer, utilize a GNU Lesser General\n"
                + "Licença Pública ao invés desta Licença.");
        jTextArea2.setText(buffer.toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        jSobre = null;
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
