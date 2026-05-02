package ex_07_StringPrograms;

public class RevStringIterative {
    public static void main(String[] args) {
        String input="Reverse the string";
        StringBuilder rev= new StringBuilder();
        for(int i=input.length()-1; i>=0; i--){
            rev.append(input.charAt(i));
        }
        System.out.println("Reversed String: "+rev.toString());
    }
}
