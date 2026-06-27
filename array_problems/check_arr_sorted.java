import java.util.Arrays;
public class check_arr_sorted {
     static boolean check(int[] nums) {
    int count = 0;

for(int i = 0; i < nums.length; i++){

    if(nums[i] > nums[(i+1)%nums.length]){
        count++;
    }

    if(count > 1){
        return false;
    }
}

return true;
      }
    //brute force
    static  boolean checkBF(int[] nums) {
        int len = nums.length;
    int[] B = new int[len];
    boolean ret =false;
    for(int i = 0 ;i<nums.length;i++){
        B[i] = nums[i];
    }
    Arrays.sort(B);
    for(int x = 0 ;x<nums.length;x++){
            int count = 0;
    for(int i = 0 ;i<nums.length;i++){
        if(B[i] == nums[(i+x) % nums.length]){
         count ++;
        }
    }
    if(count == nums.length){
        ret = true;
    }
    }
    return ret;
    }
    public static void main (String[] args){
    int[] nums = {3,4,5,1,2};
    checkBF(nums);
    check(nums);
    }
}
