import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    Cola cola;
    Sweet sweet;
    Crisp crisp;
    VendingMachine vendingMachine;
    HashMap<Coins, Integer> currentAmount;
    ArrayList<IProduct> arrayListProducts;





    @Before
    public void before(){
        cola = new Cola(1.00, 10);
        sweet = new Sweet(65, 10);
        crisp = new Crisp(50, 10);
        arrayListProducts = new ArrayList();
        currentAmount = new HashMap<Coins, Integer>();
        arrayListProducts.add(cola);
        arrayListProducts.add(sweet);
        arrayListProducts.add(crisp);
        vendingMachine = new VendingMachine(arrayListProducts);

    }


    @Test
    public void onlyacceptsValidCoinsSlots(){
        vendingMachine.getCoin(Coins.FIFTY, 1);
        vendingMachine.getCoin(Coins.ONE, 1);
        vendingMachine.getCoin(Coins.POUND, 1);
        assertEquals(7, vendingMachine.getSizeOfCurrentAmount());
    }

    @Test
    public void canGenBalance(){
        vendingMachine.genBalance();
        assertEquals(7, vendingMachine.getSizeOfBalance());

    }

    @Test
    public void canget(){
        vendingMachine.getCoin(Coins.POUND, 1);
        assertEquals(1, vendingMachine.getAmount(Coins.POUND));

    }
}
