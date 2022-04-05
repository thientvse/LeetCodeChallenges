class Solution {
    public int countPrimes(int n) {
        if(n <= 2)
            return 0;
        

        int count = 0,j= 0;
        
        boolean[] primes = new boolean[n];

        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(primes[i]){
                for (j = i*i; j < n; j+=i) {
                       primes[j] = false;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (primes[i]) count++;
        }

        return count;
    }
}