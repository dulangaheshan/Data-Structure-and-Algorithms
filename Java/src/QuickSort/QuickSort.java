package QuickSort;

public class QuickSort {

    public int partition(int arr[],int low,int high){

        int pivot = arr[high];

        int i = (low-1);

        for(int j = low;j < high;j++){

            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);

            }
        }

        swap(arr,i+1,high);

        return i+1;
}

public void sort(int arr[],int low,int high){

        if(low < high){

            int pivotindex = partition(arr,low,high);
            sort(arr,low,pivotindex-1);
            sort(arr,pivotindex+1,high);
        }
}


   public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");

    }

    public void swap(int arr[],int i ,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

}


    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length;

        QuickSort qsrt = new QuickSort();
        qsrt.sort(arr, 0, n-1);

        qsrt.printArray(arr);
    }


}
