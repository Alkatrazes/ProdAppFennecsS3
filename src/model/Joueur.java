package model;

/**
 * Created by charly on 16/11/16.
 */
public class Joueur {

    private int id;
    private String nom;
    private int nbEtoile;

    public Joueur(int _id,String _nom){
        id = _id;
        nom = _nom;
    }

    public Joueur(int _id,String _nom, int _nbEtoile){
        id = _id;
        nom = _nom;
        nbEtoile = _nbEtoile;
    }

    public int getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }

    public void ajouterEtoie(int _nbEtoile) {
        nbEtoile += _nbEtoile;
    }

    public int getNombreEtoie() {
        return nbEtoile;
    }

    public void retirerEtoie(int _nbEtoile) {
        if(_nbEtoile > getNombreEtoie() || _nbEtoile == getNombreEtoie()){
            nbEtoile = 0;
        }
        else{
            nbEtoile -= _nbEtoile;
        }
    }
}
