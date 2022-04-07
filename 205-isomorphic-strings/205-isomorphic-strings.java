class Solution {
    public boolean isIsomorphic(String s, String t) {
        return tranform(s).equals(tranform(t));
    }
    
    public static String tranform(String s){

        Map<Character, Integer> indexMapping = new HashMap<>();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (!indexMapping.containsKey(c1)){
                indexMapping.put(c1, i);
            }

            builder.append(indexMapping.get(c1).toString());
            builder.append(" ");
        }

        return builder.toString();
    }
}