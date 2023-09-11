package Lesson16;

public class Test16_2 {
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Uraaaaaa";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaa", "Yeaaah").substring(6, 10);
        System.out.println(s3);
    }
}
