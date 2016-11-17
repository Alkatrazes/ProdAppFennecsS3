package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by raphael on 17/11/16.
 */
public class TasCartes {

    List <Carte> tasCartes;

    TasCartes(){
        tasCartes = new ArrayList<Carte>();
    }

    public void addCarte(Carte c){
        tasCartes.add(c);
    }

    public void melangeCarte(){
        Collections.shuffle(tasCartes);
    }

    public void distribCarte(){

    }
}
