# def dice(p,target):
#     if target == 0:
#         print(p)
#         return
#     
#     for i in range(1, min(7, target + 1)):
#         dice(p + str(i), target - i)
# 
# dice("",4)
def dice(p,target):
    if target == 0:
        return [p]
    
    ans = []
    
    for i in range(1, min(7, target + 1)):
        ans.extend(dice(p + str(i), target - i))
    return ans

print(dice("",4))