package plane;

public class Plane {

    private planeType planeType;

    public Plane(planeType planeType){
        this.planeType = planeType;
    }

    public planeType getPlaneType() {
        return this.planeType;
    }

    public int getEnumCapacity() {
        return this.planeType.getCapacity();
    }

    public int getEnumWeight() {
        return this.planeType.getWeight();
    }

    public double bagWeightPerPerson(){
        return (getEnumWeight() / 2) / getEnumCapacity();
    }
}
