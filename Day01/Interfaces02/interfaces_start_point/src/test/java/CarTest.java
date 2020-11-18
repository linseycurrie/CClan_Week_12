import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void canConvertCar(){
//        Given we have a Car
        Car car = new Car("Tesla", 3);
//        When we pass it to the convertor
        String message = Converter.process(car);
//        Then we should see the converted String
        assertEquals("Car data", message);
    }


}
