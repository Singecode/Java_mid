package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value+addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}

// 핵심은 add 메서드
// 불변 객체는 값이 변하게 되면 더이상 불변 객체가 아님
// 하지만 여기서는 기존값에 새로운 값을 더해야함.
// 불변객체는 기존값은 변경하지 않고 계산 결과를 바탕으로 새로운 객체를 만들어서 반환.
// 이렇게 되면 불변을 유지하면서도 새로운 결과도 만들 수 있음.
