package enumration.test;

//grade == GUEST, level = 1 , 설명 = 손님
//위와 같은 출력형식을 나타내도록.
public class AuthGradeMain {
    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade g : grades) {
            printInfo(g);
        }
        
    }
    public static void printInfo(AuthGrade grade){
        System.out.println("grade = " + grade.name() + " level = " + grade.getLevel() + " 설명:" +grade.getDescription());
    }
}
