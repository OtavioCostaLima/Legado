/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ti4b.visao.telas;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Otavio Costa
 * @param <T>
 */
public class GerenciadorDeJanelas<T extends JInternalFrame> {

    private JDesktopPane DESKTOP_PANE;
    private T t;

    private static GerenciadorDeJanelas gerenciadorDeJanelas;

    public static GerenciadorDeJanelas getInstancia() {
        if (gerenciadorDeJanelas == null) {
            gerenciadorDeJanelas = new GerenciadorDeJanelas();
        }
        return gerenciadorDeJanelas;
    }

    private GerenciadorDeJanelas() {

    }

    private GerenciadorDeJanelas(JDesktopPane desktopPane) {
        this.DESKTOP_PANE = desktopPane;

    }

    public void openInternalFrame(T t) {
        this.t = t;
        if (t.isVisible()) {
            t.toFront();
            t.requestFocus();
        } else {
            DESKTOP_PANE.add(t);
            t.setVisible(true);
        }
        setPosicao();
    }

    public JDesktopPane getDESKTOP_PANE() {
        return DESKTOP_PANE;
    }

    public void setDESKTOP_PANE(JDesktopPane DESKTOP_PANE) {
        this.DESKTOP_PANE = DESKTOP_PANE;
    }

    private void setPosicao() {
        Dimension d = this.getDESKTOP_PANE().getSize();
        t.setLocation((d.width - t.getSize().width) / 2, (d.height - t.getSize().height) / 2);
    }

}
