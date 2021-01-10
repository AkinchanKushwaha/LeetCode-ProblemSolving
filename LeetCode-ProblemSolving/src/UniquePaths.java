import java.util.HashMap;

class Solution {
	
	
	//memoized solution
	
//	public int uniquePaths(int m , int n) {
//		HashMap<String, Integer> hm = new HashMap<>();
//		return uniquePaths(m, n, hm);
//	}
//	
//    public int uniquePaths(int m, int n, HashMap<String, Integer>hm) {
//    	
//    	String s1 = m+","+n;
//    	String s2 = n+","+m;
//
//    	
//    	if(hm.containsKey(s1)) {
//    		return hm.get(s1);
//    	}
//
//        if( m == 1 || n == 1) return 1;
//        if( m == 0 || n == 0) return 0;
//        
//        int res = uniquePaths(m-1, n, hm)+ uniquePaths(m, n-1, hm);
//        
//        hm.put(s1, res);
//        hm.put(s2, res);
//        
//        return res;
//    }
	
	
	//tabulation solution
	
	public int uniquePaths(int n , int m) {
		int [][] dp = new int[m][n];
		for(int i = 0 ; i<dp.length; i++) {
			dp[i][0] =1;
		}
		for(int i = 0 ; i<dp[0].length; i++) {
			dp[0][i] = 1;
		}
		
		
		for(int i = 1 ; i<dp.length; i++) {
			for(int j = 1 ; j<dp[i].length; j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
		
	}
	
}