package lang.wrapper.test;


//String str을 Ineteger로 변환해서 출력해라
//Integer을 int로 변환해서 출력해라
//int를 Integer로 변환해서 출력해라
//오토박싱, 언박싱 사용하지 말고 직접해라.
public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //문제1. str을 Integer로 변환해서 출력
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //문제2 Integer -> int
        int integer2 = integer1.intValue();
        System.out.println("integer2 = " + integer2);

        //문제3 int -> Integer;
        Integer integer3 = Integer.valueOf(integer2);
        System.out.println("integer3 = " + integer3);
    }
}
