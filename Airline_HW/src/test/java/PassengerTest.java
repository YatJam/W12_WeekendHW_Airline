import flight.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Ted Striker", 1);
    }

    @Test
    public void getPassengerName(){
        assertEquals("Ted Striker", passenger.getName());
    }

    @Test
    public void getPassengerBagQuantity(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
