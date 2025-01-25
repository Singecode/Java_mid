package enumration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        int price = 10000;
        int basic = service.discount(ClassGrade.BASIC, price); //x001, price
        int gold = service.discount(ClassGrade.GOLD, price); //x002, price
        int diamond = service.discount(ClassGrade.DIAMOND, price);//x003, price

        System.out.println("BASIC 할인 금액 = " + basic);
        System.out.println("GOLD 할인 금액 = " + gold);
        System.out.println("DIAMOND 할인 금액 = " + diamond);

    }
}
