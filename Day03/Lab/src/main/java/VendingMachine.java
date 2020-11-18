import sun.text.UCompactIntArray;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {

    private ArrayList<IProduct> products;
    private HashMap<Coins, Integer> balance;
    private HashMap<Coins, Integer> currentAmount;
    private HashMap<Coins, Integer> returnedAmount;
    private Coins coins;

    public VendingMachine(ArrayList<IProduct> products) {
        this.products = products;
        this.balance = genBalance();
        this.currentAmount = genCurrentAmount();
        this.returnedAmount = genReturnedAmount();
    }

    public HashMap<Coins, Integer> genReturnedAmount(){
        returnedAmount = new HashMap<Coins, Integer>();
        for(Coins coin : Coins.values()){
            returnedAmount.put(coin, 0);
            System.out.println(returnedAmount);
        }
        return returnedAmount;
    }


    public HashMap<Coins, Integer> genBalance(){
        balance = new HashMap<Coins, Integer>();
        for(Coins coin : Coins.values()){
            balance.put(coin, 0);
            System.out.println(balance);
        }
        return balance;
    }

    public HashMap<Coins, Integer> genCurrentAmount(){
        currentAmount = new HashMap<Coins, Integer>();
        for(Coins coin : Coins.values()){
            currentAmount.put(coin, 0);
            System.out.println(currentAmount);
        }
        return currentAmount;
    }


    public ArrayList<IProduct> getProducts() {
        return products;
    }

    public HashMap<Coins, Integer> getBalance() {
        return balance;
    }

    public HashMap<Coins, Integer> getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(HashMap<Coins, Integer> currentAmount) {
        this.currentAmount = currentAmount;
    }

    public IProduct getProduct(IProduct product){
        int index = this.products.indexOf(product);
        return this.products.get(index);
    }

    public int getSizeAL(ArrayList arrayList){
        return arrayList.size();
    }

    public int getSizeOfBalance(){
        return balance.size();
    }

    public boolean checkCoin(Coins coin, int amount) {
            if (coin.getValue() < .05){
                returnedAmount.put(coin, amount);
                return false;
            }
            return true;
        }


    public int getSizeOfCurrentAmount() {
        return this.currentAmount.size();
    }

    public void getCoin(Coins coin, int amount){
        if(checkCoin(coin, amount)){
          int i = getAmount(coin);
            currentAmount.put(coin, ( i + amount));
        }
    }

    public int getAmount(Coins coin){
        int i = currentAmount.get(coin);
        System.out.println(i);
        return i;
    }
}
