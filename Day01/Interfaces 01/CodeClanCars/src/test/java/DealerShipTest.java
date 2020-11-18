//import Actors.Customer;
//import Actors.Dealership;
//import Vehicle.Car;
//import Vehicle.components.Doors;
//import Vehicle.components.Engine;
//import Vehicle.components.ManualGearBox;
//import Vehicle.components.Tyres;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
//public class DealerShipTest {
//}
//import Actors.Customer;
//        import Vehicle.Car;
//        import Vehicle.components.Doors;
//        import Vehicle.components.Engine;
//        import Vehicle.components.ManualGearBox;
//        import Vehicle.components.Tyres;
//        import org.junit.Before;
//        import org.junit.Test;
//
//        import java.util.ArrayList;
//
//        import static org.junit.Assert.assertEquals;
//
//public class DealershipTest {
//
//    Dealership dealer;
//    Car car;
//    Engine engine;
//    Tyres tyres;
//    Doors doors;
//    ManualGearBox manualGearBox;
//
//
//    @Before
//    public void before(){
//        ArrayList<Car> dealershipCars = new ArrayList<Car>();
//        dealer = new Dealership("Bob's Autos", 20000, dealershipCars);
//        car = new Car( engine, tyres, doors, manualGearBox, 12000, "Blue", "Fiesta");
//        dealershipCars.add(car);
//    }
//
//    @Test
//    public void hasName(){
//        assertEquals("Bob's Autos", dealer.getName());
//    }
//
//    @Test
//    public void hasbalance(){
//        assertEquals(20000, dealer.getBalance(), 0.01);
//    }
//
//    @Test
//    public void hasCarsSize(){
//        assertEquals(1, dealer.getCarsSize());
//    }
//
//    @Test
//    public void hasCarsName(){
//        assertEquals("Fiesta", dealer.getCarsName(car));
//    }
//
//}