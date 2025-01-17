package lang.object.totring;

public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력" +  obj;
        //String string = "객체 정보 출력" +  obj.toString();
        //주석처리한 코드와 위의 코드는 같음 왜냐 println에 toString이 있기때문에..
        System.out.println(string);
    }
}
