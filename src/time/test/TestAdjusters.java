package time.test;

//입력받은 월의 첫날 요일과 마지막날 요일을 구해라

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        LocalDate startDate = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = startDate.getDayOfWeek();
        DayOfWeek lastDate = startDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("lastDate = " + lastDate);
    }
}