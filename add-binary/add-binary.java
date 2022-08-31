class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;

        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i>=0||j>=0){
            int sum = carry;
            if ( j >= 0) sum += Integer.parseInt(String.valueOf(b.charAt(j--)));
            if ( i >= 0) sum += Integer.parseInt(String.valueOf(a.charAt(i--)));

            sb.append(sum%2);
            carry = sum/2;
        }

        if (carry != 0) sb.append(carry);

        return sb.reverse().toString();
}
}