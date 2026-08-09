class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementos = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if(complementos.containsKey(complemento)) {
                return new int[]{complementos.get(complemento), i};
            } else {
                complementos.put(nums[i], i);
            }
        }
        
        return new int[]{-1, -1};

    }
}
