package enumration.ex3;


public class ClassGradeEx3_1 {
    public static void main(String[] args) {
       DiscountService service = new DiscountService();
        int price = 10000;
        int basic = service.discount(Grade.BASIC, price); //x001, price
        int gold = service.discount(Grade.GOLD, price); //x002, price
        int diamond = service.discount(Grade.DIAMOND, price);//x003, price

        System.out.println("BASIC 할인 금액 = " + basic);
        System.out.println("GOLD 할인 금액 = " + gold);
        System.out.println("DIAMOND 할인 금액 = " + diamond);

        //Grade grade = new Grade();
        //자 열거형 == 외부 인스턴스 생성불가임..
    }
}
