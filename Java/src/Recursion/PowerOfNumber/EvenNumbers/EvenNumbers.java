package Recursion.PowerOfNumber.EvenNumbers;

public class EvenNumbers {

    public static void main(String[] args) {

        System.out.println(Even(10) );
        //System.out.println(fun1(5,2) );
    }

    static int Even(int num){

        if(num == 0){
            return 0;
        }
        return 2 + Even(num-1);
    }


//
//    static int fun1(int x, int y)
//    {
//        if(x == 0)
//            return y;
//        else
//            return fun1(x - 1,  x + y);
//    }
}
