package lang.wrapper.test;

//String str -> Integer로 변환해서 출력
//Integer를 int로 변환해서 출력
//int를 Integer로 변환해서 출력
//오토박싱,언박싱을 사용할것
public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        //문제1 String -> Intger;
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //문제2 Integer -> int
        int integer2 = integer1;//오토 언박싱
        System.out.println("integer2 = " + integer2);
        
        //문제3 int -> Integer
        Integer integer3 = integer2; //오토 박싱
        System.out.println("integer3 = " + integer3);
    }
}
