class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++){
            
            if(flowerbed[i]==0){ // check current position can plot.
                // check before and after plot with condition
                boolean afterPlot = (i == 0)||(flowerbed[i-1]==0);
                boolean beforePlot = (i == flowerbed.length-1)||(flowerbed[i+1]==0);
                
                // if after and before are empty, we can plot here
                if(afterPlot && beforePlot){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            
        }
        
        return count >= n;
    }
}