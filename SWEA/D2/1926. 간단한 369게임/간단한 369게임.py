num = int(input())
for i in range(1, num+1):
    clap = ""   
    # 한 자리 수 박수 
    if len(str(i)) < 2:
        for j in str(i):
            if j in ('3', '6', '9'):
                i = '-'
            print(i, end=" ")
        
    # 두 자리 이상 수의 박수 
    else:
        for j in str(i):
            if j in ('3', '6', '9'):
                clap += '-'
        if len(clap) == 0:
            clap = i
        print(clap, end=" ") 