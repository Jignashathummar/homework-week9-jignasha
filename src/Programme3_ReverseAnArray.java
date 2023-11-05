import java.util.Arrays;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme3_ReverseAnArray {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 7, 9};
        System.out.println("Original Array: " + Arrays.asList(array));
        reverse(array);
    }

    //function reverses the elements of the array
    static void reverse(Integer myArray[]) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reverse Array: " + Arrays.asList(myArray));
    }
}
