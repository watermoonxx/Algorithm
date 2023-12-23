def solution(absolutes, signs):
    answer = 0
    for num, sign in zip(absolutes, signs): 
        if sign == True:
            answer += num
        else:
            answer -= num
    return answer


'''
처음 풀이: 딕셔너리 key로 value에 접근

def solution(absolutes, signs):
    answer = 0
    total = dict(zip(absolutes, signs))
    for num in total:
        if total[num] == True:
          answer += num
        else:
          answer -= num
    return answer
'''
