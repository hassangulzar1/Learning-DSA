# def subset(p,up):
#     if up == "":
#         print(p)
#         return
#     
#     ch = up[0]
# 
#     subset(p + ch,up[1:])
#     subset(p,up[1:])
# 
# subset("","abc")

# !Add into Array List 

def arrayList(p,up):
    if up == "":
        return [p]
    
    ch = up[0]

    left = arrayList(p + ch,up[1:])
    right = arrayList(p,up[1:])

    return left + right

print(arrayList("","abc"))