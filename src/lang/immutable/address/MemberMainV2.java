package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        MemberV2 v1 = new MemberV2("회원A", a);
        MemberV2 v2 = new MemberV2("회원B", a);

        //회원 a 회원 b의 처음 주소는 모두 서울
        System.out.println("member A = " + v1);
        System.out.println("member B = " + v2);

        //회원 B의주소를 부산으로 변경해야 함.
//        Address addr = memberV2.getAddress();
//        addr.setValue("부산");
        //->이걸 축약하는게
        //v2.getAddress().setValue("부산"); //컴파일 오류
        v2.setAddress(new ImmutableAddress("부산"));
        System.out.println("member A = " + v1);
        System.out.println("member B = " + v2);


    }
}
