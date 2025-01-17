package lang.object.totring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String string = obj.toString();


        //toString의 반환값;
        System.out.println(string );
        //java.lang.Object@4eec7777 --> 클래스에 대한 정보 @~== 참조값 출력

        //object 직접 출력
        System.out.println(obj);
        //결과가 똑같음.
        //분명히 string에서는 toString()함수를 적용하고, obj는 단순출력인데 결과가 같음?
        //why?
        //사실 System.out.println()은 내부에서 toString메서드를 호출함.
        //그래서 별도의 toString을 붙혀주지 않아도 객체 정보를 출력해줄 수 있음..
        //우리가 객체의 참조값을 얻을 수 있던 이유는 println의 toString덕분
    }
}
