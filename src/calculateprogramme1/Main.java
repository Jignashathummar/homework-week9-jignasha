package calculateprogramme1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        calResult(scanner);
        //Closing the scanner object
        scanner.close();
    }

    public static void calResult(Scanner scanner) {
        Calculator cal = new Calculator();
        char choice = 'Y';
        while (choice == 'y' || choice == 'Y') {

            try {
                System.out.println("Enter first number: ");
                int a = scanner.nextInt();
                System.out.println("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println("Please enter one symbol +, -, *, /: ");
                char ch = scanner.next().charAt(0);
                cal.calculateResult(a, b, ch);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                scanner.nextLine();
            }

            System.out.println("“Would you like to do more calculation Please enter “Y” or “N” :");
            choice = scanner.next().charAt(0);
        }
        System.out.println("Program terminated.");
    }

}
