import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private ArrayList<CrewMember> crewMembers;
    private Passenger passenger1;
    private Passenger passenger2;


    @Before
    public void before() {
        pilot = new Pilot("Jeff", CrewMemberRank.CAPTAIN, "12345B");
        crewMembers = new ArrayList<>();
        passenger1 = new Passenger("Harry", 2);
        passenger2 = new Passenger("Clementine", 3);
        flight = new Flight(pilot, crewMembers, "FR756", "EDI", "MEN", "6PM", 500,  165);
    }

    @Test
    public void testGetAvailableSeats() {
        assertEquals(164, flight.getAvailableSeats());
    }

    @Test
    public void testBookPassenger() {
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(162, flight.getAvailableSeats());
    }

}
