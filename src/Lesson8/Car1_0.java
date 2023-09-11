package Lesson8;

public class Car1_0 {

    String color = "blue";
    String engine = "V6";

}

class Human{
    String name = "Ivan";
    Car1_0 c = new Car1_0();
    public static void main(String[] args){
        Human h1 = new Human();
        h1.c = new Car1_0();
        h1.c.engine = "V8";
    }
}