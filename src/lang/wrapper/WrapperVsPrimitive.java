package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iteration = 1_000_000_000; //반복 횟수 설정
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive=0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("long기본형 실행 시간 = " + (endTime-startTime) + "ms");

        //Wrapper클래스 Long 사용
        Long sumWrapper =0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            sumWrapper += i; //오토박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("Long Wrapper 실행 시간 = " + (endTime-startTime) + "ms");
    }
}
