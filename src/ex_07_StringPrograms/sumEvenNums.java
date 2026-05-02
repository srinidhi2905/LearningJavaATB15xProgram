package ex_07_StringPrograms;

public class sumEvenNums {
    public static void main(String[] args) {
        int[] add={1,2,3,4,5,6,7};
        int result=0;
        for(int no:add)
        {
            if(no%2!=0) {
                result += no;
            }
        }
        System.out.println(result);
    }
}
