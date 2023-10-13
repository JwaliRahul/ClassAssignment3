package CalculatorAssignment;

import java.util.Scanner;

public class CalculatorMain {
    public static void main (String [] args)
    {
        int num;
        double addition,subtraction,multiplication,division;

        Scanner input =new Scanner(System.in);

        Calculator calciobject = new Calculator();
do
{
    System.out.println("Choose one of the following options: ");
    System.out.println("1) Addition ");
    System.out.println("2) Subtraction ");
    System.out.println("3) Multiplication ");
    System.out.println("4) Division ");
    System.out.println("5) Exit ");

    num = input.nextInt();

    switch (num)
    {
        case 1: //Addition
            System.out.println("Enter the first number: ");
            int a=input.nextInt();
            System.out.println("Enter the second number: ");
            int b=input.nextInt();
            System.out.println("Do you want to enter the thrid number? ");
            String yesNo;
            yesNo=input.next();
            if(yesNo.equalsIgnoreCase("y"))
            {
                System.out.println("Enter the thrid number: ");
                int c=input.nextInt();
                int sum=calciobject.Addition(a,b,c);
                System.out.println("Sum of the three numbers is: "+sum);
            }
            else
            {
                int sum= calciobject.Addition(a,b);
                System.out.println("Sum of the two numbers is: "+sum);
            }
            break;
        case 2: //Subtraction
            System.out.println("Enter the first number: ");
            a = input.nextInt();
            System.out.println("Enter the second number: ");
            b = input.nextInt();
            int result = calciobject.Subtraction(a,b);
            System.out.println("The result after subtracting first number from second number is: "+result);
            break;
        case 3://Multiplication
            System.out.println("Enter the first number: ");
            a = input.nextInt();
            System.out.println("Enter the second number: ");
            b = input.nextInt();
            System.out.println("Do you want to enter the thrid number? ");
            yesNo=input.next();
            if(yesNo.equalsIgnoreCase("y"))
            {
                System.out.println("Enter the thrid number: ");
                int c=input.nextInt();
                int product=calciobject.Multiplication(a,b,c);
                System.out.println("Product of the three numbers is: "+product);
            }
            else
            {
                int product= calciobject.Multiplication(a,b);
                System.out.println("Product of the two numbers is: "+product);
            }
            break;
        case 4://Division
            System.out.println("Enter the first number: ");
            a = input.nextInt();
            System.out.println("Enter the second number: ");
            b = input.nextInt();
            double result1 = calciobject.Division(a,b);
            System.out.println("Result of dividing first number by second number: "+result1);
            break;
        case 5://Exit
            System.exit(0);
            break;
        default:
            System.out.println("Error:Please enter the right number");
            break;
    }
}
while (num!=5);

        }

        }

class Calculator {
    public int Addition (int a,int b,int c)
    {
        int sum;
        sum=a+b+c;
        return sum;
    }
    public int Addition (int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
    }
    public int Subtraction (int a,int b)
    {
        int result;
        result = a-b;
        return result;
    }
    public int Multiplication (int a,int b,int c)
    {
        int result;
        result = a*b*c;
        return result;
    }
    public int Multiplication (int a,int b)
    {
        int result;
        result = a*b;
        return result;
    }
    public double Division (int a,int b)
    {
        double result;
        result = a/b;
        return result;
    }
}
