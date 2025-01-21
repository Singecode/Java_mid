package lang.string.builder;

//StringBuilder + 메서드 체인
public class StringBuilderMain_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"java")
                .delete(4,8)
                .reverse()
                .toString();
        System.out.println("string = " + string);
    }
}
