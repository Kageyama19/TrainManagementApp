import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainAppUC8 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 8: Filter Passenger Bogies Using Streams");

        List<Bogie> passengerBogies = createPassengerBogies();

        System.out.println("Original passenger bogies:");
        passengerBogies.forEach(System.out::println);

        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered passenger bogies with capacity greater than 60:");
        highCapacityBogies.forEach(System.out::println);

        System.out.println("Original list remains unchanged: " + passengerBogies.size() + " bogies");
        System.out.println("Filtered list size: " + highCapacityBogies.size());
    }

    private static List<Bogie> createPassengerBogies() {
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("BG201", "Sleeper", 72));
        passengerBogies.add(new Bogie("BG202", "AC Chair Car", 60));
        passengerBogies.add(new Bogie("BG203", "General", 90));
        passengerBogies.add(new Bogie("BG204", "First Class", 48));
        passengerBogies.add(new Bogie("BG205", "Double Decker", 120));
        return passengerBogies;
    }
}
