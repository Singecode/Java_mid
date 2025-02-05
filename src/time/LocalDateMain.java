package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now(); //LocalDate.now == 오늘 날짜 반환.
        LocalDate localDate = LocalDate.of(2024, 6, 2);
        System.out.println("오늘 날짜는? = " + nowDate);
        System.out.println("지정 날짜 반환 = " + localDate);

        //날짜 계산(불변) 반환값 받아야 함
        LocalDate plusDate = localDate.plusDays(10);
        System.out.println("지정날짜 + 10 = " + plusDate);


    }
}
