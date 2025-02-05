package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("Hours.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

        //차이 구하기
        LocalTime startTime = LocalTime.of(1, 10, 0);
        LocalTime endTime = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(startTime, endTime);
        System.out.println("secondsBetween = " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(startTime, endTime);
        System.out.println("minutesBetween = " + minutesBetween);

    }
}
