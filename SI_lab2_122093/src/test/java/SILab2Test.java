import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private final TestingService testingService = new TestingService();

    /* Ovoj test slucaj vrakja true bidejki nieden od atributite vo objektot "item"
     ne gi ispolnuva uslovite vo testingThreeCombination  */
    @Test
    void testFalse(){
        Item item = new Item("Ime item", 10, 300, 0);
        assertFalse(testingService.testingThreeCombination(item));
    }

    /* Ovoj test slucaj vrakja true, toa znaci deka funkcijata testingDiscount kje bide vistina
    * se dodeka discount > 0, vo slucajot podolu discount = 50 */
    @Test
    void testTrue(){
        Item item2 = new Item("Ime item", 100, 300, 50);
        assertTrue(testingService.testingDiscount(item2));
    }

}
