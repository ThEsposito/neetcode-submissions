class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nonZeroProduct = 1;
        int zeroCounter = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) nonZeroProduct *= nums[i];
            else zeroCounter++;
        }

        if(zeroCounter > 1) return new int[nums.length];


        for(int i = 0; i < nums.length; i++) {            
            if(zeroCounter == 1) {
                nums[i] = (nums[i] == 0) ? nonZeroProduct : 0;
            } else {
                nums[i] = nonZeroProduct/nums[i];
            }
        }

        return nums;
    }
}
