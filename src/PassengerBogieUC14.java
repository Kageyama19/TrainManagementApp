public class PassengerBogieUC14 {
    private final String bogieType;
    private final int capacity;

    public PassengerBogieUC14(String bogieType, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.bogieType = bogieType;
        this.capacity = capacity;
    }

    public String getBogieType() {
        return bogieType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogieUC14{" +
                "bogieType='" + bogieType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
