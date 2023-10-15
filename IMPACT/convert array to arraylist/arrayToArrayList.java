import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayListExample {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};

        // Using Arrays.asList()
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList);
    }
}
