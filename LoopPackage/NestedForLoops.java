package LoopPackage;

import java.util.Scanner;

/*
Nested loops
find the avarage of each student's test score
 */
public class NestedForLoops {
    public static void main(String [] str){
    //initialize what we know
        int NrStudents = 24;
        int nrTests = 4;
        Scanner scanner = new Scanner(System.in);
        //precces students
        for(int i=0; i<NrStudents; i++)
        {
            double total =0;
            for(int j=0; j<nrTests; j++)
            {
                System.out.println("Enter the score for test #"+(j+1));
                double score = scanner.nextDouble();
                total += score;

            }
            double avarage = total/nrTests;
            System.out.println("The test avarage for student #"+(i+1)+ " is " +avarage);

        }
        scanner.close();
    }

}
