import java.util.*;
import java.util.stream.Collectors;

// Bogie class (same as UC7)
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

        // Step 1: Create list of bogies (reuse UC7)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Luxury AC", 80)); // extra for testing

        // Step 2: Define capacity threshold
        int threshold = 60;

        // Step 3: Apply Stream filtering
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("Bogies with Capacity > " + threshold + ":");
        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            filteredBogies.forEach(Bogie::display);
        }

        // Step 5: Verify original list is unchanged
        System.out.println("\nOriginal Bogie List (Unchanged):");
        bogieList.forEach(Bogie::display);
    }
}
