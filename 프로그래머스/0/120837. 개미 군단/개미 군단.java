class Solution {
    public int solution(int hp) {
        // 그리디 알고리즘 유형 
        
        // 처음 작성 코드 
        /*
        int answer = 0;
        
        while (hp > 0) {
            answer += hp / 5;
            hp = hp % 5;
            answer += hp / 3;
            hp = hp % 3;
            answer += hp / 1;
            hp = hp % 1;
        }    
        return answer;
        */
        
        // 수정 코드 
        int answer = 0;
        int[] ants = {5, 3, 1};
        int i = 0;
        
        while (hp > 0) {
            answer += hp / ants[i];
            hp %= ants[i];
            i++;
        }
        return answer;
    }
}

