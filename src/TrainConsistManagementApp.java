import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public void display() {
        System.out.println(type + " Bogie -> Cargo: " + cargo);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        goodsList.add(new GoodsBogie("Open", "Coal"));             // allowed
        goodsList.add(new GoodsBogie("Box", "Grain"));             // allowed
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid

        // Uncomment below line to test INVALID case
        // goodsList.add(new GoodsBogie("Cylindrical", "Coal"));

        // Step 2: Apply safety validation using allMatch()
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display bogies
        System.out.println("Goods Bogies:");
        goodsList.forEach(GoodsBogie::display);

        // Step 4: Display safety result
        System.out.println("\nSafety Compliance Status:");
        if (isSafe) {
            System.out.println("Train is SAFE ✔");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}
