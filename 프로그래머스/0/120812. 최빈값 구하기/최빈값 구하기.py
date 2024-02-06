def solution(array):
    answer = 0
    num_dicti = {}
    for i in array:
        num_dicti[i] = 0 # 초기화 
    for j in array:
        num_dicti[j] += 1
    
    # 딕셔너리 value 값 중 최댓값 찾기 
    max_value = max(num_dicti.values())
    
    # 최대 value에 해당하는 key 리스트 
    # num_dicti.items() -> (1,1) (2,1) (3,3) (4,1) 
    max_key = [k for k, v in num_dicti.items() if v == max_value]

    if len(max_key) > 1: # max_key 리스트에 원소가 2개 이상인 경우 
        answer = -1
    else:  # max_key 리스트에 원소가 1개인 경우 
        answer = max_key[0]    
    return answer 