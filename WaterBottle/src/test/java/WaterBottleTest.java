import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void Before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void volumeBeginsAt100ml(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeBy10ml(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void emptyReducesVolumeTo0ml(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fillReturnsVolumeTo100ml(){
        waterbottle.empty();
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }

}