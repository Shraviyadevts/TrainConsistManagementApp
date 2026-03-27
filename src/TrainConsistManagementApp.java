import java.util.*;

/**
 * =============================================================
 * MAIN CLASS - TrainConsistAppUC3
 * =============================================================
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // Display final set
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically ignored.");
        System.out.println("\nSystem ready for further operations...");
    }
}