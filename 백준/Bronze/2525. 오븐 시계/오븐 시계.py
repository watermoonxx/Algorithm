h, m = map(int, input().split())
c = int(input())

get_minute = (m+c) % 60
get_hour = (m+c) // 60
result_hour = (h+get_hour) % 24

print(result_hour, get_minute)