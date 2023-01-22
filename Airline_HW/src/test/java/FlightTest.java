import cabincrew.CabinCrew;
import cabincrew.FlightAttendant;
import cabincrew.Pilot;
import cabincrew.Rank;
import flight.Flight;
import flight.Passenger;
import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.planeType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flightFR756;
    private Plane plane;
    private Pilot pilot;
    private Pilot coPilot;
    private FlightAttendant flightAttendant;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(planeType.BOEING747);
        flightFR756 = new Flight(plane, "FR756", "GLA, EDI", "GLA, EDI", "13:17");
        pilot = new Pilot("Clarence Oveur", Rank.CAPTAIN, "12345OVEUR67");
        coPilot = new Pilot("Roger Murdock", Rank.FIRSTOFFICER, "54321MURDOCK98");
        flightAttendant = new FlightAttendant("Elaine Dickinson", Rank.FLIGHTATTENDANT);
        passenger1 = new Passenger("Ted Striker", 1);
        passenger2 = new Passenger("Dr Rumak", 2);
        }


        @Test
        public void canGetPlaneType(){
            assertEquals(plane, flightFR756.getPlane());
            assertEquals(planeType.BOEING747, flightFR756.getPlane().getPlaneType());
        }

        @Test
    public void canGetFlightNumber(){
        assertEquals("FR756", flightFR756.getFlightNumber());
    }

    @Test
    public void canAddPilotsToFlight(){
        flightFR756.addPilot(pilot);
        flightFR756.addPilot(coPilot);
        assertEquals(2, flightFR756.commandCrewCount());
    }

    @Test
    public void canAddCabinCrewToFlight(){
        flightFR756.addCabinCrew(flightAttendant);
        assertEquals(1, flightFR756.cabinCrewCount());
    }

    @Test
    public void canBookPassengerOnToFlight(){
        flightFR756.addPassenger(passenger1);
        flightFR756.addPassenger(passenger2);
        assertEquals(2, flightFR756.getPassengerCount());
    }

    @Test
    public void checkStartingSeatAvailability(){
        assertEquals(50, flightFR756.remainingSeatAvailability());
    }

    @Test
    public void checkRemainingSeatAvailability(){
        flightFR756.addPassenger(passenger1);
        flightFR756.addPassenger(passenger2);
        assertEquals(48, flightFR756.remainingSeatAvailability());
    }

}
