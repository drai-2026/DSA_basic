public class check_if_number_apper_twice {
        static void singleNumber(int[] nums) {
               //better than brute force 
               /* 
HashMap<Integer, Integer> map = new HashMap<>();
for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
for (int num : map.keySet()) {
    if (map.get(num) == 1)
        return num;
}
*/


            //optimal solution
int ans = 0 ;
for(int i = 0 ; i < nums.length;i++){
    ans = ans^nums[i];
}
return ans;
    }
    public static void main(String[] args){
      int[] nums = {4,1,2,1,2};
      singleNumber(nums);
    }

}
