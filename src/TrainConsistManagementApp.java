import java.util.*;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            }
            else if (comparison < 0) {
                high = mid - 1; // Search left
            }
            else {
                low = mid + 1; // Search right
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {

        // Step 1: Create (possibly unsorted) array
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort before binary search
        Arrays.sort(bogieIds);

        // Step 3: Display sorted array
        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Step 4: Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 5: Perform Binary Search
        boolean found = binarySearch(bogieIds, key);

        // Step 6: Display result
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND ✔");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND ❌");
        }

        sc.close();
    }
}