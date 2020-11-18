import Vehicle.components.Engine;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Test
    public void hasEngineHP(){
        engine = new Engine(200, "Diesel");
        assertEquals(200, engine.getHorsePower());
    }

    @Test
    public void hasEngineFuelType(){
        engine = new Engine(200, "Diesel");
        assertEquals("Diesel", engine.getFuelType());
    }
}
