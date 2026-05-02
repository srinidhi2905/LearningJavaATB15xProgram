package ex_05_Polymorphism;

public class Lab010_OvrLoad001 {
    public static void main(String[] args) {
        mathOps math=new mathOps();
        int multiply = math.calc(12,13);
        System.out.println(multiply);
        int add=math.calc(100,14,79);
        System.out.println(add);
    }

}

class mathOps{
    int calc(int a, int b){
        return a*b;
    }
    int calc(int a, int b, int c){
        return a+b+c;
    }
    int calc(float a, float b) {
        return (int) (a / b);
    }

}
