import java.util.ArrayList;

class arrayList {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding Elements
        list.add("Element1");         // Add an element at the end
        list.add("Element2");
        list.add("Element3");
        list.add(1, "Element4");      // Add an element at a specific index

        // 3. Accessing Elements
        System.out.println("Element at index 1: " + list.get(1)); // Get an element

        // 4. Modifying Elements
        list.set(2, "ModifiedElement3"); // Set an element at a specific index
        System.out.println("Modified list: " + list);

        // 5. Removing Elements
        list.remove(1);              // Remove an element at a specific index
        System.out.println("After removing element at index 1: " + list);
        
        list.remove("Element1");      // Remove a specific element
        System.out.println("After removing 'Element1': " + list);

        // 6. Checking if the list contains an element
        boolean contains = list.contains("Element3");
        System.out.println("List contains 'Element3': " + contains);

        // 7. Getting the size of the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // 8. Iterating over the list
        System.out.println("Iterating over the list:");
        for (String element : list) {
            System.out.println(element);
        }

        // 9. Clearing the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
