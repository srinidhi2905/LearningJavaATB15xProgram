package ex_02_TerneryOperators;

public class Lab003_TerOpEx02 {
    public static void main(String[] args) {
    int age1=Integer.parseInt(args[0]);
    int age2=Integer.parseInt(args[1]);
    int age3=Integer.parseInt(args[2]);
    int age4=Integer.parseInt(args[3]);
    int age5=Integer.parseInt(args[4]);
    int age6=Integer.parseInt(args[5]);

    int age=age6;
    String result=(age<=5)?"kids":
            (age<=18)?"Minor":
                    (age>18&&age<=60)?"Adult":
                            (age>60)?"Senior Citizens":"invalid Input";
        System.out.println(result);
    }
}
