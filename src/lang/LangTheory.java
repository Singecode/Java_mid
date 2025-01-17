package lang;

public class LangTheory {
    // java.lang?
    // 언어를 이루는 가장 기본적인 패키지를 뜻 함
    // 언어를 이루는 가장 기본적인 클래스를 보관.

    //java.lang의 대표적인 패키지 클래스들
    // Object : 모든 자바 객체의 부모 클래스
    // String : 문자열
    // Integer, Double, Long : 래퍼타입, 기본형 데이터타입을 객체로 만든 것
    // Class : 클래스 메타 정보
    // System : 시스템과 관련된 기본 기능 제공

    // ex. 우리가 흔히 사용하는 System.out.println()을 사용할때는 원래 java.lang.System을 import시켜 줘야한
    // 너무 자주 사용하기 때문에 자바에서는 오토 임포트임.. 따로 추가하지 않아줘도 됨.
    // System은 java.lang 패키지 소속이다.

    // Object 클래스
    // 자바에서 모든 클래스의 최상위 부모 클래스는 항상 Object 클래스임
    // Parent 클래스를 만들었다.
    // Parent 클래스가 아무것도 상속을 받는 상태가 아니라면, 기본적으로 Parent 클래스는 Object클래스를 상속받음
    // 따라서 class Parent == 원래는 class Parent extends Object 와 같은 의미.
    // 우리가 따로 extends Object를 하지 않아도 자바에서 알아서 넣어줌
    // 따라서 extends Object는 생략을 권장
    // toString()은 Object의 메서드임
    // toString()? == 객체에 대한 정보를 출력하는 메서드임
    // object패키지에서 Parent클래스와 Parent를 상속받는 child클래스를 만들었음
    // Child child = new Child(); 객체 생성 시점에서 메모리에는 Child, Parent, Object가 함께 생성됨
    // toString()의 호출 원리는, 메모리에가서 Child 타입에 toString확인, 없으면 위로 올라감..
    // 그렇게 최종적으로 올라가서 Object의 toString()메서드가 호출되는 원리
    // 따라서 자바에서 모든 객체의 최종 부모는 Object임

    // 자바에서 Object가 최상위 부모인 이유?
    // 1.공통 기능 제공
    //  -객체의 정보를 제공하고, 다른 객체와 비교, 객체가 어떤 클래스로 만들어졌는지는 모든 객체에게 필요한 기능이자만
    //  이러한 기능을 객체를 만들때마다 항상 메서드로 만드는 것은 번거로울 것..
    //   만약 메서드를 만든다 하더라도 개발자마다 toString(), objectInfo() 등등 서로다른 메서드 명으로 만들 확률이 있음
    //   이는 일관성이 떨어지게 됨. 따라서 Object클래스르 최상위 부모로서 상속을받고 일관된 메소드명을 이용할 수 있도록
    //    하기 위함이라는 뜻에서 == 공통 기능 제공을 한다.
    //  -- Object가 제공하는 기능
    //  toString() : 객체의 정보 제공
    //  equals() : 객체의 같음을 비교함.
    //  getCalss() : 객체의 클래스 정보를 제공함.
    //  etc.

    // 2.다형성의 기본 구현
    // 부모는 자식을 담을 수 있음 ..
    // Object클래스는 모든 객체의 부모임 == 따라서 Object는 모든 클래스를 참조할 수 있음을 의미.
    // Object클래스는 다형성을 지원하는 기본적인 메커니즘을 제공 모든 자바 객체는 Object타입으로 처리가능하며
    // 다양한 타입의 객체를 통합적으로 처리가능하게 해줌.
    // 타입이 다른 객체를 어딘가에 보관해야 한다면 Object에 보관..

    //Object의 다형성
    //object.poly에 서로 다른 Car클래스와 Dog클래스를 만듦
    //둘다 부모 클래스가 없으므로 최상위 부모로는 Object가 있을 것임.
    //부모 클래스는 자식을 담을 수 있으므로 심지어 최상위 부모이기 때문에 어떠한 타입도 받을 수 있음.
    // private static void action(Object obj)
    // 선언후 obj.move()? == > 컴파일 오류
    // why? obj 자체에는 move나 sound메서드가 존재하지 않음..
    // 그렇다면 어떻게 호출할 수 있나? == 다운캐스팅을 활용하면 됨
    // if(obj instanceof Dog dog){ ....

    // Object를 활용한 다형성의 한계
    // Object객체는 모든 객체를 참조 할 수 있음.
    // 그러나 Object를 통해 전달받은 객체를 호출하기 위해서는 각 객체에 맞는 다운캐스팅 과정이 필요
    // Object가 모든 메서드를 알고 있는 것이 아니기 때문.
    // 다형성을 제대로 이용하려면 == 다형적 참조 + 메서드 오버라이딩을 활용해야 하지만.
    // 다형적 참조는 가능한 반면 Object가 모든 메서드를 알고 있는것이 아니기 때문에 메서드 오버라이딩은 불가.
    // 그렇다면 어떤 경우에 Object클래스를 활용하면 좋을까?

}
