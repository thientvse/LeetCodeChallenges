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
                
                char c = s.charAt(windowStart);
                int freq = mp.get(c) - 1;
                if(freq == 0) mp.remove(c);
                else mp.put(c , freq);
                
                windowStart++;
                
            }
            
            
           
        }
        
        return countGoodString;
        
        
    }
}