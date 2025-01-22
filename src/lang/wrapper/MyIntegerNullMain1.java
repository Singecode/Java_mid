package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger [] arr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};


        System.out.println("res1 = " +findValue(arr,-1));
        System.out.println("res2 = " + findValue(arr,0));
        System.out.println("res3 = " + findValue(arr,1));
        System.out.println("res4 = " + findValue(arr,100));
    }
    private static MyInteger findValue(MyInteger [] arr, int key) {
        for (MyInteger myInteger : arr) {
            if(myInteger.getValue()==key){
                return myInteger;
            }
        }
        return null;
    }
}

//기본형은 항상 값이 존재해야 하지만
//반면에 객체 참조형은 값이 없단느 null을 사용할 수 있음.
//null 사용시 nullPointerException을 주의하면서