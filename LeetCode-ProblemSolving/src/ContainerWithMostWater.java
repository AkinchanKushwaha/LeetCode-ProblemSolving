class ContainerWithMostWater {
    public int maxArea(int[] height) {
      
    	int i = 0 ;
    	int j = height.length-1;
    	int max_area = 0;
    	
    	while(i<j){
    		if(height[i]<height[j]) {
    			max_area = Math.max(height[i]*(j-i), max_area);
    			i++;
    		}else {
    			max_area = Math.max(height[j]*(j-i), max_area);
    			j--;
    		}
    	}
    	
    	return max_area;
      
    }
}