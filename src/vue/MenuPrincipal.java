package vue;

import controller.ControlMenuPrincipal;

import javax.swing.*;
import java.awt.*;

import static model.Jeu.X;
import static model.Jeu.Y;

/**
 * Created by bastien on 29/09/16.
 */

public class MenuPrincipal extends JPanel {

    public JButton jouer, quitter;

    public MenuPrincipal() {

        this.setLayout(null);
        setPreferredSize(new Dimension(X, Y));

        jouer = new JButton("Jouer");
        jouer.setActionCommand("Jouer");
        quitter = new JButton("Quitter");
        quitter.setActionCommand("Quitter");

        add(jouer);
        add(quitter);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        jouer.setBounds((int) (19 / 48.0 * X), (int) (23 / 54.0 * Y), (int) (5 / 24.0 * X), (int) (1 / 18.0 * Y));
        jouer.setBackground(new Color(255, 0, 0, 0));
        jouer.setFocusable(false);
        jouer.setCursor(new Cursor(Cursor.HAND_CURSOR));

        quitter.setBounds((int) (19 / 48.0 * X), (int) (14 / 27.0 * Y), (int) (5 / 24.0 * X), (int) (1 / 18.0 * Y));
        quitter.setBackground(new Color(255, 0, 0, 0));
        quitter.setFocusable(false);
        quitter.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Image img = getToolkit().getImage("imag.png");
        //g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

    public void setControl(ControlMenuPrincipal controlMenuPrincipal) {
        jouer.addActionListener(controlMenuPrincipal);
        quitter.addActionListener(controlMenuPrincipal);
    }
}