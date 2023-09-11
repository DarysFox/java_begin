package Lesson7;

public class Employee {

    public double salary;

    public void  dvojnajaZp(){
        double result = salary * 2;
        System.out.println("Novaja Zp = " + result);
    }

    public Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args){
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvojnajaZp();
    }
}

class EmpTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvojnajaZp();
    }
}
