def subset(p,up):
    if up == "":
        print(p)
        return
    
    ch = up[0]

    subset(p + ch,up[1:])
    subset(p,up[1:])

subset("","abc")