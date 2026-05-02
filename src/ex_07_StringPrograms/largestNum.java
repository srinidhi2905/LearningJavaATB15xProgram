package ex_07_StringPrograms;

import java.util.Arrays;

public class largestNum {
    public static void main(String[] args) {


        int[] num = {12, 34, 87, 99, 123, 67};
        int largestNo=num[0];
        //Arrays.sort(num);
        //System.out.println("Largest="+num[num.length-1]);
        for(int n:num)
        {
            if(n>largestNo){
                largestNo=n;
            }
        }
        System.out.println(largestNo);

    }
}
