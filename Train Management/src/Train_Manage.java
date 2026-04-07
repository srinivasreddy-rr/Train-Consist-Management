import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class Train_Manage {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create original bogie list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury", 80)); // extra for testing multiple matches

        // Step 3: Convert to stream + filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList()); // collect into new list

        // Step 4: Display original list (unchanged)
        System.out.println("Original Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 5: Display filtered list
        System.out.println("\nFiltered Bogies (capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Program continues...
    }
}