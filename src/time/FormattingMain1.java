package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포맷팅 : 날짜를 문자열로 변환
        LocalDate dt = LocalDate.of(2024, 12, 31);
        System.out.println("dt = " + dt);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String format1 = dt.format(formatter);
        System.out.println("현재 시간과 날짜 포맷팅 = " + format1);

        //파싱 : 문자를 날짜로 변경하는 것
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간  = " + parsedDate);



    }
}
