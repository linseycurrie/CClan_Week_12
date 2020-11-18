package Vehicle;

import Vehicle.components.Doors;
import Vehicle.components.Engine;
import Vehicle.components.ManualGearBox;
import Vehicle.components.Tyres;

public abstract class Vehicle {

    private Engine engine;
    private Tyres tyres;
    private Doors doors;
    private ManualGearBox manualGearBox;
    private double price;
    private String colour;
    private String name;

    public Vehicle(Engine engine, Tyres tyres, Doors doors, ManualGearBox manualGearBox, double price, String colour, String name) {
        this.engine = engine;
        this.tyres = tyres;
        this.doors = doors;
        this.manualGearBox = manualGearBox;
        this.price = price;
        this.colour = colour;
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Doors getDoors() {
        return doors;
    }

    public ManualGearBox getManualGearBox() {
        return manualGearBox;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }
}
