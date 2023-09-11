package Lesson16;

public class Metody {

    public static void main(String[] args) {
        String s1 = new String("hellommhello");
        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(4);
        System.out.println(c1);

        int i1 = s1.indexOf('e');
        System.out.println(i1);

        int i2 = s1.indexOf("el");
        System.out.println(i2);

        int i3 = s1.indexOf('h', 5);
        System.out.println(i3);

        boolean b1 = s1.startsWith("he", 7);
        System.out.println(b1);

        boolean b2 = s1.endsWith("ello");
        System.out.println(b2);
    }
}
