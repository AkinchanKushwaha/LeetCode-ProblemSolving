class ValidPalindrome {
    public boolean isPalindrome(String s) {
        
    	if(s.length()== 0) {
    		return true;
    	}
    	s = s.toLowerCase();
    	
    	int i = 0;
    	int j = s.length()-1;
    	
    	while(i<j) {
    		if(!Character.isLetterOrDigit(s.charAt(i))) {
    			i++;
    		}else if(!Character.isLetterOrDigit(s.charAt(j))) {
    			j--;
    		}else if(s.charAt(i++) != s.charAt(j--) ) {
    			return false;
    		}
    	}
    	
    	return true;
    
    }
}