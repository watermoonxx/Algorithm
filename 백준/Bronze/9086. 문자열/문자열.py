import sys
tc = int(input())
for i in range(tc):
    result = ""
    str1 = sys.stdin.readline().strip()
    result += str1[0]
    result += str1[-1]
    print(result) 