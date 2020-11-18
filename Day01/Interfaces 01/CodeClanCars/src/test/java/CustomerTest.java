import Actors.Customer;
import Vehicle.Car;
import Vehicle.components.Doors;
import Vehicle.components.Engine;
import Vehicle.components.ManualGearBox;
import Vehicle.components.Tyres;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Engine engine;
    Tyres tyres;
    Doors doors;
    ManualGearBox manualGearBox;


    @Before
    public void before(){
        ArrayList<Car> customercars = new ArrayList<Car>();
        customer = new Customer("Bob", 20000, customercars);
        car = new Car( engine, tyres, doors, manualGearBox, 12000, "Blue", "Fiesta");
        customercars.add(car);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void hasbalance(){
        assertEquals(20000, customer.getBalance(), 0.01);
    }

    @Test
    public void hasCarsSize(){
        assertEquals(1, customer.getCarsSize());
    }

    @Test
    public void hasCarsName(){
        assertEquals("Fiesta", customer.getCarsName(car));
    }

    @Test
    public void canBuyCarPos(){
        assertEquals(true, customer.buyCar(customer, car));
    }

    @Test
    public void canBuyCarNeg(){
        ArrayList<Car> customercars = new ArrayList<Car>();
        customer = new Customer("Bob", 20000, customercars);
        car = new Car( engine, tyres, doors, manualGearBox, 22000, "Blue", "Fiesta");
        customercars.add(car);
        assertEquals(false, customer.buyCar(customer, car));
    }

    

}
