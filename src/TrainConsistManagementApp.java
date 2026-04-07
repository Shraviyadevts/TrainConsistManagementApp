import java.util.*;

// Bogie class (same as previous UCs)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70)); // extra bogie

        // Step 2: Use Stream to calculate total capacity
        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)          // Extract capacity
                .reduce(0, Integer::sum);      // Aggregate sum

        // Step 3: Display result
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogie List (Unchanged):");
        bogieList.forEach(Bogie::display);
    }
}