import java.util.ArrayList;
import java.util.List;

public class TrainAppUC2 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 2: Add Passenger Bogies to Train");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition: " + passengerBogies);

        String bogieToRemove = "AC Chair";
        passengerBogies.remove(bogieToRemove);
        System.out.println("Removed bogie: " + bogieToRemove);

        boolean sleeperExists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + sleeperExists);

        System.out.println("Final passenger bogie list: " + passengerBogies);
    }
}
