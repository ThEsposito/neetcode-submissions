class Solution {
    public int findMin(int[] nums) {
        int esq = 0;
        int dir = nums.length - 1;

        while(esq < dir) {
            int meio = esq + (dir - esq)  / 2;
            if(nums[meio] < nums[dir]) {
                dir = meio;
            } else {
                esq = meio + 1;
            }
        }

        return nums[esq];
    }
}
