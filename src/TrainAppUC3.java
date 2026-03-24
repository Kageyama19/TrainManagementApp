import java.util.HashSet;
import java.util.Set;

public class TrainAppUC3 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 3: Track Unique Bogie IDs");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate (ignored by HashSet)
        bogieIds.add("BG102"); // Duplicate (ignored by HashSet)

        System.out.println("Final unique bogie IDs: " + bogieIds);
        System.out.println("Total unique bogie IDs: " + bogieIds.size());
    }
}
