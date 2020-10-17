import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
    	for(char ch : s.toCharArray()) {
    		if(ch =='(') st.push(')');
    		else if(ch =='{') st.push('}');
    		else if(ch =='[') st.push(']');
    		else if(st.isEmpty() || st.pop()!=ch) {
    			return false;
    		}
    	}
    	if(st.isEmpty()) {
    		return true;
    	}else return false;
    }
}