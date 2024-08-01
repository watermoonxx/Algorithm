class Solution {
    public String solution(int n) {
        // "수" 인덱스 -> 0,2,4 ...
        // "박" 인덱스 -> 1,3,5 ...
        
        String answer = "";
        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}