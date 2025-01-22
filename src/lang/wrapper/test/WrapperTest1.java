package lang.wrapper.test;

//문자로 입력된 str1, str2 두 수의 합을 구하자
public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";
        int res1 = Integer.parseInt(str1);
        int res2 = Integer.parseInt(str2);
        System.out.println("sum = " + (res1+res2));
    }
}
