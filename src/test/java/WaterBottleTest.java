import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void getVolumeTest() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkTest() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyTest() {
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void fillTest() {
        assertEquals(100, waterBottle.fill());
    }



}
