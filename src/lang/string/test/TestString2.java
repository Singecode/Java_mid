package lang.string.test;

//String length() 메서드를 이용하여 arr배열에 들어있는 모든 문자열의 길이의 합을 구해라

public class TestString2 {
    public static void main(String[] args) {
        String [] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;
        int sum = 0;
        for (String s : arr) {
            result = s.length();
            System.out.println(s +":" + result);
            sum += s.length();
        }
        System.out.println("sum = " + sum);

    }
}
