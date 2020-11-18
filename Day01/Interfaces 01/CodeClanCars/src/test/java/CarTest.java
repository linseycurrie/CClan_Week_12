import Vehicle.Car;
import Vehicle.components.Doors;
import Vehicle.components.Engine;
import Vehicle.components.ManualGearBox;
import Vehicle.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Tyres tyres;
    Doors doors;
    ManualGearBox manualGearBox;
    Engine engine;

    @Before
    public void before(){
        tyres = new Tyres(4);
        doors = new Doors(4);
        manualGearBox = new ManualGearBox(true);
        engine = new Engine(200, "Diesel");
        car = new Car( engine, tyres, doors, manualGearBox, 12000, "Blue", "Fiesta");
    }

    @Test
    public void hasEngineHP(){
        assertEquals(200, car.getEngine().getHorsePower());
    }

    @Test
    public void hasEngineFuelType(){
        assertEquals("Diesel", car.getEngine().getFuelType());
    }

    @Test
    public void hasTyres(){
        assertEquals(4, car.getTyres().getNumberOfTyres());
    }

    @Test
    public void hasDoors(){
        assertEquals(4, car.getDoors().getNumberOfDoors());
    }

    @Test
    public void isManualGearBox(){
        assertEquals(true, car.getManualGearBox().isGearBoxManual());
    }

    @Test
    public void hasPrice(){
        assertEquals(12000, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void hasName(){
        assertEquals("Fiesta", car.getName());
    }
}
