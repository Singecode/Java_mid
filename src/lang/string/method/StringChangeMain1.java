package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "hello, Java! Welcome to Java";
        System.out.println("인덱스 7부터의 문자열 : " + str.substring(7));
        System.out.println("인덱스 7부터~12까지 문자열 : " + str.substring(7,12));
        System.out.println("문자열 결합 : "+ str.concat("!!!!"));
        System.out.println("문자열 결합2 : " + str+"!!!");
        System.out.println("Java를 World로 대체해서 출력 "  + str.replace("Java", "World!"));
        System.out.println("첫 번째 Java를 World로 대체 : " +str.replaceFirst("Java", "World!"));
    }
}
