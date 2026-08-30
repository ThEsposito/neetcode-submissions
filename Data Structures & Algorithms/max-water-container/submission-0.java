class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxArea = containerArea(containerWidth(left, right), containerHeight(heights[left], heights[right]));
        while (left < right) {
            int area = containerArea(containerWidth(left, right), containerHeight(heights[left], heights[right]));

            if (area > maxArea) maxArea = area;

            if (heights[left] < heights[right]) left++;
            else right--;
        }

        return maxArea;
    }

    private int containerWidth(int idxA, int idxB) {
        return Math.abs(idxA - idxB);
    }

    private int containerHeight(int barA, int barB) {
        return Math.min(barA, barB);
    }

    private int containerArea(int width, int height) {
        return width * height;
    }
}
