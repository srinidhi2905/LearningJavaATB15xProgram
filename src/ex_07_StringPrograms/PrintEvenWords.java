package ex_07_StringPrograms;

public class PrintEvenWords {
    public static void printEven(String s) {
        String[] words = s.split("\\s");
        System.out.println("Total Number of words " + words.length);
        System.out.println("Even count Words: ");
        int count=1;
        for(String word: words){
            if(word.length()%2==0)
            {
               System.out.println(count +" "+ word);
                count++;
            }
        }
    }

    public static void main(String args[]) {
    String s = "these are my codings.";
    printEven(s);
}
}
