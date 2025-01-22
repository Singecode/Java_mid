package lang.math;

import java.util.Random;

//random은 내부에서 seed값을 사용해서 랜덤 값을 구하는데 이 seed값이 같으면 항상 같은 random값을 가짐
public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        Random random = new Random(1); //seed가 같으면 같은 radom값을 가짐

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble); //0.0~1.0
        
        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean); //true or false;

        //범위 조회
        int randomRange1 = random.nextInt(10); // 0~9 까지 난수
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10)+1;//1~10까지 출력
        System.out.println("randomRange2 = " + randomRange2);
    
    }
}
