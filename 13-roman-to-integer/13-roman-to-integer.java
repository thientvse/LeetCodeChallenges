class Solution {
    public int romanToInt(String s) {
        

               

                // A = 900
                s = s.replaceAll("CM", "A");

                // B = 400
                s = s.replaceAll("CD", "B");

                // E = 90
                s = s.replaceAll("XC", "E");

                // F = 40
                s = s.replaceAll("XL", "F");

                // G = 9
                s = s.replaceAll("IX", "G");

                // H = 4
                s = s.replaceAll("IV", "H");

                String[] strs = s.split("");

                int result = 0;

                for (int i = 0 ;i < strs.length; i++) {
                    switch (strs[i]) {
                        case "A":
                            result +=900;
                            break;
                        case "B":
                            result +=400;
                            break;
                        case "E":
                            result +=90;
                            break;
                        case "F":
                            result +=40;
                            break;
                        case "G":
                            result +=9;
                            break;
                        case "H":
                            result +=4;
                            break;
                        case "I":
                            result +=1;
                            break;
                        case "V":
                            result +=5;
                            break;
                        case "X":
                            result +=10;
                            break;
                        case "L":
                            result +=50;
                            break;
                        case "C":
                            result +=100;
                            break;
                        case "D":
                            result +=500;
                            break;
                        case "M":
                            result +=1000;
                            break;
                    }
                }
                return result;
    }
}