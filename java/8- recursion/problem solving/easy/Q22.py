S="aabccba"

# def removeDup(s):
#     i = 0
#     j = 0
#  
# 
#     str = ""
#     while j < len(s):
#         if s[i]  ==  s[j]:
#             j += 1
#         elif (s[i] != s[j]) or( j==len(s)-1):
#             str += s[i]
#             i = j
#             j += 1
# 
#     str+=s[j-1]
# 
#     return str
# 
# print(removeDup(S))

def removeDef(s):
    if len(s) < 2:
        return s
    
    temp = s[0]
    if temp != s[1]:
        return temp + removeDef(s[1:])
    else:
        return removeDef(s[1:])

print(removeDef(S))
