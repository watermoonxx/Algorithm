class Solution {
    public String solution(String s) {
        // 단어 s의 가운데 글자 반환
        // 단어 길이가 짝수라면 가운데 두 글자 반환 
        
        String answer = "";
        int target = 0;
        
        target =  s.length() / 2;
        if (s.length() % 2 == 1) {
            answer += s.substring(target, target+1);
        } else {
            answer += s.substring(target-1, target+1);
        }
        return answer;
    }
}