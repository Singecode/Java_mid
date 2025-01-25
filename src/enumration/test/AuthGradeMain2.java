package enumration.test;

import java.util.Scanner;

//grade == GUEST, level = 1 , 설명 = 손님
//위와 같은 출력형식을 나타내도록.
//guest == 메인화면만
//login 회원 == 메인 화면, 이메일 관리 화면
//관리자  == 메인화면, 이메일 관리, 관리자 까지
public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String selectGrade = sc.nextLine();
        selectGrade = selectGrade.toUpperCase();

        System.out.print("당신의 등급은 ");
        if(selectGrade.equals("GUEST")) {
            printInfo(AuthGrade.GUEST);
            printMenu(AuthGrade.GUEST);
        }else if(selectGrade.equals("LOGIN")) {
            printInfo(AuthGrade.LOGIN);
            printMenu(AuthGrade.LOGIN);
        }else if(selectGrade.equals("ADMIN")) {
            printInfo(AuthGrade.ADMIN);
            printMenu(AuthGrade.ADMIN);
        }else{
            System.out.println("존재하지 않는 등급입니다.");
        }

        
    }
    public static void printInfo(AuthGrade grade){
        System.out.println(grade.name() + "입니다.");
    }
    public static void printMenu(AuthGrade grade){
        System.out.println("==메뉴 목록 ==");
        if(grade.getLevel()>0 ){
            System.out.println("-메인화면-");
        }
        if(grade.getLevel() > 1){
            System.out.println("-이메일 관리 화면-");
        }
        if(grade.getLevel() > 2){
            System.out.println("-관리자 화면-");
        }
    }
}
