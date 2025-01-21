package lang.string.builder;

public class StringBuilderMain_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4,"java");
        System.out.println("sb = " + sb);

        sb.delete(4,8);
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        //StringBuilder - String 가변으로 쭉 작업하다 마지막에 불변으로 전환 가능
        //by use  toString()메서드를 활용해서.
        String string =sb.toString();
        System.out.println("string = " + string);
    }
}
