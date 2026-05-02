package ex_07_StringPrograms;

import javax.sound.midi.Soundbank;

public class SwapwithTemp {
    public static void main (String[] args)
    {
        String a="Java";
        String b="Program";
        String c;

        System.out.println("Before Swap :"+a+ " "+b );
        c=a;
        a=b;
        b=c;
        System.out.println("After Swap :"+a+ " "+b );
    }
}
