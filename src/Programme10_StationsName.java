import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme10_StationsName {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Station name from Oxford Circus, Embankment, Kings Cross St Pancras, Paddington, Waterloo ");
        String stationName = scanner.nextLine();
        stationArrayList(stationName);
        //Closing the scanner object
        scanner.close();
    }

    /**
     * Method for get list of line from station name
     * @param stationName
     */
    public static void stationArrayList(String stationName) {
        HashMap<String, String[]> stationLines = new HashMap<>();
        String[] station1 = {"Bakerloo", "Central", "Victoria"};
        String[] station2 = {"Bakerloo", "Circle", "District", "Northern"};
        String[] station3 = {"Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"};
        String[] station4 = {"Bakerloo", "Circle", "District", "Hammersmith & City"};
        String[] station5 = {"Bakerloo", "Jubilee", "Northern", "Waterloo & City"};

        stationLines.put("Oxford Circus", station1);
        stationLines.put("Embankment", station2);
        stationLines.put("Kings Cross St Pancras", station3);
        stationLines.put("Paddington", station4);
        stationLines.put("Waterloo", station5);

        String[] retrievedArray = stationLines.get(stationName);

        if (retrievedArray != null) {
            System.out.println("Lines passing through " + stationName + "':");
            for (String station : retrievedArray) {
                System.out.print(station + ", ");
            }
            System.out.println();
        } else {
            System.out.println(stationName + " is not a Zone 1 station.");
        }
    }
}
