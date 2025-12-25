package ex_02_TerneryOperators;

public class Lab004_TerOpEx03 {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 29;
        int n3 = -30;
        System.out.println("MAX OUT OF THREE");
        int max=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(max);
    }
}
