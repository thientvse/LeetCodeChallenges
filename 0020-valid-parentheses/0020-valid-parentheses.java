class Solution {
    public boolean isValid(String s) {
        
        
        // create stack to save s character
        Stack<Character> st = new Stack<>();
        
        
        // loop in s with s length
        for(int i = 0; i < s.length(); i++){
            
            
            // if stack empty or s is close bracket => false;
            if(st.empty()  && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            }
            
            // if s is open bracket, we push to stack
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
            } else if(s.charAt(i) == '}' && st.peek() == '{') {
                st.pop();
            } else if(s.charAt(i) == ']' && st.peek() == '[') {
                st.pop();
            } else {
                return false;
            }
            
        }
        
        return st.empty();
        
        
    }
}