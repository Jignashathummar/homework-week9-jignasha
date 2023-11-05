import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme5_Iterate {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Swift");
        printArrayList(languages);
    }

    public static void printArrayList(ArrayList<String> languages) {
        // store the iterator returned by iterator()
        Iterator<String> iterate = languages.iterator();
        System.out.print(" ");

        // Use methods of Iterator to access elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
