package codeexamples.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Enter integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Enter integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

                continueLoop = false;
            }
            catch (InputMismatchException e){
                System.err.printf("%nException: %s%n", e);
                scanner.nextLine();
                System.out.println("Your must enter integers");
            }
            catch (ArithmeticException e){
                System.err.printf("%nException: %s%n", e);
                System.out.println("Zero is invalid denominator");
            }
        } while (continueLoop);
    }
}
