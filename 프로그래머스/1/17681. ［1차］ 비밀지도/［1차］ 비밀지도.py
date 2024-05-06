def solution(n, arr1, arr2):
    answer = []
    list1 = []
    list2 = []
    
    for i in arr1:
        str1 = format(i, 'b') # 이진수 변환
        list1.append(str1.rjust(n, '0')) # n자리 할당, 오른쪽 정렬 후, 공백은 '0'으로 채움
    for j in arr2:
        str2 = format(j, 'b')
        list2.append(str2.rjust(n, '0'))
    
    # 리스트 원소끼리 연산
    for ele1, ele2 in zip(list1, list2):
        r = [] # answer에 넣고 초기화
        for c1, c2 in zip(ele1, ele2):
            if (c1 == c2 == '0'):
                r.append(" ")
            else:
                r.append("#")
        answer.append(''.join(r))
    return answer