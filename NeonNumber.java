package com.company;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square=n*n;
        int sum=0;
        int x;
        while(square>0)
        {
            x = square % 10;
            sum=sum+x;
            square=square/10;
        }
        if(sum==n)
            System.out.println( n + " is a neon number");
        else
            System.out.println(n + " is not a neon number");

    }
}
