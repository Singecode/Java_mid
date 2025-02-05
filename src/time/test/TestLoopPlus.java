package time.test;

//2024년 1월 1일 부터 2주 간격으로 반복하여 날짜를 출력하는 코드를 만들어라

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(2024, 1, 1);
        for(int i = 0; i<5; i++){
            LocalDate plusWeek = now.plusWeeks(i * 2);
            System.out.println("날짜" + (i+1) +":" + plusWeek);
        }

    }
}
