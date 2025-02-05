package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant insNow = Instant.now(); //UTC기준
        System.out.println("insNow = " + insNow); //9시간의 이전시간이 나옴 UTC기준이기 때문

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0); // 1970년 1월 1일 0시 0분에 매개변수를 더한 시간
        System.out.println("epochStart = " + epochStart);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpoch = later.getEpochSecond();
        System.out.println("laterEpoch = " + laterEpoch);

    }
}
