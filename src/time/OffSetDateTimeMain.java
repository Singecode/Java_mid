package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffSetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOffset = OffsetDateTime.now();
        System.out.println("nowOffset = " + nowOffset);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("offsetDateTime = " + offsetDateTime);
    }
}
