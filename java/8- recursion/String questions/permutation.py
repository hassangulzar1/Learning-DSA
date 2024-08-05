# def permutation(p,up):
#     if up == "":
#         print(p)
#         return
#     
#     ch = up[0]
# 
#     for i in range(len(p) + 1):
#         first = p[:i]
#         second = p[i:]
# 
#         permutation(first + ch + second,up[1:])
# 
# permutation("","abc")

#! Return through Arrays 
# def permutation(p,up):
#     if up == "":
#         return [p]
#     
#     ch = up[0]
#     ans = []
# 
#     for i in range(len(p) + 1):
#         first = p[:i]
#         second = p[i:]
# 
#         ans.extend(permutation(first + ch + second,up[1:]))
#     
#     return ans
# 
# print(permutation("","abc"))
#! number permutation

# def permutation(p,up):
#     if up == "":
#         return 1
#     
#     ch = up[0]
#     count = 0
#     for i in range(len(p) + 1):
#         first = p[:i]
#         second = p[i:]
# 
#         count = count + permutation(first + ch + second,up[1:])
#     
#     return count
# 
# print(permutation("","abcd"))
