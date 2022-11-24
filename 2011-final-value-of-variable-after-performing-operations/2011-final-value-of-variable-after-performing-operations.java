class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int rs = 0;
        
//         for (int i = 0; i < operations.length; i++){
//             if (operations[i].equals("--X")||operations[i].equals("X--")){
//                 rs -= 1;
//             } else {
//                 rs += 1;
//             }
//         }
        
//         return rs;
        
        for (String c: operations){
            
            if (c.charAt(1) == '-') rs--;
            else rs++;
        }
        
        return rs;
        
        
    }
}