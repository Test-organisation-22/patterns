package codeexamples.exceptions;

import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        // only for debugging, not for production
        assert (number >= 0 && number <= 10) : "bad number: " + number;

        System.out.printf("entered %d%n", number);

    }
}
