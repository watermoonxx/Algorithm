def solution(numbers):
    total_sum = sum([i for i in range(0, 9+1)])
    answer = total_sum - sum(numbers)    
    return answer
