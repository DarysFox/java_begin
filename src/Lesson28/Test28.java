package Lesson28;

import java.io.*;

public class Test28 {

    static int abc(){
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
            return 5;
        }

        catch (FileNotFoundException e){
            System.out.println("Exception byl poyman");
            return 6;
        }

        finally {
            System.out.println("Eto block finally");
        }
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
