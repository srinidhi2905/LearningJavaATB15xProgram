package ex_07_StringPrograms;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        String a="Java";
        String b="Program";
        System.out.println("Before Swap : "+a+ " "+b );
        a=a+b;
        b=a.substring(0, a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After Swap : "+a+ " "+b );
    }
}
