package flight;

import cabincrew.CabinCrew;
import cabincrew.Pilot;
import plane.Plane;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> Pilot;
    private ArrayList<CabinCrew> Cabincrew;
    private ArrayList<Passenger> PassengerList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.Pilot = new ArrayList<Pilot>();
        this.Cabincrew = new ArrayList<CabinCrew>();
        this.PassengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public ArrayList<cabincrew.Pilot> getPilot() {
        return this.Pilot;
    }

    public ArrayList<CabinCrew> getCabincrew() {
        return this.Cabincrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.PassengerList;
    }

    public int getPassengerCount(){
        return this.PassengerList.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addPilot(Pilot pilot){
        this.Pilot.add(pilot);
    }

    public int commandCrewCount(){
        return Pilot.size();
    }

    public void addCabinCrew(CabinCrew cabrincrew){
        this.Cabincrew.add(cabrincrew);
    }

    public int cabinCrewCount(){
        return Cabincrew.size();
    }

    public void addPassenger(Passenger passenger){
        if(this.plane.getEnumCapacity() > this.getPassengerCount()){
            this.PassengerList.add(passenger);
        }
    }

    public int remainingSeatAvailability(){
        int availability = this.plane.getEnumCapacity() - this.getPassengerCount();
        return availability;
    }
}
