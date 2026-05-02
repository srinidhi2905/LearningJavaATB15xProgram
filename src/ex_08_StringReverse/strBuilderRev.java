package ex_08_StringReverse;

public class strBuilderRev {
    public static void main(String[] args) {
        String input="Reverse Using String Builder";
        input=input.replaceAll("\\s+","");
        System.out.println(input);
        String revstr=new StringBuilder(input).reverse().toString();
        System.out.println(revstr);
    }
}
