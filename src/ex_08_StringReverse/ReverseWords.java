package ex_08_StringReverse;

public class ReverseWords {
    public static void main(String[] args) {
        String input="Reverse only Words";
        String[] words=input.split(" ");
        String revStr="";
        for(int i=words.length-1;i>=0;i--)
        {
            revStr+=words[i];
            if(i!=0)
                revStr+=" ";
        }
        System.out.println(revStr);

    }
}
