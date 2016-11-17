package model;

/**
 * Created by bastien on 04/11/16.
 */
public class Carte {

    private int valeur [];
    private enum Etat{
        CACHEE("Face cachee"),
        VISIBLE("Face visible");

        private String etat = "";

        Etat(String etat){this.etat = etat;}

        public String toString(){
            return etat;
        }
    }
    private Etat etatBase = Etat.CACHEE;
    private Etat etat;

    public Carte(int valeur) {
        this.valeur = new int[]{valeur};
        this.etat = etatBase;
    }

    public Carte(int valeur1, int valeur2) {
        this.valeur = new int[]{valeur1, valeur2};
        this.etat = etatBase;
    }

    public int getValeur() {
        return valeur[0];
    }

    public int getValeur(int indiceValeur) {
        return valeur[indiceValeur];
    }

    public boolean getEtat(){
        if(this.etat == Etat.VISIBLE){
            return true;
        }
        return false;
    }
}
