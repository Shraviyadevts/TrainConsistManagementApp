import java.util.*;

public class TrainConsistManagementApp {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(key)) {
                return true; // Match found → stop early
            }
        }
        return false; // No match found
    }

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Perform Linear Search
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND ✔");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND ❌");
        }

        sc.close();
    }
}