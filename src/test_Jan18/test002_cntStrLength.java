//Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.
package test_Jan18;

import java.util.Scanner;

public class test002_cntStrLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String value = sc.nextLine();
        if(CalcStringLen(value)){
            System.out.println("The String value is greater than 10");
        }
        else{
            System.out.println("The String value is less than 10");
        }
        sc.close();
    }

    public static Boolean CalcStringLen(String str) {
        return str.length() > 10;
    }
    }

