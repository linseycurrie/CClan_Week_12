package Vehicle.components;

public class ManualGearBox {

    private boolean gearBox;

    public ManualGearBox(boolean gearBox) {
        this.gearBox = gearBox;
    }

    public boolean isGearBoxManual() {
        return gearBox;
    }
}
