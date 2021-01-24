class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> hs = new HashSet<>();
       int remain = 0;
        while(n != 1){
            hs.add(n);
            int sum = 0;
            
            while(n>0){
                remain= n%10;
                sum += remain*remain;
                n /=10;
            }
            if(hs.contains(sum)){
                return false;
            }
            n= sum;
        }
        return true;
    }
}