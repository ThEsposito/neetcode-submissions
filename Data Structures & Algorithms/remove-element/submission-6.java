class Solution {
    public int removeElement(int[] nums, int val) {
        int removeCount = 0;
        int i = 0;
        int j = nums.length - 1;

        while(i <= j) {
            if(nums[i] == val){
                while(j > i && nums[j] == val) {
                    nums[j] = -1;
                    removeCount++;
                    j--;
                }

                nums[i] = nums[j];
                nums[j] = -1;
                removeCount++;
                
                j--;
            }
            i++;
        }
        return nums.length - removeCount;
    }
}