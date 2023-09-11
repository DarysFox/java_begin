package Lesson14;

public class For {

    public void time(){
        OUTER: for(int hour = 0; hour <= 23; hour++){

            for(int minute = 0; minute <= 59; minute++){

                if(minute < 10 && hour < 10){
                    System.out.println("0" + hour + ":0" + minute);
                }
                else if(minute < 10 && hour > 10) {
                    System.out.println(hour + ":0" + minute);
                }

                else if(minute > 10 && hour < 10) {
                    System.out.println("0" + hour + ":" + minute);
                }

                else if(minute > 10 && hour > 10){
                    System.out.println(hour + ":" + minute);
                }
            }
        }
    }

    public static void main(String[] args) {
        For f = new For();
        f.time();
    }
}
