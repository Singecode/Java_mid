package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        MemberV1 memberV1 = new MemberV1("회원A", a);
        MemberV1 memberV2 = new MemberV1("회원B", a);

        //회원 a 회원 b의 처음 주소는 모두 서울
        System.out.println("member A = " + memberV1);
        System.out.println("member B = " + memberV2);

        //회원 B의주소를 부산으로 변경해야 함.
//        Address addr = memberV2.getAddress();
//        addr.setValue("부산");
        //->이걸 축약하는게
        memberV2.getAddress().setValue("부산"); //이거임
        //memberV2.setAddress(new Address("부산"));
        System.out.println("member A = " + memberV1);
        System.out.println("member B = " + memberV2);
        //앗! side effect발생!.

    }
}
