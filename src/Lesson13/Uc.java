package Lesson13;

public class Uc {

}


class Ucenik {

    int grade;

    Ucenik(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Ucenik u1 = new Ucenik(3);

        switch (u1.grade) {

            case 2:
                System.out.println("Student is 2th");
                break;

            case 3:
                System.out.println("Student is 3th");
                break;

            case 4:
                System.out.println("Student is 4th");
                break;

            default:
                System.out.println("Grade is wrong");
                break;
        }
        /*
        if(u1.grade == 2){
            System.out.println("Student is 2th");
        }

        else if(u1.grade == 3){
            System.out.println("Student is 3th");
        }

        else if(u1.grade == 4){
            System.out.println("Student is 4th");
        }

        else if(u1.grade == 5){
            System.out.println("Student is 5th");
        }

        else{
                System.out.println("Grade is wrong");
        }
    }

         */
    }
}