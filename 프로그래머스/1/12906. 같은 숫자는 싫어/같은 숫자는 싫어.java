import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 연속적으로 나타나는 숫자는 하나만 남기기 
        
        Queue<Integer> queue1 = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (queue1.isEmpty()) {
                queue1.offer(arr[i]); 
                continue;
            }
            
            if (queue1.peek() != arr[i]) {  
                array.add(queue1.poll()); // 큐에서 삭제 & ArrayList에 추가 
                queue1.offer(arr[i]); 
            } else if (queue1.peek() == arr[i]) {
                continue;
            }
        } 
        if (!queue1.isEmpty()) {
            array.add(queue1.poll());
        }
        
        // ArrayList -> 배열 
        int[] answer = new int[array.size()];
        for (int j=0; j<array.size(); j++) {
            answer[j] = array.get(j);
        }
        return answer;
    }
}