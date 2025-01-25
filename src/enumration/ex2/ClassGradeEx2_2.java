package enumration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService service = new DiscountService();
        //ClassGrade grade = new ClassGrade();
        int result = service.discount(ClassGrade.DIAMOND, price);
        System.out.println("result = " + result);
        //존재하지 않는 등급 출력
        //그도 그럴게 지금 생성한 인스턴스는 위에 열거형과 관련없는 아예 새로운 참조값을 지닌 인스턴스임
    }
}

//열거형을 썼다고 해서 완벽하게 해결이 아닌 바로 또 다른 인스턴스를 생성하고 이렇게 생성된 인스턴스를
//파라미터로 넘길 수 있음 == 결국 또 문제는 인스턴스 생성이 가능하다가 문제가 되었음.
//이 문제를 해결하려면 외부에서 해당 인스턴스를 생성할 수 없게 막으면 됨
//생성자를 private로 막아버리면 됨
//이렇게 생성자도 막아버리면 개발자 입장에서는 객체 생성도 못하므로 ClassGrade코드를 보고
//해당 열거되어있는 상수만 사용하라는 거구나를 인지할수 있게 됨.