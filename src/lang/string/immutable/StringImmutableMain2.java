package lang.string.immutable;

public class StringImmutableMain2 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat( "java");
        System.out.println("str = " + str2);
    }
}
//str로 hello문자열을 지정하고, concat을 통해서 java를 합쳐 hellojava가 나오길 기대했음
//그러나 전혀 합쳐지지 않고 그냥 hello만 출력됨
//String은 불변객체임 저번에 배웠던 불변객체의 특성을 잘 생각해보자
//return값으로 보통 새로운 인스턴스를 생성해준다고 했었다.
//return StringConcatHelper.simpleConcat(this, str); 반환값이 이렇게 있었음 concat보면.
//리터럴로 선언하면 문자열 풀에서 관리한다고 했었음, 리터럴 값이 같다면 해당 문자열들은 모두 같은 참조값을 지니게 됨.
//불변객체로 선언되지 않았다면 이들중 하나만 값이 바뀌어도 나머지 모두가 값이 변경됨 --> 사이드 이펙트 발생.
//그러나 String 클래스는 불변 객체로 만들어졌기 때문에 이러한 사이드 이펙트가 발생하지 않음.