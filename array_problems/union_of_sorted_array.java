import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class union_of_sorted_array {
     static int unionArray(int[] nums1, int[] nums2) {
      //optimal
     int x = 0 ; 
     int y = 0 ;
     ArrayList<Integer> arr = new ArrayList<>();
     while(x < nums1.length&& y<nums2.length){
         if(nums1[x]<nums2[y]){
            if(arr.isEmpty()||arr.get(arr.size()-1)!= nums1[x]){
                  arr.add(nums1[x]);
            }x++;
         }
         else   if(nums1[x]>nums2[y]){
            if(arr.isEmpty()||arr.get(arr.size()-1)!= nums2[y]){
                  arr.add(nums2[y]);
            }y++;}
           else{
            if(arr.isEmpty()||arr.get(arr.size()-1)!= nums1[x]){
                  arr.add(nums1[x]);
            }x++;y++;
         }
         
     }
     if(y == nums2.length){while(x<nums1.length){if(arr.isEmpty() || arr.get(arr.size()-1) != nums1[x]){arr.add(nums1[x]);}x++;}}
     if(x == nums1.length){while(y<nums2.length){if(arr.isEmpty() || arr.get(arr.size()-1) != nums2[y]){arr.add(nums2[y]);}y++;}}
     int[] nums = new int[arr.size()];
     for (int i = 0; i < arr.size(); i++) {
    nums[i] = arr.get(i);
}

      //brute force
      /* 
        int x = 0; int y = 0;
     Set<Integer> set = new HashSet<>();
      while (x < nums1.length && y < nums2.length) {
            if (nums1[x] < nums2[y]) {
                set.add(nums1[x]);
                x++;
            }
            else if (nums1[x] > nums2[y]) {
                set.add(nums2[y]);
                y++;
            }
            else {            
                set.add(nums1[x]);
                x++;
                y++;
            }
        }
              while (x < nums1.length) {
            set.add(nums1[x]);
            x++;
        }

        while (y < nums2.length) {
            set.add(nums2[y]);
            y++;
        }
        // convert set to array
int[] nums = new int[set.size()];
int i = 0;
for (int num : set) {
    nums[i] = num;
    i++;
}*/
return nums;
}
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        unionArray(nums1, nums2);
    }
}