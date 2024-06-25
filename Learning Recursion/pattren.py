# def pattren(r,c):
#     if r == 0:
#         return
#     
#     if c < r:
#         print("*",end="")
#         pattren(r,c+1)
#     else:
#         print("")
#         pattren(r-1,0)
# pattren(4,0)

def pattren(r,c):
    if r == 0:
        return
    
    if c < r:
        pattren(r,c+1)
        print("*",end="")
    else:
        pattren(r-1,0)
        print("")

pattren(4,0)
