public class find_missing_num{
static void missingNumber(int[] nums) {   
}


    /*{
       //brute force       
        int ans = -1;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]!=i){
              ans = i;
}
        }
        if(ans == -1){ans = nums.length;}
        System.out.println(ans);
    } 
*/

    public static void main(String[] args){
    int[] nums = {0, 2, 3, 1, 4};
    missingNumber(nums);
    }
}