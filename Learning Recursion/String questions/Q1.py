# def removeA(p,up):
#     if up == "":
#         print(p)
#         return
#     
#     ch = up[0]
# 
#     if ch == "a":
#         removeA(p,up[1:])
#     else:
#         removeA(p+ch,up[1:])
#     
# 
# removeA("","baccdah")

def removeA(str):
    if str == "":       
        return ""
    
    ch = str[0]

    if ch == "a":
       return removeA(str[1:])
    else:
       return ch + removeA(str[1:])
    

print(removeA("baccdah"))



