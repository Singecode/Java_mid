package lang.immutable.address;

public class RefMain_3 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a; // 자바에서 공유 참조를 막을 수 있는 방법이 없음.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    private static void change(Address address, String changeAddress){
        System.out.println("주소값을 변경합니다.");
        address.setValue(changeAddress);
    }
}

