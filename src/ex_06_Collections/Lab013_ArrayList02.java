package ex_06_Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab013_ArrayList02 {
    public static void main(String[] args) {
    List lang=new ArrayList();
        lang.add("Java");
        lang.add("C++");
        lang.add("Ruby");
        lang.add("Perl");
        lang.add("C#");
        lang.add("Python");
        lang.add(true);
        lang.add(641047);
        lang.add("C#");
        lang.add("C#");

        System.out.println(lang.size());
        System.out.println(lang.isEmpty());
        System.out.println(lang.contains("641037"));
        System.out.println(lang.contains("Ruby"));
        System.out.println(lang.contains("Typescript"));
        System.out.println(lang.indexOf("C#"));
        System.out.println(lang.lastIndexOf("C#"));

    }
}
