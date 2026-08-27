class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int esq = 0;
        int dir = n - 1;

        int min = nums[0];
        while(esq <= dir) {
            if(nums[esq] < nums[dir]) {
                min = Math.min(min, nums[esq]);
                break;
            }

            int meio = esq + (dir - esq)  / 2;
            min = Math.min(min, nums[meio]);
            if(nums[meio] >= nums[esq]) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }

        return min;
    }
}
