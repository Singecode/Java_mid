package lang.string.test;

//spilt를 사용해서 fruits를 분리하고 join을 사용해서 분리한 문자열르 다시 합쳐라
public class TestSpring10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String [] fArr = fruits.split(",");
        for (String s : fArr) {
            System.out.println(s);
        }
        String joinedString  = String.join("->",fArr);
        System.out.println("joinedString = " + joinedString);
    }
}
