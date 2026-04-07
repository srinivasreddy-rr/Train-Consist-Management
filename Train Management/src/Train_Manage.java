import java.util.LinkedHashSet;

public class Train_Manage {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 3: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 4: Add duplicate bogie (will be ignored)
        train.add("Sleeper");

        // Step 5: Display final formation (in insertion order)
        System.out.println("Final Train Formation: " + train);

        // Program continues...
    }
}