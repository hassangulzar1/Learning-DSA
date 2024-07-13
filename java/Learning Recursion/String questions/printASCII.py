
def arrayList(p,up):
    if up == "":
        list = []
        list.append(p)
        return list
    
    ch = up[0]

    left = arrayList(p + ch,up[1:])
    right = arrayList(p,up[1:])
    third = arrayList(p + str(ord(ch)),up[1:])

    return left + right + third

print(arrayList("","abc"))