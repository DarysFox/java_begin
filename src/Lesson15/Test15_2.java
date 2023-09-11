package Lesson15;

public class Test15_2 {
    public static void main(String[] args) {

        boolean b = true;
        int a = 1;

        while(b){
            System.out.println(a);
            if(a % 3 == 0 && a % 7 == 0){
                b = false;
            }
            a++;
        }

    }

        /*int money = 100;

        while(money > 0){
            System.out.println("Make a stav");
            System.out.println("U loose");
            money = money - 10;
        }

         */
}
