package vue;

import controller.ControlFenetreNouvellePartie;
import model.Jeu;

import javax.swing.*;
import java.awt.*;

import static model.Jeu.X;
import static model.Jeu.Y;


/**
 * Created by bastien on 16/11/1.
 */

public class FenetreNouvellePartie extends JPanel {

    private Jeu jeu;
    public JButton retour;

    public FenetreNouvellePartie(Jeu jeu) {

        this.jeu = jeu;

        this.setLayout(null);
        setPreferredSize(new Dimension(X, Y));

        retour = new JButton("Retour");
        retour.setActionCommand("Retour");

        add(retour);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        retour.setBounds((int) (19 / 48.0 * X), (int) (14 / 27.0 * Y), (int) (5 / 24.0 * X), (int) (1 / 18.0 * Y));
        retour.setBackground(new Color(255, 0, 0, 0));
        retour.setFocusable(false);
        retour.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Image img = getToolkit().getImage("imag.png");
        //g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

    public void setControl(ControlFenetreNouvellePartie controlFenetreNouvellePartie) {
        retour.addActionListener(controlFenetreNouvellePartie);
    }
}