package ex_04_Statements;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Lab008_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side1= sc.nextInt();
        int side2= sc.nextInt();
        int side3= sc.nextInt();

        if(side1==side2 && side2==side3 && side3==side1)
        {
            System.out.println("Acute Triangle");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
