class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int consecutives = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) {
                consecutives++;
                maxConsecutives = Math.max(consecutives, maxConsecutives); 
            } else {
                consecutives = 0;
            }
        }

        return maxConsecutives;
    }
}