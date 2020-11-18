import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColaTest {

    @Test
    public void hasCode() {
        Cola cola = new Cola(1.00, 20);
        assertEquals("Cola", cola.getCode());
    }

    @Test
    public void hasAmount() {
        Cola cola = new Cola(1.00, 20);
        assertEquals(20, cola.getAmount());
    }


}
