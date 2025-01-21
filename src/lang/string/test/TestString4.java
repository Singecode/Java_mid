package lang.string.test;

//subString()메서드를 활용하여 hello 부분과 .txt부분을 분리해라
public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        System.out.println("filename = " + str.substring(0,5));
        System.out.println("extName = " + str.substring(5,9));

    }
}
