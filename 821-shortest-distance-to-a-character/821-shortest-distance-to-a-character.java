class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] rs = new int[s.length()];
        
        int index = s.indexOf(c);
        
        int len = s.length();
        
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                rs[i] = 0;
                index = i;
            } else {
                if (index < i){
                    rs[i] = i - index;
                } else {
                   rs[i] = index -i;
                }
            }
        }
        
         for (int i = len -1; i >= 0 ; i--) {
            if(s.charAt(i) == c){
                rs[i] = Math.min(rs[i], 0);
                index = i;
            } else {
                rs[i] = Math.min(rs[i], Math.abs(i - index));
            }
          }
    
        return rs;
    }
}