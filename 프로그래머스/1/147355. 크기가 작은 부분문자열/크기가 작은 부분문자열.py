def solution(t, p):
    answer = 0
    num_list = []
    
    for idx, l in enumerate(t):
        if idx > len(t) - len(p):
            break
        num_list.append(t[idx:idx+len(p)]) # 슬라이싱 
    
    # 리스트에 담긴 문자열 p와 크기 비교 
    for i in num_list:
        if int(i) <= int(p):
            answer += 1
    return answer 