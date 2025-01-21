package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println("메서드 호출 비교 == " + isSame(s1, s2));

        String str3 = "Hello";
        String str4 = "Hello";
        System.out.println("메서드 호출 비교 == "+ isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        //return x==y;

        return x.equals(y);
    }
}
// 우리가 개발하는 입장에서는 해당 메서드에 리터럴이 들어올지, 인스턴스가 들어올지 이거는 메서드를  만든 사람만이 앎.
// 그러나 지금 메서드 제작자가 없다면? == 비교를 해버리면 리터럴이 들어오는 경우 인스턴스가 들어오는 경우마다
// 결과가 계속 달라질 것임 -> 매개변수로 넘어오는 것이 리터럴이냐 인스턴스냐를 확일할 방법이 없기때문에
// 따라서 String을 비교할때는 무조건 equals를 사용해야함(동등성비교)