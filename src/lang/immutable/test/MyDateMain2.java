package lang.immutable.test;

public class MyDateMain2 {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1; // date1 date2 == x001
        System.out.println("date1 =  " + date1);
        System.out.println("date2 =  " + date2);

        System.out.println("2025 -> date1");
        //date1 = new ImmutableMyDate(2025,1,1); //나는 인자를 년 만 바꾸고 싶은데
        // 이렇게 되면 매번 3개의 파라미터를 넘겨줘야 함.
        date1 = date1.withYear(2025); //년을 바꾸는 메서드 data =1 x002라는 참조값을 지니게 됨.
        date1 = date1.withMonth(2); //달을 바꾸는 메서드
        date1 = date1.withDay(22); //일을 바꾸는 메서드
        System.out.println("date1 =  " + date1);
        System.out.println("date2 =  " + date2);
    }
}
//해당 방법으로도 풀수 있지만
//강의 마지막에 배웠떤 불변객체의 값 변환을 한번 써보자.
//불변객체의 값을 변경하는 메서드의 리턴값으로는 보통 새로운 객체를 생성하는 경우가 많기때문에
//꼭 리턴값을 받아서 이용하도록 하자
//리턴값을 받지 않고 그냥 사용하게 되면 그 값은 버려짐 GC화 됨.

//date1 = 2024-1-1
//date2 = 2024-1-1
//2025 -> date1
//date1 = 2025-1-1
//date2 = 2025-1-1