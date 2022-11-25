class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxCandy = 0;
        
        for (int e: candies){
            maxCandy = Math.max(maxCandy, e);
        }
        
        
        List<Boolean> rs = new ArrayList<>();
        
        for (int i = 0; i < candies.length; i++){
            
            int candyWithExtra = candies[i] + extraCandies;            
            
            if (candyWithExtra >= maxCandy){
                rs.add(true);
            } else {
                rs.add(false);
            }
                
        }
        
        return rs;
        
    }
}