package Recursion.PowerOfNumber.Factorial;

public class Factorial {

    public static void main(String[] args) {

        Factorial f = new Factorial();
        System.out.println(f.fac(10));

    }

    public int fac(int num){
        if(num == 1 || num ==0){
            return 1;
        }
        else{
            return num * fac(num-1);
        }
    }

}
