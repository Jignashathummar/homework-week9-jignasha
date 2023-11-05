import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<String>();
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Sky");
        printArrayList(colours);
    }

    //Method for Print ArrayList
    public static void printArrayList(ArrayList<String> colours) {
        for (String colour : colours) {
            System.out.println(colour);
        }
    }
}
