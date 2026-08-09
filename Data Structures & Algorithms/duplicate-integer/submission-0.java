class Solution {
    // public boolean hasDuplicate(int[] nums) { // Time O(N ^ 2), Space O(1)
    //     int n = nums.length;
    //     for(int i = 0; i < n; i++) {
    //         for(int j = i + 1; j < n; j++) {
    //             if(nums[i] == nums[j]) return false;
    //         }
    //     }

    //     return true;
    // }

    public boolean hasDuplicate(int[] nums) { // Time O(N), Space O(N)
        HashSet<Integer> found = new HashSet<>();

        for(int num : nums) {
            if(found.contains(num)) return true;

            found.add(num);
        }

        return false;
    }
}