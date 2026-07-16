public class linearSearch {
    static  int linearSearch(int nums[], int target) {
		int index = 0;
        while(index< nums.length && nums[index] != target){
          index++;
        }
    if(index< nums.length && nums[index] == target){return index;}
    else{return -1;}
    }
    public static void main(String[] args){
        int[] nums = {2, 3, 4, 5, 3};
        int target = 3;
        linearSearch(nums,target);
    }
}
