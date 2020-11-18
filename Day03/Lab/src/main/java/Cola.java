public class Cola extends Product{

    private static final String CODE = "Cola";

    public Cola(double price, int amount) {
        super(price, amount);
    }

    public String getCode() {
        return CODE;
    }
}
