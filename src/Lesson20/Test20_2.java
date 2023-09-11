package Lesson20;

import java.util.ArrayList;

public class Test20_2 {

    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("poka");
        list.add(sb);
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        System.out.println(list.toString());
    }
}
