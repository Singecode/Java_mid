package enumration.ref3;


import static enumration.ref3.Grade.*;

public class ClassGradeRefMain4 {
    public static void main(String[] args) {
        int price = 10000;
        Grade [] grades = Grade.values();
        for (Grade grade : grades) {
            print(grade,price);
        }
    }
    public static void print(Grade grade, int price){
        System.out.println(grade.name() + "의 할인 금액 : " + grade.discount(price));
    }
}
