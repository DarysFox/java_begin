package Lesson21;

public class GarbCol {

    public static void main(String[] args) {
        int a = 6;
        System.out.println((a < 4 ? 7 : "bruh"));

        int b = 5;
        int c = (a < 6) ? a++ : b++;
        System.out.println("a = " + a + ", b = " + b);
        
    }
}
