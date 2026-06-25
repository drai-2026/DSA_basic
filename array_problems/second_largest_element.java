public class second_largest_element {
    public static void main(String[] args) {
        int[] arr2 = {213,213,2132,32434,342,13,123};
        int[] arr1 = {2,1};
         if(arr1.length < 2){System.out.println("array contains only one element");return;}
        int largest = arr1[0];
        int slargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr1.length;i++){   
            if(arr1[i] > largest){
              slargest = largest;
              largest = arr1[i];
            } 
           else if(arr1[i] > slargest && arr1[i] < largest){
            slargest = arr1[i];
            }
        }
         if (slargest == Integer.MIN_VALUE) {
           System.out.println("Second largest element does not exist.");
           }
        System.out.println(slargest);
    }
}
