def solution(n):
    answer = 0
    square = 0
    remain = []
    while n != 0:
        remain.append(n % 3)
        n //= 3
    remain.reverse() 
    
    for i in remain:
        answer += i * (3 ** square)
        square += 1
    return answer