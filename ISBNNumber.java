package com.company;
import java.util.Scanner;

public class ISBNNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 10 digit number");
        long n = sc.nextLong();
        if(Long.toString(n).length()!=10)
            System.out.println("Not ISBN number");
        else
        {
            int i = 10;
            long sum = 0;
            long x;
            while (i > 0)
            {
                x = n % 10;
                sum = sum + (x * i);
                i--;
                n=n/10;
            }
            if(sum%11==0)
                System.out.println( "is an ISBN number");
            else
                System.out.println("is not an ISBN number");
        }
    }
}
