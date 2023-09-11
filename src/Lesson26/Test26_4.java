package Lesson26;

public class Test26_4 {
    public static void main(String[] args) {

        Lion l = new Lion();
    }
}

class Animal{
    Animal(){
        System.out.println("Constructor of Animal");
    }
    static{
        System.out.println("Static init in Animal");
    }
    {
        System.out.println("Nonstatic init in Animal");
    }
}


class Mammal extends Animal{
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static{
        System.out.println("Static init in Mammal");
    }
    {
        System.out.println("Nonstatic init in Mammal");
    }
}

class Lion extends Mammal{
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static{
        System.out.println("Static init in Lion");
    }
    {
        System.out.println("Nonstatic init in Lion");
    }
}