public class bubbelsort {
        public static void main(String[] args){
    int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
    int[] arr2 = {123,343,34,32,1232,2342}; 
    int len  = arr1.length;
    int temp1;
    for(int i = len - 1 ; i > 0 ; i--){
        for(int j = 0 ; j <= i-1;j++){
        if(arr1[j] > arr1[j+1]){
         temp1 = arr1[j];
         arr1[j] = arr1[j+1];
         arr1[j+1] = temp1;
        }
        }
    }
     for(int i = 0 ; i < len ; i ++ ){
      System.out.println(arr1[i]);
    }
}
}
