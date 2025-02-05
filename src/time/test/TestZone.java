package time.test;

//서울의 회의 시간은 2024년 1월 1일 오전 9시임.
//이때 런던, 뉴욕의 회의 시간을 구하여라

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9,0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
       ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("서울 회의 시간 : " + seoulTime);
        System.out.println("런던 회의 시간 : " + londonTime);
        System.out.println("뉴욕 회의 시간 : " + nyTime);


    }
}
