package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "      Java  Programming         ";
        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거 : " + strWithSpaces.trim());
        System.out.println("공백 제거(strip) :" + strWithSpaces.strip());
        System.out.println("앞공백 제거(strip) :" + strWithSpaces.stripLeading());
        System.out.println("뒷공백 제거(strip) :" + strWithSpaces.stripTrailing());
        //strip vs trim ?
        // trim : 문자열 양쪽 끝 공백 제거 단순 whiteSpace만 제거 가능
        // strip : WhiteSpace 및 유니코드 공백 포함해서 제거



    }
}
