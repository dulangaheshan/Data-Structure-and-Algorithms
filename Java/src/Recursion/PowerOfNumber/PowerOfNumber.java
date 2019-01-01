package Recursion.PowerOfNumber;

public class PowerOfNumber {

    public static void main(String[] args) {


        PowerOfNumber power = new PowerOfNumber();
        System.out.println(power.Power(2,31)-1);
        System.out.println(power.Power(2,31));

    }

    public int Power(int base,int num){

        if(num == 1){
            return base;
        }
        if(num == 0){
            return 1;
        }
        else{
            return base * Power(base,num-1);
        }
    }
}
