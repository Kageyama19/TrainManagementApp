import java.util.ArrayList;
import java.util.List;

public class TrainAppUC10 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 10: Count Total Seats in Train");

        List<Bogie> bogies = createBogies();

        System.out.println("Passenger bogies in the train:");
        bogies.forEach(System.out::println);

        int totalSeatingCapacity = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("Total seating capacity of the train: " + totalSeatingCapacity);
        System.out.println("Original list remains unchanged: " + bogies.size() + " bogies");
    }

    private static List<Bogie> createBogies() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("BG401", "Sleeper", 72));
        bogies.add(new Bogie("BG402", "AC Chair", 56));
        bogies.add(new Bogie("BG403", "First Class", 40));
        bogies.add(new Bogie("BG404", "Sleeper", 72));
        return bogies;
    }
}
