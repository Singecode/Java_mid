package enumration.test;

import java.util.Scanner;

//grade == GUEST, level = 1 , 설명 = 손님
//위와 같은 출력형식을 나타내도록.
public class AuthGradeMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST,LOGIN,ADMIN] : ");
        String grade = sc.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase()); //사용자 친화적 소문자 입력시 -> 대문자로 자동 변환
        System.out.println("당신의 등급은 : " + authGrade.getDescription() + "입니다.");

        System.out.println("== 메뉴 목록 ==");
        if(authGrade.getLevel()>0){
            System.out.println("메인메뉴");
        }
        if(authGrade.getLevel()>1){
            System.out.println("이메일 관리 화면");
        }
        if(authGrade.getLevel()>2){
            System.out.println("관리자 화면");
        }
    }
}
