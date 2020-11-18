import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> card;

    public Wallet(String name) {
        this.name = name;
        this.card = new ArrayList<IScan>();;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        int total=0;
        for (int i=0; i < this.card.size(); i++){
            total += 1;
        }
        return total;

//        return this.card.size() + this.card.size() + this.card.size() + this.card.size();
    }

    public void addItem(IScan card) {
        this.card.add(card);
    }

}
