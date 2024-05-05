def solution(s):
    answer = []
    dicti = {}

    for index, k in enumerate(s):
        # 처음 등장 
        if k not in dicti:
            answer.append(-1)
            dicti[k] = index
        else:
            answer.append(index - dicti[k])
            dicti[k] = index # 업데이트 
    return answer