import model.Carte;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bastien on 16/11/16.
 */
public class CarteUnitTest {

    @Test
    public void testPourUneCarteA1Valeur() {
        Carte c = new Carte(1);
        Assert.assertEquals(1,c.getValeur());
    }

    @Test
    public void testPourUneCarteA2Valeur() {
        Carte c = new Carte(1, 5);
        Assert.assertEquals(1,c.getValeur(0));
        Assert.assertEquals(5,c.getValeur(1));
    }
}