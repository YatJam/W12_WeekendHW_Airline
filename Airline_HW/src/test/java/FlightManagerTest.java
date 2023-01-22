import flight.Flight;
import flight.FlightManager;
import flight.Passenger;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.planeType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;

    private Plane plane;

    private Flight flight;

    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(planeType.CONCORDE);
        flight = new Flight(plane, "FR123", "Crab Town", "Pickle Palace", "14:03");
        passenger1 = new Passenger("Bobby", 1);
        passenger2 = new Passenger("Bobbert", 3);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canGetFlightType(){
        assertEquals(planeType.CONCORDE, plane.getPlaneType());
    }

    @Test
    public void getBagWeightPerPassenger(){
        assertEquals(25, flightManager.bagWeightPerPerson(), 0.0);
    }
}
