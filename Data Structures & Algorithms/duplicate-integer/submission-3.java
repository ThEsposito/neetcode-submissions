class Solution {
    public boolean hasDuplicate(int[] nums) { // Time O(N log N), Space O(1)
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }

        return false;
    }

}