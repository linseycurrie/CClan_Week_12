import Vehicle.components.Doors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorsTest {

    Doors doors;

    @Test
    public void hasDoors(){
        doors = new Doors(4);
        assertEquals(4,  doors.getNumberOfDoors());
    }

}
