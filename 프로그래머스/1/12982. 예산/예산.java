import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 신청한 금액보다 적게는 x, 신청금액으로 지원
        // 최대 몇 개의 부서에 지원할 수 있는지 --> 신청금액 작은순으로 선택 
        
        // 배열 오름차순 정렬
        Arrays.sort(d);
        
        int answer = 0;
        for (int i=0; i<d.length; i++) {
            if (budget >= 0) { // 연산 전 budget 확인 
                budget -= d[i];
                if (budget >= 0) { // 연산 후 결과가 음수가 아니라면 지원 가능 
                    answer += 1;
                }
            }            
        }
        return answer;
    }
}