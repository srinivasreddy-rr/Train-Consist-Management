import java.util.ArrayList;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class Train_Manage {

    public static void main(String[] args) {

        // Step 1: Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create bogie list (reuse from previous UC)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury", 80));

        // Step 3: Stream -> map -> reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all capacities

        // Step 4: Display original list (unchanged)
        System.out.println("Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 5: Display total seating capacity
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        // Program continues...
    }
}