import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[nums.length+1];

        // for (int num : nums) {
        //     // set.add(num);

        // }
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]] = 1;
        }

        // for (int i = 1; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         res.add(i);
        //     }
        // }
        for (int i = 1; i <= nums.length; i++) {
            if(arr[i]==0) res.add(i);
        }


        return res;
    }
}
