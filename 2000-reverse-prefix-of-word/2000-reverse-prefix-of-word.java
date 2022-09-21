class Solution {
    public String reversePrefix(String word, char ch) {
        
        
       char[] w = word.toCharArray();
        
       int end = word.indexOf(ch);
        
        int start = 0;
        while(start < end){
            char temp = w[start];
            w[start] = w[end];
            w[end] = temp;
            start++;
            end--;
           
        }
        
        return new String(w);
            
    }
}