package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("Hello"); //x001
        String str2 = new String ("Hello"); //x002
        System.out.println("str1 == str2 비교 " + (str1 == str2));
        System.out.println("equals 비교 " + str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 " + (str3 == str4));
        System.out.println("리터럴 equals 비교 " + str3.equals(str4));
    }
}
