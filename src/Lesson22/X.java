package Lesson22;

public class X {

    public X(String s){
        System.out.println(s);
    }
}

class Y extends X{
    public Y(){
        super("ok");
        System.out.println("hello");
    }
}
