package time;

public class Theory {
    //모든 나라마다 쓰는 시간개념이 다르기 때문이 이에 맞춰 개발자가 하나씩 구현하는 것은 버그도 많고 한계가 있음
    //그래서 우리는 이에 맞는 시간 라이브러리를 사용하여 구현해야함.

    //1. 기본 날짜와 시간(LocalDateTime)
    //LocalDate, LocalTime,LocalDateTime
    //LocalDate : 날짜만 표현할때 사용(년,월,일) --> 2025-01-31..
    //LocalTime : 시간만을 표현할때 사용(시,분,초) --> 08:20:30.213...
    //LocalDateTime : LocalDate 와 LocalTime을 합한 개념 -- 2025-01-31T:08:20:30:213..
    // Local이 붙는 이유 == 세계시간대를 고려하지 않아서, 타임존이 적용되지 않기 때문...
    // 해당 시간클래스는 국내 서비스만 고려할시 사용.
    // 모든 날짜 클래스는 불변임 따라서 반환값을 반드시 받아서 사용해야함.

    //2.TimeZone
    //일광 절약 시간제 + UTC로부터의 offset 정보를 모두 포함
    //ZoneId클래스로 제공
}
