package ex_04_Statements;

import java.util.Scanner;

public class Lab009_forLoopGradCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Valid Number ranging from 0 to 100");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter Valid Number ranging from 0 to 100");
        }
        else {
            int marks = sc.nextInt();


            if (marks >= 90 && marks <= 100) {
                System.out.println("A Grade :" + marks);
            } else if (marks >= 80 && marks < 90) {
                System.out.println("B Grade :" + marks);
            } else if (marks >= 70 && marks < 80) {
                System.out.println("C Grade :" + marks);
            } else if (marks >= 60 && marks < 70) {
                System.out.println("D Grade :" + marks);
            } else if (marks >= 0 && marks < 60) {
                System.out.println("F Grade :" + marks);
            } else {
                System.out.println("Enter Valid Number ranging from 0 to 100");
            }
            sc.close();
        }

    }
}
