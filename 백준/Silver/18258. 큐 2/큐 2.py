from collections import deque
import sys
queue = deque()
result = 0

tc = int(sys.stdin.readline())
for i in range(tc):
  cmd = sys.stdin.readline().split() 
  if cmd[0] == 'push':
    queue.append(int(cmd[1]))
  elif cmd[0] == 'front':
    if queue:
      result = queue[0]
    else:
      result = -1
    print(result)
  elif cmd[0] == 'back':
    if queue:
      result = queue[-1]
    else:
      result = -1
    print(result)
  elif cmd[0] == 'size':
    result = len(queue)
    print(result)
  elif cmd[0] == 'empty':
    if queue:
      result = 0
    else:
      result = 1
    print(result)
  elif cmd[0] == 'pop':
    if queue:
      result = queue.popleft()
    else:
      result = -1
    print(result) 