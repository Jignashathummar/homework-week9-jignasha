import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme11_CompareArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        boolean result = compareArray(c1, c2);
        System.out.println("Compare two ArrayList: " + result);
    }

    /**
     * Method for comparing two Arraylist
     *
     * @param a1 = ArrayList1
     * @param a2 = ArrayList2
     * @return
     */
    public static boolean compareArray(ArrayList<String> a1, ArrayList<String> a2) {
        return a1.equals(a2);
    }
}
