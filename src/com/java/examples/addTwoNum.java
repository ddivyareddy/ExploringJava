package com.java.examples;
import java.util.Scanner;
public class addTwoNum {
    public static void main(String args[])
    {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        sc.close();
        sum=num1+num2;
        System.out.println("----------sum is------------"+sum);
    }
}
