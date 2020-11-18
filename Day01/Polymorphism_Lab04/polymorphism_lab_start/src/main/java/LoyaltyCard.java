public class LoyaltyCard implements IScan {
    private String barCode;
    private String vendor;

    public LoyaltyCard(String barCode, String vendor) {
        this.barCode = barCode;
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String scan(String data) {
        return this.barCode;
    }
}
