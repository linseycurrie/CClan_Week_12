import Vehicle.components.ManualGearBox;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManualGearBoxTest {

    ManualGearBox manualGearBox;

    @Test
    public void hasManualGearBoxPositive(){
        manualGearBox = new ManualGearBox(true);
        assertEquals(true, manualGearBox.isGearBoxManual());
    }

    @Test
    public void hasManualGearBoxNegative(){
        manualGearBox = new ManualGearBox(false);
        assertEquals(false, manualGearBox.isGearBoxManual());
    }


}
