package ex_08_StringReverse;

public class revStrWthoutLenthFn {
    public static void main(String[] args) {
        String input = "Reversing without using Length Function";
        char[] charInput = input.toCharArray();
        String revStr = "";

        for (char c : charInput) {
            revStr =c+revStr;
        }
        System.out.println(revStr);
    }
}
