package inputPackage;

import java.util.Scanner;

public class InputClass {
    public static void main(String[] str){
        //enter an adjective
        System.out.println("Enter an adjective: ");
        Scanner adjScanner = new Scanner(System.in);
        String adj = adjScanner.next();

        //Enter a season of the year
        System.out.println("Enter a season of the year: ");
        Scanner seasonScanner = new Scanner(System.in);
        String season = seasonScanner.next();

        //enter a number
        System.out.println("Enter a number: ");
        Scanner numberScanner = new Scanner(System.in);
        int number = numberScanner.nextInt();

        //result
        System.out.printf("On a %s %s day, i drink a minimum of %d cups of coffe", adj, season, number);
    }
}
