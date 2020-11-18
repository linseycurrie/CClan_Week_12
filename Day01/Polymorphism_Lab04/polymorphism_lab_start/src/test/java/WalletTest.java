import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    private Wallet wallet;
    private IScan card1;
    private IScan card2;
    private IScan card3;
    private IScan card4;


    @Before()
    public void before(){
        wallet = new Wallet("Isa's Wallet");
        card1 = new CreditCard("1111222233334444", "12/23", 234);
        card2 = new DebitCard("1111222233334444", 909090, 12345678, "12/23", 234);
        card3 = new LoyaltyCard("123456787890", "Harrid's Stores");
        card4 = new Ticket("AB12345", "QWERTY123456", "26/01/2020");
    }

    @Test
    public void canGetWalletName() {
        assertEquals("Isa's Wallet", wallet.getName());
    }

    @Test
    public void walletStartsEmpty() {
        assertEquals(0, wallet.getNumberOfItems());
    }

    @Test
    public void canAddCardToWallet() {
        wallet.addItem(card1);
        assertEquals(1, wallet.getNumberOfItems());
    }

    @Test
    public void canAddEverythingToWallet() {
        wallet.addItem(card1);
        wallet.addItem(card2);
        wallet.addItem(card3);
        wallet.addItem(card4);
        assertEquals(4, wallet.getNumberOfItems());
    }
}
