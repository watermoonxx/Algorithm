from itertools import combinations

def solution(numbers):
    answer = []
    result = combinations(numbers, 2) # (2, 1), (2, 3) ...
    for num1, num2 in result:
        answer.append(num1+num2)
    answer = sorted(set(answer))
    return answer