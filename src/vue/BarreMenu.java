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

    private Fenetre fen;

    public JMenu menu;
    public JMenuItem credit;

    public BarreMenu(Jeu _jeu,Fenetre _fen) {

        jeu = _jeu;
        fen = _fen;

        menu = new JMenu("Menu");
        menu.setActionCommand("Menu");

        credit = null;

        credit();
        this.add(menu);
        fen.setJMenuBar(this);
    }

    public void credit() {
        credit = new JMenuItem("Crédit");
        menu.add(credit);
    }
/*
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        credit.setText("Crédit");
        credit.repaint();
    }
*/
    public void setControl(ControlBarreMenu controlBarreMenu) {
        menu.addActionListener(controlBarreMenu);
    }
}