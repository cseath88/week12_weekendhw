import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before() {
        passenger1 = new Passenger("Clive", 2);
        passenger2 = new Passenger("Jane", 4);
    }

    @Test
    public void hasName() {
        assertEquals("Clive", passenger1.getName());
    }

    @Test
    public void canGetTotalBags() {
        assertEquals(4, passenger2.getTotalBags());
    }
}
