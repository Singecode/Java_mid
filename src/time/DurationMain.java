package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime it = LocalTime.of(1,0);
        System.out.println("it = " + it);

        //계산에 사용
        LocalTime plusDuration = it.plus(duration);
        System.out.println("더한 시간 = " + plusDuration); //1시간 30분 출력

        //시간 차이
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(16, 40);
        Duration betweenTime = Duration.between(startTime, endTime);
        System.out.println("차이 : " + betweenTime.getSeconds() +"초");
        System.out.println("근무시간 : " + betweenTime.toHours() + "시간" + betweenTime.toMinutesPart()+"분");
    }
}
