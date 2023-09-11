package Lesson16;

import java.util.Locale;

public class Lower {
    public static void main(String[] args) {

        String s = "PriVet";

        String s2 = s.toLowerCase();
        System.out.println(s2);

        String s3 = s.toUpperCase();
        System.out.println(s3);

        boolean b = s.contains("iV");
        System.out.println(b);
    }
}
