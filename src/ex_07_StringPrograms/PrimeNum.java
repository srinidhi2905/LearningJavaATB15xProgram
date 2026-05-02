package ex_07_StringPrograms;

public class PrimeNum {
    public static boolean isPrime(int num){
        if (num<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0) {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int n:num){
            if(isPrime(n))
            {
                System.out.println(n);
            }
            }
    }
}
