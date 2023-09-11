package Lesson29;

import java.time.*;

public class Test29 {
    public static void main(String[] args) {
        //System.out.println(LocalDate.now());
        //System.out.println(LocalTime.now());
        //System.out.println(LocalDateTime.now());

        LocalDate ld1 = LocalDate.of(2005, 2, 2);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2005, Month.FEBRUARY, 2);
        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.of(15,30, 45);
        System.out.println(lt2);
        LocalTime lt3 = LocalTime.of(15,30, 45, 999999);
        System.out.println(lt3);
    }

}
