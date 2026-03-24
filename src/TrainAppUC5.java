import java.util.LinkedHashSet;
import java.util.Set;

public class TrainAppUC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 5: Preserve Insertion Order of Bogies");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // Duplicate entry (ignored automatically)

        System.out.println("Final train formation: " + trainFormation);
        System.out.println("Total unique bogies: " + trainFormation.size());
    }
}
