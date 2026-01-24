//Write a Java program to compare two strings and check whether they are equal or not.
package test_Jan18;

import java.util.Scanner;

public class test004_StrComparison {
    public static void main(String[] args) {
        String strA = "Str";
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide the input to compare");
        String strb =sc.next();
        if(strA.equals(strb)) {
            System.out.println("Match Successful");
        }
        else {
            System.out.println("Sorry, The String that you entered is different");
        }
        sc.close();

    }
}
