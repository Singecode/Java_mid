package lang.object.test;

//Rectangle{width=100, height=20}
//Rectangle{width=100, height=20}
// false
// true

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2); //동일성 비교
        System.out.println(rect1.equals(rect2)); // 동등성 비교..
    }
}

//println 자체에 == toString()기능이 있음
//근데 오버라이딩 하지 않고 순수 toString()이면.. 객체의 순수 정보와 참조값만 출력
//위와 같이 출력하고 싶으면==> 결국 toString()오버라이딩 해줘야 함.

//equals도 봤음
//euqlas메서드 자체도 결국 풀어보면 참조값을 비교하게 됨.
//인스턴스간 비교를 하고싶으면 결국 우리가 Object클래스 내 equals메서드를 오버라이등 해줘야함.

// 우리가 직접 구현해도 되지만. alt+inset generate기능을 통해서 만들어보자.

