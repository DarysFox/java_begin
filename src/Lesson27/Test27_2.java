package Lesson27;

public class Test27_2 {
    public static void main(String[] args) {

        int [] array = {4, 8, 1};
        System.out.println("U nas est massiv");

        try{
            System.out.println(array[5]);
            System.out.println("Vsem choroshego dnya!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Bil poyman exception: " + e);
        }
    }
}
