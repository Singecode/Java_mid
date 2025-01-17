package lang.object.totring;

public class ToSTringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1" , 2);
        Dog dog2 =  new Dog("멍멍이2" , 5);

        //단순 toString호출
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        //toString생략 호출
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);
        //결과는 같음 why? println내부에 toString메서드 호출 기능이 있기 때문

        //Object다형성 활용
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
        ObjectPrinter.print(car);

       String ref = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("ref =" + ref);

        String ref1 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("ref1 =" + ref1);

        //오버라이딩 된 toString말고 16진수 참조값을 보고싶을때 Integer.toHexString();s
    }
}
