public enum Coins {

    ONE(.01),
    TWO(.02),
    FIVE(.05),
    TEN(.10),
    TWENTY(.20),
    FIFTY(.50),
    POUND(1.00);


    private final double value;

    Coins(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
