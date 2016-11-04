package controller;

import model.Jeu;
import vue.Fenetre;

import java.io.IOException;

/**
 * Created by bastien on 28/09/16.
 */

public class ControlGroup {

    public Jeu jeu;
    public Fenetre fenetre;

    public ControlGroup(Jeu jeu) throws IOException {
        this.jeu = jeu;
        fenetre = new Fenetre(this.jeu);

        ControlMenuPrincipal controlMenuPrincipal = new ControlMenuPrincipal(this.jeu, fenetre);
        ControlBarreMenu controlBarreMenu = new ControlBarreMenu(this.jeu, fenetre);
    }
}