package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder1 = new ValueAdder();
        ValueAdder adder2 = adder1.add(1);
        ValueAdder adder3 = adder2.add(2);
        ValueAdder adder4 = adder3.add(3);

        System.out.println("result = " + adder4.getValue());
    }
}
