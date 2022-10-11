class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();
        
        for (int i = 1; i <= n; i++){
        
            boolean devide3 = i % 3 == 0;
            boolean devide5 = i % 5 == 0;
            
            if (devide3 && devide5){
                results.add("FizzBuzz");
            } else if (devide3){
                results.add("Fizz");
            } else if (devide5){
                results.add("Buzz");
            } else {
                results.add(""+i);
            }
            
        }
        
        return results;
        
        
    }
}