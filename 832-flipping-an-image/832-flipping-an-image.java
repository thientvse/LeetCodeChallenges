class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int c = image[0].length;
        
        
       for(int[] row: image){
           
           for(int i = 0; i < (c+1)/2; i++){
               int temp = row[i];
               row[i] = 1 - row[c-1-i];
               row[c-1-i] = 1 - temp;
           }
       }
        
        return image;
        
    }
}