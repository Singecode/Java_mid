package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper == Integer.valueOf();
        int value = 7;
        Integer boxedValue = value; //Auto Boxing

        //Wrapper -> Primitivie ==intValue()메서드 활용
        int unboxedValue = boxedValue; // Auto unBoxing
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}

//컴파일 단계에서 Integer.valueOf(value); , boxedVaule.intValue(); 를 자동으로 추가해주는 것임.
//boxingmain1,2는 둘다 동일하게 작동함