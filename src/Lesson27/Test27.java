package Lesson27;
import java.io.*;

public class Test27 {
    public static void main(String[] args){

        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem choroshego dnya!");
        }

        catch (FileNotFoundException e){
            System.out.println("Bil poyman exception: " + e);
        }

        finally {
            System.out.println("eto finally block");
        }

        System.out.println("Danniy kod uje ne imeet otnosheniya k isklyucheniyam");

        //FileOutputStream fos = new FileOutputStream(f);
        //fos.write(100);
    }
}
