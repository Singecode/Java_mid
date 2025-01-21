package lang.string.method;

public class StringSpiltJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //spilt()
        String[] spilt = str.split(",");
        for (String s : spilt) {
            System.out.println(s);
        }

        //join()
        String joinedStr = String.join("-","A","B","C");
        System.out.println("joinedStr = " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", spilt);
        System.out.println("result = " + result);

            //System.out.println("joinStr = " + joinstr);
    }
}

