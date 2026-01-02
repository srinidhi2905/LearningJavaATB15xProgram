package ex_03_Operators;

public class Lab006_incrEx02 {
    public static void main(String[] args) {
        int a=3;
        a=a++ * ++a; //3*5
        System.out.println("a= "+a);

        int b=3;
        b=b++ * b++; //3*4
        System.out.println("b= "+b);

        int c=3;
        c=++c * ++c; // 4*5
        System.out.println("c= "+c);

        int d=3;
        d=++d * d++; //4*4
        System.out.println("d= "+d);


    }
}
