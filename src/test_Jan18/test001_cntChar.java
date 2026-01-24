//Write a Java program to count the total number of characters in a given string (excluding spaces).
package test_Jan18;

public class test001_cntChar {
    public static void main(String[] args) {
        String str = "Length of String";
        String strWithoutSpace=str.trim().replaceAll("\\s+", "");

        int strLength=str.length();
        int strLengthWithoutspace=strWithoutSpace.length();
        System.out.println("Length a String is " +strLength);
        System.out.println("Length a String is " +strLengthWithoutspace);
    }
}
