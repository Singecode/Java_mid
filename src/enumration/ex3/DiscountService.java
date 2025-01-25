package enumration.ex3;
//고객은 3등급으로 나누고 상품 구매시 등급별로 할인을 적용한다
// Basic -> 10%
// Gold -> 20%
// Diamond -> 30%
public class DiscountService {

    public int discount(Grade grade, int price){
        int discountRate = 0;
        if(grade == Grade.BASIC){ //grade == x001이 넘어옴
            discountRate = 10;
        }else if(grade == Grade.GOLD){ //==x002
            discountRate = 20;
            }else if(grade == Grade.DIAMOND){//== x003
            discountRate = 30;
        }else{
            System.out.println("존재하지 않는 등급.");
        }
        return price*discountRate/100;
    }
}
