package Recursion.PowerOfNumber;

import java.sql.SQLOutput;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fac(6));
    }


    static int fac(int n){

        if (n == 0) {
            return 0;
        }
        if(n==1){
            return 1;
        }else{
            //System.out.println(n);
            return fac(n-1) + fac(n-2);
        }
    }


}
