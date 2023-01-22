import cabincrew.FlightAttendant;
import cabincrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    private FlightAttendant flightAttendant;

    @Before
    public void before(){
        flightAttendant = new FlightAttendant("Elaine Dickinson", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Elaine Dickinson", flightAttendant.getName());
    }

    @Test
    public void canPassMessageToPassengers(){
        assertEquals("Elaine Dickinson: Is there a doctor on board?", flightAttendant.messageToPassengers(flightAttendant));
    }
}
