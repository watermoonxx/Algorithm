def solution(arr1, arr2):
    answer = []
    row = len(arr1)
    col = len(arr1[0])
    
    for i in range(row):
        element = []
        for j in range(col):
            element.append(arr1[i][j] + arr2[i][j])
        answer.append(element)
    return answer
