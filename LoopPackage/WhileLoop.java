package LoopPackage;

import java.util.Scanner;

/*
While loop
 Each store employee makes $15 an hour. Write a program that allows the employee
 to enter the number of hours worked for the week. Do not allow overtime.
 */
public class WhileLoop {
    public static void main(String[] str)
    {
        //write the known variables
        int rate = 15;
        int maxHours =40;

        //get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. try again");
            hoursWorked = scanner.nextDouble();

        }
        scanner.close();
        double gross = rate * hoursWorked;
        System.out.println("Calculate gross: " +gross);
    }
}
