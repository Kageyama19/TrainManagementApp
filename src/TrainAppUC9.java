import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainAppUC9 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 9: Group Bogies by Type");

        List<Bogie> bogies = createBogies();

        System.out.println("Original bogie list:");
        bogies.forEach(System.out::println);

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(
                        Bogie::getBogieType,
                        LinkedHashMap::new,
                        Collectors.toList()
                ));

        System.out.println("Grouped bogies by type:");
        groupedBogies.forEach((type, groupedList) -> {
            System.out.println(type + " -> " + groupedList);
        });

        System.out.println("Original list remains unchanged: " + bogies.size() + " bogies");
        System.out.println("Total groups formed: " + groupedBogies.size());
    }

    private static List<Bogie> createBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG301", "Sleeper", 72));
        bogies.add(new Bogie("BG302", "AC Chair", 56));
        bogies.add(new Bogie("BG303", "Sleeper", 72));
        bogies.add(new Bogie("BG304", "First Class", 40));
        bogies.add(new Bogie("BG305", "AC Chair", 56));
        return bogies;
    }
}
