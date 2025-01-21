package lang.string.test;

//indexOf()와 subString을 시용해서 문제 해결 가능
public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extidx = str.indexOf(ext);
        String fileName = str.substring(0, extidx);
        System.out.println("extidx = " + extidx);
        String extName = str.substring(extidx);
        System.out.println("FileName = " + fileName);
        System.out.println("extName = " + extName);


    }
}
