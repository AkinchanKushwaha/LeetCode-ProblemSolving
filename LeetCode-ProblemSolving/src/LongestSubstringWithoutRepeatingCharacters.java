import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
    	int i = 0, j = 0;
    	HashSet<Character> hs = new HashSet<>();
    	int max = 0;
    	
    	while(i <s.length() && j<s.length()) {
    		if(!hs.contains(s.charAt(j))) {
    			hs.add(s.charAt(j));
    			j++;
    			
    		}else {
    			hs.remove(s.charAt(i));
    			i++;
    		}
            max = Math.max(max, j-i);
    	}
    	
    	return max;
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		System.out.println(lengthOfLongestSubstring(s));
	}
}