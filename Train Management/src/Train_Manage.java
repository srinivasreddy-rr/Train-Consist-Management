import java.util.HashSet;
import java.util.Set;

public class Train_Manage {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 3: Add bogie IDs (including duplicates)
        bogieIds.add("B001");
        bogieIds.add("B002");
        bogieIds.add("B003");
        bogieIds.add("B002"); // duplicate
        bogieIds.add("B001"); // duplicate

        // Step 4: Display final set (duplicates removed automatically)
        System.out.println("Unique Bogie IDs: " + bogieIds);

        // Program continues...
    }
}