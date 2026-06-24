public class Quicksort {
    static int partation(int[] arr1,int low , int high){
             int pivot = arr1[low];
             int i = low +1;
             int j = high;
            while (i <= j) {
            while (i <= high && arr1[i] <= pivot) {
                i++;
            }
            while (j >= low + 1 && arr1[j] > pivot) {
                j--;
            }
            if(i<j){
            int temp1 = arr1[i];
            int temp2 = arr1[j];
            arr1[i] = temp2;
            arr1[j] = temp1; 
        }
        }
           int temp = arr1[low];
        arr1[low] = arr1[j];
        arr1[j] = temp;

        return j;
    }
         static void quickSort(int[] arr1, int low, int high) {
        if (low < high) {
            int pIndex = partation(arr1, low, high);
            quickSort(arr1, low, pIndex - 1);
            quickSort(arr1, pIndex + 1, high);
        }
    }
            
         public static void main(String[] args){
            
    int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
    int[] arr3 = {123,343,34,32,1232,2342}; 
    int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
    int high = arr1.length-1;
    int low = 0;
    quickSort(arr1,low,high);
    for(int i = 0 ; i < arr1.length ; i ++ ){
      System.out.println(arr1[i]);
    }
}
}