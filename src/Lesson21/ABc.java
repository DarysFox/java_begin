package Lesson21;

public class ABc {

    public void abc(String s){
        System.out.println(s);
    }

    public void abc(boolean b){
        System.out.println(b);
    }

    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("poka");
    }
}
