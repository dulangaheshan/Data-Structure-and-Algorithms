package MergeSort;

public class MergeSort {

    public static void merge_sort_devide(int [] input,int start,int end) throws Exception{

        if(end-start < 2){
            return;
        }

        int mid = (start+end)/2;
        merge_sort_devide(input,start,mid);
        merge_sort_devide(input,mid+1,end);
        merge(input,start,mid,end);

    }


      static void merge(int [] input,int start,int mid,int end) throws Exception{

        int Left = mid-start;
        int Right = end-mid;

        int [] LeftArray = new int[Left];
        int [] RightArray = new int[Right];
        for(int i = 0;i<Left;i++){
            LeftArray[i] = input[start+i];

        }
          for(int j = 0;j<Right;j++){
              RightArray[j] = input[mid+j];

          }


          int LIndex = 0;
          int RIndex = 0;
          int newindex = 0;


          while(LIndex < Left && RIndex < Right ){

              if(LeftArray[LIndex] < RightArray[RIndex]){
                  input[newindex] = LeftArray[LIndex];
                  LIndex++;
              }
              else{

                  input[newindex] = LeftArray[RIndex];
              }

              newindex++;

              throw new Exception();
          }

          while (LIndex < Left)
          {
              input[newindex] = LeftArray[LIndex];
              LIndex++;
              newindex++;
          }

          /* Copy remaining elements of R[] if any */
          while (RIndex < Right)
          {
              input[newindex] = RightArray[RIndex];
              RIndex++;
              newindex++;
          }


      }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        merge_sort_devide(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

}


