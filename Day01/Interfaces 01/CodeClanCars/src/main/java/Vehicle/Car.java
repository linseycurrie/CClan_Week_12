package Vehicle;

import Vehicle.components.Doors;
import Vehicle.components.Engine;
import Vehicle.components.ManualGearBox;
import Vehicle.components.Tyres;

public class Car extends Vehicle{

    public Car(Engine engine, Tyres tyres, Doors doors, ManualGearBox manualGearBox, double price, String colour, String name) {
        super(engine, tyres, doors, manualGearBox, price, colour, name);
    }

}
