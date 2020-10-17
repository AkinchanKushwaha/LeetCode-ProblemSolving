class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int current_max = nums[0];
        int max = current_max;
        
        for(int i =1; i<nums.length; i++){
            current_max = Math.max(nums[i], current_max+nums[i]);
            max = Math.max(max, current_max);
        }
        return max;
    }
}