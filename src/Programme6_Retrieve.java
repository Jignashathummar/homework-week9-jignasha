import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme6_Retrieve {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Index number between 0 to 4: ");
        try {
            int num = scanner.nextInt();
            ArrayList<String> tools = new ArrayList<String>();
            tools.add("eclipse");
            tools.add("Rest Assured");
            tools.add("Postman");
            tools.add("Jira");
            tools.add("Agile");
            retriveElement(tools, num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
        //Closing the scanner object
        scanner.close();
    }

    //Method for Retrive Element from ArrayList
    public static void retriveElement(ArrayList<String> tools, int indexNumber) {

        System.out.println("ArrayList:" + tools);

        if (indexNumber >= 0 && indexNumber < tools.size()) {
            String element = tools.get(indexNumber);
            System.out.println("Element at index " + indexNumber + ": " + element);
        } else {
            System.out.println("Index is out of range.");
        }
        System.out.println("Selected Index is: " + indexNumber);
    }
}
