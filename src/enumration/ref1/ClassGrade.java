package enumration.ref1;

//회원의 할인율이 등급에따라 정해짐
//따라서 리팩토링시 회원등급에서 할인율도 같이 묶어서 포함하고 있도록
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); //X001
    public static final ClassGrade GOLD = new ClassGrade(20); //X002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //X003

    private final int discountRate;

    private ClassGrade(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
