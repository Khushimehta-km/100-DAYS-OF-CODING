/*Write a program to input two numbers and display their sum. */

import java.util.Scanner;
public class Code1
{

    public void sum(int a , int b)
    {
        System.out.println("Sum : " + (a + b));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Code1 c1 = new Code1();
        System.out.println("Enter the number of test cases to be performed :");
        int t = sc.nextInt();   //test cases
        for (int i = 1 ; i <= t ; i++)
        {   System.out.println("Enter the value of a :");
            int a = sc.nextInt();
            System.out.println("Enter the value of b :");
            int b = sc.nextInt();
            c1.sum(a , b);
        }
        

    }
}