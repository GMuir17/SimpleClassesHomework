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

}
