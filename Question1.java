import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Mango");

        System.out.println("Original List: " + originalList);

        // Create a new list to store the reversed elements
        List<String> reverseList = new ArrayList<>(originalList);
        Collections.reverse(reverseList);

        System.out.println("Reverse List: " + reverseList);
    }
}
