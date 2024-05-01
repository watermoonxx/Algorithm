def solution(sizes):
    for i in sizes:
        if i[0] > i[1]:
            tmp = i[0]
            i[0] = i[1]
            i[1] = tmp
    
    # 각 인덱스에서의 최댓값
    w = max(sizes, key=lambda dt: dt[0])
    h = max(sizes, key=lambda dt: dt[1])
    answer = w[0] * h[1]
    return answer