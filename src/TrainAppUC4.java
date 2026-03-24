import java.util.LinkedList;

public class TrainAppUC4 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 4: Maintain Ordered Bogie IDs");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (0-based index)
        trainConsist.add(2, "Pantry Car");

        String removedFirst = trainConsist.removeFirst();
        String removedLast = trainConsist.removeLast();

        System.out.println("Removed first bogie: " + removedFirst);
        System.out.println("Removed last bogie: " + removedLast);
        System.out.println("Final ordered train consist: " + trainConsist);
    }
}
