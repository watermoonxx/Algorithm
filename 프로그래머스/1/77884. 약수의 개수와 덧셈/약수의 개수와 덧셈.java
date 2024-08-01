class Solution {
    public int solution(int left, int right) {
        // left부터 right까지 
            // 약수의 개수가 짝수인 수
            // 약수의 개수가 홀수인 수
        
        int answer = 0;
        for (int i=left; i<=right; i++) {
            int divisor = 1;
            int count = 0;
            while (divisor <= i) {
                if (i % divisor == 0) {
                    count += 1; // 약수의 개수 
                }
                divisor += 1;
            }
            if (count % 2 == 0) { // 짝수 
                answer += i;
            } else { // 홀수 
                answer += (i * -1);
            }
        }
        return answer;
    }
}