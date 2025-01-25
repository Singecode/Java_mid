package enumration.ex1;


public class StringGradeEx1_1 {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        int price = 10000;
        int basic = service.discount(StringGrade.BASIC,price);
        int gold = service.discount(StringGrade.GOLD,price);
        int diamond = service.discount(StringGrade.DIAMOND,price);

        System.out.println("Basic 할인 금액 = " + basic);
        System.out.println("Gold 할인 금액 = " + gold);
        System.out.println("Diamond 할인 금액 = " + diamond);
    }
}

//문자열 상수를 사용한 덕분에 전체적으로 코드가 더 명확해짐
//discount메서드에 인자를 전달할때도 StringGrade클래스가 제공하는 문자열 상수를 이용하면 됨
//만약 실수로 문자열의 입력을 잘못하더라도 컴파일 시점에서 오류가 발생 -> 오류를 더 쉽고 빠르게 찾을 수 있음.