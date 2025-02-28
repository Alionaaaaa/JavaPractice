package LoopPackage;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String [] str)
    {
        System.out.println("Enter a text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        boolean letterFound = false;

        //create a loop to iterate through all the items and accumulate the costs
        for(int i=0; i<text.length(); i++)
        {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a')
            {
                letterFound = true;
                break;
            }
        }
        if(letterFound) {
        System.out.println("This text contains the letter 'A'");
        }
        else {
            System.out.println("This text doen not contain the letter 'a'");


        }



    }
}
