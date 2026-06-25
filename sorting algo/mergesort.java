public class mergesort{
   static void divide(int[] arr1,int low,int high){
    if(low >= high){return;}
      int mid = (high+low)/2;
      divide(arr1,low,mid);
      divide(arr1,mid+1,high);
      merge(arr1, high, mid, low);
   }
   static void merge(int[] arr1,int high,int mid,int low){
      int left = low;
      int right = mid+1;
      int[] temp = new int[high - low +1];
      int index = 0; 
      while(left<=mid &&right<=high){
      if(arr1[left]<=arr1[right]){
         temp[index] = arr1[left];
         left++;
      }
    else{
         temp[index] = arr1[right];
         right++;
      }
        index++;
      }
      while(left <= mid){
     temp[index] = arr1[left];
      left++;
       index++;
              }

while(right <= high){
    temp[index] = arr1[right];
    right++;
    index++;
}
 for(int i = 0; i < temp.length; i++){
    arr1[low + i] = temp[i];
}
   }
    public static void main(String[] args){
        int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
        int len = arr1.length;
        int high = len-1;
        int low = 0;
        divide(arr1,low,high);     
        for(int i = 0 ; i < len ; i ++ ){
      System.out.println(arr1[i]);
    }
}
}