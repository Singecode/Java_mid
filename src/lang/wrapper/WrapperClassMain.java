package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //미래에 삭제예정 대신에 valueOf를 사용해라..
        Integer integerObj = Integer.valueOf(10); //-128~127 자주사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(10);
        Double v = Double.valueOf(10);
        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("v = " + v);
        System.out.println("longObj = " + longObj);

        System.out.println("내부 값 읽기");
        int res1 = integerObj.intValue();
        System.out.println("res1 = " + res1);
        long res2 = longObj.longValue();
        System.out.println("res2 = " + res2);

        System.out.println("비교");
        System.out.println("== compare : " + (newInteger == integerObj));
        System.out.println("equals compare : " + newInteger.equals(integerObj));

    }
}
