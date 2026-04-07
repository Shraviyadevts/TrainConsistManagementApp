import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("=== Train Consist Management System ===");
        System.out.println("Enter number of bogies to add:");

        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Step 2: Insert entries using put()
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Bogie Name " + i + ":");
            String bogieName = scanner.nextLine();

            System.out.println("Enter Capacity for " + bogieName + ":");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            bogieCapacityMap.put(bogieName, capacity);
        }

        // Step 3: Display bogie-capacity mapping
        System.out.println("\n=== Bogie Capacity Details ===");

        // Step 4: Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram Completed Successfully.");

        scanner.close();
    }
}