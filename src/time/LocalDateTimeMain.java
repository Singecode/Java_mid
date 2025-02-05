package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println("현재 날짜 및 시간 반환 = " + nowDate );
        LocalDateTime ofDt = LocalDateTime.of(2024, 6, 2, 18, 32, 35);
        System.out.println("설정한 날짜 및 시간 반환 = " + ofDt);

        //날짜와 시간 분리
        LocalDate date = ofDt.toLocalDate(); //날짜만 뽑아서 사용가능
        System.out.println("ofDt의 날짜값 = " + date);
        LocalTime time = ofDt.toLocalTime(); //시간만 뽑아서 사용가능
        System.out.println("ofDt의 시간값 = " + time);

        //날짜와 시간을 합칠 수 있음.
        LocalDateTime sumDt = LocalDateTime.of(date, time);
        System.out.println("분리된 날짜와 시간 합체 = " + sumDt);

        //계산(불변)
        LocalDateTime plusDt = ofDt.plusDays(1000);
        System.out.println("지정날짜 + 1000일 = " + plusDt);
        LocalDateTime plusYear = ofDt.plusYears(2);
        System.out.println("지정날짜 + 2년 = " + plusYear);

        //비교
        System.out.println("현재 날짜시간이 지정날짜 시간보다 이전인가?");
        System.out.println(nowDate.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정날짜보다 이후인가?");
        System.out.println(nowDate.isAfter(ofDt));
        System.out.println("현재 시간과 지정날짜가 동일한가?");
        System.out.println(nowDate.isEqual(ofDt));

        //euqals를 사용하지 않고 isEqual을 사용하는 이유?
        //isEqual은 단순히 비교대상이 시간적으로 같으면 True 반환, 객체가 다르고 시간존이 달라도, 시간적으로 같으면 true 반환,
        //ex. 서울의 9시와 UTC의 0시는 타임존 데이터는 다르나 시간적으로 같으므로 true 반환
        //equals는 객체 타입, 타임존 등등, 내부데이터의 모든 구성요소가 같아야 true반환
        //위와 같은 예시는 타임존 데이터가 다르기때문에 equals에서는 false반환.


    }
}
