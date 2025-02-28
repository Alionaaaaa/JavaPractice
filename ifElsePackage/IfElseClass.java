package ifElsePackage;

import java.util.Scanner;

/*
IF ELSE
All salespeople are expected to make at least 10 sales a week
for those who do, they receive a congratulatory message
for those who don't they are informed of how many sales they were short


*/
public class IfElseClass {
    public static void main(String [] str) {
        //get the number of sales
        System.out.println("Please enter the number of sales done this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        int expectedSales = 10;
        //condition of gaining the messages
        if (sales == expectedSales) {
            System.out.println("Congrats you completed the necessary number of sales!!!");
        }
        else if (sales > expectedSales) {
            System.out.println("Congrats you did much sales than avarage this week, for this you will be well rewarded ");
        }

        else{
                    System.out.printf("Unfortunatelly you did not completed the plan of %d  expected sales", expectedSales);
        }

    }

}
