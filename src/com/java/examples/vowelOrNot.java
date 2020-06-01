package com.java.examples;
import java.util.Scanner;
public class vowelOrNot {
    public static void main(String args[])
    {
        boolean isVowel=false;
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'a':
            case 'b':
            case 'e': isVowel=true;
        }
        if(isVowel=true)
        {
            System.out.println(ch+"is a vowel");
        }
        else
        {
            System.out.println(ch+"is not an alphabet");
        }
    }
}
