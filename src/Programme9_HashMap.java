import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme9_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Jhon", 18);
        people.put("Smith", 25);
        people.put("Alice", 33);
        keyValue(people);
    }

    /**
     * Method for get the age of people
     * @param people
     */
    public static void keyValue(HashMap<String, Integer> people) {
        for (String name : people.keySet()) {
            int age = people.get(name);
            System.out.println(name + ": " + age + " years old");
        }
    }
}
