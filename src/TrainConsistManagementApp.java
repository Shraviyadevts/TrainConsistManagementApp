import java.util.*;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistAppUC2
 * =============================================================
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after addition (READ)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE)
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair':");
        System.out.println(passengerBogies);

        // Check existence (READ)
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\n'Sleeper' bogie exists in the train.");
        } else {
            System.out.println("\n'Sleeper' bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for further operations...");
    }
}