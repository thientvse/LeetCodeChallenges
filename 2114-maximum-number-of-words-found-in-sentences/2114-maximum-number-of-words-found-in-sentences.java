class Solution {
    public int mostWordsFound(String[] sentences) {
        
        
        int max = 0;
        
        for (int i = 0; i < sentences.length; i++){
            
            String str = sentences[i];
            
            String[] strArr = str.split(" ");
            
            max = Math.max(strArr.length, max);
            
        }
        
        return max;
        
    }
}