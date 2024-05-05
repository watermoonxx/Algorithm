def solution(strings, n):
    answer = sorted(strings, key=lambda dt: (dt[n], dt))
    # dt[n]으로 판단할 수 없을 때, dt 기준으로 넘어감(튜플로 우선순위 설정)
    return answer