package br.com.ti4b.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Otavio Costa
 */
public class Mensagens {

    public static void mensagensDeErro(int valorDoErro,Exception e) {
        switch (valorDoErro) {
            case 1:
                JOptionPane.showMessageDialog(null, "Ocorreu um erro durante inesperado!", "ERRO...", JOptionPane.ERROR_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao efetuar login!\nERRO: "+e.getMessage(), "ERRO...", JOptionPane.ERROR_MESSAGE);
                break;
        }

    }

}
