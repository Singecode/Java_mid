package lang.wrapper;

public class MyIntegerMain0 {
    public static void main(String[] args) {
        int value = 10;
        int res1 = compareTo(value,5);
        int res2 = compareTo(value,20 );
        int res3 = compareTo(value,10);
        System.out.println("res = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
    public static int compareTo(int a, int b){
        if(a<b){
            return -1;
        }else if(a>b){
            return 1;
        }else{
            return 0;
        }
    }
}

//여기서는 value값을 외부 메서드를 통해 비교한다, 만약 이 value가 인스턴스 였다면, 자기 자신과 비교하는 메서드를 만들어
//더 유용하게 사용할 수 있었을 것.