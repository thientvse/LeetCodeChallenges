class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        
        int len = nums.length;
        
        int[] rs = new int[len];
        
        int indexOdd = 1;
        int indexEven = 0;
        
        for (int i = 0; i < len; i++){
            if(nums[i] % 2 == 0 ){
                rs[indexEven] = nums[i];
                indexEven += 2;
            } else {
                rs[indexOdd] = nums[i];
                indexOdd += 2;
            }
            
        }
        
      
    
        
        return rs;
    
        
    }
}