package lang.immutable.address;

public class RefMain_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 가능
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a); //side_effect발생 -> 같은 참조값을 참조하는 a의 값도 같이 변해버림.
        System.out.println("b = " + b); //b의 값만 부산으로 변경하길 원했음..
        // 이렇게 주된 작업 외에 추가적인 부수 효과를 일으키는 것 == 사이드 이펙트
        // side effect가 발생하면?
        // 부정적인 의미임, 이로인해 디버깅이 어려워지고 코드의 안정성 저하.


        //a와b는 참조값 x001로 같은 참조값을 가지게 됨.
        //따라서 x001참조값을 지닌 value에 접근할 수 있는 것임.
        //참조값에 있는 변수가 변경되면.. 둘은 같은 참조값을 지닌 인스턴스를 참조하기 때문에
        //둘다 부산으로 바뀌는 것임..
        //그리고 toString()을 오버라이딩 했기때문에 저렇게 깔끔하게 나옴.
    }
}
