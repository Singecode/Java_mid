package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간을 밀리초로 가져옴
        long currentTime = System.currentTimeMillis();
        System.out.println("currentTime = " + currentTime);

        //현재 시간을 나노초로 가져옴
        long currentTime2 = System.nanoTime();
        System.out.println("currentTime2 = " + currentTime2);

        //환경 변수를 읽는다.
        System.out.println("System.getenv() = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("System.getProperties() = " + System.getProperties());
        System.out.println("Java-Version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사함.
        char[] originalArray = {'h','e','l','l','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray,0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        //프로그램 종료
        System.exit(0);
        //가급적이면 사용하지 말자..
    }
}
