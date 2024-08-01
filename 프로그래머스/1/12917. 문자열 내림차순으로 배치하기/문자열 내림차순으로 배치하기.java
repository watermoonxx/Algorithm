import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자열을 StringBuilder로 변환 
        StringBuilder sb = new StringBuilder(s);
        
        // StringBuilder를 char[] 배열로 변환 
            // toCharArray(): 문자열을 char[] 배열로 변환하는 String 클래스에서 제공하는 메소드
        char[] charArr = sb.toString().toCharArray();
        
        // char[] -> Character[] 
        Character[] charObj = new Character[charArr.length];
        for (int i=0; i<charArr.length; i++) {
            charObj[i] = charArr[i];
        }
        
        // Character[] 배열 내림차순 정렬
        Arrays.sort(charObj, Collections.reverseOrder());
        System.out.println(Arrays.toString(charObj));
        
        // Character[] -> StringBuilder
        StringBuilder sb2 = new StringBuilder(charObj.length);
        for (Character c : charObj) {
            sb2.append(c);
        }
        return sb2.toString();
    }
}