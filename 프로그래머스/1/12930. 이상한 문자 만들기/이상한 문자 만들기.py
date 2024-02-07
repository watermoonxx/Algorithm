def solution(s):
    answer = ""
    s = list(s.split(" "))
    
    for idx1, word in enumerate(s):
        for idx2, letter in enumerate(word):
            if idx2 == 0 or idx2 % 2 == 0:
                answer += letter.upper()
            else:
                answer += letter.lower()
        if idx1 != len(s) - 1: # len(s) == 3, idx1 == 2 일때, 즉 마지막 단어는 공백 추가 x
            answer += " "
    return answer 
