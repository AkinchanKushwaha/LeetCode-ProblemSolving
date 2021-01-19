import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();
        Map<String, ArrayList> ans = new HashMap<String, ArrayList>();
        for (int i = 0 ; i<strs.length; i++) {
        	
        	char[] c = strs[i].toCharArray();
        	Arrays.sort(c);
        	String key = String.valueOf(c);
        	
        	if (!ans.containsKey(key)) 
        		ans.put(key, new ArrayList());
        	ans.get(key).add(i);
        }
        return new ArrayList(ans.values());
    }
}