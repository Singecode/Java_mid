package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        String result1 = a.concat(b);
        String result2 =a+b;
        System.out.println(result1);
        System.out.println(result2);
    }
}
