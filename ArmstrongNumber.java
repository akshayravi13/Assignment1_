package com.company;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int size= Integer.toString(n).length();
        double sum=0;
        int x;
        int n1=n;
        while(n>0)
        {
            x=n%10;
            sum=sum+Math.pow(x,size);
            n=n/10;
        }

        if(sum==n1)
            System.out.println(n1 + " is an Armstrong number");
        else
            System.out.println(n1 + " is not an Armstrong number");

    }
}
