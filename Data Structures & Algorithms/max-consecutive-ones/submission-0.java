class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int i = 0;
        while(i < nums.length) {
            int consecutives = 0;
            while(i < nums.length && nums[i] == 1){
                consecutives++;
                i++;
            }
            maxConsecutives = Math.max(consecutives, maxConsecutives);
            i++; // Meto essa? Ou posso acabar somando duplicado?
        }

        return maxConsecutives;
    }
}