package PracticeExercises;

import java.util.Scanner;

public class ArraysOfInt {
    public static void main (String [] args)
    {
        int [] intArray =new int [10];
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        num=input.nextInt();
        intArray[0] =num;
        System.out.println("Enter the second number ");
        num=input.nextInt();
        intArray[1] =num;
        System.out.println("Enter the third number ");
        num=input.nextInt();
        intArray[2] =num;
        System.out.println("Enter the fourth number ");
        num=input.nextInt();
        intArray[3] =num;
        System.out.println("Enter the fifth number ");
        num=input.nextInt();
        intArray[4] =num;

        for (int i=0; i<intArray.length; i++)
        {
            System.out.println("Integer at page " +i + " is " + intArray[i]);
        }
    }
}
