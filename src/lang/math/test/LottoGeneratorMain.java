package lang.math.test;

//로또 번호를 자동으로 만들어주는 자동 생성기를 만들자.
//로또 번호는 1~45 사이의 숫자를 6개 뽑아야 함.
//각 숫자는 중복되면 안됨.
//실행할때마다 결과값이 달라야 함
public class LottoGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        System.out.println("로또 번호: ");
        for (int l : lottoNumbers) {
            System.out.print(l+" ");
        }

    }
}

//일단 여기까지,, 난수 생성해서 6개까지 출력하는 건됨.
//근데 3 39 44 17 44 1 이렇게 중복값도 있음
//이걸 보완해보자
//중복 검증 메서드를 만들고 그걸 통과해야 배열에 추가하게끔.
