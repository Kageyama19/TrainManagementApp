public class Bogie {
    private final String bogieId;
    private final String bogieType;
    private final int capacity;

    public Bogie(String bogieId, String bogieType, int capacity) {
        this.bogieId = bogieId;
        this.bogieType = bogieType;
        this.capacity = capacity;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getBogieType() {
        return bogieType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{" +
                "bogieId='" + bogieId + '\'' +
                ", bogieType='" + bogieType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
