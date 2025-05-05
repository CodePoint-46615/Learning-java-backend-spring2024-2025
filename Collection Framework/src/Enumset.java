
import java.util.EnumSet;
enum Day {
    SUN, MON, TUE, WED, THU, FRI, SAT
}

public class Enumset {
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.FRI, Day.SAT);
        System.out.println(weekend);
        EnumSet<Day> weekDay = EnumSet.range(Day.SUN, Day.THU);
        System.out.println(weekDay);
    }
}