import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme8_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<Integer>();
        number.add(4);
        number.add(7);
        number.add(8);
        numberContains(number);

    }

    /**
     * Method for number contains
     * @param number
     */
    public static void numberContains(HashSet<Integer> number) {
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i)) {
                System.out.println(i + " is found in the set.");
            } else {
                System.out.println(i + " is not found in the set.");
            }
        }
    }
}
