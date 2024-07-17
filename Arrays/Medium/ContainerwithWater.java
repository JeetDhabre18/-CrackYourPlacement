class ContainerwithWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int hLeft = height[left];
            int hRight = height[right];

            
            int width = right - left;
            int h = Math.min(hLeft, hRight);

           
            maxArea = Math.max(maxArea, width * h);

            
            if (hLeft < hRight) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
        
    }
}

