package lang.immutable.address;

public class RefMain_2 {
    public static void main(String[] args) {
        //side effect해결 방안 ==> 서로 다른 참조값을 지니게 하는 것
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //b는 부산 a는 서울, 원하는 결과값이 나옴
        //why? b와 a는 서로 다른 참조를 보기 때문임.



    }
}
