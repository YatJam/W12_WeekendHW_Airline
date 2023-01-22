import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.planeType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(planeType.BOEING747);
    }

    @Test
    public void getPlaneType(){
        assertEquals(planeType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(50, plane.getEnumCapacity());

    }

    @Test
    public void getPlaneWeight(){
        assertEquals(2000, plane.getEnumWeight());
    }

    @Test
    public void getWeightBagsPerPeson(){
        assertEquals(20, plane.bagWeightPerPerson(), 0.0);
    }
}
