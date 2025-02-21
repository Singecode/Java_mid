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
    //   이는 일관성이 떨어지게 됨. 따라서 Object클래스를 최상위 부모로서 상속을받고 일관된 메소드명을 이용할 수 있도록
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

    //Object 배열
    //Object배열을 통해 모든 객체를 저장할 수 있는 배열을 만들었다.
    //size 함수를 통해 전달된 객체의 수를 입력받는 메서드를 완성함
    //Object가 없다면? 어떻게 될까?
    //Object가 없다면 사용자가 직접 Object와 같은 클래스를 만들어 직접 정의한 클래스를 상속받으면 된다.
    //하지만 수많은 개발자가 서로다른 이름의 일관성 없는 클래스를 만들게 되면서 호환성이 많이 떨어지게 될것이다.
    // 이러한 경우 우리는 모든 클래스의 최상위 부모인 Object 클래스를 사용하여 이런한 문제를 해결할 수 있다.

    // Object클래스의 toString()메서드
    // toString() : 객체의 정보를 문자열 형태로 제공 => 디버깅과 로깅에 활용
    // public String toString() {
    // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    // }
    // toString 메서드의 형태는 위와 같이 생김
    // getClass().getName()을 통해 클래스에 대한 정보를 얻어내고
    // 추후 자세히 다루겠지만 hashCode()를 이용해 클래스의 참조값을 얻어냄.
    // 해시값 16진수로 제공해줌.

    // 분명히 string에서는 toString()함수를 적용하고, obj는 단순출력인데 결과가 같음?
    // why?
    // 사실 System.out.println()은 내부에서 toString메서드를 호출함.
    // 그래서 별도의 toString을 붙혀주지 않아도 객체 정보를 출력해줄 수 있음..
    // 우리가 객체의 참조값을 얻을 수 있던 이유는 println의 toString덕분

    // toString오버라이딩
    // toString을 통해서 객체의 정보와 참조값을 나타낼수 있지만, 이것만으로는 적절하게 나타낼수 없음
    // 그래서 우리는 toString을 오버라이딩해서 사용
    // toString은 최상위 부모의 메서드이기때문에 어느 클래스든 오버라이딩 가능.

//    public class BadObjectPrinter {
//        public static void print(Car car) { //Car 전용 메서드
//            String string = "객체 정보 출력: " + car.carInfo(); //carInfo() 메서드 만듬
//            System.out.println(string);
//        }
//    }
//    public static void print(Dog dog) { //Dog 전용 메서드
//        String string = "객체 정보 출력: " + dog.dogInfo(); //dogInfo() 메서드 만듬
//        System.out.println(string);

    //BadObjectPrinter는 Dog,Car에 의존한다고 표현.. 이는 표현할 인스턴스가 늘때마다 해당 인스턴스 정보를
    //출력해주는 메서드 또한 늘어난도 표현 가능..


//    public class ObjectPrinter {
//        public static void print(Object obj) {
//            String string = "객체 정보 출력: " + obj.toString();
//            System.out.println(string);
//        }
//    }
    //클래스가 파라미터를 통해 특정 동작을 수행한다면 해당 클래스는 특정 파라미터에 의존한다고 표현
    //Object클래스는 특정 구체적인 개념에 의존하는 것이 아닌 추상적인 것에 의존하는 것.

    //println의 구현 의존은 Object에 의존하고 있음
    // 따라서 어떤 타입이오든 모든 객체정보를 편리하게 출력할 수 있음
    // 이때 우리는 println의 어떠한 코드도 수정할 필요가 없음 == OCP원칙이 잘 지켜지고 있다는 뜻
    // => 확장에는 열려 있고 변경에는 닫혀 있는 바람직한 코드임
    // 이는 다형적 참조오 메서드 오버라이딩 덕.

    //정적 의존관계 vs 동적 의존관계
    //앞서 만들었던 ObejectPrinter예시로 들자
    //정적 의존관계 : 클래스내의 전달인자만 보고 파악이 가능, 주로 컴파일 시간에 결ㅈ어
    //ObjectPrinter(Object obj) ==> 아! Object타입에 의존하고 있구나를 파악..

    //동적 의존관계 : 프로그램을 실행하는 런타임에서 확인 가능.
    //obj에는 Car타입이 넘어올수도 Dog타입이 넘어올수도 있다. 이렇게 런타임에 어떤 인스턴스를 사용하는 것을 나타내는것.

    //단순히 의존관계, 의존한다랄고 표현하는 것은 정적 의존관계를 말하는 것.

    //동등성과 동일성
    //동일성 : ==연산자를 사용하여 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    // ->물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인하는 것.

    // 동등성 : equals()메서드를 이용, 두 객체가 논리적으로 동등한지 확인

    // -> 동일성은 JVM기준 메모리참조가 기준이므로 물리적, 동등성은 보통 사람이 생각하는 논리적인 기준에 맞추어 비교.

//    User a = new User("id-100") //참조 x001
//    User b = new User("id-100") //참조 x002

    //a와 b는 서로 다른 객체이며, 서로다른 참조값을 지니지만, 해당 참조값의 내용자체는 같음..
    //동일성과 동등성 기준에서 보자면 동일성은 없지만, 동등성은 지니고 있다고 생각.
    //equals package 참조..
    //동일성 비교가 항상 필요한 것은 아님. 꼭 필요한 경우에만 equals메서드를 오버라이딩 하면 됨
    // equals와 hashcode는 보통 함께 사용됨.. 추후에 자세히 다룰 예정.(컬렉션 프레임워크)
}
