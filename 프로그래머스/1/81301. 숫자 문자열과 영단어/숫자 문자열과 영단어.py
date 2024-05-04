def solution(s):
    answer = 0
    num = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
    for index, k in enumerate(num):
        s = s.replace(k, str(index))
    answer = int(s)
    return answer