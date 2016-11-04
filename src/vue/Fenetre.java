package vue;

import controller.ControlBarreMenu;
import controller.ControlMenuPrincipal;
import model.Jeu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bastien on 28/09/16.
 */

public class Fenetre extends JFrame {
    public static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

    public static final int X = (int) tailleEcran.getWidth();
    public static final int Y = (int) tailleEcran.getHeight();
    private Jeu jeu;
    public MenuPrincipal panelMenuPrincipal;
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
        barreMenu = new BarreMenu(jeu);
    }

    public void setControlMenuPrincipal(ControlMenuPrincipal controlMenuPrincipal) {
        panelMenuPrincipal.setControl(controlMenuPrincipal);
    }

    public void setControlBarreMenu(ControlBarreMenu controlBarreMenu) {
        barreMenu.setControl(controlBarreMenu);
    }
}