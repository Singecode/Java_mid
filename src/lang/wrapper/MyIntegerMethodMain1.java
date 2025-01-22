package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(10);
        int res1 = myInt.compareTo(5);
        int res2 = myInt.compareTo(10);
        int res3 = myInt.compareTo(20);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
}

//MyInteger는 내부에 int value; 라는 단순한 데이터 조각인 int를 내부에 품고, 메서드를 통해 다양한 기능을 제공했음.
//덕분에 데이터 조각에 불과한 int를 MyInteger를 통해 객체로 다룰수 있게 되었음.
//compareTo는 자기 자신의 값을 외부값과 비교
//MyInteger는 객체이므로 메서드를 편리하게 호출 가능.
//int는 기본형이기 때문에 스스로 메서드를 가질 수 없음.