import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 덧셈 결과 반환 
        
        // 2차원 배열 선언 및 생성 
        int[][] result = new int[arr1.length][arr1[0].length]; // 두 행렬의 행과 열의 크기가 같으므로 가능  
	    
	for (int i=0; i<arr1.length; i++) {
		for (int j=0; j<arr1[i].length; j++) {
			result[i][j] = arr1[i][j] + arr2[i][j];
		}
	}
	return result;
    }
}
