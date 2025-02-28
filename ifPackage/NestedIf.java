package ifPackage;

import java.util.Scanner;

/*
to qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years
 */
public class NestedIf {
    public static void main(String [] str){
        //initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get what we don't
        System.out.println("How much money do you yearn per year?");
        Scanner salaryScanner = new Scanner(System.in);
        double salary = salaryScanner.nextDouble();

        System.out.println("How much years do you work in your company?");
        Scanner timeScanner = new Scanner(System.in);
        int time = timeScanner.nextInt();
        salaryScanner.close();
        timeScanner.close();

        //make desision
        if(salary >= requiredSalary) {
        if(time >= requiredYearsEmployed) //if(salary >= requiredSalary && time >= requiredYearsEmployed)
        {
            System.out.println("Congrats you are able to get a loan");
        }
        }
        else {
            System.out.println("Unfortunately you are not able to get a loan");

        }
    }
}
