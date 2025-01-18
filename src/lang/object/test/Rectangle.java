package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

}
// 모든 클래스는 Object클래스를 상속받음
// 여기서 우리가 오버라이딩 해야할 Object메서드는 toString(), equals()임
// 일단 내가 직접 구현해보고
// 추후 ide의 도움을 받아보자..