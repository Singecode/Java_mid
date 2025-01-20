package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; //a의 값을 b로 복사한다음에 대입.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("b->20");
        System.out.println("b = " + b);
        System.out.println("a = " + a);
        // 기본형은 절대로 값을 공유하지 않는다고 했음
        // 따라서 b = 20; a=10임.
        // 맨 위에서 a의 10과 b의 10은 서로 복사된 완전히 다른 값임.
        // 메모리 상에서도 a에 속하는 10과 b에 속하는 10은 각각 별도로 존재.
        // 따라서 변수한개가 변경되면 하나의 변수값만 변경..
    }
}
