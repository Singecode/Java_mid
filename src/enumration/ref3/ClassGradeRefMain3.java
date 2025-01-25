package enumration.ref3;


import static enumration.ref3.Grade.*;

public class ClassGradeRefMain3 {
    public static void main(String[] args) {
        int price = 10000;
        print(BASIC, price);
        print(GOLD, price);
        print(DIAMOND, price);
    }
    public static void print(Grade grade, int price){
        System.out.println(grade.name() + "의 할인 금액 : " + grade.discount(price));
    }
}
