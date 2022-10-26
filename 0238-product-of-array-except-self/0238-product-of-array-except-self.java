class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       
        
        int[] res=new int[nums.length];

        int allProduct = 1;
        
        int countZero = 0;
        // 1. Multiple all element except value 0 and count value 0;
        for(int c: nums){
            if(c == 0){
                countZero++;
                continue;
            }
            allProduct *= c;
        }
        
        // check nums[i]
        // if countZero = 0, you can devide all product to myself
        // check countZero with other value
        for(int i = 0; i < nums.length; i++){
            if(countZero == 0){
                res[i] = allProduct/nums[i];
            } else if (countZero == 1){
                res[i] = nums[i] != 0 ? 0 : allProduct;
            } else {
                res[i] = 0;
            }
        }
        
        return res;
        
    }
}