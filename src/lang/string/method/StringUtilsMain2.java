package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format 메서드
        String format = String.format("num : %d, bool %b , str: %s", num, bool, str);
        System.out.println("format = " + format);

        String format2= String.format("숫자: %.2f", 10.2345);
        System.out.println("format2 = " + format2);

        //printf
        System.out.printf("숫자 : %.2f\n" , 10.254848);

        //match 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("str이 패턴과 일치하는가 = " + str.matches(regex));
    }
}
