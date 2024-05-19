def solution(num_list):
    odd = even = 0
    for i in num_list:
        if i % 2 != 0:
            odd = odd * 10 + i
        else:
            even = even * 10 +i
    
    return odd + even