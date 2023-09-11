package Lesson12;

public class Test12 {

    void abc() {
        String str;
        int a = 10;

        if (a >= 10) {
            str = "Hello";
        } else if (a < 10) {
            str = "Bye";
        } else {
            str = "null";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test12 test = new Test12();
        test.abc();
    }

    /*
    void max(int i1, int i2, int i3){
        if(i1 > i2 && i1 > i3){
            System.out.println("Max: " + i1);
        }

        else if(i2 > i1 && i2 > i3){
            System.out.println("Max: " + i2);
        }

        else{
            System.out.println("Max: " + i3);
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.max(10, 0, 5);
    }






     */
    /*
    public static void main(String[] args) {
        int salary = 1500;
        if(salary < 200){
            System.out.println("salary is too low");
        }
        else if(salary < 400){
            System.out.println("salary is normal");
        }
        else if(salary < 600){
            System.out.println("salary is high");
        }
        else{
            System.out.println("salary is really nice");
        }
    }
     */
}
