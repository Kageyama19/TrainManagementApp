public class Bogie {
    private final String bogieName;
    private final int capacity;

    public Bogie(String bogieName, int capacity) {
        this.bogieName = bogieName;
        this.capacity = capacity;
    }

    public String getBogieName() {
        return bogieName;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{" +
                "bogieName='" + bogieName + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
