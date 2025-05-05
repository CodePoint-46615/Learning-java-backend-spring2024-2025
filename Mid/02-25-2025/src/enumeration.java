//Topic =>  Enumeration

import java.math.BigDecimal;
public class enumeration {
    public static void main(String[] args) {
        //enum object creation
        Days day1 = Days.MONDAY;
        System.out.println(day1);
        //ordinal()
        System.out.println("Ordinal Value Monday: "+day1.ordinal());
        //equals()
        System.out.println(day1.name().equals("Monday"));
        //equalsIgnoreCase()
        System.out.println(day1.name().equalsIgnoreCase("Monday"));

        //compareTo()
        Days day2 = Days.SUNDAY;
        System.out.println("Ordinal Value Sunday: " +day2.ordinal());
        System.out.println("compareTo() result: "+day1.compareTo(day2));

        //valueOf()
        //Days day3 = Days.valueOf("Monday"); //java.lang.IllegalArgumentException
        Days day3 = Days.valueOf("FRIDAY");
        System.out.println(day3);

        //values()
        Days[] days = Days.values();
        for(Days day: days){
            System.out.print(day+" ");
        }
    }
}
