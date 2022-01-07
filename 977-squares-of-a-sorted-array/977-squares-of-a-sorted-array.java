class Solution {
    public int[] sortedSquares(int[] nums) {
        int start =0;
        int end = nums.length - 1;
        int j = nums.length -1;
        
        int[] squares = new int[nums.length];
        
        while(start<=end){
            if (Math.abs(nums[start]) > Math.abs(nums[end])){
                squares[j] = nums[start]*nums[start];
                start++;
            } else {
                squares[j] = nums[end]*nums[end];
                end--;
            }
                
            j--;
                
        }
                
        return squares;
    }
}