class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int lengthRs = nums.length*2;
        int length = nums.length;
        int[] rs = new int[length*2];
        
        for (int i = 0; i < lengthRs; i++){
            
            
            if (i < length){
                rs[i] = nums[i];
            } else {
                rs[i] = nums[i-length];
            }
        }
        
        return rs;
    }
}