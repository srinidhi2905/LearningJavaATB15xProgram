package ex_07_StringPrograms;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String input){
        input=input.toLowerCase();
        int start=0;
        int end=input.length()-1;
        while(start<end){
            if(input.charAt(start)!=input.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine();

        if(isPalindrome(input)){
            System.out.println("The entered String is a Palindome");
        }
        else {
            System.out.println("The entered String is not a Palindome");
        }
        sc.close();
    }
}
