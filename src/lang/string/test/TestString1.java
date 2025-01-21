package lang.string.test;

//startsWith() 메서드를 이용하여 해당 문자열이 htttps://로 시작하는지 확인해라

public class TestString1 {
    public static void main(String[] args) {
        String url = "https:// www.example.com";
        System.out.println("result = " + url.startsWith("https://"));

    }
}
