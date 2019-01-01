package Recursion.PowerOfNumber;

public class OddEvenCount {

    public static void main(String[] args) {
        System.out.println(count(5));
    }

static int count(int num){

    if(num == 0){
        return 0;
    }
    if(num % 2 == 0){
        return 2 + count(num-1);
    }
    else{
        return 1 + count(num -1);
    }
}

}