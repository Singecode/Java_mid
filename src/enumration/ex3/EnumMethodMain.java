package enumration.ex3;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 enum 반환
        Grade [] grade = Grade.values();
        System.out.println("grade = " + Arrays.toString(grade));
        //enum 클래스의 정의된 모든 변수들을 조회해볼 수 있음
        //참고로 배열을 그냥 조회하면 참조값이 나오니 내용을 보고싶담녀 Arrays.toString으로 감쌀 것.
        for (Grade g : grade) {
            System.out.println("name = " +g.name() + " ,"  + "ordinal = " + g.ordinal());
        }
        //반복을 통해서도 받을 수 있음 grade.name() ==> 열거형에 정의된 변수 이름을 가져오고
        //grade.ordinal() == 각 변수마다 번호를 매김

        //String -> enum 변환, *잘못된 문자가 들어가면 ==IllegalArgumentException이 터짐
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("(gold) = " + (gold));
    }
}
//그러나 ordinal은 가급적 사용하지 않는 것이 좋음
//값을 사용하다가 중간에 변수 위치가 변하면 전체 상수 위치가 모두 변경 될 수 있기 때문.