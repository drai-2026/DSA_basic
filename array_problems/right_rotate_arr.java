public class right_rotate_arr{
    // rotate by one place 
    static void onerotate(int[] nums){
        int temp = nums[0];
        for(int i = 1;i<nums.length;i++){
            nums[i-1]=nums[i]; 
        }
        nums[nums.length-1] = temp;
        for(int i = 0 ; i < nums.length;i++){System.out.println(nums[i]);}
    }




    //rotate by k places
    static void rotate(int[] nums, int k) {
            //optimal
            int temp = nums.length-1;
for(int i = 0 ; i <  k + (nums.length - k) / 2;i++){
int temp1 = nums[i];
nums[i] = nums[temp];
nums[temp] = temp1;
temp--;
}
temp = k - 1;
for(int i = 0 ; i < k/2;i++){
int temp1 = nums[i];
nums[i] = nums[temp];
nums[temp] = temp1;
temp--;
}
temp = nums.length-1;
for(int i = k ; i < (nums.length/2)+k;i++){
int temp1 = nums[i];
nums[i] = nums[temp];
nums[temp] = temp1;
temp--;
}
        //brute force
   /*  if(k>=nums.length){k = k % nums.length;}
    for(int j = 0 ; j < k;j++){
            int temp = nums[nums.length-1];
            for(int i = nums.length-1;i>0;i--){
            nums[i]=nums[i-1]; 
        }
       nums[0] = temp;
        }
*/


        //print array
        for(int i = 0 ; i < nums.length;i++){
            System.out.println(nums[i]);}
    }
    public static void main(String[] args){
int[] nums = {1,2,3,4,5,6,7};
int k = 3 ;
//onerotate(nums);
rotate(nums,k);
}}