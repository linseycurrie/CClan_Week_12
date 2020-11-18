package Vehicle.components;

public class Engine {

    private int horsePower;
    private String fuelType;

    public Engine(int horsePower, String fuelType) {
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }
}
