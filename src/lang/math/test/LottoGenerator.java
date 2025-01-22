package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random rand = new Random(); //1~45까지의 수를 난수로 생성.
    private int[] arr;  // 숫자를 최대 6개까지 담을수 있는 배열 생성
    private int count = 0;
    public int[] generate() {
        arr = new int[6];
        while(count<6){
            int randNum = rand.nextInt(45)+1;
            if(isEqual(randNum)){
                arr[count] = randNum;
                count++;
            }
        }
        return arr;
    }

    private boolean isEqual(int random) {
        for(int i = 0; i < count; i++) {
            if(arr[i] == random) {
                return false;
            }
        }
        return true;
    }
}
