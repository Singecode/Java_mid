package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(23, 18,5);
        System.out.println("현재 시간 = " + nowTime);
        System.out.println("지정 시간 = " + ofTime);

        //시간 계산 불변
        ofTime = ofTime.plusSeconds(30);
        System.out.println("지정시간 + 1 = " + ofTime);
    }
}
