package codeexamples.casestudy.creditinquiry;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreditInquiry {

    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args){

        MenuOption accountType = getRequest();

        while (accountType != MenuOption.END){
            switch (accountType){
                case ZERO_BALANCE:
                    System.out.printf("%nAccounts with zero balances:%n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("%nAccounts with credit balances:%n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("%nAccounts with debit balances:%n");
                    break;
            }
            readRecords(accountType);
            accountType = getRequest();
        }
    }

    private static MenuOption getRequest(){

        int request = 4;

        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
                " 1 - List accounts with zero balances",
                " 2 - List accounts with credit balances",
                " 3 - List accounts with debit balances",
                " 4 - Terminate program");

        try{
            Scanner input = new Scanner(System.in);
            do{
                System.out.printf("%n? ");
                request = input.nextInt();
            } while ((request < 1) ||(request > 4));
        }
        catch (NoSuchElementException e){
            System.out.print("Invalid input.");
        }

        return choices[request-1];
    }

    private static void readRecords(MenuOption accountType){

        try (Scanner input = new Scanner(Paths.get("/home/user/Projects/patterns/src/main/java/codeexamples/casestudy/creditinquiry/clients.txt"))){
            while (input.hasNext()){
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                if (shouldDisplay(accountType, balance)){
                    System.out.printf("%-7d%-8s%8s%10.2f%n", accountNumber, firstName, lastName, balance);
                }
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean shouldDisplay(MenuOption accountType, double balance){
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
            return true;
        else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
            return true;
        else return (accountType == MenuOption.ZERO_BALANCE) && (balance == 0);
    }


}
