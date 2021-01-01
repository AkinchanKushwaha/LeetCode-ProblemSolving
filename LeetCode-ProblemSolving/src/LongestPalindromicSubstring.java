class Solution {
	
	// https://www.youtube.com/watch?v=y2BD4MJqV20
    public String longestPalindrome(String s) {
    	if(s.length() == 0) {
    		return s;
    	}
    	int len = 0;
    	int start = 0, end = 0;
        for(int i = 0 ; i < s.length(); i++) {
        	int len1 =  expandFromTheMiddle(s, i, i);
        	int len2 =  expandFromTheMiddle(s, i, i+1);
        	len  = Math.max(len1, len2);
        	
        	if(len > end - start) {
        		end = i + len/2;
        		start = i - ((len-1)/2);
        	}
        }
        
        return s.substring(start, end+1);
    }
    
    public int expandFromTheMiddle(String s, int i , int j) {
    	while(i >= 0 && j <s.length() && s.charAt(i) == s.charAt(j)) {
    		i--;
    		j++;
    	}
    	
    	return j-i-1;
    }
}