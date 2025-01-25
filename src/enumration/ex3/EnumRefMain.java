package enumration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("BASIC = " + Grade.BASIC.getClass());
        System.out.println("GOLD = " + Grade.GOLD.getClass());
        System.out.println("DIAMOND = " + Grade.DIAMOND.getClass());
        //getCalss()확인 결과 해당 BASIC,GOLD,DIAMOND는 Grade소속


        //ref
        System.out.println("BASIC ref = " + refValue(Grade.BASIC));
        System.out.println("GOLD ref = " + refValue(Grade.GOLD));
        System.out.println("DIAMOND ref = " + refValue(Grade.DIAMOND));
        //enum은 toString을 오버라이딩 해버렸음..
        //이 셋은 서로 다른 참조값을 지니고 있음 우리가 앞서 열거형을 직접 만들때와 똑같은 형태
    }
    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
