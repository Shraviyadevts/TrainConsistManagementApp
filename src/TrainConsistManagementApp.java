// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum");
            }

            // If safe, assign cargo
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            // Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    public void display() {
        System.out.println(type + " Bogie -> Cargo: " + cargo);
    }
}

// Main Class
public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Another safe assignment
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie States:");
        b1.display();
        b2.display();

        System.out.println("\nProgram continues safely...");
    }
}