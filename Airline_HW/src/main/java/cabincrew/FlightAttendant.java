package cabincrew;

public class FlightAttendant extends CabinCrew{

    public FlightAttendant(String name, Rank rank){
        super(name, rank);
    }

    public String messageToPassengers(FlightAttendant flightAttendant){
        return flightAttendant.getName() + ": Is there a doctor on board?";
    }
}
