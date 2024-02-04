def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        divider = 1
        count = 0
        while divider <= i:
            if i % divider == 0:
                count += 1
            divider += 1
        if count % 2 == 0: # 최종 count는 약수의 개수 
            answer += i
        else:
            answer += (-1 * i) 
    return answer 