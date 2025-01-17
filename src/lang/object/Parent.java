package lang.object;

//사실 자바에서 extends Object 는 묵시적으로 해줌.. 생략을 권장
//없다면 Parent는 묵시적으로 Object클래스를 상속받음을 의미.
public class Parent{

    //부모가 없으면 묵시적으로 Object클래스를 상속받는다.
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
