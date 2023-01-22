package flight;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public double bagWeightPerPerson(){
        return (flight.getPlane().getEnumWeight() / 2) / flight.getPlane().getEnumCapacity();
    }

    public int calculateTotalBaggageWeightPerPerson(Flight passengerList){
        for(passenger : flight.getPassengers()){
            totalPerPerson = totalPerPerson += passenger;
        }
    }
}
