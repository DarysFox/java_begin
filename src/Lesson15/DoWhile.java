package Lesson15;

public class DoWhile {

    public static void main(String[] args) {

        int chas = 0;

        OUTER:
        do {
            int minuta = 0;

            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
            chas++;
        }
        while (chas < 24);
        /*
        int money = 100;
        do{
            System.out.println("delaj stavku");
            System.out.println("vy proigrali");
            System.out.println(" ");
            money -= 10;
        }
        while (money > 50);
    }

         */
    }
}