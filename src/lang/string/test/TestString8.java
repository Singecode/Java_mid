package lang.string.test;

//replace를 사용해서 java라는 단어를 jvm으로 변경해라
public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        System.out.println("input = " + input.replace("java", "jvm"));
    }
}
