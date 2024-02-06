n, m = map(int, input().split())
star = '*'
line = star * n
for i in range(m):
    print(line)


'''
방법2
star = '*'
for i in range(m):
    for j in range(n):
        print(star, end='')
    print(' ')
''' 