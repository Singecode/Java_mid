package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        LocalDateTime ldt = LocalDateTime.of(2031,6,2,18,31,25);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2023,1,1,13,30,50,0,ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utcZdt2 = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt2 = " + utcZdt2);

    }
}
