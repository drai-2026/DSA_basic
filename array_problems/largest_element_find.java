import java.util.Arrays;
public class largest_element_find {
    public static void main(String[] args){
    int [] arr1 = {123,213,231,12243,43,534534,5436,7546457};
    //brute force sol 
      Arrays.sort(arr1);
      System.out.println(arr1[arr1.length -1]);//time complexty = nlog(n)
      //optimal sol
      int largest = arr1[0];
      for(int i = 0 ; i<arr1.length;i++){
        if(arr1[i] >= largest){
            largest=arr1[i];
        }
      }
       System.out.println(largest);// TC = n  
    }
}
