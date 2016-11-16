import model.Jeu;
import model.Joueur;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bastien on 16/11/16.
 */
public class JeuUnitTest {

    @Test
    public void testNombreDeJoueur() {
        Jeu j = new Jeu();
        j.initNbJoueur(3);
        Assert.assertEquals(3, j.getNbJoueur());

    }

    @Test
    public void testCreerPlusieurJoueur() {
        Jeu j = new Jeu();
        j.initNbJoueur(3);
        j.addJoueur(new Joueur("bob"));
        j.addJoueur(new Joueur("patrick"));
        j.addJoueur(new Joueur("serge"));

        Assert.assertEquals("bob", j.getJoueur(0).getNom());
        Assert.assertEquals("patrick", j.getJoueur(1).getNom());
        Assert.assertEquals("serge", j.getJoueur(2).getNom());
    }
}
