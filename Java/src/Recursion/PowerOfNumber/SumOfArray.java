package Recursion.PowerOfNumber;

public class SumOfArray {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int result = sum(arr, n - 1);
    }




    static int sum(int [] arr,int n){
        if(n==0){
            return arr[0];
        }else{
            return arr[n] + sum(arr,n-1);
        }
    }



}
