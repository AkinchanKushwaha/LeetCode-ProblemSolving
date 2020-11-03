import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(numRows == 0) {
        	return ans;
        }
        
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        
        for(int i = 1 ; i<numRows ; i++) {
        	List<Integer> row = new ArrayList<>();
        	List<Integer> prevRow = ans.get(i-1);
        	
        	row.add(1);
        	
        	for(int j = 1; j<i; j++) {
        		row.add(prevRow.get(j-i) + prevRow.get(j));
        	}
        	row.add(1);
        	ans.add(row);
        }
        
        return ans;
        
    }
}