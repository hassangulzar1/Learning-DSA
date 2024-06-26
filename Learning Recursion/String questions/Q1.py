def removeA(p,up):
    if up == "":
        print(p)
        return
    
    ch = up[0]

    if ch == "a":
        removeA(p,up[1:])
    else:
        removeA(p+ch,up[1:])
    

removeA("","baccdah")



