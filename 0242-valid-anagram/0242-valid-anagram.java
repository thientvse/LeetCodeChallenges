class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }
        
        for(char c: map.keySet()){
            if(map.get(c)!=0) return false;
        }
        
        return true;
        
        /** 
            1. tao mot hash map
            2. duyet mang 
               + add cac ky tu cua chuoi s vao hash map cung voi so lan xuat hienj
               + remove cac ky tu cua chuoi t trong hashmap
            3. duyet hash map
               Neu con gia tri thi la false
               Va nguoc lai
        */ 
        
        /**
            1. Tao 2 mang ky tu voi s va t
            2. sort 2 mang
            3. duyet vao so sanh tung phan tu trong mang
        
        */
    }
}