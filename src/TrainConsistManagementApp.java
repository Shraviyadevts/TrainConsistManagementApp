import java.util.*;

public class TrainConsistManagementApp {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            // Optimization: track if swap happens
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap → already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Step 1: Create array of capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Step 2: Display original array
        System.out.println("Original Capacities:");
        System.out.println(Arrays.toString(capacities));

        // Step 3: Apply Bubble Sort
        bubbleSort(capacities);

        // Step 4: Display sorted array
        System.out.println("\nSorted Capacities (Ascending):");
        System.out.println(Arrays.toString(capacities));
    }
}