package switchPackage;

import java.util.Scanner;

public class switchStatement {
    public static void main(String []str){
        //get grade
        System.out.println("Enter the grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;

        switch (grade){
            case "A":
                 message = "Excelent job";
                 break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "You need to work a little bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error, invalid grade!";
                break;
        }

        System.out.println("Your feedback is "+message);



    }
}
