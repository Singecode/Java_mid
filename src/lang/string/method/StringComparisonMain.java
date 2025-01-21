package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "hello, Java!"; //대문자 포함
        String str2 = "hello, java!"; //대문자 없음
        String str3 = "hello, world!";

        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));
        //IgnoreCase == 대소문자 무시하고 같은지 확인 == true;

        System.out.println("b compare to a : " + "c".compareTo("a"));
        System.out.println("b compare to a : " + "b".compareTo("a"));
        //compareTo == 사전적으로 얼마나 떨어져 있는지 숫자로 나타내줌.
        System.out.println("str1 compare to str 3 : " + str1.compareTo(str3));
        System.out.println("str1 compare to str 2 : " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with Hello : " +str1.startsWith("hello"));
        System.out.println("str1 end wtih Java : " + str1.endsWith("Java!"));


    }
}
