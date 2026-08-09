class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int i = 0;
        int j = nums.length - 1;

        while(i <= j) {
            if(nums[i] == val){
                while(j > i && nums[j] == val) {
                    nums[j] = -1;
                    count++;
                    j--;
                }

                nums[i] = nums[j];
                nums[j] = -1;
                count++;
                
                j--;
            }
            i++;
        }
        return nums.length - count;
    }
}