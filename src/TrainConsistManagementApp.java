import java.util.*;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistAppUC5
 * =============================================================
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Display final formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nNote: Duplicate bogies are automatically ignored.");
        System.out.println("\nSystem ready for further operations...");
    }
}