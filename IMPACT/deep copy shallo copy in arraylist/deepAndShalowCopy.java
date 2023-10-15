import java.util.ArrayList;
import java.util.List;

public class DeepCopyArrayListExample {
    public static void main(String[] args) {
        // Create the original ArrayList
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        // Create a deep copy by creating a new ArrayList and adding elements
        List<Integer> deepCopyList = new ArrayList<>(originalList);

        // Test if it's a deep copy
        originalList.set(0, 100); // Modify the original
        deepCopyList.set(0, 200); // Modify the deep copy

        // Print the values to check
        System.out.println("Original List:");
        for (Integer value : originalList) {
            System.out.println(value);
        }

        System.out.println("Deep Copy List:");
        for (Integer value : deepCopyList) {
            System.out.println(value);
        }
    }
}
