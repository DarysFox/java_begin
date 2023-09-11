package Lesson23;

public class Test23_2 {
    void abc(Animal a){
        System.out.println("A");
    }

    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test23_2 t = new Test23_2();
        Animal an = new Mouse();
        //t.abc(an);
        an.getName();
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}