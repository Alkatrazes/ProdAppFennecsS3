package model;

import java.awt.*;

/**
 * Created by bastien on 28/09/16.
 */

public class Jeu {

    public static Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    public static final int X = (int) tailleEcran.getWidth();
    public static final int Y = (int) tailleEcran.getHeight();

    public Jeu() {
    }
}