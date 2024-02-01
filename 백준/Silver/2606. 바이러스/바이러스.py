import sys
from collections import deque

vertexs = int(sys.stdin.readline().strip())
edges = int(sys.stdin.readline().strip())
visited = [False] * (vertexs+1)
count = 0

network = [[] * (vertexs+1) for _ in range(vertexs+1)]
for i in range(edges):
  v1, v2 = map(int, sys.stdin.readline().split())
  network[v1].append(v2) 
  network[v2].append(v1) 

def bfs(start):
  global count
  visited[start] = True # 방문
  queue = deque([start])

  while queue:
    cur_v = queue.popleft()

    # 컴퓨터1에 연결된 모든 컴퓨터 큐에 저장 
    for v in network[cur_v]:
      if visited[v] == False:
        visited[v] = True
        count += 1
        queue.append(v)
  return count 

bfs(1)
print(count) 