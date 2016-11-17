package vue;

import controller.ControlBarreMenu;
import model.Jeu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Florian Vaissiere on 03/10/2016.
 */

public class BarreMenu extends JMenuBar {

    private Jeu jeu;

    public JMenu menu;
    public JMenuItem nouvellePartie, menuPrincipal, quitter;

    public BarreMenu(Jeu _jeu) {

        jeu = _jeu;

        menu = new JMenu("Menu");
        nouvellePartie = new JMenuItem("Nouvelle Partie");
        nouvellePartie.setActionCommand("Nouvelle Partie");
        menuPrincipal = new JMenuItem("Menu Principal");
        menuPrincipal.setActionCommand("Menu Principal");
        quitter = new JMenuItem("Quitter");
        quitter.setActionCommand("Quitter");

        menu.add(nouvellePartie);
        menu.add(menuPrincipal);
        menu.add(quitter);

        add(menu);

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void setControl(ControlBarreMenu controlBarreMenu) {
        nouvellePartie.addActionListener(controlBarreMenu);
        menuPrincipal.addActionListener(controlBarreMenu);
        quitter.addActionListener(controlBarreMenu);
    }
}