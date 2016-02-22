package br.com.ti4b.util;

import br.com.ti4b.visao.telas.Tela_login;
import com.jgoodies.animation.Animation;
import com.jgoodies.animation.AnimationEvent;
import com.jgoodies.animation.AnimationListener;
import com.jgoodies.animation.Animations;
import com.jgoodies.animation.Animator;
import com.jgoodies.animation.swing.animations.BasicTextAnimation;
import com.jgoodies.animation.swing.components.BasicTextLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class Animacao extends JWindow {

    BasicTextLabel label;

    public void Apresentacao() {
        JPanel content = (JPanel) getContentPane();
        content.setLayout(new GridLayout(1, 1));
        content.setBackground(Color.white);
        content.setBorder(BorderFactory.createLineBorder(new Color(0, 153, 0)));
        label = new BasicTextLabel("");
        Font f = new Font("", 1, 45);
        label.setFont(f);
        content.add(label);
        int width = 500;
        int height = 300;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);
        setVisible(true);

        Animation animation = createAnimation();
        AnimationListener al;
        al = new AnimationListener() {

            @Override
            public void animationStarted(AnimationEvent ae) {

            }

            @Override
            public void animationStopped(AnimationEvent ae) {
                synchronized ("A") {
                    "A".notify();
                }
            }
        };
        animation.addAnimationListener(al);
        Animator animator = new Animator(animation, 30);
        animator.start();
        synchronized ("A") {
            try {
                "A".wait();

            } catch (Exception e) {
            }

        }
    }

    private Animation createAnimation() {
        Animation a1 = BasicTextAnimation.defaultSpace(label, 3000, "SEJA BEM VINDO!", new Color(0, 153, 0));
        // Animation a2 = BasicTextAnimation.defaultScale(label, 1000, "AO", Color.green);
        Animation a3 = BasicTextAnimation.defaultFade(label, 3000, "AO LEGADO :)", Color.orange);
        //  Animation a4 = BasicTextAnimation.defaultSpace(label, 5000, ":)", Color.black);
        Animation allSeq = Animations.sequential(new Animation[]{
            Animations.pause(1000), a1, Animations.pause(1000), a3, Animations.pause(1000)});
        return Animations.parallel(allSeq, a1);
    }

    public static void main(String[] args) {
        Animacao animacao = new Animacao();
        animacao.Apresentacao();
        new Tela_login().setVisible(true);
        animacao.dispose();
        // System.exit(0);
    }
}
