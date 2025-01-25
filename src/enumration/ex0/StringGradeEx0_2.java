package enumration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        int price = 10000;
        int basic = service.discount("BASIC",price);
        int gold = service.discount("GOLD",price);
        int diamond = service.discount("DIAMOND",price);

        //존재하지 않는 회원 등급
        int vip = service.discount("VIP",price);
        System.out.println("Vip = " + vip);

        //오타
        service.discount("BSIC",price);

        System.out.println("Basic 할인 금액 = " + basic);
        System.out.println("Gold 할인 금액 = " + gold);
        System.out.println("Diamond 할인 금액 = " + diamond);
    }
}

//해당 코드에서 발생할 수 있는 문제점
//회원 등급을 String타입으로 넘길때, 발생할 수 있는 문제
//1. 오타 발생 가능
//2. 존재하지 않는 회원등급 입력 가능성
//String을 통해 등급을 넘기는 방식은 == 타입 안정성의 부족임
// 타입 안정성 == 문자열을 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있음.
// 데이터 일관성 == Gold,GOLD,gold등 다양한 형식으로 문자열이 입력될 수 있기때문에 일관성이 떨어짐.
// 값의 제한이 부족 : String으로 상태나 카테고리를 표현하면 잘못된 문자열을 실수로 입력할 가능성이 있음.
// 컴파일 시점에서는 문자열에 오타가 있어도 감지x, 런타임에서만 문제가 발생하기 때문에 디버깅이 어려워짐.

// 이러한 문제를 해결하려면 정확한 문자만 discount메서드에 넘길 수 있도록 값을 제한해야함 기존의 String으로는
// 이러한 문제를 해결 할 수 없음.

