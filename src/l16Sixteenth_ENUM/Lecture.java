package l16Sixteenth_ENUM;

import java.util.Arrays;

public class Lecture {

    public static void main(String[] args) {

// Отрримання опису для ENUM
        Season season = Season.AUTUMN;
        System.out.println(season.getDescription());


        Role role = Role.getById(1);
        if(role !=null){
            System.out.println("Role "+ role.getValue());
        }else {
            System.out.println("Role not found");
        }




        WeekDays day = WeekDays.WEDNESDAY;
        switch (day) {
            case MONDAY ->  System.out.println("Monday");
            case TUESDAY ->  System.out.println("Tuesday");
            case WEDNESDAY ->  System.out.println("Wednesday");
            case THURSDAY ->  System.out.println("Thursday");
            case FRIDAY ->  System.out.println("Friday");
            case SATURDAY ->  System.out.println("Saturday");
            case SUNDAY ->  System.out.println("Sunday");
        }


            /*
    Основні методи enum:
    values() -
    valueOf() -
    ordinal() -
    */

        WeekDays[] weekDays = WeekDays.values();
        WeekDays tuesday = WeekDays.valueOf("TUESDAY");
        int tuesdayOrdinal = WeekDays.TUESDAY.ordinal();
        System.out.println(Arrays.toString(weekDays));
        System.out.println(tuesday);
        System.out.println(tuesdayOrdinal);




    }






}
