class Solution {
    public int firstUniqChar(String s) {
        int numOfChar[] = new int[26];
        
        for(int i = 0 ; i<s.length(); i++){
            numOfChar[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i<s.length() ; i++){
            if(numOfChar[s.charAt(i)-'a'] == 1){
                return i;
            }
        }return -1;
                         
    }
}