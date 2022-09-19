class Solution {
    public String firstPalindrome(String[] words) {
        for (String word: words){
            
            if(checkPalindromic(word)){
                return word;                
            }
            
        }
        
        return "";
    }
    
    public boolean checkPalindromic(String word){
        int start = 0;
        int end = word.length()-1;
        
        char[] w = word.toCharArray();
        
            
        while (start < end){
            if(w[start] != w[end]){
                return false;
            } else {
                start++;
                end--;
            }
        }
        
        return true;
    }
}