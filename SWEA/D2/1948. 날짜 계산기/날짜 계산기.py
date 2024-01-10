tc = int(input())
# 월에 해당하는 날짜 저장 
dicti_date = {}
for i in range(1, 12+1):
    if i in (1, 3, 5, 7, 8, 10, 12):
        dicti_date[i] = 31
    elif i in (4, 6, 9, 11):
        dicti_date[i] = 30
    elif i == 2:
        dicti_date[i] = 28

for i in range(1, tc+1):
    date = list(map(int, input().split()))
    if date[0] == date[2]:
        result = date[3] - date[1] + 1
        print(f"#{i} {result}")
    else:
        day = 0
        # 사이에 존재하는 달 날짜 수 더하기 
        for j in range(date[0]+1, date[2]): # 6, 7
            day += dicti_date[j]
        
        # 시작 달 날짜 수 더하기
        day += dicti_date[date[0]] - date[1] + 1

        # 마지막 달 날짜 수 더하기
        day += date[3]
        print(f"#{i} {day}") 