package LoopPackage;

import java.util.Scanner;

/*
For loop
Write a program that will scan a given number of item and tally the cost
 */
public class ForLoop {
    public static void main(String [] str)
    {
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total = 0;

        //create a loop to iterate through all the items and accumulate the costs
        for(int i=0; i<quantity; i++)
        {
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();

            total = total + price;
            System.out.println("The total price is "+total);

        }
        scanner.close();


    }
}
