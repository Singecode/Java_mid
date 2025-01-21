package lang.string.test;

// str문자열을 반대로 뒤집어라
public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse().toString();
        System.out.println("sb = " + sb);
    }
}
