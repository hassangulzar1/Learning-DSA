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
    

    if str.startswith("apple"):
       return removeA(str[5:])
    else:
       return str[0] + removeA(str[1:])
    

print(removeA("myapplebacha"))



