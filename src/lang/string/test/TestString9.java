package lang.string.test;

//spilt를 활용하여 이메일의 아이디와 도메인 부분을 분리해라

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String [] result =  email.split("@");
        System.out.println("ID: " + result[0]);
        System.out.println("Domain = " + result[1]);
    }
}
