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

    public JMenu test;
    public JMenuItem menu;

    public BarreMenu(Jeu jeu) {

        this.jeu = jeu;

        menu = new JMenuItem("Menu");
        menu.setActionCommand("Menu");

        test = null;

        add(menu);
    }

    public void test() {
        test = new JMenu("test");
        add(test);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        test.setText("test");
        test.repaint();
    }

    public void setControl(ControlBarreMenu controlBarreMenu) {
        menu.addActionListener(controlBarreMenu);
    }
}