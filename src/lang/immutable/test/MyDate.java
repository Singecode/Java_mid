package lang.immutable.test;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
}


//해당 클래스는 가변 클래스
//main에서 출력해본 결과 side effect가 발생
//이제 이를 해결하기위해서는 물론 서로 다른 객체를 생성하는 방법도 있지만.
//불변클래스를 배웠으니 이를 활용해보자
//MyDate클래스를 immutableDate 불변클래스로 만들어서 date1만 바뀌게끔 해보자