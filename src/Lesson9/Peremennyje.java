package Lesson9;

public class Peremennyje {

    int z = 5;

    String color;
    int a = 10;
    String engine;
    static int count;

    public static void changeA(int b){
        Peremennyje p = new Peremennyje("black", "V8");
        p.a = b;
    }

    Peremennyje(String color, String engine){
        this.count++;
        this.color = color;
        this.engine = engine;
    }

    public void showPer(){
        System.out.println("Car color: " + color);
        changeColor("red");
    }

    public void changeColor(String color2){

    }
}
