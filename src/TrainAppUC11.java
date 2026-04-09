import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainAppUC11 {

    private static final Pattern TRAIN_ID_PATTERN = Pattern.compile("TRN-\\d{4}");
    private static final Pattern CARGO_CODE_PATTERN = Pattern.compile("PET-[A-Z]{2}");

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Use Case 11: Validate Train ID & Cargo Codes");

        String validTrainId = "TRN-1234";
        String invalidTrainId = "TRAIN12";
        String validCargoCode = "PET-AB";
        String invalidCargoCode = "PET-ab";

        validateTrainId(validTrainId);
        validateTrainId(invalidTrainId);
        validateCargoCode(validCargoCode);
        validateCargoCode(invalidCargoCode);
    }

    private static void validateTrainId(String trainId) {
        Matcher matcher = TRAIN_ID_PATTERN.matcher(trainId);
        boolean isValid = matcher.matches();
        System.out.println("Train ID " + trainId + " is " + (isValid ? "valid" : "invalid"));
    }

    private static void validateCargoCode(String cargoCode) {
        Matcher matcher = CARGO_CODE_PATTERN.matcher(cargoCode);
        boolean isValid = matcher.matches();
        System.out.println("Cargo Code " + cargoCode + " is " + (isValid ? "valid" : "invalid"));
    }
}
