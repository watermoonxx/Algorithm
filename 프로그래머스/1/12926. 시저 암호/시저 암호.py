def solution(s, n):
    answer = ''
    for i in s:
        # 공백
        if i == ' ':
            answer += ' '
        else:
            # 대문자
            if (ord(i) >= 65 and ord(i) <= 90):
                num_result = ord(i) + n
                if num_result >= 91:
                    num_result -= 26
                alpha_result = chr(num_result)
                answer += alpha_result
            
            # 소문자
            if (ord(i) >= 97 and ord(i) <= 122):
                num_result = ord(i) + n
                if num_result >= 123:
                    num_result -= 26
                alpha_result = chr(num_result)
                answer += alpha_result
    return answer