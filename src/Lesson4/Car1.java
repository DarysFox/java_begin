package Lesson4;

public class Car1 {
    Car1(String cvet, String motor){
        color = cvet;
        engine = motor;

        System.out.println("Cvet mashiny: " + color + ", motor mashiny: " + engine);
    }

    String color;
    String engine;
}

class Car1Test{
    public static void main(String[] args){
        Car1 car1 = new Car1("pink", "V8");

        Car1 car2 = new Car1("silver", "V6");
    }
}
