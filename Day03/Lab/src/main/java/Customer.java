import java.util.ArrayList;

public class Customer {

    private ArrayList<IProduct> purchases;
    private ArrayList<Double> balance;
    private ArrayList<Double> currentSpent;

    public Customer(ArrayList<IProduct> purchases, ArrayList<Double> balance, ArrayList<Double> currentSpent) {
        this.purchases = purchases;
        this.balance = balance;
        this.currentSpent = currentSpent;
    }

    public ArrayList<IProduct> getPurchases() {
        return purchases;
    }

    public ArrayList<Double> getBalance() {
        return balance;
    }

    public ArrayList<Double> getCurrentSpent() {
        return currentSpent;
    }


}
