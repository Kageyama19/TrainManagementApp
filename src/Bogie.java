public class Bogie {
    private final String bogieId;
    private final String bogieType;
    private final int capacity;

    public Bogie(String bogieName, int capacity) {
        this(null, bogieName, capacity);
    }

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

    public String getBogieName() {
        return bogieType;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        if (bogieId == null) {
            return "Bogie{" +
                    "bogieName='" + bogieType + '\'' +
                    ", capacity=" + capacity +
                    '}';
        }

        return "Bogie{" +
                "bogieId='" + bogieId + '\'' +
                ", bogieType='" + bogieType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
