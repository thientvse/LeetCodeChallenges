class Solution {
    public int countGoodSubstrings(String s) {
        int countGoodString = 0;
        
        int windowStart = 0;
        
        Map<Character,Integer> mp = new HashMap<>();
        
        
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char right = s.charAt(windowEnd);
            
            mp.put(right, mp.getOrDefault(right,0)+1);
            
            if (windowEnd - windowStart + 1 < 3){
                
            } else if (windowEnd - windowStart + 1 == 3){
                
                if(mp.size() == 3){
                    countGoodString++;
                }
                
                char left = s.charAt(windowStart);
                
                mp.put(left, mp.get(left) - 1);

                if(mp.get(left) == 0){
                    mp.remove(left);
                }
                
                windowStart++;
                
            }
            
            
           
        }
        
        return countGoodString;
        
        
    }
}