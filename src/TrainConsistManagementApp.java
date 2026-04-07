import java.util.*;

// Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " -> Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create List to store bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort bogies using Comparator (ascending order)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Sort in descending order
        bogieList.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nBogies Sorted by Capacity (Descending):");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}
