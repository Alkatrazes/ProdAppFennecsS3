import model.Carte;
import model.Joueur;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarOutputStream;

/**
 * Created by charly on 16/11/16.
 */
public class JoueurTestUnit {

    @Test
    public void testJoueurGetIdEtGetNom() {
        Joueur j1 = new Joueur(1,"Titi");
        Assert.assertEquals(1,j1.getId());
        Assert.assertEquals("Titi",j1.getNom());
    }

    @Test
    public void testJoueurGetIdEtGetNomPourUneCollectionDeJoueur() {
        String nom[] = {"Titi","Toto","Tutu"};
        Map<Integer,Joueur> listeJoueur = new HashMap<Integer,Joueur>();
        for(int i = 0;i<nom.length;i++){
            Joueur j = new Joueur(i+1,nom[i]);
            listeJoueur.put(i+1,j);
        }
        for(int j = 0;j<listeJoueur.size();j++){
            Assert.assertEquals(j+1,listeJoueur.get(j+1).getId());
            Assert.assertEquals(nom[j],listeJoueur.get(j+1).getNom());
        }
    }
}
