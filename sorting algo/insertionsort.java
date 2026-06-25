public class insertionsort{
public static void main(String[] args) {
    int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
    int[] arr2 = {123,343,34,32,1232,2342}; 
    int[] arr3 ={1,2,3,4,5,6,7,8,9,10};
    int len  = arr1.length;
    for(int i = 0;i < len;i++){
        int j=i;
        while(j > 0 && arr1[j] < arr1[j-1]){
         int temp1 = arr1[j];
         int temp2 = arr1[j-1];
         arr1[j] = temp2;
         arr1[j-1] = temp1;
         j--;
        }
        }
        //test comment 
        for(int i = 0 ; i < len ; i ++ ){
      System.out.println(arr1[i]);
    }
    }
}
