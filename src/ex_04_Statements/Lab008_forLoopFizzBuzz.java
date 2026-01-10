package ex_04_Statements;

public class Lab008_forLoopFizzBuzz {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0&&i%5==0) {
                System.out.println(i + " FizzBuzz");
            }

             else if(i%3==0)
            {
                System.out.println(i+" Fizz");
            }
            else if(i%5==0)
            {
                System.out.println(i+" Buzz");
            }
            else {
                System.out.println(i);
                 }
            }


    }
}
