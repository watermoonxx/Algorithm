class Solution {
    public String solution(String phone_number) {
        // 뒷 4자리 제외하고 모두 "*" 처리

        String answer = "";
		for (int i = 0; i < phone_number.length(); i++) {
			if (i < phone_number.length() - 4) {
				answer += "*";
			} else {
                answer += phone_number.substring(i, i+1);
			}
		}
        return answer;
    }
}