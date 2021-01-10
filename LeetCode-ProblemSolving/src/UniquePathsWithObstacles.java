
class Solution {
	    public int uniquePathsWithObstacles(int[][] arr) {
	    	int r = arr.length;
	    	int c = arr[0].length;
	    	
	    	arr[0][0] = 1;
	    	
	    	if(arr[0][0] == 1) {
	    		return 0;
	    	}
	    	
	    	for(int i = 1; i<r; i++) {
	    		if(arr[i-1][0] == 1 && arr[i][0] == 0) {
	    			arr[i][0] = 0;
	    		}else arr[i][0] = 1;
	    	}
	    	
	    	for(int i = 1; i<c; i++) {
	    		if(arr[0][i-1] == 1 && arr[0][i] == 0) {
	    			arr[0][i] = 0;
	    		}else arr[0][i] = 1;
	    	}
	    	
	        for (int i = 1; i < r; i++) {
	            for (int j = 1; j < c; j++) {
	                if (arr[i][j] == 0) {
	                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
	                } else {
	                    arr[i][j] = 0;
	                }
	            }
	        }
	        
	        return arr[r-1][c-1];
	    }
}