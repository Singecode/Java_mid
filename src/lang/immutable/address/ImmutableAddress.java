package lang.immutable.address;

public class ImmutableAddress {
    private final String value; //final 한번 값을 생성자에서 생성하고 나면 더는 값 변경 불가

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}

//불변 클래스를 설계하는 방법은 어떻게든 필드값을 변경하지 못하게만 설정하면 됨.
//처음에 값이 설정되고 나며는 더는 변경이 불가능하게
//final키워드를 통해 좀 더 의미를 명확하게