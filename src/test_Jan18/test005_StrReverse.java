//Write a Java program to reverse a given string using a loop.
package test_Jan18;

import java.util.Scanner;

public class test005_StrReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide the input to be reversed");
        String input=sc.next();
        String reversed="";
        for(int i=input.length()-1;i>=0;i--)
        {
            reversed +=input.charAt(i);
        }
        System.out.println("The reversed String is "+reversed);
    sc.close();
    }
}

