public class Crisp extends Product{


    private static final String CODE = "Crisp";

    public Crisp(double price, int amount) {
        super(price, amount);
    }

    public String getCode() {
        return CODE;
    }
}
