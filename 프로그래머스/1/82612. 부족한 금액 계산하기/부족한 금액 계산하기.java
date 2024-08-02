class Solution {
    public long solution(int price, int money, int count) {
        // count번 타면 금액에서 얼마가 모자라는지 리턴 
        // 부족하지 않다면 0 리턴

        long answer = 0;
        
        // 지불할 금액
        long sum = 0;
        for (int i=1; i<=count; i++) {
            sum += price * i;
        }
        //System.out.println(sum);
        
        // 결과
        if (money >= sum) {
            answer = 0;
        } else if (money < sum) {
            answer = sum - money;
        }
        return answer;
    }
}