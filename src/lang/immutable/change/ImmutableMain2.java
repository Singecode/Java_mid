package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); //만약 이대로 출력한다면?
        //10 기존값 그대로 나옴?
        //why? 새로운 객체를 반환하는 메서드임 x002의 참조값을 지닌..
        //하지만 반환타입을 받아줘서 쓰는 뭔가가 없으면
        //이 리턴값은 그냥 버려지는 것.
        //불변 객체에 관련된 메서드는 보통 새로운 객체를 반환하기 때문에
        //꼭 리턴값을 받아줘야함.

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        //System.out.println("obj2 = " + obj2.getValue());
        System.out.println("obj1 = " + obj1.getValue());
    }
}
