package enumration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(); //X001
    public static final ClassGrade GOLD = new ClassGrade(); //X002
    public static final ClassGrade DIAMOND = new ClassGrade(); //X003

    //private생성자를 추가해서 외부에서 생성하지 못하게 막아버림.
    private ClassGrade() {}
}
