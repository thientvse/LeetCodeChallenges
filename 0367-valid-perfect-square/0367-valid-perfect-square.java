class Solution {
    public boolean isPerfectSquare(int num) {
        
        if (num == 1) return true;
        long start  = 0;
        long end = num/2;
        
        
        
        
        while (start <= end){
            long mid = start + (end - start)/2;
            
            long sqrt = mid*mid;
            
            if (sqrt == num){
                return true;
            }
            
            if (sqrt > num){
                end = mid - 1;
            } else if (sqrt < num){
                start = mid + 1;
            }
            
        }
        
        return false;
        
        // if(num==1)return true;
        // long s=0,e=num/2;
        // while(s<=e){
        //     long m=s+(e-s)/2;
        //     long sq=m*m;
        //     if(sq==num)return true;
        //     else if(sq>num)e=m-1;
        //     else s=m+1;
        // }
        // return false;
    }
}