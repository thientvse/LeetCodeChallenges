class Solution {
    public int countNegatives(int[][] grid) {
        
        int count =0;
        for(int[] row: grid){
            int index = binarySearch(row);
            int N = row.length;
            count += (N -index);
        }
        return count;
    }
    
     public int binarySearch(int[] nums){
        int N = nums.length, start =0, end = N-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < 0){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }
}