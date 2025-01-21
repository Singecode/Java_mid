package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder add = new ValueAdder();
        add.add(1);
        add.add(2);
        add.add(3);

        int result = add.getValue();
        System.out.println("result = " + result);
    }
}
