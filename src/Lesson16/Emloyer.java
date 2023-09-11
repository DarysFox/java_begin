package Lesson16;

public class Emloyer {

}

class Em{
    double salary;
    boolean isManager;
    Em(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEm{
    public static void main(String[] args) {
        Em em = new Em(100.5, true);
        System.out.println("Salary: " + em.salary + ", He is manager: " + em.isManager);
    }
}