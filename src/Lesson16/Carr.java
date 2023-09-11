package Lesson16;

public class Carr {

    String color;
    String engine;
    
    Carr(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Carr abc(String cvet){
        Carr c10 = new Carr(cvet, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Carr c = new Carr("red", "V6");
        Carr c2 = c.abc("black");
        System.out.println(c.color);
    }
}
