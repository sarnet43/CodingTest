str = input()

def solution(mystring):
    a = len(str)
    answer = ''
    for i in range(a):
        if str[i].isupper() == True:
            answer += str[i].lower()
        else:
            answer += str[i].upper()
    return answer

print(solution(str))
        