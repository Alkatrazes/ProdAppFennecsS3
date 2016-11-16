package model;

/**
 * Created by bastien on 04/11/16.
 */
public class Carte {

    private int valeur [];

    public Carte(int valeur) {
        this.valeur = new int[]{valeur};
    }

    public Carte(int valeur1, int valeur2) {
        this.valeur = new int[]{valeur1, valeur2};
    }

    public int getValeur() {
        return valeur[0];
    }

    public int getValeur(int indiceValeur) {
        return valeur[indiceValeur];
    }
}
