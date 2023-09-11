package Lesson20_2;

import java.util.ArrayList;
import java.util.List;


public class ArList2 {

    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        List <String> list = List.of("odin", "dva", "tri");
        System.out.println("list = " + list);
    }
}
