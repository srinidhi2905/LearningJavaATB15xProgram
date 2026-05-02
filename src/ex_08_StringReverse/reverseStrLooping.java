package ex_08_StringReverse;

public class reverseStrLooping {
    public static void main (String Args[]){
        String input="My First Interview";
        String revStr="";
        System.out.println("The Reversed Str is");
        for(int i=input.length()-1; i>=0; i--){
            revStr+=input.charAt(i);
        }
        System.out.println("The Reversed Str is"+revStr);
    }
}
