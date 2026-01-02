package ex_03_Operators;

public class Lab005_incrEx01 {
    public static void main(String[] args) {
        int a=10;
        a=a++ +a++ +a++;
        //10+11+12
        System.out.println("a= "+a);
        int b=10;
        b=++b+ ++b+ ++b;
        //11+12+13
        System.out.println("b= "+b);
    }
}
