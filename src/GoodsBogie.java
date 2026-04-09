public class GoodsBogie {
    private final String bogieId;
    private final String bogieType;
    private final String cargoType;

    public GoodsBogie(String bogieId, String bogieType, String cargoType) {
        this.bogieId = bogieId;
        this.bogieType = bogieType;
        this.cargoType = cargoType;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getBogieType() {
        return bogieType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "bogieId='" + bogieId + '\'' +
                ", bogieType='" + bogieType + '\'' +
                ", cargoType='" + cargoType + '\'' +
                '}';
    }
}
