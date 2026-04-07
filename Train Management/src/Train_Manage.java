import java.util.LinkedList;

public class Train_Manage {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 3: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // Step 4: Insert Pantry Car at position 2 (index 2)
        train.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + train);

        // Step 5: Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Step 6: Display final train consist
        System.out.println("Final Train Consist: " + train);

        // Program continues...
    }
}