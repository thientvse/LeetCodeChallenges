class Solution {
    public int countOdds(int low, int high) {
        
        int totalNumber = high - low + 1;
        
        if (high % 2 != 0 && low % 2 != 0){
            return totalNumber/2 + 1;
        } else {
            return totalNumber/2;
        }
        
    }
}