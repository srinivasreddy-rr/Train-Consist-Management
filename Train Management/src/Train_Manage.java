import java.util.ArrayList;
import java.util.List;

public class Train_Manage {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Step 3: Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 4: Display bogies after addition
        System.out.println("Bogies after addition: " + bogies);

        // Step 5: Remove one bogie (AC Chair)
        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);

        // Step 6: Check if Sleeper exists
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Step 7: Final state of bogies
        System.out.println("Final Bogie List: " + bogies);

        // Program continues...
    }
}