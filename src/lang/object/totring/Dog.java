package lang.object.totring;

public class Dog {

    private String dogName;
    private int age;

    Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
