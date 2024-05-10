def solution(answers):
    answer = []
    stu1 = [1, 2, 3, 4, 5]
    stu2 = [2, 1, 2, 3, 2, 4, 2, 5]
    stu3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    score = [0, 0, 0]
    
    for index, k in enumerate(answers): 
        if k == stu1[index % 5]:
            score[0] += 1
        if k == stu2[index % 8]:
            score[1] += 1
        if k == stu3[index % 10]:
            score[2] += 1
    
    for index, j in enumerate(score):
        if j == max(score):
            answer.append(index + 1)
    return answer