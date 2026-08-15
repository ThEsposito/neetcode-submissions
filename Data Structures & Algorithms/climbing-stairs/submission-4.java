class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[]{0,1};
        int next = 0;
        for(int i = 0; i < n; i++) {
            next = arr[0] + arr[1];
            arr[0] = arr[1];
            arr[1] = next;
        }

        return next;
    }
}
