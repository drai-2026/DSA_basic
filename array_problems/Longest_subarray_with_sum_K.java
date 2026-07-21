public class Longest_subarray_with_sum_K {
    static void longestSubarray(int[] nums,int k) {
                int ans = 0; int min = 0;
       for(int i = 0 ; i <nums.length;i++){
       int sum = 0 ;
          for(int j = i ; j < nums.length;j++){
            sum = sum + nums[j];
            if(sum == k){min = j-i+1;}
          }
         if(min> ans){ans = min;}
       }
    }
    public static void main(String[] args){
     int[] nums = {10, 5, 2, 7, 1, 9};
     int k = 15;
     longestSubarray(nums,k);
    }
}
