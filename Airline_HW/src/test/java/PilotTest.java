import cabincrew.Pilot;
import cabincrew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Clarence Oveur", Rank.CAPTAIN, "12345OVEUR67");
    }

    @Test
    public void getPilotName(){
        assertEquals("Clarence Oveur", pilot.getName());
    }

    @Test
    public void getRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void getPilotLicence(){
        assertEquals("12345OVEUR67", pilot.getPilotLicence());
    }

    @Test
    public void canStartFlying(){
        assertEquals("Clarence Oveur: Chocks away!", pilot.startsFlight(pilot));
    }
}
