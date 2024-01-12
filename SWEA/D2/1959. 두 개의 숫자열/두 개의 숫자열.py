tc = int(input())
for i in range(1, tc+1):
    sum_list = 0
    result = []
    n, m = map(int, input().split())
    nums_n = list(map(int, input().split()))
    nums_m = list(map(int, input().split()))
 
    # 큰 수를 nums_m으로 고정시키기 
    if n > m:
        n, m = m, n
        nums_n, nums_m = nums_m, nums_n
 
    count = m - n + 1 # 위치를 움직일 수 있는 횟수
    for j in range(count):
        sum_list = 0
        for k in range(n):
            sum_list += nums_n[k] * nums_m[k+j]
        result.append(sum_list)
    print(f"#{i} {max(result)}") 