package vue;

import com.sun.naming.internal.FactoryEnumeration;
import controller.ControlMenuPrincipal;

import javax.swing.*;
import java.awt.*;

import static vue.Fenetre.X;
import static vue.Fenetre.Y;

/**
 * Created by bastien on 29/09/16.
 */

public class MenuPrincipal extends JPanel {

    public Fenetre fen;
    public JButton jouer, options, credits, quitter;

    public MenuPrincipal(Fenetre _fen){

        fen = _fen;

        this.setLayout(null);
        fen.setPreferredSize(new Dimension(X, Y));

        jouer = new JButton("Jouer");
        jouer.setActionCommand("Jouer");
        options = new JButton("Options");
        options.setActionCommand("Options");
        credits = new JButton("Crédits");
        credits.setActionCommand("Crédits");
        quitter = new JButton("Quitter");
        quitter.setActionCommand("Quitter");

        add(jouer);
        add(options);
        add(credits);
        add(quitter);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        jouer.setBounds((X/2)-415/2, 100, 415, 52);
        jouer.setBackground(new Color(255, 0, 0, 0));
        jouer.setFocusable(false);
        jouer.setCursor(new Cursor(Cursor.HAND_CURSOR));

        options.setBounds((X/2)-415/2, 200, 415, 52);
        options.setBackground(new Color(255, 0, 0, 0));
        options.setFocusable(false);
        options.setCursor(new Cursor(Cursor.HAND_CURSOR));

        credits.setBounds((X/2)-415/2, 300, 415, 52);
        credits.setBackground(new Color(255, 0, 0, 0));
        credits.setFocusable(false);
        credits.setCursor(new Cursor(Cursor.HAND_CURSOR));

        quitter.setBounds((X/2)-415/2, 400, 418, 52);
        quitter.setBackground(new Color(255, 0, 0, 0));
        quitter.setFocusable(false);
        quitter.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Image img = getToolkit().getImage("images/test.jpg");
        //g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

    public void setControl(ControlMenuPrincipal controlMenuPrincipal) {
        jouer.addActionListener(controlMenuPrincipal);
        options.addActionListener(controlMenuPrincipal);
        credits.addActionListener(controlMenuPrincipal);
        quitter.addActionListener(controlMenuPrincipal);
    }
}