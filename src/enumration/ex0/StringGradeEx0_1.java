package enumration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        int price = 10000;
        int basic = service.discount("BASIC",price);
        int gold = service.discount("GOLD",price);
        int diamond = service.discount("DIAMOND",price);

        System.out.println("Basic 할인 금액 = " + basic);
        System.out.println("Gold 할인 금액 = " + gold);
        System.out.println("Diamond 할인 금액 = " + diamond);
    }
}


