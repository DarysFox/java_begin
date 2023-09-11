package Lesson13;

public class Test13 {
    public static void main(String[] args) {
        switch("Monday"){
            case "Monday":

            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println("Work until 18:00");
                break;

            case "Saturday":
                System.out.println("Work until 14:00");
                break;

            case "Sunday":
                System.out.println("No work");
                break;

            default:
                System.out.println("Wrong day");
                break;
        }
    }
}
