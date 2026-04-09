import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainAppUC7 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 7: Sort Bogies by Capacity");

        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 40));

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Passenger bogies sorted by capacity:");
        passengerBogies.forEach(System.out::println);
    }
}
