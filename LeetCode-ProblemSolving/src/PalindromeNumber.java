class PalindromeNumber {
    public boolean isPalindrome(int x) {
    	if(x<0) {
    		return false;
    	}
        String str = String.valueOf(x);
        int i = 0;
        int j = str.length()-1; 
        while(i<j) {
        	if(str.charAt(i) != str.charAt(j)) {
        		return false;
        	}else {
        		i++;
        		j--;
        	}
        	
        }
        return true;
    }
}