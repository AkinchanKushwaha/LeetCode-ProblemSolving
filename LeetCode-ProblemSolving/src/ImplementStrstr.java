class ImplementStrstr {
    public int strStr(String haystack, String needle) {
        
        int len = needle.length();
        if(haystack.equals(needle)) {
        	return 0;
        }
        
        for(int i = 0; i<=haystack.length()-len; i++){
            if(haystack.substring(i, len+i).equals(needle)){
                return i;
            }
        }
        return -1;
    
    }
}