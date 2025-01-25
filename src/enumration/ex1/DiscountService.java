package enumration.ex1;


//고객은 3등급으로 나누고 상품 구매시 등급별로 할인을 적용한다
// Basic -> 10%
// Gold -> 20%
// Diamond -> 30%
public class DiscountService {

    public int discount(String grade, int price){
        int discountRate = 0;
        if(grade.equals(StringGrade.BASIC)){
            discountRate = 10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountRate = 20;
        }else if(grade.equals(StringGrade.DIAMOND)){
            discountRate = 30;
        }else{
            System.out.println("할인x");
        }
        return price*discountRate/100;
    }
}
