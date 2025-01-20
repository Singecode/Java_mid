package lang.immutable.address;

public class    RefMain1 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법x(자바 뭄법상 맞음)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b=new ImmutableAddress("부산"); //
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}

//b의 값을 부산으로 변경하고 싶어 setValue와 같은 메서드를 찾는데 없음..
//클래스 내부로 들어가서 보니 불변객체로 선언되어있었음..
//이게 의미하는 바는 == 생성자를 통해서만 값을 변경 가능..
//그렇다면 우리가 b의 값을 변경하는 방법은 b=new ImmutableAddress("부산"); 이라고 작성할것
