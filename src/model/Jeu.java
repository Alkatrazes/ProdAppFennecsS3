package model;

import java.awt.*;

/**
 * Created by bastien on 28/09/16.
 */

public class Jeu {

    private Joueur tabJoueur[];

    public static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    public static final int X = (int) tailleEcran.getWidth();
    public static final int Y = (int) tailleEcran.getHeight();
    private int nbJoueur;

    public Jeu() {
        tabJoueur = null;
    }

    public void addJoueur(Joueur joueur) {
        for (int i = 0; i < tabJoueur.length; i++)
            if (tabJoueur[i] == null) {
                tabJoueur[i] = joueur;
                break;
            }
    }

    public Joueur getJoueur(int i) {
        return tabJoueur[i];
    }

    public void initNbJoueur(int i) {
        tabJoueur = new Joueur[i];

    }

    public int getNbJoueur() {
        return tabJoueur.length;
    }
}