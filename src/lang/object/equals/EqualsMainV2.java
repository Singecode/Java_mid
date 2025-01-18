package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
         UserV2 user1 = new UserV2("id-100");
         UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1==user2));
        System.out.println("equality = " + user1.equals(user2));
        //결과 동일성은 다르지만 동등성은 true값을 얻게 됨.
    }
}
