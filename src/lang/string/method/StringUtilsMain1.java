package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 = " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("boolean의 문자열 값 = " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("obj의 문자열 값 = " + objString);

        //문자 + x => 문자로 변환
        String numString2 = " " + num;
        System.out.println("빈문자열 + num = " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println(strCharArray);

    }
}
