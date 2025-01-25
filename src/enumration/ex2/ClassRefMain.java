package enumration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());
        //이 3가지는 ClassGrade로부터 만들어짐을 확인 가능

        System.out.println("ref BASIC = " + ClassGrade.BASIC );
        System.out.println("ref GOLD = " + ClassGrade.GOLD );
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND );
        //참조값은 3개다 서로다른 참조값을 지니고 있음. == 인스턴스 3개를 따로 지니고 있음


    }
}
