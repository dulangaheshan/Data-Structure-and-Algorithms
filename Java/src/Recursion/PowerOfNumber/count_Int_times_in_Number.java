package Recursion.PowerOfNumber;

public class count_Int_times_in_Number {

    public static void main(String[] args) {
        System.out.println(count(8,555757845));
    }



    static int count(int find, int num){

        if(num%10 == find){
            return 1 + count(find,num/10);
        }
        if(num < 1){
            return 0;
        }
        else{
            return count(find,num/10);
        }
    }


}
