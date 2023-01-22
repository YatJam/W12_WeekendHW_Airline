package plane;

public enum planeType {
    BOEING747(50, 2000),
    BOEING707(25, 1000),
    CONCORDE(20, 1000),
    ASTROTRAIN(10, 5000);

    private final int capacity;
    private final int weight;

    planeType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
