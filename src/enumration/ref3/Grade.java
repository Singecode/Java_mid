package enumration.ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30),VIP(40);

    private final int discountRate;

    Grade(int discountRate){
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int discount(int price){
        return price*getDiscountRate()/100;
    }
}
