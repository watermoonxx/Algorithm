import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 배열에서 가장 작은 수 제거 후 배열 리턴
        // get(): 인덱스에 해당하는  요소 반환
        
        List<Integer> answer = new ArrayList<>();
        int minNum = 0;
        int[] resultArr;
        
        for (int i=0; i<arr.length; i++) {
            answer.add(arr[i]);
            if (i == 0) {
                minNum = answer.get(0); // 첫번째 값으로 일단 지정 
            }
            if (answer.get(i) < minNum) {
                minNum = answer.get(i);
            }
        }
        
        if (answer.size() == 1) {
            resultArr = new int[answer.size()];
            resultArr[0] = -1;
        } else {
            // 가장 작은 수 제거
            // minNum의 index
            int minIndex = answer.indexOf(minNum);
            answer.remove(minIndex);
        
            // ArrayList -> 배열 변환 
            resultArr = new int[answer.size()];
            for (int j=0; j<resultArr.length; j++) {
                resultArr[j] = answer.get(j);
            }
        }
        return resultArr;
    }
}