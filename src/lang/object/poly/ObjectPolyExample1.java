package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        action(dog);
        action(car);
    }
    private static void action(Object obj) {
        //obj.sound(); obj는 sound메서드가 없음
        //obj.move();  obj는 move메서드가 없음

        //객체에 맞는 다운캐스팅이 필요
        if(obj instanceof Dog dog) {
            dog.sound();
        }else if(obj instanceof Car car) {
            car.move();
        }

    }
}
