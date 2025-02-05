package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용 20일 동안이라는 의미
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        //기간의 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 6, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("몇달 = " + between.getMonths() +"개월" + " 일 = " + between.getDays() + "일"); //둘 사이의 기간차이 5달 하고 1일차이남..


    }
}
