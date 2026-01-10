package ex_04_Statements;

import java.util.Scanner;

public class Lab008_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Side A: ");
        int A = sc.nextInt();
        System.out.println("Enter the Side B: ");
        int B = sc.nextInt();
        System.out.println("Enter the Side C: ");
        int C = sc.nextInt();

        System.out.println("Based on the input, the Triangle Classifier is : ");

        if(A == B && B == C && C == A)
        {
            System.out.println("Acute Triangle");
        } else if (A == B || B == C || C == A) {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }
}
