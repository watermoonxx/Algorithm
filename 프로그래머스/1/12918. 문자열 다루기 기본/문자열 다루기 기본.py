def solution(s):
    # 우선 문자열 s의 길이가 4 또는 6인지 확인 
    if len(s) == 4 or len(s) == 6: 
        for i in s:
            value = ord(i)
            if value < 48 or value > 57:
                answer = False
                break
            else:
                answer = True
    else:
        answer = False
    return answer