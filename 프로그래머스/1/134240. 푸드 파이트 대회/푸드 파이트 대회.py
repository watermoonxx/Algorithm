def solution(food):
    answer = ''
    answer1 = ''
    for index, value in enumerate(food):
        if index == 0:
            continue
        if value % 2 != 0:
            value -= 1
        if value == 0:
            continue
        food_count = value // 2
        answer1 += (str(index) * food_count)
    answer += answer1 + '0' + answer1[::-1]    
    return answer