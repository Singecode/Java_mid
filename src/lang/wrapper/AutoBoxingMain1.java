package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper == Integer.valueOf();
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        //Wrapper -> Primitivie ==intValue()메서드 활용
        int unboxedValue = boxedValue.intValue();
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
