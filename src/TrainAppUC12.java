import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TrainAppUC12 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 12: Safety Compliance Check for Goods Bogies");

        List<GoodsBogie> goodsBogies = createGoodsBogies();

        System.out.println("Goods bogies prepared for safety check:");
        goodsBogies.forEach(System.out::println);

        Predicate<GoodsBogie> safetyRule = bogie ->
                !"Cylindrical".equalsIgnoreCase(bogie.getBogieType()) ||
                        "Petroleum".equalsIgnoreCase(bogie.getCargoType());

        boolean isSafetyCompliant = goodsBogies.stream()
                .allMatch(safetyRule);

        System.out.println("Train safety compliant: " + isSafetyCompliant);
    }

    private static List<GoodsBogie> createGoodsBogies() {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("GB501", "Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("GB502", "Open", "Coal"));
        goodsBogies.add(new GoodsBogie("GB503", "Box", "Grain"));
        goodsBogies.add(new GoodsBogie("GB504", "Cylindrical", "Petroleum"));
        return goodsBogies;
    }
}
