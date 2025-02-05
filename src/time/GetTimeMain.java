package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR = " + dt.get(ChronoField.YEAR));
        System.out.println("MONTH OF YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY OF MONTH = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR OF DAY = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE OF HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECONDS OF MINUTES = " + dt.get(ChronoField.SECOND_OF_MINUTE) );

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = " + dt.getYear());
        System.out.println("MONTH OF YEAR = " + dt.getMonthValue());
        System.out.println("DAY OF MONTH = " + dt.getDayOfMonth());
        System.out.println("HOUR OF DAY = " + dt.getHour());
        System.out.println("MINUTE OF HOUR = " + dt.getMinute());
        System.out.println("SECONDS OF MINUTES = " + dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
