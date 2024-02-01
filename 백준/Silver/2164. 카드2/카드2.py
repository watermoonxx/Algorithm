import sys
from collections import deque

num = int(sys.stdin.readline().strip())
queue = deque()
for i in range(1, num+1):
  queue.append(i)

while len(queue) > 1:
  queue.popleft()
  front = queue.popleft()
  queue.append(front)

print(*queue) 