N = int(input())
input_1 = list(input())
sum = 0
for i in range(N): # range(N)은 0부터 (N-1)까지
  sum += int(input_1[i])
print(sum)