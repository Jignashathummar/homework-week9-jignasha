import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class Programme7_EmptyOrNot {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        //Array is empty or not
        isArrayEmpty(number);
        //Add value in ArrayList
        number.add(3);
        number.add(5);
        number.add(4);
        number.add(7);
        number.add(9);
        //Array is empty or not
        isArrayEmpty(number);
    }

    /**
     * Method for check Array is empty or not
     *
     * @param numArrayList
     */
    public static void isArrayEmpty(ArrayList<Integer> numArrayList) {
        if (numArrayList.isEmpty()) {
            System.out.println("arraylist is empty");
            System.out.println("Arraylist: " + numArrayList);
        } else {
            System.out.println("ArrayList is not empty");
            System.out.println("Arraylist: " + numArrayList);
        }
    }

}
