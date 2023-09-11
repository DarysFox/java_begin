package Lesson20;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <> ();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for(String s : list){
            System.out.println(s + " ");
        }
    }
}


