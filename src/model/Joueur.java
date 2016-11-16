package model;

/**
 * Created by charly on 16/11/16.
 */
public class Joueur {

    private int id;
    private String nom;

    public Joueur(int _id,String _nom){
        id = _id;
        nom = _nom;
    }

    public int getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }
}
