public class TrainAppUC14 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 14: Handle Invalid Bogie Capacity");

        try {
            PassengerBogieUC14 validBogie = new PassengerBogieUC14("Sleeper", 72);
            System.out.println("Passenger bogie created successfully: " + validBogie);
        } catch (InvalidCapacityException exception) {
            System.out.println("Error creating valid bogie: " + exception.getMessage());
        }

        try {
            PassengerBogieUC14 invalidBogie = new PassengerBogieUC14("AC Chair", 0);
            System.out.println("Passenger bogie created successfully: " + invalidBogie);
        } catch (InvalidCapacityException exception) {
            System.out.println("Failed to create passenger bogie: " + exception.getMessage());
        }

        System.out.println("Program continues safely after validation.");
    }
}
