package vue;

import controller.ControlBarreMenu;
import controller.ControlFenetreNouvellePartie;
import controller.ControlMenuPrincipal;
import model.Jeu;

import javax.swing.*;

/**
 * Created by bastien on 28/09/16.
 */

public class Fenetre extends JFrame {
    private Jeu jeu;
    public MenuPrincipal panelMenuPrincipal;
    public FenetreNouvellePartie panelFenetreNouvellePartie;
    public BarreMenu barreMenu;

    public Fenetre(Jeu jeu) {

        this.jeu = jeu;

        init();
        barreMenu.setVisible(false);
        setJMenuBar(barreMenu);
        setUndecorated(true);
        setContentPane(panelMenuPrincipal);
        pack();
        setTitle("Jeu");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void init() {
        panelMenuPrincipal = new MenuPrincipal();
        panelFenetreNouvellePartie = new FenetreNouvellePartie(jeu);
        barreMenu = new BarreMenu(jeu);
    }

    public void setControlMenuPrincipal(ControlMenuPrincipal controlMenuPrincipal) {
        panelMenuPrincipal.setControl(controlMenuPrincipal);
    }

    public void setControlBarreMenu(ControlBarreMenu controlBarreMenu) {
        barreMenu.setControl(controlBarreMenu);
    }

    public void setControlFenetreNouvellePartie(ControlFenetreNouvellePartie controlFenetreNouvellePartie) {
        panelFenetreNouvellePartie.setControl(controlFenetreNouvellePartie);
    }
}