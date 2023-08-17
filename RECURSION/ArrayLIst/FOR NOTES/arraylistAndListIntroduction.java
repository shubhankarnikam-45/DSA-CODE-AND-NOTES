public class Main {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Using List (via ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("List: " + list);
    }
}

// In this example, both arrayList and list are instances of classes that implement the 
// List interface, but they are both backed by ArrayList implementations. This means you
// can switch between different implementations of the List interface without changing
// your code significantly.