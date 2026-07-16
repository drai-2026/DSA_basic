public class move_zeroes {
       //optimal
 static void moveZeroes(int[] nums) {
    int j = 0 ;
for(int i= 0 ; i < nums.length;i++){
    if(nums[i] != 0){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
    }
}
 }
//brute force
    /* 
    static void moveZeroes(int[] nums) {
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i] == 0){
                int j = i+1;
                while(j < nums.length && nums[j] == 0 ){
                    j++;
                }
                if(j < nums.length && nums[j] !=0){
                nums[i] = nums[j]; 
                nums[j] = 0;
            }
        }
    }*/
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
                for(int i = 0 ; i < nums.length ;i ++ ){
            System.out.println(nums[i]);
        }
    }
}
