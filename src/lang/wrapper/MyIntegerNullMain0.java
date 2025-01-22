package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,3};
        int res1 = findValue(arr, -1);
        int res2 = findValue(arr, 0);
        int res3 = findValue(arr, 100);

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
    }
    private static int findValue(int[] arr, int key) {
        for (int value : arr) {
            if(value==key){
                return value;
            }
        }
        return -1;
    }
}

//루프에서 못찾으면 -1을 반환하도록 설계해줬음.
//여기서 문제가 나옴.. 해당 배열에서는 -1이 존재하기 때문에 -1을 찾으면 -1을 반환하고
// 못찾아도 -1을 반환하도록 설계되어있음 그래서 출력하고 봤더니, -1이 두개가 나옴
// 설계자는 본인이 설계해서 알겠지만 다른 사람이 볼때는 이게 배열에서 있는 -1인가 못찾아서 반환되는 -1인가 굉장히 모호하게 됨.