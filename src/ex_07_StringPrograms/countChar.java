package ex_07_StringPrograms;

public class countChar {
    public static void main(String[] args) {
        String input="Srinidhi";
        char[] letters= input.toCharArray();
        int count=0;

        for(char c:letters)
        {
            if(c=='i')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
