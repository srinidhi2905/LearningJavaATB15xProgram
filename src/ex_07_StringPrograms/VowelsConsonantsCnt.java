package ex_07_StringPrograms;

public class VowelsConsonantsCnt {
    public static void main(String[] args) {
        String input="Such a beautiful day";
        StringBuffer vowels= new StringBuffer();
        StringBuffer consonants= new StringBuffer();
        int vow=0;
        int cons=0;
        input=input.toLowerCase();
        for(int i=0; i<input.length();i++)
        {
            char ch= input.charAt(i);
         if("aeiou".indexOf(ch)!=-1)
         {
             vowels.append(ch);
             vow++;
         } else if (ch>'a' && ch<'z') {
             consonants.append(ch);
             cons++;
         }

         }
        System.out.println("Vowels count: "+vow+" Vowels: "+vowels);
        System.out.println("Consonants count: "+cons+" Consonants: "+consonants);
        }
}
