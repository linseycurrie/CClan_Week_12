import Vehicle.components.Tyres;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Test
    public void hasTyres(){
        tyres = new Tyres(4);
        assertEquals(4, tyres.getNumberOfTyres());
    }
}
