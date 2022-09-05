class Solution {
    public int findNumbers(int[] nums) {
         int result = 0;
         for (int num: nums) {
                int countNumber = 0;
                while (num>0){
                    int n = num%10;
                    countNumber++;
                    num = num/10;
                }
                if (countNumber % 2 == 0){
                    result++;
                }
            }

            return result;
    }
}