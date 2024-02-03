def solution(n):
    answer = ''
    str1 = "박수"
    for i in range(1, n+1): #i=1,2,3
        i = i % 2        
        answer += str1[i]
    return answer


'''
n < 10^4
'''