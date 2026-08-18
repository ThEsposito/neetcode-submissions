class Solution {
    private List<List<Integer>> s;
    public List<List<Integer>> permute(int[] nums) {
        s = new ArrayList<>();

        backtracking(new ArrayList<>(), nums, new boolean[nums.length]);
        return s;
    }

    public void backtracking(List<Integer> permut, int[] nums, boolean[] chosen) {
        if(permut.size() == nums.length) {
            s.add(new ArrayList<>(permut));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!chosen[i]) {
                permut.add(nums[i]);
                chosen[i] = true;
                
                backtracking(permut, nums, chosen);

                permut.remove(permut.size() - 1);
                chosen[i] = false;
            }
        }
    }
}
