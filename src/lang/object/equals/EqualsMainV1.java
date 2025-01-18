package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");
        System.out.println("identity = " + (user1 == user2)); //동일성 = false
        System.out.println("equality = " + (user1.equals(user2)));//동등성 == false
        //why? equals메서드도 ==으로 비교함 결국 참족값 비교랑 같은 결과가 나옴.
        //how? == equlas메서드도 용도에 맞게 오버라이딩을 통해 이욯해야 함.
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
        //equals 메서드는 이렇게 생김.
    }
}
