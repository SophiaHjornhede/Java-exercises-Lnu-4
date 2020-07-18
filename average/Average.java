package average;

/**
 * Assignment-4, exercise-4,main class
 *
 * @author Sophia Hjörnhede
 * @version 1.10 11 July 2020
 */

import average.NegativeNumberException;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) throws NegativeNumberException {
        Scanner keyboard = new Scanner(System.in);
        int numbers = 0;
        boolean again = true;

        while (again) {
            try {
                System.out.println("How many numbers do you want to enter?");
                numbers = keyboard.nextInt();

                if (numbers < 1)
                    throw new NegativeNumberException();
                again = false;
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value which is not allowed.");
                System.out.print("Please enter the number again. ");
                keyboard.nextLine(); // clearing buffer

            } catch (NegativeNumberException e) {
                System.out.println("Numbers must be greater than 0.");
                keyboard.nextLine();
            }
        }

        double sum = 0;

        for (int i = 0; i < numbers; i++) {
            again = true;
            while (again) {
                try {
                    System.out.println("Enter number " + (i + 1));
                    sum += keyboard.nextInt();
                    again = false; // value ok, get next one
                } catch (InputMismatchException e) {
                    System.out.println("You entered a non-numeric value which is not allowed.");
                    System.out.print("Please enter the number again. ");
                    keyboard.nextLine(); // clearing buffer
                }
            }
        }

        // Setting format for output
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setMinimumFractionDigits(2);
        //double avg = ;
        System.out.println("Average of the entered numbers is " + df2.format((sum / numbers)));
    }
}
