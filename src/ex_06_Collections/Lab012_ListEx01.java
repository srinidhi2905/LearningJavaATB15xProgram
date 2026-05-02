package ex_06_Collections;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab012_ListEx01
{
    public static void main(String[] args) {


        List fruits = List.of("Apple", "Orange", "Mango", "Banana", "Grapes","Apple", true, 12344);

        System.out.println(fruits);

        List lang= new ArrayList();
        lang.add("Java");
        lang.add("C++");
        lang.add("Ruby");
        lang.add("Perl");
        lang.add("C#");
        lang.add("Python");
        lang.add(true);
        lang.add(641047);

        //-----------Ways to Iterate----------

        for(Object lan: lang){
            System.out.print(lan+", ");
        }

        for(int i=0;i< lang.size();i++) {

            System.out.print(lang.get(i)+" ");
        }

        Iterator it=lang.iterator();
        while(it.hasNext()){

            System.out.print(it.next()+ " ");
        }
    }


}
