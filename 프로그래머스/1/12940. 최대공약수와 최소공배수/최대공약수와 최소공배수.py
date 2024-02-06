def solution(n, m):
    answer = []
    # m을 항상 큰 수로 고정 
    if n > m:
        m, n = n, m
    a, b = m, n
    
    # 작은수가 0이 될때까지 연산 반복 
    while b != 0:
        remain = a % b
        a = b
        b = remain
        
    gcd = a
    lcm = gcd * (m // gcd) * (n // gcd)
    answer.append(gcd)
    answer.append(lcm)
    return answer 