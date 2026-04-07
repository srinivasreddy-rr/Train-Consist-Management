import java.util.ArrayList;
import java.util.List;

public class Train_Manage {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Check existence
        boolean exists = bogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        // Display final list
        System.out.println("Final Bogies: " + bogies);
    }
}