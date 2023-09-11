package Lesson24;

import javax.crypto.spec.PSource;

public class Test24 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploschad();
    }
}

abstract class Figura{

    int kolichestvoStoron = 0;

    abstract void perimetr();
    abstract void ploschad();
    void showInfo(){
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura{

    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr(){
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }
    public void ploschad(){
        System.out.println("Ploschad kvadrata = " + storona1 * storona1);
    }

}

class Pryamougolnik extends Figura{

    int kolichestvoStoron = 0;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr(){
        System.out.println("Perimetr pryamougolnika = " + (storona1 + storona2) * 2);
    }
    public void ploschad(){
        System.out.println("Ploschad pryamougolnika = " + storona1 * storona2);
    }

}

class Okruzhnost extends Figura{

    int kolichestvoStoron = 0;
    int radius = 3;

    public void perimetr(){
        System.out.println("Perimetr okruzhnosti = " + 2 * 3.14 * radius);
    }
    public void ploschad(){
        System.out.println("Ploschad okruzhnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirechugolnik extends Figura{
    void def(){
        System.out.println("Eto chetirechugolnik");
    }
}