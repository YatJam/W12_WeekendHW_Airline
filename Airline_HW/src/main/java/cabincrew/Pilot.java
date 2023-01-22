package cabincrew;

public class Pilot extends CabinCrew{

    private String pilotLicence;

    public Pilot(String name, Rank rank, String pilotLicence){
        super(name, rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }

    public String startsFlight(Pilot pilot){
        return pilot.getName() + ": Chocks away!";
    }
}
