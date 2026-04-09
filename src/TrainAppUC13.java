import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainAppUC13 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 13: Performance Comparison (Loops vs Streams)");

        List<Bogie> bogies = createBogies();

        long loopStartTime = System.nanoTime();
        List<Bogie> loopFilteredBogies = filterWithLoop(bogies);
        long loopEndTime = System.nanoTime();

        long streamStartTime = System.nanoTime();
        List<Bogie> streamFilteredBogies = filterWithStream(bogies);
        long streamEndTime = System.nanoTime();

        long loopDuration = loopEndTime - loopStartTime;
        long streamDuration = streamEndTime - streamStartTime;

        System.out.println("Loop-based filtered bogies count: " + loopFilteredBogies.size());
        System.out.println("Stream-based filtered bogies count: " + streamFilteredBogies.size());
        System.out.println("Loop-based execution time (ns): " + loopDuration);
        System.out.println("Stream-based execution time (ns): " + streamDuration);
        System.out.println("Both approaches returned same result size: " +
                (loopFilteredBogies.size() == streamFilteredBogies.size()));
    }

    private static List<Bogie> createBogies() {
        List<Bogie> bogies = new ArrayList<>();

        for (int index = 1; index <= 10000; index++) {
            int capacity = 40 + (index % 50);
            String bogieType = index % 3 == 0 ? "Sleeper" : index % 3 == 1 ? "AC Chair" : "First Class";
            bogies.add(new Bogie("BG" + (5000 + index), bogieType, capacity));
        }

        return bogies;
    }

    private static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> filteredBogies = new ArrayList<>();

        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 60) {
                filteredBogies.add(bogie);
            }
        }

        return filteredBogies;
    }

    private static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(bogie -> bogie.getCapacity() > 60)
                .collect(Collectors.toList());
    }
}
