import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm  = new HashMap<>();
        for(int i = 0 ; i<nums.length ; i++) {
        	int c = target- nums[i];
        	if(hm.containsKey(c)) {
        		return new int[] {hm.get(c),i};
        	}else hm.put(nums[i],i);
        }
        throw new IllegalArgumentException("no match found");
    }
}