public class Max_Consecutive_Ones{
    static int findMaxConsecutiveOnes(int[] nums) {
            int one = 0;
            int finall = 0;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i] == 1){
                one++;
            }
            if(nums[i] == 0){
                if(one >= finall){finall = one;}
                  one = 0;
            }
        }    
        if(one >= finall){finall = one;}
        return finall;
        }
    public static void main(String[] args){
     int nums[] = {1,1,0,1,1,1};
     findMaxConsecutiveOnes(nums);
    }
}

