import java.util.*;

class Solution {
    public boolean solution(String s) {
        // 문자열 길이가 4 또는 6인지, 숫자로만 구성되어 있는지
        
        boolean answer = true;
        
        // 길이 
        if (!((s.length() == 4) || (s.length() == 6))) {
            answer = false;
        } else {
            // 숫자가 아닌 알파벳이 있다면(아스키코드 문자 0~9 --> 48~57)   
            StringBuilder sb = new StringBuilder(s);
            char[] charArr = sb.toString().toCharArray();
            // System.out.println(Arrays.toString(charArr));
            
            for (int i=0; i<charArr.length; i++) {
                int target = charArr[i];
                if (!((target >= 48) && (target <= 57))) { // 문자 0~9 범위가 아니라면 
                    answer = false;
                }
            }
        }
        return answer;
    }
}