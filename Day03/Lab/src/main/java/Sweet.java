public class Sweet extends Product{


    private static final String CODE = "Sweet";

    public Sweet(double price, int amount) {
        super(price, amount);
    }

    public String getCode() {
        return CODE;
    }
}
