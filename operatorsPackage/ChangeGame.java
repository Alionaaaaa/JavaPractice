package operatorsPackage;

import java.util.Scanner;

public class ChangeGame {
    public static void main(String []str)
    {
        //enter pennies, nickels, dimes, quarters
        System.out.println("Enter pennies");
        Scanner penniesScanner = new Scanner(System.in);
        int nrPennies = penniesScanner.nextInt();

        System.out.println("Enter nickels");
        Scanner nickelsScanner = new Scanner(System.in);
        int nrNickels = nickelsScanner.nextInt();

        System.out.println("Enter dimes");
        Scanner dimesScanner = new Scanner(System.in);
        int nrDimes = dimesScanner.nextInt();

        System.out.println("Enter quarters");
        Scanner quartersScanner = new Scanner(System.in);
        int nrQuarters = quartersScanner.nextInt();

        // set the value for this notions in cents
        int pennies = 1;
        int nickels = 5;
        int dimes = 10;
        int quarters = 25;
        int cent = 100;

        //compare the actual value and the needed one
        if(nrPennies * pennies == cent || nrNickels * nickels == cent || nrDimes * dimes == cent ||  nrQuarters * quarters == cent){

            System.out.println("You won");
        }

        //tell the user how much they went over or under

        //de continuat...

    }
}
