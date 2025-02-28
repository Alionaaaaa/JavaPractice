package ifPackage;

import java.util.Scanner;

/*
If statements
All salespeople get a payment of 1000$ a week
Who exceed 10 salees get ana ditional 250$.
 */
public class SalaryCalculator {
    public static void main(String [] str)
    {
       // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int extrasales =10;

        // get values for the unknown
        System.out.println("How many sales did the employee did this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // quick detour for the bonus earners
        if(sales > extrasales)
        {
            salary += bonus;
        }

        //output
        System.out.printf("The employee's pay is %d $", salary);
    }

}
