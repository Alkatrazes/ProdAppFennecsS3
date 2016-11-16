package controller;

import model.Jeu;
import vue.Fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bastien on 06/10/16.
 */

public class ControlBarreMenu extends Control implements ActionListener {

    protected ControlBarreMenu(Jeu jeu, Fenetre fenetre) {
        super(jeu, fenetre);
        fenetre.setControlBarreMenu(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Nouvelle Partie":
                fenetre.barreMenu.setVisible(true);
                fenetre.setContentPane(fenetre.panelFenetreNouvellePartie);
                fenetre.repaint();
                fenetre.pack();
                fenetre.setLocationRelativeTo(null);
                fenetre.requestFocus();
                break;
            case "Menu Principal":
                fenetre.barreMenu.setVisible(false);
                fenetre.setContentPane(fenetre.panelMenuPrincipal);
                fenetre.repaint();
                fenetre.pack();
                fenetre.setLocationRelativeTo(null);
                fenetre.requestFocus();
                break;
            case "Quitter":
                System.exit(0);
                break;
        }
        fenetre.repaint();
    }
}