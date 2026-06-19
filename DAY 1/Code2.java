/*Write a program to input two numbers and display their sum, difference, product, and quotient.
Division by zero should be handled carefully. */

import java.util.Scanner;

public class Code2
{
    
    public void operation(int a , int b)
    {
        System.out.println("Sum : " + (a + b));
        System.out.println("Difference : " + (a - b));
        System.out.println("Product : " + (a * b));
        if (b == 0)
        {
            System.out.println("undefined");
        }
        else
        {
            System.out.println("Quotient : " + (double)(a / b));
        }
        
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Code2 c2 = new Code2();
        System.out.println("Enter number of test cases to be performed");
        int t = sc.nextInt();
        for (int i = 1 ; i <= t ; i++)
        {
            System.out.println("Enter value of a : ");
            int a = sc.nextInt();
            System.out.println("Enter value of b : ");
            int b = sc.nextInt();
            c2.operation(a , b);

        }

    }
}
