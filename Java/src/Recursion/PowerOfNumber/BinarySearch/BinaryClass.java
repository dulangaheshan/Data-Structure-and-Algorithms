package Recursion.PowerOfNumber.BinarySearch;

public class BinaryClass {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int result = search(arr, 0, n, 10);
        System.out.println(result);
    }


    static int search(int[] arr, int start, int end, int find) {

        if (end >= start) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == find) {
                return mid;
            }
            if (find > arr[mid]) {
                search(arr, mid + 1, end, find);
            }
            if (find < arr[mid]) {
                search(arr, start, mid - 1, find);
            }


        }

        return -1;
    }

}

