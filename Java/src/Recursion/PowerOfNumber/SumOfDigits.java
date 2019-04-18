package Recursion.PowerOfNumber;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sum(99));
    }
    static int sum(int num){

        if(num < 1){
            return 0;
        }
        else{
            return num%10 + sum(num/10);
        }
    }




}
