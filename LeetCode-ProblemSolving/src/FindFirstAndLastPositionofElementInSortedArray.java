class Solution {
	
	public int[] searchRange(int[]nums, int target) {
		int min = Integer.MAX_VALUE, max = Integer.MAX_VALUE;
		
		for(int i = 0 ; i<nums.length; i++) {
			if(nums[i] == target) {
				min = i;
				break;
			}
		}
		
		for(int i = nums.length-1; i>=0; i--) {
			if(nums[i] == target) {
				max =i;
				break;
			}
		}
		
		if(min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
			int ans[] = {-1, -1};
			return ans;
		}else {
			int ans[] = {min, max};
			return ans;
		}

	}
}