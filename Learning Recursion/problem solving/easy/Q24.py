string = "abc"

def subset(p,up):
    if up == "":
        return [p]
    
    temp = up[0]

    left = subset(p + temp, up[1:])
    right = subset(p, up[1:])

    return left + right

print(subset("",string))