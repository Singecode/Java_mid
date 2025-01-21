package lang.string.immutable;

public class StringImmutableMain1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat( "java");
        System.out.println("str = " + str);
    }
}
//str로 hello문자열을 지정하고, concat을 통해서 java를 합쳐 hellojava가 나오길 기대했음
//그러나 전혀 합쳐지지 않고 그냥 hello만 출력됨
//String은 불변객체임 저번에 배웠던 불변객체의 특성을 잘 생각해보자
//return값으로 보통 새로운 인스턴스를 생성해준다고 했었다.