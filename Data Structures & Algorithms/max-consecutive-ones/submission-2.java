class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int consecutives = 0;

        int i = 0;
        while(i < nums.length) {
            if(nums[i] == 1) {
                consecutives++;
                maxConsecutives = Math.max(consecutives, maxConsecutives);
            } else {
                consecutives = 0;
            }
            i++;
        }

        return maxConsecutives;
    }
}