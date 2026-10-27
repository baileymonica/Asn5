import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // 1. Create 2 ArrayLists: one for String, one for Integer
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();

        // 2. Add 4 items to each ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(92);

        // 3. Display initial contents using loops (avoiding direct toString())
        System.out.println("=== Initial Fruit List (using basic for loop) ===");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits.get(i));
        }

        System.out.println("\n=== Initial Scores List (using enhanced for-each loop) ===");
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }

        // 4. Try out 2 more ArrayList operations:
        // Operation 1: remove() - remove an item by index
        fruits.remove(2); // Removes "Cherry"

        // Operation 2: set() - update/replace an element at a specific index
        scores.set(0, 95); // Changes the first score from 85 to 95

        // 5. Display the ArrayLists again to reflect changes
        System.out.println("\n=== Updated Fruit List (after remove) ===");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit " + (i + 1) + ": " + fruits.get(i));
        }

        System.out.println("\n=== Updated Scores List (after set) ===");
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }
    }
}